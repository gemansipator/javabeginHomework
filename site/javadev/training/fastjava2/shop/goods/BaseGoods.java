package site.javadev.training.fastjava2.shop.goods;

import site.javadev.training.fastjava2.shop.department.BaseDepartment;
import site.javadev.training.fastjava2.shop.interfaces.GoodsInterface;

public abstract class BaseGoods implements GoodsInterface {
    //свойства, которые будут иметь все товары
    private double price;
    private boolean hasGuarantee;
    private String name;
    private BaseDepartment department;
    private String company;

    public double getPrice() {
        return price;
    }

    @Override
    public boolean hasGuarantee() {
        return hasGuarantee;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasGuarantee() {
        return hasGuarantee;
    }

    public void setHasGuarantee(boolean hasGuarantee) {
        this.hasGuarantee = hasGuarantee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseDepartment getDepartment() {
        return department;
    }

    public void setDepartment(BaseDepartment department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}


