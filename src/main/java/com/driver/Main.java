package com.driver;

public class Main {
 public class A{
      String meth(){
          return "Invoking method from class A";
      }
      B b=new B();
      String s=b.meth();
  }
  public class B extends A {
      String meth(){
          return "Method is overridden in Extendend class B";
      }
    }
}