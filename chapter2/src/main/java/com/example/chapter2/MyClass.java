package com.example.chapter2;

import com.example.lib.ClassX;
import com.example.lib2.CLassX2;

import java.util.ArrayList;

public class MyClass {
    public static double average(int a, int b,int c){
        return (a+b+c)/3.0;
    }
    public static void main(String[] args){
        int a=11;
        int b=12;
        int c=13;
        System.out.println("Hello World!");
        System.out.println(average(1,2,3));
        ClassX t1=new ClassX();
        t1.method1();
        CLassX2 t2=new CLassX2();
        t2.method1();
        t2.method2();
        ArrayList p= new ArrayList();
        p.add(3);
        p.add("4543");
        p.add(23);
        for (Object o: p) {
            System.out.println("object is " + o);
        }


    }
}