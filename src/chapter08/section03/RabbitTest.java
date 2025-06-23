package chapter08.section03;

public class RabbitTest {
    public static void main(String[] args) {
//        Rabbit rabbit = new Rabbit();
        HouseRabbit h = new HouseRabbit();
        MoutainRabbit m = new MoutainRabbit();

        h.move(10, 30);
        m.move(100, 300);

        m.run();

        h.eat("grasses");
        m.eat("wild grasses");
    }
}
