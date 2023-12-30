package site.javadev.training.fastjava2.shop.interfaces;

import site.javadev.training.fastjava2.shop.goods.BaseGoods;
import site.javadev.training.fastjava2.shop.service.BaseEmployee;

import java.util.ArrayList;

public interface DepartmentInterface {
    String getName();
    ArrayList<BaseEmployee> getEmployeeList();
    ArrayList<BaseGoods> getGoodList();
}
