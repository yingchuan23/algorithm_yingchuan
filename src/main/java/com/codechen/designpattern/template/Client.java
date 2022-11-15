package com.codechen.designpattern.template;

public class Client {


    public static void main(String[] args) {

        Student student = new Student();
        student.preparegotoschool();

        Teacher teacher = new Teacher();
        teacher.preparegotoschool();
    }


}