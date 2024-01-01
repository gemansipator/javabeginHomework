package site.javadev.training.fastjava2.shop.service;

import site.javadev.training.fastjava2.shop.department.BaseDepartment;
import site.javadev.training.fastjava2.shop.interfaces.DepartmentInterface;
import site.javadev.training.fastjava2.shop.interfaces.EmployeeInterface;

public class BaseEmployee implements EmployeeInterface {
    private String name;
    private DepartmentInterface department;
    private boolean free;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    @Override
    public boolean isFree() {
        return false;
    }
}
