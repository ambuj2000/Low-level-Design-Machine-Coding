package src.SnakesAndLadders.Entities;

public class Ladder extends BoardEntity {
    public Ladder(int start, int end) {
        super(start, end);
    }

    @Override
    public String getString(int index) {
        return "L: "+index;
    }

    @Override
    public String getEncounterMessage() {
        return "Encountered a Ladder";
    }
}
