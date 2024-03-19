/*Do not enter any number that is multiple of all the prime numbers, that is 210.
Game Condition:
1. Both players input integers.
2. A random number between 1 and 9 (inclusive) is generated.
3. The program determines the winner based on the following conditions:
4. If both player inputs are divisible by the random number, the player with the lesser input wins. If the inputs are equal, it's a tie.
5. If only one player's input is divisible by the random number, that player wins.
6, If neither player's input is divisible by the random number, nobody wins.*/

package Mini_project;       //Ignore when copying

import java.util.Random;
import java.util.Scanner;

public class Game_1 {
    public static void main(String[] args) {
        Random rand = new Random();
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int ply1, ply2;
        System.out.println("Do not enter anything thats a multiple of 210");
        for(int i=0; i<5; i++){
            System.out.print("Enter an integer from player 1: ");
            ply1 = input.nextInt();
            System.out.print("Enter an integer from player 2: ");
            ply2 = input.nextInt();

            int random_input = rand.nextInt(9)+1;
            System.out.println("Generated Number: "+random_input);
            
            if((ply1%1 == 0 && ply1%2 == 0 && ply1%3 == 0 && ply1%5 == 0 && ply1%7 == 0)||(ply2%1 == 0 && ply2%2 == 0 && ply2%3 == 0 && ply2%5 == 0 && ply2%7 == 0)){
                throw new IllegalArgumentException("Don't be over smart.");
            }
            else{
                if(ply1%random_input == 0 && ply2%random_input == 0){
                    if(ply2>ply1){
                        System.out.println("Player 1 wins.");
                    }
                    else if(ply1>ply2){
                        System.out.println("Player 2 wins.");
                    }
                    else{
                        System.out.println("No body wins.");
                    }
                }
                else if (ply1%random_input == 0 && ply2%random_input != 0){
                    System.out.println("Player 1 wins.");
                }
                else if(ply1%random_input != 0 && ply2%random_input == 0){
                    System.out.println("Player 2 wins.");
                }
                else{
                    System.out.println("No body won");
                }
            }
        }
    }
}