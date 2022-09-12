import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
 
      Scanner scnr = new Scanner(System.in);
      
         int feet;
         double inches;
         double metersInInches;
         double meters;
         double inchesInFeet;
         
     
      System.out.print("Enter distance in Meters : ");
      meters = scnr.nextDouble();
      
      
      
      metersInInches = meters * 39.37;
      feet = (int)(metersInInches / 12);
      
      
      inches = metersInInches % 12;
      
      
      
      System.out.printf("%.2f meters in Feet and Inches is : %d\' %.2f\"", meters, feet, inches);
   }
}
