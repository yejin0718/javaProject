package chapter03;

import java.util.Scanner;

public class Code3_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\n===================운전자 합격 조회 프로그램===================\n");
        //점수입력
        System.out.print("* 운전자 점수 입력: ");
        int score = s.nextInt();

        //입력받은 정수가 합격인지 불합격인지 판단
        String result = "";
        if(score >= 70) {
            result = "합격";
        } else {
            result = "불합격";
        }

        //결과출력
        System.out.println(result);
    }
}
