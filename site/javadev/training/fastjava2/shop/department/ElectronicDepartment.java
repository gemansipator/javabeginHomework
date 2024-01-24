package site.javadev.training.fastjava2.shop.department;

import site.javadev.training.fastjava2.shop.interfaces.GoodsInterface;

import java.util.ArrayList;

public class ElectronicDepartment extends AbstractDepartment {
    public ElectronicDepartment() {
    }

    public ElectronicDepartment(String name) {
        super(name);
    }

    @Override
    public ArrayList<GoodsInterface> getGoodList() {
        return null;
    }
}
