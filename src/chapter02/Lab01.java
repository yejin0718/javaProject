package chapter02;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ");
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.print("받는 사람 : " );
        String name = s1.nextLine();

        System.out.print("주소 : " );
        String address = s1.nextLine();

        System.out.print("무게(g) : " );
        int g = s2.nextInt();

        System.out.println("** 받는 사람 ==>"+name);
        System.out.println("** 주소 ==>"+address);
        System.out.println("** 배송비 ==>"+g*5);

        s1.close();
        s2.close();
    }
}
