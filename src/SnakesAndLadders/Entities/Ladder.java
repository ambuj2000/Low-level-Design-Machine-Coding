package src.SnakesAndLadders.Entities;

public class Ladder extends BoardEntity {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public String getEncounterMessage() {
        return "Encountered a Ladder";
    }
}
