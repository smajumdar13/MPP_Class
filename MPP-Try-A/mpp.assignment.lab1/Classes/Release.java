import java.sql.Date;

public class Release {
	private Sprint[] sprints;
	private Date dueDate;
	public Date getDueDate() {
		return dueDate;
	}
	public Sprint[] getSprints() {
		return sprints;
	}
}
