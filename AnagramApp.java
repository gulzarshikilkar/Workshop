import java.util.*;

public class AnagramApp {
    public static void main(String x[]) {
        char ch[] = new char[]{'a','b','a','C','d'};
        char ch1[] = new char[]{'b','d','A','a','c'};

        Scanner sc = new Scanner(System.in);
	  
     /*   System.out.println("Enter 5 characters for the first char array:");
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
          }

        System.out.println("Enter 5 characters for the second char array:");*/
        for (int j = 0; j < ch1.length; j++) {
            ch[j] =Character.toLowerCase(ch[j]);
	    ch1[j] =Character.toLowerCase(ch1[j]);

             }

        

       
        Arrays.sort(ch);
        Arrays.sort(ch1);
	
                if (Arrays.equals(ch, ch1)) {
            System.out.println("The Strings are anagrams");
           } else {
            System.out.println("The Strings are not anagrams");
                  }
    }
}
