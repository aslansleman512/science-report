public class RandomNumber {
   public static void main(String[] args) {
      int max = 100;
      int min = 1;
      Random rnd = new Random();
      int randomNum = rnd.nextInt((max - min) + 1) + min;
      System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
   }
}
