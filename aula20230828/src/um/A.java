package um;

import dois.B;

public class A {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B();
        B b3 = new B();

        System.out.println(b1.getClass());
        System.out.println(b2.getClass());
        System.out.println(b3.getClass());

    }
}

