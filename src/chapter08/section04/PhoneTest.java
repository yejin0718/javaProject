package chapter08.section04;

//<인터페이스>
// new 연산자로 객체 생성 불가능
// 필드: 상수, 메소드: 추상메소드(예외적으로 default 키워드를 붙여서 메소드 구현가능)
// 인터에페이스 용도:
// - 약속(추상메소드)을 정해 놓고 약속을 지킨 클래스들만 만들 수 있다
// - 공동작업으로 프로젝트 할 때 정말 많이 사용: 메소드 이름, 반환형, 매개변수 중간에 수정이나 삭제를 함부로 하지 못하게 하기 위해서
// 인터페이스는 상속 받은 클래스는 추상메소드 외에 일반적인 다른 메소드도 구현 가능

public class PhoneTest {
    public static void main(String[] args) {
        TelePhone telephone = new TelePhone();
        FeaturePhone featurePhone = new FeaturePhone();
        SmartPhone smartPhone = new SmartPhone();

        telephone.answeringMachine("지금은 전화를 받을 수 없습니다. 메세지를 남겨주세요.");
        telephone.callPhone("010-1111-1234");
        telephone.receivePhone("010-2222-1234");

        featurePhone.sendSMS("010-3333-1234", "메세지 전송");

        smartPhone.installAPP("카카오톡");
    }
}
