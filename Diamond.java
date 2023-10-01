import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    int a, b, row_nmbr;
    // asking for number input
    System.out.println("Enter a number");
    Scanner scan = new Scanner(System.in);
    row_nmbr = scan.nextInt();

    // generate diamond based on number inputed
    for(a = 0 ;a <= row_nmbr ; a++); {
      for(b = 1 ; b <= row_nmbr - 1 ; b++); {
        System.out.print(" ");
      }
    }
  }
}
