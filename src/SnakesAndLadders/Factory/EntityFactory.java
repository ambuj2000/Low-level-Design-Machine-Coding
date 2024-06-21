package src.SnakesAndLadders.Factory;

import src.SnakesAndLadders.Entities.BoardEntity;
import src.SnakesAndLadders.Entities.Ladder;
import src.SnakesAndLadders.Entities.Snake;

public class EntityFactory {

    public static BoardEntity getEntity(BoardEntityEnum boardEntityEnum, int start, int end){

           if(boardEntityEnum.equals(BoardEntityEnum.SNAKE)){
                 return  new Snake(start,end);
           }else if(boardEntityEnum.equals(BoardEntityEnum.LADDER)){
               return new Ladder(start,end);
           }
           System.out.println("Invalid type of Board entity");
           return null;
    }
}
