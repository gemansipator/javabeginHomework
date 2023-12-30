package site.javadev.training.fastjava2.shop.bank;

import site.javadev.training.fastjava2.shop.interfaces.BankInterface;

public class BaseBank implements BankInterface {
    private String name;
    private String creditDescription;

    @Override
    public void checkInfo() {

    }

    @Override
    public void giveCredit() {

    }

    @Override
    public String getName() {
        return name;   // автоматически поставилось return null; но нам надо чтобы имя возвращало
    }
}
