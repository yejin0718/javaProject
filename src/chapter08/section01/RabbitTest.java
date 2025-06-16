package chapter08.section01;

public class RabbitTest {
    public static void main(String[] args) {
        System.out.println("Rabbit 객체 생성자의 토끼 객체의 수: " + Rabbit.cnt);

        Rabbit r1 = new Rabbit();
        System.out.println("Rabbit 객체 생성자의 토끼 객체의 수: " + Rabbit.RABBIT_NAME + r1.cnt);

        Rabbit r2 = new Rabbit();
        System.out.println("Rabbit 객체 생성자의 토끼 객체의 수: " + r2.cnt);
    }
}
