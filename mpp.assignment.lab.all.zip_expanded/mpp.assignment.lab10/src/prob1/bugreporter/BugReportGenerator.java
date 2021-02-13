package prob1.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import prob1.classfinder.ClassFinder;




/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	public final static String FILE_LOCATION = "src/lesson10/labs/prob1/resource/";
	private static final String PACKAGE_TO_SCAN = "lesson10.labs.prob1.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";

	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);

		// sample code for reading annotations -- you will need to change
		// this quite a bit to solve the problem
		// Sample code below obtains a list of names of developers assigned to bugs
		// List<String> names = new ArrayList<String>();
		HashMap<String, BugInfo> buginfos = new HashMap<>();
		for (Class<?> cl : classes) {
			if (cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport) cl.getAnnotation(BugReport.class);
				// String name = annotation.assignedTo();
				// names.add(name);
				BugInfo bugInfo = null;
				if (!buginfos.containsKey(annotation.assignedTo())) {
					bugInfo = new BugInfo(annotation.assignedTo());
					buginfos.put(annotation.assignedTo(), bugInfo);
				} else {
					bugInfo = buginfos.get(annotation.assignedTo());

				}
				bugInfo.AddBugDetail(annotation.reportedBy(), cl.getCanonicalName(), annotation.description(),
						annotation.severity());
			}
		}

		writeToFile(buginfos);
	}
	private void writeToFile(HashMap<String, BugInfo> bugReports)
	{
		try(PrintWriter printWriter = new PrintWriter( new FileWriter( new File(FILE_LOCATION+REPORT_NAME) ));) {	
			for( Entry<String, BugInfo> bugReport : bugReports.entrySet())
			{
				BugInfo buginfo =  bugReport.getValue();
				printWriter.println(buginfo.getAssignedTo());
				
				for(BugDetail detail: buginfo.getBugdetails())
				{
					printWriter.printf("  %s %s\n",REPORTED_BY,detail.getReportedBy());
					printWriter.printf("  %s %s\n",CLASS_NAME,detail.getClassName());
					printWriter.printf("  %s %s\n",DESCRIPTION,detail.getDescription());
					printWriter.printf("  %s %s\n",SEVERITY,detail.getSeverity());
					printWriter.println();
				}
				
				
			}
			
		} catch (Exception e) {
			LOG.warning("IOException attempting to write a file: " + e.getMessage());
		}
	
	}
	

}
