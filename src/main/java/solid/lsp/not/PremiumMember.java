package solid.lsp.not;

public class PremiumMember extends Member {

    public PremiumMember(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {
        System.out.println("PremiumMember joinTournament");
    }

    @Override
    public void organizeTournament() {
        System.out.println("PremiumMember organizeTournament");
    }
}
