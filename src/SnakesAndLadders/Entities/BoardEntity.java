package src.SnakesAndLadders.Entities;

public abstract class BoardEntity {
    int start;
    int end;

    public BoardEntity(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public abstract String getString(int index);
    public abstract String getEncounterMessage();

}
