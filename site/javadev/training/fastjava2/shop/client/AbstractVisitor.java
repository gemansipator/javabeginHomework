package site.javadev.training.fastjava2.shop.client;

import site.javadev.training.fastjava2.shop.goods.Televisor;
import site.javadev.training.fastjava2.shop.interfaces.GoodsInterface;
import site.javadev.training.fastjava2.shop.interfaces.VisitorInterface;

public abstract class AbstractVisitor implements VisitorInterface {
    private String name;
    @Override
    public void buy(GoodsInterface goods){
        System.out.println(goods.getName());
        if(goods instanceof Televisor){
            ((Televisor) goods).selectChannel();
        }

    }
    @Override
    public void returnGoods(GoodsInterface goods){

    }

    @Override
    public String getName() {
        return name;
    }
}
