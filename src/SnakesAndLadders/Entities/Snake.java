package src.SnakesAndLadders.Entities;

public class Snake extends BoardEntity {
    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getString(int index) {
        return "S: "+index;
    }

    @Override
    public String getEncounterMessage() {
        return "Encountered a Snake";
    }
}
