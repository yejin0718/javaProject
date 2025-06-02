package chapter07;

public class Car {
    private String name;
    private String product;
    private int price;
    private int year;
    private int cc;

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    //메소드(기능)
    public void start(){
        System.out.println("시동을 건다.");
    }

    public void drive(int speed){
        System.out.println("시속 " + speed + "로 달린다.");
    }

    public void forward(){
        System.out.println("전진한다.");
    }

    public void backward(){
        System.out.println("후진한다.");
    }

    public void stop(){
        System.out.println("정지한다.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", cc=" + cc +
                '}';
    }
}
