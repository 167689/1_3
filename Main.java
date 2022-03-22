import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj x");
    double x =scan.nextDouble();
    System.out.println("Podaj y");
    double y =scan.nextDouble();
   double z=Math.pow(x,y);
    System.out.println("Wynik ="+z); 
  }
}