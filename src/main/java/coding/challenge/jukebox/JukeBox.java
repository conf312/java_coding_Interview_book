package coding.challenge.jukebox;

public class JukeBox implements Selector {
    private final CDPlayer cdPlayer;

    public JukeBox(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    @Override
    public void nextSoundBtn() {

    }

    @Override
    public void prevSongBtn() {

    }

    @Override
    public void addSongToPlaylistBtn(Song song) {

    }

    @Override
    public void removeSongFromPlaylistBtn(Song song) {

    }

    @Override
    public void shuffleBtn() {

    }
}
