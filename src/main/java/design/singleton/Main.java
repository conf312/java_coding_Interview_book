package design.singleton;

public class Main {
    public static void main(String[] args) {
        // 인스턴스 얻기
        Singleton singleton = Singleton.INSTANCE;

        // 데이터 설정
        singleton.setData(42);

        // 데이터 가져오기
        System.out.println("Data: " + singleton.getData());
    }
}
