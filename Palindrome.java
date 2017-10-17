import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Palindrome
{
   public static boolean Alphabetic( String input )
   {
      boolean valid = true;
      int length = input.length();
      for ( int i = 0; i < length; i++ )
      {
         char character = Character.toUpperCase(
            input.charAt( i ) );
         if ( character < 'A' || character > 'Z' )
              valid = false;
      }
      return valid;
 }

 public static void main(String[] args)
 {
    BufferedReader reader;
    reader = new BufferedReader(
    new InputStreamReader( System.in ) );
    int stringSize =0;
    boolean valid = true;
    String inputLine ="";
    String reverse = "";
    System.out.println( "Please enter string>" );
    try
    {
       inputLine = reader.readLine();
    }
    catch ( IOException ioe )
    {
       System.out.println(
          "Error reading keyboard input" );
        System.exit( 1 );
    }
    stringSize = inputLine.length();
 	if (stringSize > 10)
 	{
 		System.out.println("String too long" );
 		System.exit( 2);
 	}
 		if (stringSize == 0)
 	{
 		System.out.println("Invalid Input" );
 		System.exit( 3);
 	}
 
 	if( ! Alphabetic(inputLine))
 	{
 		 System.out.println("Invalid Input" );
 		System.exit(4);
 	}

 	int length = inputLine.length();
 	for(int i = length-1; i>=0; i--)
 		reverse=reverse+ inputLine.charAt(i);
 	if(inputLine.equals(reverse))
 		System.out.println(" String is a palindrome ");
 	else
 		System.out.println(" String is not a palindrome");
     System.exit( 0 );
  }
}