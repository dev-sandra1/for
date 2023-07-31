import java.util.Scanner;

public class Excercise{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int numSaludo ;
      System.out.print("how many greetings do you want?: ");
        numSaludo = entry.nextInt();

        for(int greeting = 1 ; greeting <= numSaludo ; greeting++ ) {
       System.out.println(greeting);
    }
    }
}