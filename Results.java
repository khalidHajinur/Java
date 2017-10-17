import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Random;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Results
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
   public static void bubble(String[] array1, String[] array2, int count)
   {
   	int i, j;
   	String temp;
   	for( i=0; i<count -1; i++)
   	{
   		for(j=count-1; j>i; j--)
   		{
   			int arrayOne = array1[j].compareTo(array1[j-1]);

   			if( arrayOne <0)
   			{
   				temp=array1[j];
   				array1[j]=array1[j-1];
   				array1[j-1]=temp;
 
   				temp=array2[j];
   				array2[j]=array2[j-1];
   				array2[j-1]=temp;
   			}
   		}
   	}
   }

	public static void main(String[] args)
	{
		PrintStream output = new PrintStream ( System.out);

		int count=0 ;
		boolean done = false;
		String surname[] = new String[60];
		String initials[] = new String[60];
		String mark[] = new String[60];
		String fullname[] = new String[60];
		String inputLine = "";
		String randWord;
		String wordArraytoString;
		String enteredword = "";
		BufferedReader reader = null;
		// Check number of command line arguments
		if (args.length ==1 )
		{
			for ( int i =0; i< args.length; i++)
			{
				System.out.println("args[" + i + "] contains " + args[i] );
			}
		}
		else
		{
			System.out.println( " arguments not supplied");
			System.exit(1);
		}
		//open text file
		try
		{
			reader = new BufferedReader( new FileReader( args[0] ) );
		}
		catch ( FileNotFoundException fnfe)
		{
			System.out.println("file containing words cannot be opened" 
				                                    +args[0] + "'");
			System.exit(2);
		}
		// read lines until end of file is readed
		//initialise word count to zero
		
		BufferedReader wordInputline;
             wordInputline = new BufferedReader(
                               new InputStreamReader( System.in ) );
		while( ! done )
		{
			try
			{
				inputLine = reader.readLine();
			}
			catch ( IOException ioe)
			{
				System.out.println("I/O error");
				System.exit(3);
			}
			// end of file?
			if ( inputLine == null )
			{
				done = true;
			}
			else
			{
				 // break up line into words
				StringTokenizer tokenizer 
				              = new StringTokenizer( inputLine);
			    while ( tokenizer.hasMoreTokens() )
			    {
			    	String name = tokenizer.nextToken();
                    surname[count] = name;
                    String inits= tokenizer.nextToken();
                    initials[count] = inits;
                    String mrk = tokenizer.nextToken();
                    mark[count] = mrk;
                    String full = inits + " " + name;
                    fullname[count]= full;
                    count++;

			    }

			}

		} 
		//bubble(surname,count);
		bubble(fullname, mark, count); 
		System.out.println("Name" + "              " + "Mark");
		System.out.println("----" + "              " + "----");

		for ( int i=0; i<count; i++)
		{
			//System.out.println(surname[i]);
			String data = String.format("%-10s        %3s   \n", fullname[i], mark[i]);
			System.out.println(data);
		}
	}
}