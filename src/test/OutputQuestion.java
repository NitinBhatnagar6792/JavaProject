package test;


class Parent {

    static {

        System.out.println("1. Parent static block");

    }
 
    {

        System.out.println("2. Parent instance block");

    }
 
    Parent() {

        System.out.println("3. Parent constructor");

        print();

    }
 
    void print() {

        System.out.println("4. Parent print method");

    }

}
 
class Child extends Parent {

    String message = getMessage();
 
    static {

        System.out.println("5. Child static block");

    }
 
    {

        System.out.println("6. Child instance block");

    }
 
    Child() {

        System.out.println("7. Child constructor");

        print();

    }
 
    @Override

    void print() {

        System.out.println("8. Child print method");

    }
 
    static String getMessage() {

        System.out.println("9. Child getMessage method");

        return "Hello";

    }

}


public class OutputQuestion {

	
    public static void main(String[] args) {

        System.out.println("10. Starting main");

        Parent p = new Child();

        System.out.println("11. Ending main");

    }

    
    
}
