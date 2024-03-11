
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setEmployeeId(sc.nextInt());

        System.out.print("Enter Employee Name: ");
        emp.setEmployeeName(sc.next());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextDouble());

        System.out.print("Enter PF Percentage: ");
        int pfPercentage = sc.nextInt();

        emp.calculateNetSalary(pfPercentage);

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getEmployeeName());
        System.out.println("Salary: $" + emp.getSalary());
        System.out.println("Net Salary: $" + emp.getNetSalary());
    }
}
