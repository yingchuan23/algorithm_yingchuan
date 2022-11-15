package com.codechen.designpattern.adapter.adapter1;

/*需要适配的类*/
class Adaptee {
    public void specificRequest() {
        System.out.println("被适配类具有 特殊功能...");
    }
}

// 目标接口，或称为标准接口
interface Target {
    public void request();
}

class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("普通类具有 普通功能。。。。");
    }
}


class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }

}


public class AdapterTest {

    public static void main(String[] args) {
        /*使用的是普通的 功能类*/
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();


        /*使用的是特殊类的功能*/
        Adapter adapter = new Adapter();
        adapter.request();
    }

}