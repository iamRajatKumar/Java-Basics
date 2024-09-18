package InnerClass.StaticInnerClass;

public class ToyotaCars {
    private int x=10;

    public static class Brand {
        // public static String brandname= "Toyota";
        private static String brandname= "Toyota";
        
        public static void tagLine(){
            System.out.println("Best Cars in the world!");
        }
    }

    public class NonStaticInner {
        public void Model(String model){
            System.out.println("Make of the Cars: "+model);
            System.out.println("Brand Name: "+Brand.brandname);
            System.out.println("Value of X :"+x);
        }
        
    }

    
    NonStaticInner nonStaticInner = new NonStaticInner();
    public NonStaticInner getNonStaticInner() {
        return nonStaticInner;
    }



}
