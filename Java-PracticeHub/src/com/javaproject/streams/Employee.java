package com.javaproject.streams;


public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;
    private boolean isActive;

    public Employee(String name, int age, String department, double salary, boolean isActive) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.isActive = isActive;
    }
    public boolean isActive() {
        return isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
