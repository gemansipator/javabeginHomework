package site.javadev.training.fastjava2.shop.service;

import site.javadev.training.fastjava2.shop.bank.AbstractBank;
import site.javadev.training.fastjava2.shop.interfaces.BankInterface;

public class Banker extends BaseEmployee{

    private BankInterface bank; // вместо типа BaseBank прописали выше тип. Чтобы в переменную мы могли записать любой
    // банк реализующий соответствующий интерфейс

    public void sendRequest(){    //отправляет запрос

    }
}
