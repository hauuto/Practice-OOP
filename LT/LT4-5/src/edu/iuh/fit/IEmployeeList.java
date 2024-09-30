package edu.iuh.fit;

public interface IEmployeeList {

    int WEEKS_PER_YEAR = 52;
    public abstract Employee findEmployee(String id);
    Employee updateEmployee(Employee newInforEmp);
    Employee[] listEmployees();

    public default void getX() {    }

}
