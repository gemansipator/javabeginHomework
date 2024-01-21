package site.javadev.training.fastjava2.shop;

import site.javadev.training.fastjava2.shop.interfaces.DepartmentInterface;
import site.javadev.training.fastjava2.shop.interfaces.VisitorInterface;
import site.javadev.training.fastjava2.shop.staff.Administrator;

import java.io.File;
import java.util.ArrayList;

public class SalesRoom {

    public static final String SHOP_NAME = "technodom";

    private ArrayList<DepartmentInterface> departmentList = new ArrayList<DepartmentInterface>();// в каждом департаменте имеются свои сотрудники

    private ArrayList<VisitorInterface> visitorList = new ArrayList<VisitorInterface>();

    public ArrayList<DepartmentInterface> getDepartmentList() {
        return departmentList;
    }

    public void addDepartment(DepartmentInterface department){
        departmentList.add(department);
    }

    public void addVisitor(VisitorInterface visitor){
        visitorList.add(visitor);
    }

}
