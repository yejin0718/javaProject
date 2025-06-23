package chapter08.section04;

public interface Phone {
//    인터페이스의 필드는 상수로만 사용이 가능: 항상 같은 값을 갖는 필드
//    static final 키워드 생략 가능(원래 상수가 되려면 static final 키워드를 선언)
    String name = "Phone";

//    인터페이스는 추상메소드에 public과 abstact를 생략 가능
    void callPhone(String phoneNumber);
    public abstract void receivePhone(String phoneNumber);
}
