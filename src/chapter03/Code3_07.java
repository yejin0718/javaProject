package chapter03;

import java.util.Scanner;

public class Code3_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("파운드(lb)를 입력하세요: ");
        double lb = s.nextInt();
        double changKg = lb / 2.204623;

        System.out.println(lb+"파운드(lb)는 " + changKg + "킬로그램(kg)입니다.");

        System.out.print("킬로그램(kg)을 입력하세요: ");
        double kg = s.nextInt();
        double changLb = kg * 2.204623;

        System.out.println(kg+"파운드(lb)는 " + changLb + "킬로그램(kg)입니다.");

        s.close();
    }
}
