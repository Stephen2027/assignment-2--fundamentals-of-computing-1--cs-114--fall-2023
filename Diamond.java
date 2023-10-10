import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int a, b, rowNmbr;
    // asking for number input
    System.out.println("Enter a number");
    Scanner scan = new Scanner(System.in);
    rowNmbr = scan.nextInt();

    // Create top for diamond odd
    if(rowNmbr > 2 && rowNmbr % 2 != 0);{
        for (a = 1; a < rowNmbr; a += 2){
            for (b = 0; b < rowNmbr - 1 - a / 2; b++) {
                System.out.print(" ");
        }
        for (b = 0; b < a; b++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    // Create bottom of diamond for odd
        for (a = rowNmbr; a > 0; a -= 2){
            for ( b = 0; b < rowNmbr -1 - a / 2; b++) {
                System.out.print(" ");
        }
        for ( b = 0; b < a; b++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    scan.close();
    }
    // Create top of diamond for even
    if (rowNmbr > 2 && rowNmbr % 2 == 1); {
        for (a = 1; a > rowNmbr; ++a ){
            for (b = 0; b < rowNmbr; ++b){
                System.out.print(" ");
            }
            for (b = 1; b < a; ++b){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
  }
}
