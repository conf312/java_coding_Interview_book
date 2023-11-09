package design.singleton;

public enum Singleton {
    INSTANCE; // 싱글 인스턴스를 나타내는 열거 상수

    // 싱글턴 클래스의 다른 멤버 변수 및 메서드를 추가할 수 있습니다.
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
