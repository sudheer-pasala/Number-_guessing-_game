import java.lang.Math;
import java.util.Scanner;
class NumberGuessingGame{
    public static void main(String[]args){
        
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME.");
        
    System.out.println("Guess Any Number between 1-10");
    /*  A decimal Number as an Input is taken by the user */
    
    System.out.println("Enter your Number");
    
    Scanner sc= new Scanner(System.in);
    int x= sc.nextInt();
 
  //Random Number Generator code.
    int Max=10;
    int Min=1;
    int range= Max-Min+1;
    int randomNumber= (int) (Math.random()*range)+Min;
    System.out.println("The Number is:" + randomNumber); 
     
    
    /*Below code  checks the user guess Number and the random 
    Number generated is Same or Not*/
    
    if(x==randomNumber){
        System.out.println("YOU WON!");
    }else if(x>randomNumber){
        System.out.print("you guseed a greater Number");
        System.out.println("please try again");
    }else{
        System.out.println("you guessed a lesser Number");
        System.out.println("please try again");
    }
    /*Replay() function calls back main function and start's game back
    on user demand by pressing zero*/
    Replay();
}

/*replay function restarts game when it is called. */

static void Replay(){
    System.out.println("If you want to replay the game.");
    System.out.print("PLEASE ENTER 0.\t");
    Scanner Sc= new Scanner(System.in);
    int y= Sc.nextInt();
    if(y==0){
        main(null);
    }
}
    
}