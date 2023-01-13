package com.driver;

public class Main {
    public static void main(String[] args) {
        A bObj=new B();
        String s=bObj.meth();
        System.out.println(s);
    }

}
class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{

    String meth(){
        return "Method is overridden in Extendend class B";
    }
}