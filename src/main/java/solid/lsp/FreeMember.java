package solid.lsp;


public class FreeMember implements TournamentJoiner {
    private final String name;

    public FreeMember(String name) {
        this.name = name;
    }

    @Override
    public void joinTournament() {
        System.out.println("Classic joinTournament");
    }
}
