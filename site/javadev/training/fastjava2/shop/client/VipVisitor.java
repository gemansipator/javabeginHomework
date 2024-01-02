package site.javadev.training.fastjava2.shop.client;

import site.javadev.training.fastjava2.shop.interfaces.GoodsInterface;

public class VipVisitor extends AbstractVisitor {
    //private String name; не нужно дублировать переменную. Она уже есть в родительском классе Visitor
    private float discont;
    @Override
    public void buy(GoodsInterface goods){
        if (!checkDiscount()){
            super.buy(goods);
        }else {
            //купить со скидкой
        }

    }
    private boolean checkDiscount(){
        return discont > 0;
    }
}
