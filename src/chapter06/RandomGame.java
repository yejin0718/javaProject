package chapter06;

import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computer = 0, user = 0;

        for( int i=1; i<=10; i++) {
            computer = (int)(Math.random()*5 + 1);
            System.out.printf("게임 %d회 : ", i);
            System.out.print("컴퓨터가 생각한 숫자는?(1~5 사이의 정수)");
            user = sc.nextInt();

            if(user == computer) {
                System.out.println("축하합니다. 제 생각과 일치했어요");
                break;
            }
        }
        System.out.println("게임이 종료되었습니다.");
        sc.close();
    }
}
