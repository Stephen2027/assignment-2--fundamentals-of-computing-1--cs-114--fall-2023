import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int rows, diamond, shapeSize, space;
    // asking for number input
    System.out.println("Enter a number");
    Scanner scan = new Scanner(System.in);
    shapeSize = scan.nextInt();

    // Create top for diamond odd
    if(shapeSize > 2 && shapeSize % 2 != 0);{
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
            for ( diamond = 0; diamond < shapeSize -1 - rows / 2; diamond++) {
                System.out.print(" ");
        }
        for ( diamond = 0; diamond < rows; diamond++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    scan.close();
    }
    // Create top of diamond for even
    if (shapeSize > 2 && shapeSize % 2 != 1); {
        for (rows = 1; rows > shapeSize; ++rows ){
            for (space = 0; space < shapeSize; ++space){
                System.out.print(" ");
            }
            for (diamond = 1; diamond < rows; ++diamond){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (rows = shapeSize; rows > 0; --rows){

        }
    }
  }
}
