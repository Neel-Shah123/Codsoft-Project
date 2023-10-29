import java.util.Scanner;
import java.util.Random;

class Task1{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
 	 	 	25
Random ran = new Random();

int score = 0;
int option=1;

System.out.println("Welcome to the Number Guessing Game!");


System.out.println(" You have 5 number of attempts to guess the number between 1 to 100");

while(option ==1){
int randomNo = ran.nextInt(100) +1; // within range 1 to 100

int Attempt = 0;

for(int i=1;i<=5;i++){
Attempt++;



System.out.println("Enter the guess number ");
int num = sc.nextInt();

if(num==randomNo){


System.out.println("Guess is correct");
System.out.println("You guessed the correct number in "+Attempt+" attempt");

score++;
break;


}

else if (num < randomNo){
System.out.println("Guess is too low ");

}


else{
System.out.println("Guess is too high ");
}


if(i == 5){

System.out.println("You've run out of attempts. The corrected number was  "+ randomNo);

}
}
System.out.println("Do you want to play again? (1 for yes, 0 for no)");
   option = sc.nextInt();

}
if (option == 0) {
System.out.println("Thank you for playing!!");
 System.out.println("Your total score is " + score);
System.exit(0);
 } 
}
}