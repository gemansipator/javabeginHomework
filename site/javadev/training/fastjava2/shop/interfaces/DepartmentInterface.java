package site.javadev.training.fastjava2.shop.interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {
    String getName();
    ArrayList<EmployeeInterface> getEmployeeList();
    ArrayList<GoodsInterface> getGoodList();

    ArrayList<GoodsInterface> getGoodsList();
}
