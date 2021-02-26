package Lesson10.Prob1.bugreporter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BugInfo {
	private String assignedTo;
	private List<BugDetail> bugdetails;

	public BugInfo(String assignedTo) {		
		this.assignedTo = assignedTo;
		bugdetails= new ArrayList<BugDetail>();
	}	
	public void AddBugDetail(String reportedBy,String className,String description,int severity) {
		getBugdetails().add(new BugDetail(reportedBy, className, description, severity));
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hashCode(assignedTo);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(obj.getClass()!=this.getClass()) return false;
		BugInfo abugInfo = (BugInfo)obj;
		return this.assignedTo.equals(abugInfo.assignedTo);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public List<BugDetail> getBugdetails() {
		return bugdetails;
	}

}
