package site.javadev.training.fastjava2.shop.department;

import site.javadev.training.fastjava2.shop.interfaces.DepartmentInterface;
import site.javadev.training.fastjava2.shop.interfaces.EmployeeInterface;
import site.javadev.training.fastjava2.shop.interfaces.GoodsInterface;

import java.util.ArrayList;

public abstract class AbstractDepartment implements DepartmentInterface {
    private String name;
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<GoodsInterface> goodsList;

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }
    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList){
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodList() {
        return goodsList;
    }
    public void setGoodsList(ArrayList<GoodsInterface> goodsList){
        this.goodsList = goodsList;
    }
}
