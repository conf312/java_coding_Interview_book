package solid.lsp.not;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> members1 = List.of(new PremiumMember("Jack"), new FreeMember("Tom"));

        for (Member member : members1) {
            member.organizeTournament();
        }
    }
}
