package Lesson10.Prob1.bugreporter;

public class BugDetail {
private String reportedBy;
private String className;
private String description;
private int severity;

public String getReportedBy() {
	return reportedBy;
}

public String getClassName() {
	return className;
}

public String getDescription() {
	return description;
}

public int getSeverity() {
	return severity;
}

public BugDetail(String reportedBy, String className, String description, int severity) {
	
	this.reportedBy = reportedBy;
	this.className = className;
	this.description = description;
	this.severity = severity;
}

}
