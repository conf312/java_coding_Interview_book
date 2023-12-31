package solid.lsp.not;

public abstract class Member {
    private final String name;

    public Member(String name) {
        this.name = name;
    }

    public abstract void joinTournament();
    public abstract void organizeTournament();
}
