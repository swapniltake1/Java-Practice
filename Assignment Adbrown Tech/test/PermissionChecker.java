package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermissionChecker {
  private static boolean checkPermission(Employee employee, String permission) {
        if (permission.contains("Department is")) {
            int startIndex = permission.indexOf("'");
            int endIndex = permission.lastIndexOf("'");
            if (startIndex != -1 && endIndex != -1 && endIndex > startIndex) {
                String requiredDepartment = permission.substring(startIndex + 1, endIndex);
                return requiredDepartment.equals(employee.getDepartment());
            }
        } else if (permission.contains("Team is")) {
            int startIndex = permission.indexOf("'");
            int endIndex = permission.lastIndexOf("'");
            if (startIndex != -1 && endIndex != -1 && endIndex > startIndex) {
                String requiredTeam = permission.substring(startIndex + 1, endIndex);
                return requiredTeam.equals(employee.getGroup());
            }
        } else if (permission.contains("Office is")) {
            int startIndex = permission.indexOf("'");
            int endIndex = permission.lastIndexOf("'");
            if (startIndex != -1 && endIndex != -1 && endIndex > startIndex) {
                String requiredOffice = permission.substring(startIndex + 1, endIndex);
                return requiredOffice.equals(employee.getOffice());
            }
        }
        return false;
    }

    private static void setPermissions(User user, Scanner scanner) {
        System.out.println("Enter the number of permissions for user " + user.getName() + ":");
        int numPermissions = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numPermissions; i++) {
            System.out.println("Enter permission " + (i + 1) + " for user " + user.getName() + ":");
            String permission = scanner.nextLine();
            user.addPermission(permission);
        }
    }

    private static void viewPermissions(User user) {
        System.out.println("Permissions for user " + user.getName() + ":");
        for (String permission : user.getPermissions()) {
            System.out.println(permission);
        }
    }

    private static void seePermissionFromName(List<User> userList, String userName) {
        boolean userFound = false;
        for (User user : userList) {
            if (user.getName().equals(userName)) {
                userFound = true;
                System.out.println("User: " + user.getName());
                viewPermissions(user);
                for (String permission : user.getPermissions()) {
                    System.out.println("Permissions: " + permission);
                }
                break;
            }
        }
        if (!userFound) {
            System.out.println("User not found. Please provide a valid user name.");
        }
    }

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Swapnil", "IT", "Team A", "Hyderabad"));
        employeeList.add(new Employee("Abhi", "HR", "Team B", "Delhi"));
        employeeList.add(new Employee("Rohit", "Finance", "Team C", "Pune"));
        employeeList.add(new Employee("Onkar", "IT", "Team D", "Mumbai"));

        List<User> userList = new ArrayList<>();

        User sampleUser = new User("Abhi");
        sampleUser.addPermission("Access Rule 1: Department is 'IT'");
        sampleUser.addPermission("Access Rule 2: Office is 'Delhi'");
        userList.add(sampleUser);

        User sampleUser2 = new User("Swapnil");
        sampleUser2.addPermission("Access Rule 1: Department is 'IT'");
        sampleUser2.addPermission("Access Rule 2: Office is 'Delhi'");
        userList.add(sampleUser2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add permissions, 2 to see permissions from name:");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (choice == 1) {
            System.out.println("Enter the number of users:");
            int numUsers = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            for (int i = 0; i < numUsers; i++) {
                System.out.println("Enter the name of user " + (i + 1) + ":");
                String userName = scanner.nextLine();
                User user = new User(userName);
                setPermissions(user, scanner);
                userList.add(user);
            }
        } else if (choice == 2) {
            System.out.println("Enter the name of the user to view permissions:");
            String inputUserName = scanner.nextLine();
            seePermissionFromName(userList, inputUserName);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        for (User user : userList) {
            System.out.println("User: " + user.getName());
            viewPermissions(user);
            for (String permission : user.getPermissions()) {
                System.out.println("Permissions: " + permission);
                for (Employee employee : employeeList) {
                    if (checkPermission(employee, permission)) {
                        System.out.println(" - " + employee);
                    }
                }
            }
            System.out.println();
        }
    }
}