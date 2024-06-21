package src.SnakesAndLadders;

import src.SnakesAndLadders.Entities.Game;
import src.SnakesAndLadders.Entities.Player;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int dimension,diceCount;

        System.out.println("Enter the dimension of the Game");
        dimension=sc.nextInt();
        System.out.println("Enter the total diceCount");
        diceCount=sc.nextInt();

        Player Ambuj=new Player("ambuj");
        Player Abhi=new Player("abhi");
        Player Amit=new Player("amit");
        Player tushar=new Player("Tushar");
        Player Ram=new Player("ram");

        Game game=new Game(dimension,diceCount);
        game.addPlayer(Ambuj);
        game.addPlayer(Abhi);
        game.addPlayer(Amit);
        game.addPlayer(tushar);
        game.addPlayer(Ram);

        game.launchGame();


    }
}
