public class DoubleEveryDay {

    public static void main(String[] args) {
        int num = 1;
        //int sum = 0;
        System.out.println("On Day 1 ₹ = "+num);
        for (int i =1; i < 30; i++) {
            
            num *= 2;
            System.out.println("Per day ₹ increasing by 2: "+num);
        }
        System.out.println("On 30 day ₹ value: "+num);
        
    }
}
