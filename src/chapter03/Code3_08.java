package chapter03;

import java.util.Scanner;

public class Code3_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("키를 입력해주세요: ");
        double cm = s.nextDouble();
        System.out.print("체중을 입력해주세요: ");
        double kg = s.nextDouble();

        double cmMath;
        cmMath = cm/100;
        cmMath = Math.pow(cmMath, 2);
        double BMI = kg / cmMath;

        System.out.println("당신은 체중" + kg +"kg, 키" + cm + " 이므로 BMI지수가 " + BMI + "입니다.");

        s.close();
    }
}
