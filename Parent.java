package com.acadgild.java.session4;

class Parent{
private void method1(){
 System.out.println ("Parent's method1()");
}
public void method2() {
 System.out.println ("Parent's method2()");
method1();
}
}
 class Child extends Parent {
 public void method1() {
 System.out.println ("Child's method1()");
} 
 }

/* output -  Parent's method2()
             Parent's method1()*/
 
