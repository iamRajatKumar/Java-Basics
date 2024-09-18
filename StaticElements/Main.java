package StaticElements;

public class Main {
    public static void main(String[] args) {
        
        //we dont need object while using static keyword
        //TestStatic obj1 = new TestStatic();

        System.out.println("obj1 Static Var = "+TestStatic.getStaticVar());
        TestStatic.setStaticVar(25);
        System.out.println("obj1 Static Var = "+TestStatic.getStaticVar());

        
        System.out.println("obj2 Static Var = "+TestStatic.getStaticVar());
        TestStatic.setStaticVar(50);
        System.out.println("obj2 Static Var = "+TestStatic.getStaticVar());

        //TestStatic obj3 = new TestStatic();
        System.out.println("obj3 Static Var = "+TestStatic.getStaticVar());

        // output without using static keyword
        // obj1 Static Var = 0
        // obj1 Static Var = 25
        // obj2 Static Var = 0
        // obj2 Static Var = 50
        // obj2 Static Var = 0


        //output after using static keyword in public int staticVar =0;
        //obj1 Static Var = 0
        // obj1 Static Var = 25
        // obj2 Static Var = 25
        // obj2 Static Var = 50
        // obj3 Static Var = 50

    }
}
