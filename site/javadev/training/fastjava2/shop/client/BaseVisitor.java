package site.javadev.training.fastjava2.shop.client;

import site.javadev.training.fastjava2.shop.interfaces.VisitorInterface;

public class BaseVisitor implements VisitorInterface {
    private String name;
    public void buy(){

    }
    public void returnGoods(){

    }

    @Override
    public String getName() {
        return name;
    }
}
