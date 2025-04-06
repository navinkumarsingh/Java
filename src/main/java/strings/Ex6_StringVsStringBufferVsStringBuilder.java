package strings;

public class Ex6_StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        //A1_String - immutable
        String s ="welcome";
        s.concat("to java");
        System.out.println(s); //immutable, cannot change original value of s

        //StringBuffer - mutable
        StringBuffer sb1 = new StringBuffer("welcome");
        sb1.append("to java");
        System.out.println(sb1);

        //StringBuilder - Immutable
        StringBuilder sb2 = new StringBuilder("welcome");
        sb2.append("to java");
        System.out.println(sb2);
    }
}
