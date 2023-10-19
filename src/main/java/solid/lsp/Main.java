package solid.lsp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TournamentJoiner> members1 = List.of(new PremiumMember("Jack"), new FreeMember("Tom"));
        List<TournamentOrganizer> members2 = List.of(new PremiumMember("Jack"));

        for (TournamentJoiner member : members1) {
            member.joinTournament();
        }

        for (TournamentOrganizer member : members2) {
            member.organizeTournament();
        }
    }
}
