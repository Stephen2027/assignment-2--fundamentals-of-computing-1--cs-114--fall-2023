import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int a, b, rowNmbr;
    // asking for number input
    System.out.println("Enter a number");
    Scanner scan = new Scanner(System.in);
    rowNmbr = scan.nextInt();

    // generate top half of diamond
    for(a = 0 ;a <= rowNmbr ; a++) {
      for(b = 1 ; b <= rowNmbr - a ; b++) {
        System.out.print(" ");
      }
      for(b = 1 ; b <= 2*a-1 ; b++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    // generate bottom half of diamond
    for(a = rowNmbr - 1 ; a >= 1 ; a--) {
      for(b = 1 ; b <= rowNmbr - a ; b++) {
        System.out.print(" ");
      }
      for (b = 1 ; b <= 2*a-1 ; b++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
