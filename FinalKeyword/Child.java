package FinalKeyword;

public class Child {
    public final int x;
    //if we iniatialzie the value constructor is not allowd
    public Child() {
        this.x=10;
    }

    public Child(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
    // setter is not allowed
    // public void setX(int x) {
    //     this.x = x;
    // }

}
