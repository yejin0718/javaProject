package chapter08.LAB;

public class Car {
    private String carName;
    private int speed;

    public String getCarName() {
        return carName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedUp(int speed, String carName) {
        System.out.printf("** %s의 현재 속도: %d \n", carName, speed);
    }
}
