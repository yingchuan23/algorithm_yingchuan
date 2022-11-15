package com.codechen.designpattern.template;


/*使用抽象类定义整个流程的骨架*/
public abstract class AbstractPerson {

    //模板方法，使用final修改，防止子类改变算法的实现步骤
    public final void preparegotoschool() {
        dressUp();
        eatBreakfast();
        takeThings();
    }


    //以下是不同子类根据自身特性完成的具体步骤
    protected abstract void dressUp();

    protected abstract void eatBreakfast();

    protected abstract void takeThings();
}
