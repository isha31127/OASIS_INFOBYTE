import java.util.*;
public class GTN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int start = 1;
        int end = 100;
        int attempt = 4;
        int i=0;
        int ans = random.nextInt(end)+start;
        System.out.println("*************************************************WELCOME TO THE NUMBER GUESSING GAME**********************************************\n");
        System.out.println("_______________________________________________________________RULES______________________________________________________________\n");
        System.out.println("You have given 4 chances to guess the number\n");
        System.out.println("___________________________________________________________________________________________________________________________________\n\n");
        System.out.println("*************************************************Let's start the game*************************************************************\n");
        while(i<attempt){
            System.out.printf("\nGuess the number between "+start+" and "+end+" : ");
            int n = sc.nextInt();
            if(n==ans){
                System.out.println("\nYes...Correct,number is "+ans+" \n you have guessed the number in "+i+" attempts :)");
                break;
            }
            else if(n<ans){
                System.out.println("\nYour guess is smaller than Correct guess ");
            }
            else if(n>ans){
                System.out.println("\nyour guess is greater than Correct guess ");
            }
            i++;
        }
    if(i==attempt){
        System.out.println("\n\n********************************You have used your all "+i+" attempt********************************** ");
        System.out.println("\n\nCorrect guess was "+ans);
    } 
    System.out.println("\nThanks for playing.....\n\n BYE :)");
    }
}
