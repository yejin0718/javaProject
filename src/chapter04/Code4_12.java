package chapter04;

public class Code4_12 {
    public static void main(String[] args) {
        String str1 = "한국폴리텍대학 AISoftware Seoul Junsu";

        String s1 = str1.toUpperCase();
        System.out.println(s1);

        String s2 = str1.toLowerCase();
        System.out.println(s2);

        System.out.println(str1);

        String str2 = "   AISoftware   Seoul           ";
        System.out.println(str2);
        String s3 = str2.trim();
        System.out.println(s3);

        String str4 = str2.replaceAll("", "");
        System.out.println(str4);

        String str5 = str2.replace("", "");
        System.out.println(str5);
        String str6 = str2.replaceFirst("", "");
        System.out.println(str6);
    }
}
