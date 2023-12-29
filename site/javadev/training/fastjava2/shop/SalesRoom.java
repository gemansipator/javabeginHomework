package site.javadev.training.fastjava2.shop;

import site.javadev.training.fastjava2.shop.client.BaseVisitor;
import site.javadev.training.fastjava2.shop.department.BaseDepartment;
import site.javadev.training.fastjava2.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {
    private ArrayList<BaseDepartment> departmentList;
    private String name;
    private ArrayList<BaseVisitor> visitorList;
    private Administrator administrator;
}
