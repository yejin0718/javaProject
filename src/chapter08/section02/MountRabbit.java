package chapter08.section02;

public class MountRabbit extends Rabbit{
    String mountName;

    public MountRabbit() {
        super();
        System.out.println("2. MountRabbit의 생성자가 실행됨.");
    }

    void eatWildGrass() {
        System.out.println("산토끼는 풀을 먹는다.");
    }
}
