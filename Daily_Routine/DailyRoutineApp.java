package Daily_Routine;

import java.util.Scanner;

public class DailyRoutineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyRoutineManager routineManager = new DailyRoutineManager();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n==== Daily Routine Menu ====");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Remove Task");
			System.out.println("4. Exit");
			
			System.out.println("\n Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); //Consume newline
			
			switch(choice) {
			case 1:
				System.out.println("Enter the time for the task (e.g., 8:00 Am): ");
				String time = scanner.nextLine();
				
				System.out.println("Enter the task description: ");
				String description = scanner.nextLine();
				
				routineManager.addTask(time, description);
				break;
				
			case 2:
				routineManager.viewTasks();
				break;
			case 3:
				routineManager.viewTasks();
				
				System.out.println("Enter the task number to remove(Starting from 0): ");
				int taskNumber = scanner.nextInt();
				
				routineManager.removeTask(taskNumber);
				break;
			case 4:
				System.out.println("Exiting... Hava a productive day!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again!");
			}
		}

	}

}
