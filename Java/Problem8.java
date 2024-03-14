package Learn;

public class test6 {
    private static void length_method(){
        String str = "programming";
        System.out.println(str.length());
    }

    private static void cases(){
        String str = "It is what it is";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }

    private static void concaty(){
        String str1 = "It is ";
        String str2 = "what it is";
        System.out.println(str1.concat(str2));                  //basically can only add two strings not more than that
        System.out.println("It "+"is "+"what "+"it "+"is");     //Addition goes brrrr
    }

    private static void comparetoo(){
        String str1 = "Vandal";
        String str2 = "Phantom";
        String str3 = "Odin";
        System.out.println(str1.compareTo(str3));
        System.out.println(str2.compareTo(str3));
    }

    private static void char_array(){
        String str = "saket";

        char[] chr = str.toCharArray();
        System.out.println(chr);
        for(int i = 0; i<chr.length; i++){
            System.out.print(chr[i]+" ");
        }
        System.out.println();
    }

    private static void char_at(){
        String str = "Java";
        char ch = str.charAt(2);
        System.out.println(ch);
        System.out.println(str.charAt(1));
        // System.out.println(str.charAt(-1)); //does not work -1 nhi kaam krta h bhai... java h python nhi
        // System.out.println(str.charAt(4));  //same as above
    }

    private static void str_contructs(){
        String s = new String();
        System.out.println(s);                      // prints "(Null)"
        char[] chars = {'A','n','i','s','h'};
        String s2 = new String(chars);
        System.out.println(s2);
        String s3 = new String(chars, 0, 3);
        System.out.println(s3);
    }

    private static void str_buff(){
        String str = "Programming";
        StringBuffer str_b = new StringBuffer(str);
        System.out.println(str_b.append(" in Java"));
        System.out.println(str_b.insert(2, "Java"));
        System.out.println(str_b.replace(1,4, "Java"));
        System.out.println(str_b.delete(1,4));
        System.out.println(str_b.reverse());
        System.out.println("Substring class example: "+ str_b.substring(3, 5));
    }
    public static void main(String[] args) {
        length_method();
        cases();
        concaty();
        comparetoo();
        char_array();
        char_at();
        str_contructs();
        str_buff();
    }
}