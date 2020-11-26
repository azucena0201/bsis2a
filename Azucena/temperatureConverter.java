package Activity3;
import java.util.Scanner;

public class temperatureConverter {

  public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
        

        System.out.print("Enter temperature in Celsius: ");
        float C = input.nextFloat();
        float F = C * (9f / 5) + 32;
        

        System.out.println(C + " degree Celsius is equal to \n" + F +" degree Fahrenheit.");
  }
}
