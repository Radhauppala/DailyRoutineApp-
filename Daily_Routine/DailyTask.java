package Daily_Routine;

public class DailyTask {
	
	private String time; // The time for the task
	private String description; // The description of the task
	
	// Constructor to initialize the task
	public DailyTask(String time, String description) {
		this.time = time;
		this.description = description;
	}
	
	// Getters
	public String getTime() {
		return time;
	}
	public String getDescription() {
		return description;
	}
	
	// Overriding toString() to display the task in a readable format
	@Override
	public String toString() {
		return "Time: " + time + ", Task: " + description;
	}
}
