package StaticElements;

public class TestStatic {
    public static int staticVar =0;

    public static int getStaticVar() {
        return staticVar;
    }

    public static void setStaticVar(int staticVar) {
        TestStatic.staticVar = staticVar;
    }

    //getter setter   without static
    // public int getStaticVar() {
    //     return staticVar;
    // }

    // public void setStaticVar(int staticVar) {
    //     this.staticVar = staticVar;
    // }
    //imp note: We cant make a class as static unless it is inner class
}
