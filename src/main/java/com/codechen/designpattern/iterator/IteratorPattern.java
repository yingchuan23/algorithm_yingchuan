package com.codechen.designpattern.iterator;


public class IteratorPattern {

    public static void main(String[] args) {

        Aggregate ag = new ConcreteAggregate();
        ag.add("山东大学");
        ag.add("山东建筑大学");
        ag.add("济宁学院");
        System.out.print("聚合的内容有: ");
        Iterator it = ag.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString() + "\t");
        }
        Object ob = it.first();
        System.out.println(" inFirst: " + ob.toString());
    }

}
