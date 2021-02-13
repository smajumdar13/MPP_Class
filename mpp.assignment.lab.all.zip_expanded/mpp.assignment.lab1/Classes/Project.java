
public class Project {
	private Release[] releases;
	private Feature[] backlog;
	private ProjectManager Manager;

	public Release[] getReleases() {
		return releases;
	}

	public Feature[] getBacklog() {
		return backlog;
	}

	public ProjectManager getManager() {
		return Manager;
	}
}
