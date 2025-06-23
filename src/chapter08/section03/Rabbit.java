package chapter08.section03;

public abstract class Rabbit {
    String shape;
    int x,y;

    abstract public void move(int x, int y);

    public void eat(String food) {
        System.out.println("Rabbit" + shape + " eats " + food);
    }
}
