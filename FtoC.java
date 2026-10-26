import java.util.Scanner;

class FtoC
{
    public static void main(String[] args)
    {
      Scanner temp = new Scanner(System.in);
      System.out.println("Enter Temp");
      double initialTemp = Double.parseDouble(temp.nextLine());
      double convertedTemp;
      convertedTemp = ((initialTemp - 32.0) * (5.0/9.0));
      System.out.printf("%f",convertedTemp);
    }
}
