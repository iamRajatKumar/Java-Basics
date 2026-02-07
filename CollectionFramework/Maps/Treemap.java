package CollectionFramework.Maps;

import java.util.TreeMap;
import java.util.Map;

class CodeTree implements Comparable<CodeTree>{
    private String sectionNo;
    private String lectureNo;
    public String getSectionNo() {
        return sectionNo;
    }

    public String getLectureNo() {
        return lectureNo;
    }

    
    
    public CodeTree(String sectionNo, String lectureNo) {
        this.sectionNo = sectionNo;
        this.lectureNo = lectureNo;
    }

    @Override
    public int compareTo(CodeTree o) {
        String CodeTree1  = sectionNo.concat(lectureNo);
        String CodeTree2 = o.getSectionNo().concat(o.getLectureNo());
        return CodeTree1.compareTo(CodeTree2);
    }

    @Override
    public String toString() {
        return "CodeTree [sectionNo=" + sectionNo + ", lectureNo=" + lectureNo + "]";
    }
    
}

public class Treemap{
    public static void main(String[] args) {
        Map<CodeTree, String> map = new TreeMap<CodeTree, String>();
        map.put(new CodeTree("S11", "11"),"Rajat");
        map.put(new CodeTree("S11", "22"),"Deepali");
        map.put(new CodeTree("S11", "00"),"Raj");
        map.put(new CodeTree("S11", "65"),"Rajdeep");

        System.out.println(map);
    }

}
