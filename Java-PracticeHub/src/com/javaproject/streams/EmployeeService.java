package com.javaproject.streams;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeService {

    public List<String> getActiveEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(Employee::isActive)
                .map(Employee::getName)
                .collect(Collectors.toList()).reversed();
    }


    public double getAverageSalaryByDepartment(List<Employee> employees, String department) {
        return employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    public Optional<Employee> getHighestPaidEmployee(List<Employee> employees) {
        return employees.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
    }

    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    public Map<String, Double> getTotalSalaryByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)));
    }
}
