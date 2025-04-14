package chapter03;

import java.util.Scanner;

public class Code3_10 {
    public static void main(String[] args) {
        System.out.println("========== 편의점 일일 매출 계산기 =====");

        int total = 0;
        total -= 900 * 10;
        total += 1800 * 2;
        total -= 3500 * 5;
        total += 4000 * 4;
        total += 1500 * 1;
        total += 2000 * 4;
        total += 1800 * 5;

        System.out.println("편의점 일일 총 매출액: " + total);
    }
}
