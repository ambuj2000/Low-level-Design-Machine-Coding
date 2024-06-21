package src.SnakesAndLadders.Entities;

import src.SnakesAndLadders.Service.DiceService;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    int dimension;

    int diceCount;


    Queue<Player> players;

    Queue<Player>winners;

    Board board;

  public Game(int dimension,int diceCount){
        this.diceCount=diceCount;
        this.dimension=dimension;
        this.players=new LinkedList<>();
        this.winners=new LinkedList<>();
        board=new Board(dimension);
    }

    public void launchGame(){
        board.printBoard();
        Scanner sc=new Scanner(System.in);
        while(players.size()>1){

            Player currentPlayer=players.poll();
            System.out.println("Current player is "+currentPlayer.getUsername()
            +" at position "+currentPlayer.getPosition());
            System.out.println("Enter any button to roll up the dice");

            int diceRoll=sc.nextInt();

            int diceValue= DiceService.rollDiceValue(this.diceCount);
            int positionPlayer= currentPlayer.getPosition()+diceValue;

            if(board.isSnakeOrLadder(positionPlayer)){
                //move player to the end of entity
                BoardEntity entity=board.cells.get(positionPlayer);
                positionPlayer=entity.getEnd();
                System.out.println(entity.getEncounterMessage());
                System.out.println("Moving the player to : "+positionPlayer);

            }

            if(positionPlayer == board.size){
                //Player has won and added to the winner list
                System.out.println("The person has won: " +currentPlayer.getUsername());
                winners.add(currentPlayer);
            }else if(positionPlayer > board.size){
                //add the player back to the end of the queue
                  players.add(currentPlayer);
            }else {
                currentPlayer.setPosition(positionPlayer);
                players.add(currentPlayer);
            }

        }
    }


    public void addPlayer(Player player){
        this.players.add(player);
    }
}
