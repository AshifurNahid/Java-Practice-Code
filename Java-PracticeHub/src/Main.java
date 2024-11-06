import com.javaproject.streams.Employee;
import com.javaproject.streams.EmployeeService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, "Engineering", 70000, true),
                new Employee("Bob", 40, "HR", 50000, true),
                new Employee("Charlie", 35, "Engineering", 120000, false),
                new Employee("Dana", 29, "Marketing", 60000, true)
        );

        EmployeeService service = new EmployeeService();

        System.out.println("Active Employees: " + service.getActiveEmployees(employees));


        System.out.println("Average Salary (Engineering): " + service.getAverageSalaryByDepartment(employees, "Engineering"));


        service.getHighestPaidEmployee(employees).ifPresent(emp ->
                System.out.println("Highest Paid Employee: " + emp));


        System.out.println("Employees Grouped by Department: " + service.groupByDepartment(employees));


        System.out.println("Total Salary by Department: " + service.getTotalSalaryByDepartment(employees));
    }
}
