package edu.iuh.fit;/*
 * @ (#) iuh.fit.EmployeeList.java       1.0      9/17/2024
 *
 * Copyright (c) 2024 IUH.FIT
 */


/**
 * @description:
 * @author: To Thanh Hau
 * @version: 1.0
 * @created: 9/10/2024 7:17 AM
 */
public class EmployeeList implements IEmployeeList{

    private Employee[] list;
    private int count = 0;


    //Constructors
    public EmployeeList(){
        list = new Employee[10];
    }
    public EmployeeList(int size) {
        list = new Employee[size];
    }

    public void addEmployee(Employee emp){
        if(count == list.length){
            Employee[] newList = new Employee[list.length * 2];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
        list[count++] = emp;
    }

    @Override
    public Employee findEmployee(String id) {
        for (int i = 0; i < count; i++) {
            Employee emp = list[i];
            if (emp.getId().equals(id)) {
                return emp;
            }
        }
        return null;
    }


    @Override
    public Employee updateEmployee(Employee newInfoEmp) {
        Employee emp = findEmployee(newInfoEmp.getId());
        if (emp == null)
            return null;

        emp.setName(newInfoEmp.getName());
        emp.setDob(newInfoEmp.getDob());

        if (newInfoEmp instanceof HourlyEmployee) {
            HourlyEmployee temp = (HourlyEmployee) emp;
            HourlyEmployee newEmp = (HourlyEmployee) newInfoEmp;
            temp.setHoursWorked(newEmp.getHoursWorked());
            temp.setHourlyWage(newEmp.getHourlyWage());

        }
        return emp;
    }

    @Override
    public Employee[] listEmployees() {
        Employee [] temp = new Employee[count];
        for (int i = 0; i < count; i++) {
            temp[i] = list[i];
        }
        return temp;
    }

}
