package chapter07.access;

public class RabbitPrivateTest {
    public static void main(String[] args) {
        RabbitPrivate rabbit1 = new RabbitPrivate();
        rabbit1.setShape("Rectangle");
        rabbit1.setPosition(50,100);
        System.out.println("토끼모양: "+rabbit1.getShape());
        System.out.println("토끼 현재 위치: ("+ rabbit1.getX()+ "." + rabbit1.getY() + ")");
    }
}
