package site.javadev.training.fastjava2.shop;

import site.javadev.training.fastjava2.shop.client.BaseVisitor;
import site.javadev.training.fastjava2.shop.department.BaseDepartment;
import site.javadev.training.fastjava2.shop.interfaces.DepartmentInterface;
import site.javadev.training.fastjava2.shop.interfaces.VisitorInterface;
import site.javadev.training.fastjava2.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {
    private ArrayList<DepartmentInterface> departmentList;  // в каждом департаменте имеются свои сотрудники
    private String name;
    private ArrayList<VisitorInterface> visitorList;
    private Administrator administrator;
}
