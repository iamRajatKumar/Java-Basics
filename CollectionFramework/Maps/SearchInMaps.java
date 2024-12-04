package CollectionFramework.Maps;

import java.util.Map;
import java.util.TreeMap;

public class SearchInMaps {
    public static void main(String[] args) {
        Map<Code, String> map = new TreeMap<Code, String>();
        map.put(new Code("S11", "11"),"Rajat");
        map.put(new Code("S11", "22"),"Deepali");
        map.put(new Code("S11", "00"),"Raj");
        map.put(new Code("S11", "65"),"Rajdeep");

        //getting value using key
        System.out.println("\n"+map.get(new Code("S11", "11")));

        //getting key using value
        Code code = null;

        for(Code key: map.keySet()){
            if(map.get(key).equals("Deepali")){
                code = key;
                break;
            }
        }
        System.out.println("Key is : "+code);
    }
}

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