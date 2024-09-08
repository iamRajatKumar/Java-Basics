public class PrimitiveDataType {

    public static void main(String[] args) {
        //4 byte
        int max =2147483647, min = -2147483647;
        //2 byte
        short smax = 32767, smin = -32767;
        //8 byte
        long lmax = 9223372036854775807L, lmin = -9223372036854775807L;
        //1 byte
        byte bmax=127, bmin= -128;
        //float
        float f = 1.0f;
        //double 
        double d = 1.5d;
        //Boolean
        boolean var;
        var= true;
        //character
        char c = '\u00A7';
        //String
        String s = "rajat \u00f1";
        System.out.println(" Integer: "+max+" "+min+"\n "+"Byte: "+bmax+" "+bmin+"\n "+"Long: "+lmax+" "+lmin+"\n "+"Short :"+smax+" "+smin+" ");
        System.out.println(" Float: "+f +"\n Double: "+d+"\n Boolean: "+var+"\n Character: "+c+"\n String: "+s);
        
        //String with Int
        String s1 ="100";
        int num = 10;
        System.out.println(" "+Integer.parseInt(s1)+num);
    }
}