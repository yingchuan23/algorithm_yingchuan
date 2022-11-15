package com.codechen.designpattern.adapter.adapter2;


interface Target {

    public void request();

}

class Adaptee {

    public void specilrequest() {
        System.out.println("具有特殊的功能");
    }

}


class ConcreteTarget implements Target {


    @Override
    public void request() {
        System.out.println("具有普通的功能。。。。");
    }

}


class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specilrequest();
    }
}


public class AdapterTest2 {
    public static void main(String[] args) {
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();

        /*使用特殊的功能*/
        /*需要创建一个被被适配者作为参数*/
        Adapter adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
