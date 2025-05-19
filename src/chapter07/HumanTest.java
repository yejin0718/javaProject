package chapter07;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        human1.name = "김폴리";
        human1.age = 20;
        human1.walk("학교");
        human1.eat("파스타");

        human2.name = "이폴리";
        human2.age = 22;
        human2.walk("집");
        human2.eat("국밥");
    }
}
