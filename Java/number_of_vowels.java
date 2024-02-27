package Java;
import java.util.*;

public class number_of_vowels{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        String str_lower = str.toLowerCase();
        char str_array[] = str_lower.toCharArray();
        char vow[] = {'a', 'e', 'i', 'o', 'u'};

        int count_vow = 0;
        int count_con = 0;
        int count_space = 0;

        for(int i=0; i<str_array.length; i++){
            for(int j=0; j<vow.length; j++){
                if(str_array[i] == vow[j]){
                    count_vow++;
                }
            }
            if(str_array[i] == ' '){
                count_space++;
            }
        }

        count_con = str_array.length - (count_space + count_vow);

        System.out.println("Number of vowels: "+count_vow);
        System.out.println("Number of consonants: "+count_con);
        
        input.close();
    }
}