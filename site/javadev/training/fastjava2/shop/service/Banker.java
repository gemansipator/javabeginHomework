package site.javadev.training.fastjava2.shop.service;

import site.javadev.training.fastjava2.shop.bank.BaseBank;

public class Banker extends BaseEmployee{

    private BaseBank bank;  //принадлежность к банку. В эту переменную можем запихнуть любой объект дочернего банка

    public void sendRequest(){    //отправляет запрос

    }
}
