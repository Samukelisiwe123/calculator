package com.employees.api.Models;

public class Employee {

    long id;
    String name;
    String surname;
    double salary;
    String address;
    String department;

    public Employee(){}
    public Employee(long id, String name, String surname, double salary, String address, String department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.address = address;
        this.department = department;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
