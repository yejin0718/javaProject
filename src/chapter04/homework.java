package chapter04;

import java.util.Scanner;

public class homework {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int subjectCount;
        System.out.print("과목 수를 입력하세요: ");
        subjectCount = scanner.nextInt();

        int totalCredits = 0;
        double totalGradePoints = 0.0;

        for (int i = 0; i < subjectCount; i++) {
            System.out.println("===========" + (i + 1) + "번째 과목 정보를 입력하세요.========");

            System.out.print("*과목명: ");
            String subjectName = scanner.next();

            System.out.print("*이수 학점: ");
            int credit = scanner.nextInt();

            System.out.print("*성적 학점: ");
            double grade = scanner.nextDouble();

            totalCredits += credit;
            totalGradePoints += grade * credit;
        }

        double avg = totalGradePoints / totalCredits;
        avg = Math.round(avg * 100.0) / 100.0;

        System.out.println("학습자의 평균 학점은 " + avg + "입니다.");

        scanner.close();
    }
}
