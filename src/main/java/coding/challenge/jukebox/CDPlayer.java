package coding.challenge.jukebox;

import java.util.Set;

public class CDPlayer {
    private CD cd;
    private final Set<CD> cds;
    private final Playlist playlist;

    public CDPlayer(Set<CD> cds, Playlist playlist) {
        this.cds = cds;
        this.playlist = playlist;
    }

    protected void playNextSong(){}
    protected void playPrevSong(){}
    protected void addCD(CD cd){}
    protected void removeCD(CD cd){}

    public CD getCd() {
        return cd;
    }

    public Set<CD> getCds() {
        return cds;
    }

    public Playlist getPlaylist() {
        return playlist;
    }
}
