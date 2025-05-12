package chapter06;

public class ForTest4 {
    public static void main(String[] args) {
        int hap = 0;
        String oddEven = "";

        for(int i=1; i<=1000; i++) {
            if(i % 2 == 0) {
                hap += i;
                oddEven = "짝수";
            }
        }

        System.out.println("1-100 까지의 " + oddEven + "의 합계는 " + hap + "이다.");
    }
}
