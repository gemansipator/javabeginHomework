package site.javadev.training.fastjava2.shop.start;

import site.javadev.training.fastjava2.shop.client.CommonVisitor;
import site.javadev.training.fastjava2.shop.goods.Computer;
import site.javadev.training.fastjava2.shop.goods.Subwoofer;
import site.javadev.training.fastjava2.shop.goods.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor televisor = new Televisor("Samsung");
        Computer computer = new Computer("MacBook");
        Computer computer2 = new Computer("Asus");
        Subwoofer subwoofer = new Subwoofer("Microlab");

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(televisor);
        commonVisitor.buy(computer);
        commonVisitor.buy(computer2);
        commonVisitor.buy(subwoofer);



    }
}
