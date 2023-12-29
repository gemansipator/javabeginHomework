package site.javadev.training.fastjava2.shop.department;

import site.javadev.training.fastjava2.shop.goods.BaseGoods;
import site.javadev.training.fastjava2.shop.service.BaseEmployee;

import java.util.ArrayList;

public class BaseDepartment {
    private String name;
    private ArrayList<BaseEmployee> employeeList;
    private ArrayList<BaseGoods> goodsList;
}
