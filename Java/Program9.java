//Write a program that simulates rolling of two 6 sided dice
//until their combined result comes up as 7.

package Java;
import java.util.Random;

public class Program9 {
    public static void main(String[] args) {
        Random rand = new Random();

        int sum_of_two_dices = 0;
        int count = 0;
        int dice1, dice2;

        while(sum_of_two_dices!=7){
            dice1 = rand.nextInt(6)+1;
            dice2 = rand.nextInt(6)+1;

            sum_of_two_dices = dice1 + dice2;

            count++;

            System.out.printf("Roll:%d. %d + %d = %d\n", count, dice1, dice2, sum_of_two_dices);
        }
        System.out.printf("You won after %d tries.\n", count);
    }
}

