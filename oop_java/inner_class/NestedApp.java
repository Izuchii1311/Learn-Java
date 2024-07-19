package oop_java.inner_class;

import oop_java.inner_class.Company.Employee;

public class NestedApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Izuchii Studio");

        // Pastikan harus membuat object company terlebih dahulu.
        Employee employee = company.new Employee();
        employee.setName("Luthfi Nur Ramadhan");

        System.out.println(employee.getName());         // Luthfi Nur Ramadhan
        System.out.println(employee.getCompany());      // Izuchii Studio

    }
}
