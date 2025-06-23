package chapter08.LAB;

public class SchoolBus extends Car{
    @Override
    public void speedUp(int speed, String carName) {
        if(speed > 60)
            speed = 60;
        super.speedUp(speed, carName);
    }
}
