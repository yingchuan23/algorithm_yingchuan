package com.codechen.designpattern.proxy;

public class You implements GiveGift {

    private BeautifulGirl beautifulGirl;

    public You(BeautifulGirl beautifulGirl) {
        this.beautifulGirl = beautifulGirl;
    }

    @Override
    public void giveFlowers() {
        System.out.println(beautifulGirl.getName() + "送你花。。。。。。。");
    }

    @Override
    public void giveChocolate() {
        System.out.println(beautifulGirl.getName() + "送你巧克力。。。。。");
    }

    @Override
    public void giveBook() {
        System.out.println(beautifulGirl.getName() + "送你书。。。。。。");
    }
}