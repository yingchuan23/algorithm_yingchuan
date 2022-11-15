package com.codechen.designpattern.proxy;

public class Client {
    public static void main(String[] args) {
        BeautifulGirl mm = new BeautifulGirl("小妹妹...");

        HerChum chum = new HerChum(mm);

        chum.giveBook();
        chum.giveChocolate();
        chum.giveFlowers();
    }
}