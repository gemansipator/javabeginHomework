package site.javadev.training.fastjava2.shop.bank;

public class SberBank extends AbstractBank{
    public SberBank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo(){
        super.checkInfo();
    }

    @Override
    public void giveCredit(){
        //доработанная реализация
    }
}
