package com.driver;

public class A {
    public String meth() {
        return "Invoking method from class A";
    }


    public class B extends A {
        B b = new B();
        String s = b.meth();

        public String meth() {
            return "Method is overridden in Extendend class B";
        }

        //public static void main(String[]args){
        String a = b.meth();

    }
}

