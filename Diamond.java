import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int rows, diamond, shapeSize;
    // asking for number input
    System.out.println("Enter a number");
    Scanner scan = new Scanner(System.in);
    shapeSize = scan.nextInt();

    // Create top for diamond odd
    if(shapeSize %2 == 1){
        for (rows = 1; rows < shapeSize; rows += 2){
            for (diamond = 0; diamond < shapeSize - 1 - rows / 2; diamond++) {
                System.out.print(" ");
        }
        for (diamond = 0; diamond < rows; diamond++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    // Create bottom of diamond for odd
        for (rows = shapeSize; rows > 0; rows -= 2){
            for (diamond = 0; diamond < shapeSize - 1 - rows / 2; diamond++) {
                System.out.print(" ");
        }
        for (diamond = 0; diamond < rows; diamond++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    }
    // Create top of diamond for even
    else if (shapeSize %2 == 0) {
      for (int spaces = shapeSize - 1; spaces > 0; spaces -= 1 ){ // creates correct number of spaces for first row
        System.out.print(" ");
      }
      // Middle rows for top of even diamond
      System.out.println(" *");
        for (rows = 2; rows <= shapeSize/2 + 1; rows += 1){
            for (int spaces = -2 * rows + (shapeSize + 2); spaces > 0; spaces -= 1){ // prints the correct number of spaces before the " *" is printed
                System.out.print(" ");
            }
            for (diamond = 2 * rows - 2; diamond > 0; diamond -= 1){
                System.out.print(" *");
            }
            System.out.println("");
        }
        // Create middle rows for bottom of diamond for even
        for (rows = shapeSize/2; rows >= 2; rows--){
          for (int spaces = -2 * rows + (shapeSize + 2); spaces > 0; spaces -= 1){
            System.out.print(" ");
          }
          for(diamond = 2 * rows - 2; diamond > 0; diamond -=1){ // prints the correct number of " *" for each row
            System.out.print(" *");
          }
          System.out.println("");

        }
        // Create last row for bottom of even numbers
        for (int spaces = shapeSize - 1; spaces > 0; spaces -= 1){
          System.out.print(" ");
        }
        System.out.println(" *");
        scan.close();
    }

  }
}
