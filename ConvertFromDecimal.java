import java.util.Scanner;
public class ConvertFromDecimal
{
   public static void main(String[] args)
   {
      //seperate scanners due to an error when taking in some responses
      Scanner scanInt = new Scanner(System.in);
      Scanner scanString = new Scanner(System.in);
      
      while(true)//sets the program to into a infinite loop until it is broken by the user 
      {
         System.out.print("What would you like to convert a decimal integer to (1 for octal, 2 for hexadecimal, or 3 for binary): ");
         int selectedOption = scanInt.nextInt(); //takes inout from above question
         
         System.out.print("Please enter an interger to convert (in base 10): ");
         int decimalInput = scanInt.nextInt(); //takes input from above question
         
         /*
         This takes response to the initial question and runs it against if statements to pass the
         decimalInput variable to the correct method chosen by the user
         */ 
         switch(selectedOption)
         {
            case 1:
               decimalToOct(decimalInput);
               break;
            case 2:
               decimalToHex(decimalInput);
               break;
            case 3:
               decimalToBin(decimalInput);
               break;   
         }
         
         System.out.println("Would you like to convert another number (y/n)");
         String response = scanString.nextLine(); //takes input for above question
         
         if(response.equalsIgnoreCase("n")){
            break;
         }
      }
   }
   public static void decimalToHex(int decimalInput)
   {
      String hex = Integer.toHexString(decimalInput);
      System.out.println(hex);   //runs passed parameter through a method and prints the output
   }
      
   public static void decimalToBin(int decimalInput)
   {
      String bin = Integer.toBinaryString(decimalInput);
      System.out.println(bin);   //runs passed parameter through a method and prints the output
   }
      
   public static void decimalToOct(int decimalInput)
   {
      String oct = Integer.toOctalString(decimalInput);
      System.out.println(oct);   //runs passed parameter through a method and prints the output
   }
}