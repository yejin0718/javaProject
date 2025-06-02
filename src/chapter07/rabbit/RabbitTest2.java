package chapter07.rabbit;

public class RabbitTest2 {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit();
        System.out.println(rabbit1);

        Rabbit rabbit2 = new Rabbit("하얀동그라미토끼", 50, 100);
        System.out.println(rabbit2);
    }
}