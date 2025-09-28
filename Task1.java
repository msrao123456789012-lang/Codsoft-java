import java.util.Random;
import java.util.*;
public class Task1
{
	public static void main(String[] args) {
	//for  getting input from user
	Scanner sc=new Scanner(System.in);
	//for generating random number
    Random r=new Random();
   //initializing score to zero
    int score=0;
	//calling playgame method 
    int score1=playgame(sc,r,score);
	    //printing total score obtained by user
    System.out.println("your score is:"+score1);
	}
	public static int playgame(Scanner sc,Random r,int score){
	   //generating random number between 1-100
	int randnum=r.nextInt(1,101);
		//System.out.println(randnum);
		//setting choice limit for each random number to limited 
	int choicelimit=10;
	   //checking and entering into the loop
	while(true){
		//checking user out of choices or not
	  if(choicelimit>=1){
		 System.out.print("enter your guess the number from ranges from 1-100:");
		 int userchoice=sc.nextInt();
		 //checking and generating whether user guess is correct or too long or too short 
		if(userchoice<randnum){
		   System.out.println("too low ");
		   choicelimit--;
		 }
		 else if(userchoice>randnum){
			System.out.println("too high");
			choicelimit--;
		 }
		 else{
			System.out.println("you got the number,congrats!");
			System.out.println("you guessed within "+(10-choicelimit)+" choices");
			score++;
			//System.out.println(score);
		 //asking user either he/she wants to play again or not
			System.out.println("Do you want to play again if you want to play again enter 1 else enter 0");
			int play_again=sc.nextInt();
			//if he/she wants to play again then the whole things happens from beginning
		 if(play_again==1){
			   return playgame(sc,r,score);
			}
		   //if he/she does not want to play then quit from the current game and return to the main method
			else{
				return score; 
			}
			//break;
		 }
		 }
		//when user run out of choices for a particular number guess then user prompted to enter to play again or not 
		 else{
			 System.out.println("out of choice guess");
			 score--;
			 System.out.println("Do you want to play again if you want to play again enter 1 else enter 0");
			 int play_again=sc.nextInt();
			 if(play_again==1){
			   return playgame(sc,r,score);
			}
			else{
				return score; 
			}
			 //break;
		 }
		
	   }
	   // return score;

	}
}
