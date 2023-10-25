package override;

public interface VideoPlayer {
    public boolean play();
    default String caption(int size) {
        if (size > 10)
            return "MIDDLE";
        return "BASIC";
    }
}
