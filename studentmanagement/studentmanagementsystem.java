import java.util.ArrayList;
import java.util.Scanner;

public class studentmanagementsystem {
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSTUDENT MANAGEMENT RECORD");
            System.out.println("1. Add student");
            System.out.println("2. Update student");
            System.out.println("3. Delete student");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // clears buffer
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    students.add(new student(id, name, age));
                    System.out.println("Student added!!");
                    break;

                case 2:
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    boolean found = false;
                    for (student s : students) {
                        if (s.id == updateId) {
                            scanner.nextLine(); // clear buffer
                            System.out.print("Enter new name: ");
                            s.name = scanner.nextLine();
                            System.out.print("Enter new age: ");
                            s.age = scanner.nextInt();
                            System.out.println("Update done!!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found. Re-enter the ID.");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean removed = students.removeIf(s -> s.id == deleteId);
                    if (removed) {
                        System.out.println("Deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }

        } while (choice != 4);

        scanner.close();
    }
}
