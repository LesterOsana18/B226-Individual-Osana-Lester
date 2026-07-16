// Activity 16: Conditional To-Do List Manager
package day25.activity;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TodoManager {

	// Create global variables for Scanner and ArrayList objects
	static Scanner input = new Scanner(System.in);
	static ArrayList<String> tasks = new ArrayList<>();

	public static void main(String[] args) {

		// Display the main menu options
		TodoManager todoManager = new TodoManager();
		todoManager.displayMenu();

		// Close the Scanner object after use
		input.close();
	}

	// Display the main menu and process user selections
	public void displayMenu() {

		// Store the user's menu selection
		int choice = 0;

		do {

			System.out.println("\n==============================");
			System.out.println("      TO-DO LIST MANAGER");
			System.out.println("==============================");
			System.out.println("1. Add a task");
			System.out.println("2. View all tasks");
			System.out.println("3. Update a task");
			System.out.println("4. Remove a task");
			System.out.println("5. Clear all tasks");
			System.out.println("6. Exit");

			try {

				System.out.print("\nEnter your choice (1-6): ");
				choice = input.nextInt();
				input.nextLine(); // Consume newline

				switch (choice) {

				case 1:
					addTask();
					break;

				case 2:
					viewTasks();
					break;

				case 3:
					updateTask();
					break;

				case 4:
					removeTask();
					break;

				case 5:
					clearTasks();
					break;

				case 6:

					if (confirmAction("exit the program")) {

						System.out.println("\nExiting the program...");
						System.out.println("Thank you for using To-Do List Manager!");

					} else {

						choice = 0;
					}

					break;

				default:
					System.out.println("\nInvalid choice. Please select from 1-6.");
				}

			} catch (InputMismatchException e) {

				System.out.println("\nInvalid input. Please enter numbers only.");
				input.nextLine(); // Clear invalid input

			}

		} while (choice != 6);
	}

	// Add a new task to the list
	public void addTask() {

		System.out.print("\nEnter a task: ");
		String task = input.nextLine().trim();

		if (task.isEmpty()) {

			System.out.println("Task cannot be empty.");
			return;
		}

		tasks.add(task);
		System.out.println("Task added successfully.");
	}

	// Display all saved tasks
	public void viewTasks() {

		if (tasks.isEmpty()) {

			System.out.println("\nNo tasks found.");

		} else {

			System.out.println("\n========== TASK LIST ==========");

			// For loop to iterate through the tasks and display them with their corresponding numbers
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println((i + 1) + ". " + tasks.get(i));
			}
		}
	}

	// Update an existing task
	public void updateTask() {

		if (tasks.isEmpty()) {

			System.out.println("\nNo tasks available to update.");
			return;
		}

		viewTasks();

		try {

			System.out.print("\nEnter the task number to update: ");
			int taskNumber = input.nextInt();
			input.nextLine();

			if (taskNumber >= 1 && taskNumber <= tasks.size()) {

				System.out.print("Enter the new task: ");
				String newTask = input.nextLine().trim();

				if (newTask.isEmpty()) {

					System.out.println("Task cannot be empty.");
					return;
				}

				tasks.set(taskNumber - 1, newTask);
				System.out.println("Task updated successfully.");

			} else {

				System.out.println("Invalid task number.");
			}

		} catch (InputMismatchException e) {

			System.out.println("Invalid input. Please enter a valid task number.");
			input.nextLine();
		}
	}

	// Remove a task from the list
	public void removeTask() {

		if (tasks.isEmpty()) {

			System.out.println("\nNo tasks available to remove.");
			return;
		}

		viewTasks();

		try {

			System.out.print("\nEnter the task number to remove: ");
			int taskNumber = input.nextInt();
			input.nextLine();

			if (taskNumber >= 1 && taskNumber <= tasks.size()) {

				if (confirmAction("remove this task")) {

					tasks.remove(taskNumber - 1);
					System.out.println("Task removed successfully.");

				} else {

					System.out.println("Operation cancelled.");
				}

			} else {

				System.out.println("Invalid task number.");
			}

		} catch (InputMismatchException e) {

			System.out.println("Invalid input. Please enter a valid task number.");
			input.nextLine();
		}
	}

	// Remove every task from the list
	public void clearTasks() {

		if (tasks.isEmpty()) {

			System.out.println("\nThe task list is already empty.");

		} else {

			if (confirmAction("clear all tasks")) {

				tasks.clear();
				System.out.println("\nAll tasks cleared successfully.");

			} else {

				System.out.println("\nOperation cancelled.");
			}
		}
	}

	// Prompts the user to confirm an action before continuing
	public boolean confirmAction(String action) {

		while (true) {

			System.out.print("\nAre you sure you want to " + action + "? (Y/N): ");
			String confirmation = input.nextLine().trim().toUpperCase();

			if (confirmation.equals("Y")) {
				return true;
			}

			if (confirmation.equals("N")) {
				return false;
			}

			System.out.println("Invalid input. Please enter Y or N.");
		}
	}
}