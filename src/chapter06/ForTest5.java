package chapter06;

public class ForTest5 {
    //50~1000 사이의 짝수의 합계를  구하시오.
    public static void main(String[] args) {
        int num = 1000;
        int hap = 0;
        String oddEven = "";

        for(int i=500; i<=num; i++) {
            if(i % 2 == 0) {
                hap += i;
                oddEven = "짝수";
            }
        }

//        for(int i=500; i<=num; i+=2) {
//                hap += i;
//                oddEven = "짝수";
//        }

        System.out.println("500-1000 까지의 " + oddEven + "의 합계는 " + hap + "이다.");
    }
}
