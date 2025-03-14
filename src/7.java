import java.util.Scanner;
class Main {
public static void main(String[] args) {
// initialize scanner to read input from command line
Scanner sc = new Scanner(System.in);
// prompt user for input
System.out.print("Enter a number: ");
int num = sc.nextInt(); // read in the number
if (num >= 0) { // if the number is positive
System.out.println("The number is positive.");
} else if (num < 0) { // if the number is negative
System.out.println("The number is negative.");
} else { // if the number is zero
System.out.println("The number is zero.");
}
}
}