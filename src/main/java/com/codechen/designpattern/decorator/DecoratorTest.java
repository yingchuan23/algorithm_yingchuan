package com.codechen.designpattern.decorator;


/*定义被装饰者*/
interface Human {

    /*穿衣服*/
    void wearClothes();

}

/*定义装饰者*/
abstract class Decorator implements Human {

    private Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }
}

/*然后定义下面的三个不同的装饰者方法*/
class Decorator_zero extends Decorator {

    public Decorator_zero(Human human) {
        super(human);
    }

    public void goHome() {
        System.out.println("进房子。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        /*x想要穿衣服  就先要进房子*/
        goHome();
    }
}


class Decorator_first extends Decorator {

    public Decorator_first(Human human) {
        super(human);
    }

    public void goClothespress() {
        System.out.println("去衣柜找找看。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothespress();
    }
}

class Decorator_two extends Decorator {

    public Decorator_two(Human human) {
        super(human);
    }

    public void findClothes() {
        System.out.println("找到一件D&G。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findClothes();
    }
}

class Person implements Human {

    @Override
    public void wearClothes() {
        System.out.println("穿什么呢。。");
    }

}


//测试类
public class DecoratorTest {


    public static void main(String[] args) {

        Human person = new Person();

        Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));

        decorator.wearClothes();
    }
}







