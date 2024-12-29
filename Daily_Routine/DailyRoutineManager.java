package Daily_Routine;

import java.util.List;
import java.util.ArrayList;

public class DailyRoutineManager{
	List<DailyTask> tasks; // A list to store all tasks
	
	//Constructor to initialize the task list
	public DailyRoutineManager() {
		tasks = new ArrayList<>();
	}
	
	//Method to add a task
	public void addTask(String time, String description) {
		tasks.add(new DailyTask(time, description));
		System.out.println("Task added successfully!");
	}
	
	//Method to view all tasks
	public void viewTasks() {
		if(tasks.isEmpty()) {
			System.out.println("No tasks in your daily routine.");
		}
		else {
			System.out.println("\n Your Daily Routine: ");
			for(DailyTask task : tasks) {
				System.out.println(task);
			}
		}
	}
	
	//Method to remove a task by its index
	public void removeTask(int index) {
		if(index < 0 || index > tasks.size()) {
			System.out.println("Invalid task number. Please try again!");
		}
		else {
			tasks.remove(index);
			System.out.println("Task removed successfully!");
		}
	}
}
