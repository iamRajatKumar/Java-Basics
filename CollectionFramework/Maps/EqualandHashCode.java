package CollectionFramework.Maps;

class Code implements Comparable<Code>{
    private String sectionNo;
    private String lectureNo;
    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    
    
    public Code(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    @Override
    public int compareTo(Code o) {
        String code1  = sectionNo.concat(lectureNo);
        String code2 = o.getSectionNo().concat(o.getLectureNo());
        return code1.compareTo(code2);
    }

    @Override
    public String toString() {
        return "Code [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
    }
    
}

public class EqualandHashCode {
    public static void main(String[] args) {
        // String x1 = "Rajat";
        // x1 += "Sharma";
        // String x2 = "RajatSharma";

        // System.out.println(x1.hashCode()); //o/p : -1919317912
        // System.out.println(x2.hashCode()); //o/p : -1919317912
        // System.out.println(x1 == x2); //output false
        // System.out.println(x1.equals(x2)); //output true, beacuse the hascode are same

        Code code1 = new Code("01","02");
        Code code2 = new Code("01","02");

        System.out.println(code1 == code2); //output false
        System.out.println(code1.equals(code2)); //output false, because the hasCodes are different
        System.out.println(code1.hashCode()); //output : 2061475679
        System.out.println(code2.hashCode()); //output : 140435067
    }
}
