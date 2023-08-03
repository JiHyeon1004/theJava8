public class Foo {


    public static void main(String[] args) {

//        //함수형 인터페이스가 아니라면 이렇게 썼어야 했다.
//        //익명 내부 클래스 (anonymous inner class)
//        FunctionalInterfaceTest functionalInterfaceTest = new FunctionalInterfaceTest() {
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//            }
//        };

        //안에서 하는 일이 한 줄이라면 람다식으로 이렇게 표현 가능
        FunctionalInterfaceTest functionalInterfaceTest = () -> System.out.println("Hello");
        functionalInterfaceTest.doIt();

//        //한 줄이 아니라면
//        FunctionalInterfaceTest functionalInterfaceTest = () -> {
//            System.out.println("Hello");
//            System.out.println("doing 2 jobs");
//        };
    }

}

