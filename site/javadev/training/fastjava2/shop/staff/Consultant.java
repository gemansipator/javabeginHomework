package site.javadev.training.fastjava2.shop.staff;

import site.javadev.training.fastjava2.shop.enums.ConsultResult;
import site.javadev.training.fastjava2.shop.interfaces.VisitorInterface;

public class Consultant extends AbstractStaff {
    public Consultant() {
    }


    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);

        // здесь должна быть логика, купит или пойдет домой

        return ConsultResult.BUY;

    }


    public void send(){

    }


}

