package chapter08.LAB;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {

        while (true) {
            int speed = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("가속할 속도 ==> ");
            speed = sc.nextInt();

            if(speed == -1) {
                System.out.println("자동차가 멈춥니다.");
                break;
            }

            SportCar sportCar = new SportCar();
            sportCar.speedUp(speed, "스포츠카");

            SchoolBus schoolBus = new SchoolBus();
            schoolBus.speedUp(speed, "스쿨버스");
        }


    }
}
