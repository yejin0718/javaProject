package chapter02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        System.out.println("\n\n===        단순 계산기      ===\n\n");

        Scanner s = new Scanner(System.in);

        System.out.print("* 첫번째 정수 값 입력: " );
        Integer num1 = s.nextInt();
        System.out.print("* 두번째 정수 값 입력: " );
        Integer num2 = s.nextInt();

        int resPlus, resMius, resMultiply, resDivide, resMod;
        resPlus = num1 + num2;
        resMius = num1 - num2;
        resMultiply = num1 * num2;
        resDivide = num1 / num2;
        resMod = num1 % num2;
        System.out.println(num1 + " + " + num2 + " = " + resPlus);
        System.out.println(num1 + " - " + num2 + " = " + resMius);
        System.out.println(num1 + " * " + num2 + " = " + resMultiply);
        System.out.println(num1 + " / " + num2 + " = " + resDivide);
        System.out.println(num1 + " % " + num2 + " = " + resMod);
    }
}
