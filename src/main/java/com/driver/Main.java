package com.driver;

public class Main {

    public static class A
    {
        public String meth()
        {
            return "Involving method from class A";
        }
    }
    public static class B extends A{
        public String meth(){
            return "Method is overriding in Extended class B";
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.meth();
        B b1 = new B();
        b.meth();
    }
}