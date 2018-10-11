//im just trying to get another shirt
import java.util.Scanner;

public class rocket{
   public static void main(String args[]){
      int userInput;
      Scanner scnr = new Scanner(System.in);
      System.out.print("What is the size of the rocket: ");
      userInput = scnr.nextInt();

      cone(userInput);
      middle(userInput);
      topHalf(userInput);
      bottomHalf(userInput);
      middle(userInput);
      bottomHalf(userInput);
      topHalf(userInput);
      middle(userInput);
      cone(userInput);
   }
   public static void cone(int userIn){

        int lines = (userIn * 2) - 1;
        for(int row = 0; row < lines; row++){ // this loop makes sure that it prints out things line by line
             for(int space = (lines - (row - 1)) - 2; space >= 0; space--){ // this loop prints out the amount of spaces before printing 
                  System.out.print(" ");                                    //out the slashes to the left of the stars
             }


             for(int slash = 0; slash <= row; slash++){ // this loop prints out the slashes to the left of the stars
                  System.out.print("/");
             }
             System.out.print("##");
              for(int slash = 0; slash <= row; slash++){ // this loop prints out the slashes to the right of the stars of the cone.
                  System.out.print("\\");
             }
             System.out.println();


        }



   }
   public static void topHalf(int userIn){
       for(int line = userIn, row = 0; line  > 0; line--){ // this loop makes sure that everything is printed line by line.
           row++;
           System.out.print("|");
           for(int periods = 0; periods < (line - 1); periods++){ //this for loop creates the periods before the slashes on the top half 
               System.out.print(".");                             // part.
           }
           for(int slash = 0; slash < row; slash++){ // this for loop creates the slashes on the left half of the ship
               System.out.print("/\\");
           }
           for(int periods = 0; periods < ((line - 1) * 2); periods++){ //this loop adds the periods in the middle of the slashes on the
               System.out.print(".");                                   // left and right half of the ship
           }
           for(int slash = 0; slash < row; slash++){ // this loop adds the slashes on the right side of the ship
               System.out.print("/\\");
           }
           for(int periods = 0; periods < (line - 1); periods++){ // this loops adds the periods thats to the right of the slashes on the
               System.out.print(".");                             // right half of the ship.
           }
           System.out.print("|");
           System.out.println();
       }
   }

   public static void bottomHalf(int userIn){
       for(int line = userIn, row = 0; row < line; row++){ // this loop makes sure that things are printed line by line
           System.out.print("|");


           for(int periods = 0; periods < row; periods++){ // this loop prints the periods on the left side of the ship.
               System.out.print(".");
           }
           for(int slash = userIn; slash > row; slash--){ //this loop prints out the slashes on the left side of the ship
                System.out.print("\\/");

           }
           for(int periods = 0; periods < row * 2; periods++){ // this loop prints the periods in the middle of the left and right slashes
               System.out.print(".");

           }

           for(int slash = userIn; slash > row; slash--){ // this loop prints the periods in the right side of the ship
                System.out.print("\\/");
           }
           for(int periods = 0; periods < row; periods++){ // this loop prints the periods in the right side of the ship.
               System.out.print(".");
           }
           System.out.print("|");
           System.out.println();
       }

   }
   public static void middle(int userIn){
      System.out.print("+");
      for(int i = userIn * 2, star = 0; star < i; star++){ // this loop prints the total =* that separates each part of the ship,
          System.out.print("=*");
      }
      System.out.println("+");
   }

}
