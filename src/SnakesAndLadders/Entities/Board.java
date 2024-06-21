package src.SnakesAndLadders.Entities;

import src.SnakesAndLadders.Factory.BoardEntityEnum;
import src.SnakesAndLadders.Factory.EntityFactory;

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
                 addEntityToBoard(EntityFactory.getEntity(BoardEntityEnum.SNAKE,snakeStart,snakeEnd),snakeStart);
             }


             //create a ladder at random position which is empty

             start=2;
             end=size-1;
             int ladderStart=randomValueGenerator(start,end);
             start=ladderStart+1;
             int ladderEnd=randomValueGenerator(start,end);
             if(!isSnakeOrLadder(ladderStart)){
                 addEntityToBoard(EntityFactory.getEntity(BoardEntityEnum.LADDER,ladderStart,ladderEnd),ladderStart);
             }

        }
    }
    private int randomValueGenerator(int min,int max){
        return (int)Math.floor(Math.random()*(max-min+1))+min;
    }

    public void printBoard(){
        int dimension=(int)Math.sqrt(size);
        for(int index=1;index<=size;index++) {
            if (isSnakeOrLadder(index))
                System.out.print(this.cells.get(index).getString(index));

            System.out.println(" " + index);
            if(index%dimension==0){
                System.out.println("\n");
            }
        }
    }

    public boolean isSnakeOrLadder(int index){
        return this.cells.containsKey(index);
    }

    private void addEntityToBoard(BoardEntity entity,int index){
        this.cells.put(index,entity);
    }
}
