package com.codechen.designpattern.proxy;

public class HerChum implements GiveGift {

    private You you;

    public HerChum(BeautifulGirl mm) {
        this.you = new You(mm);
    }


    @Override
    public void giveFlowers() {
        you.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        you.giveChocolate();
    }

    @Override
    public void giveBook() {
        you.giveBook();
    }
}