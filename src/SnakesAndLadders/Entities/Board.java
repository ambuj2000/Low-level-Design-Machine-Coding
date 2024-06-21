package src.SnakesAndLadders.Entities;

import java.util.HashMap;
import java.util.Map;

public class Board {
    int size;

    Map<Integer,BoardEntity> cells;

    public Board(int dimension) {
        this.size = dimension*dimension;
        cells=new HashMap<>();

        for(int iteration=0;iteration<dimension;iteration++){

            //create a snake at random position
             int start=2,end=size-1;//snake cannot be at position 1 or n
             int snakeStart=randomValueGenerator(start,end);
             end=snakeStart-1;
             int snakeEnd=randomValueGenerator(start,end);
             if(!isSnakeOrLadder(snakeStart)){
                 addEntityToBoard();
             }



             //create a ladder at random position which is empty

        }
    }
    private int randomValueGenerator(int min,int max){
        return (int)Math.floor(Math.random()*(max-min+1))+min;
    }

    private boolean isSnakeOrLadder(int index){
        return this.cells.containsKey(index);
    }

    private void addEntityToBoard(BoardEntity entity,int index){
        this.cells.put(index,entity);
    }
}
