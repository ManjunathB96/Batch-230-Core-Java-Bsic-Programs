package day1_basic_programs;

public class DemoOfStaticVariable {

    /*Note :
        1) The static variable is a class level variable, and it is common to all the class objects
         that is a single copy of the static variable is shared among all the class objects
          */

    int val1 = 8;            //instance variables
    int val2 = 9;

    void show() {
        val1 = 20;
        System.out.println(val1 + "  " + val2);
    }

    static int x = 2;
    static int y;
    static int a = 20;
    static int b;

    static void display(int c) {

        System.out.println(x);
        System.out.println("a =" + " " + a);
        System.out.println("b =" + " " + b);
        System.out.println("c =" + " " + c);
    }

    static {                //static block initialize static variables
        b = a + 30;
    }

    public static void main(String[] args) {
        System.out.println(x);// refer note : 1)
        System.out.println();
        System.out.println(y);

        System.out.println();
        //Static Variable can be accessed directly by the class name and doesn't need any object
        System.out.println(DemoOfStaticVariable.a);


        display(100);
        System.out.println();
        DemoOfStaticVariable.display(25); //Static method  can  also be accessed directly by the class name

        System.out.println();
        System.out.println("a =" + " " + a);
        System.out.println("b =" + " " + b);

        //printing instance variables  require  object
        DemoOfStaticVariable variable = new DemoOfStaticVariable();
        System.out.println();
        System.out.println(variable.val1);
        System.out.println(variable.val2);

        System.out.println();  // printing non-static mtd  require  object
        variable.show();
    }
}
