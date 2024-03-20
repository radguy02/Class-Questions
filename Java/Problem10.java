//A program that simulates tossing a coin 100 times and counts number of heads and tails.

package Java;
import java.util.Random;

public class Problem10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = 0;
        int heads = 0, tails = 0;
        boolean side;
        
        while(i != 100){
            side = rand.nextBoolean();
            if(side){                               //Taking Boolean Sides = true as heads.
                heads++;
            }
            else{                                   //Taking boolean sides = false as tails.
                tails++;
            }
            i++;
        }
        System.out.println("No. of tails: " + tails);
        System.out.println("No. of heads: " + heads);
    }    
}