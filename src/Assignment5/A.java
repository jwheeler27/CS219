package Assignment5;

public class A
{
    public void method1() { System.out.println("A 1"); }

    public void method2() { System.out.println("A 2"); }

    public String toString() { return "A"; }
} // end class A

class B extends A
{
    public void method2() { System.out.println("B 2"); }
} // end class B

class C extends A
{
    public void method1() { System.out.println("C 1"); }

    public String toString() { return "C"; }
} // end class C

class D extends C
{
    public void method2() { System.out.println("D 2"); }
} // end class D

// Client program to use the A, B, C, and D classes.
class ABCDMain
{
    public static void main(String[] args)
    {
        A[] elements = {new A(), new B(), new C(), new D()};
        for (A e : elements)
        {
            System.out.println(e);
            e.method1();
            e.method2();
        }
    } // end main
}// end ABCDMain