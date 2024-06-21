package src.SnakesAndLadders.Service;

public class DiceService {

    public static int rollDiceValue(int diceCount){
        int start=1,end=6;
        int totalDiceCount=0;
        for(int iteration=0; iteration<diceCount; iteration++) {
            int diceValue = (int) Math.floor(Math.random() * (end - start + 1)) + start;
            totalDiceCount+=diceValue;
        }

        System.out.println("Rolled dice and got a value: "+totalDiceCount);
        return totalDiceCount;

    }
}
