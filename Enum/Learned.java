package Enum;

public enum Learned {
    COREJAVA(10), COLLECTIONS(20), GENERICS(30), JSP(40), MULTITHREADING(50);

    private int i;
    
    public int getI() {
        return i;
    }

    Learned(int i) {
        this.i = i;   
    }

    
}
