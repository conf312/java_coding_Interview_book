package solid.lsp.not;

public class FreeMember extends Member {

    public FreeMember(String name) {
        super(name);
    }

    @Override
    public void joinTournament() {
        System.out.println("Classic joinTournament");
    }

    // 이 메서드는 리스코프 치환 원칙에 맞지 않다.
    @Override
    public void organizeTournament() {
        System.out.println("A free member cannot organizeTournament");
    }
}
