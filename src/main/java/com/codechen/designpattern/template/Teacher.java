package com.codechen.designpattern.template;

public class Teacher extends AbstractPerson {
    @Override
    protected void dressUp() {
        System.out.println("穿工作服。。。");
    }

    @Override
    protected void eatBreakfast() {
        System.out.printf("做早饭，吃早饭，喂孩子。。");
    }

    @Override
    protected void takeThings() {
        System.out.println("准备昨天考试的试卷，然后上课的时候讲题。。。");
    }
}
