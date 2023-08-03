//추상형 메서드가 하나 있으면 함수형 인터페이스
//두 개 있으면 아님.
//추가적으로 인터페이스 안에 static 메서드와 default 를 정의할 수 있다.

@java.lang.FunctionalInterface
public interface FunctionalInterfaceTest {

    //추상형 메서드
    //밑에 뭐가 있던 추상형 메서드가 하나이면 함수형 인터페이스
    void doIt();

    static void printName(){
        System.out.println("JiHyeon");
    }
    
    default void printAge(){
        System.out.println("24");
    }

}
