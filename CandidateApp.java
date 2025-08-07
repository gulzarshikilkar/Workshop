import java.util.*;

public class CandidateApp{
       public static void main(String X[]){

                 Scanner sc=new Scanner(System.in);
               int age;
               System.out.println("Enter the Age Of Candidate ");
               age=sc.nextInt();
               System.out.println((age>18)?(age +" Eligible For Voting"):(age +" Not Eligible for voting"));



       }
}