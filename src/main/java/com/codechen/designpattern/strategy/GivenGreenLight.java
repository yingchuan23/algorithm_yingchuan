package com.codechen.designpattern.strategy;

public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国开个绿灯  放过刘备");
    }

}
