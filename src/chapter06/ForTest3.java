package chapter06;

public class ForTest3 {
    public static void main(String[] args) {
//        N명의 줄을 세우는 방법에 대한 경우의 수
        int fact = 1;
        int count = 7;

        for(int i = 1; i <= count; i++) {
            fact *= i;
        }

        System.out.println(count + "명의 줄을 세울 수 있는 경우의 수는 "+fact+"개이다.");
    }
}
