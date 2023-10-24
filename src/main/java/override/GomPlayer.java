package override;

public class GomPlayer implements VideoPlayer {
    @Override
    public boolean play() {
        return false;
    }

    public static void main(String[] args) {
        GomPlayer gomPlayer = new GomPlayer();
        System.out.println(gomPlayer.caption(25));
    }

}
