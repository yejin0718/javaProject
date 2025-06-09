package chapter07.access;

public class RabbitPublicTest {
    public static void main(String[] args) {
        RabbitPublic r1 = new RabbitPublic();
        r1.shape = "Circle";
        r1.x = 10;
        r1.y = 20;

        System.out.printf("토끼의 모양은 [%s]입니다.\n",r1.shape);
        System.out.printf("토끼의 위치는 (%d,%d)입니다.\n",r1.x, r1.y);
    }
}
