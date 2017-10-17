// word game
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Random;
import java.io.InputStreamReader;
public class wordgame
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
		BufferedReader reader = null;
		// Check number of command line arguments
		if (args.length >1 )
		{
			for ( int i =0; i< args.length; i++)
			{
				System.out.println("args[" + i + "] contains " + args[i] );
			}
		}
		else
		{
			System.out.println( "Two arguments not supplied");
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
		int count=0 ;
		boolean done = false;
		String words[] = new String[100];
		String inputLine = "";
		String randWord;
		String wordArraytoString;
		String enteredword = "";
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
			    	String word = tokenizer.nextToken();
                    words[count] = word;
			    	count++;

			    }
			}
		}

			try
			{
				reader.close();
			}
			catch( IOException ioe)
			{
				System.out.println("Error closing file '"
					                               +args[0] + "'");
				System.exit(4);
			}
			// output count of words
			System.out.println(args[0] +" "+  count + "  words ");
			Random generator= new Random();
			int number=0;
			for ( int i =1; i<=24; i++)
			{
				 number =
						Math.abs( generator.nextInt() ) % count;
			}
			randWord = words[number];
			char [] output = new char[randWord.length()];
			for(int a=0; a<output.length; a++)
			{
				output[a]='*';
				System.out.print(output[a]);

			}
			System.out.println("");
			int guess =Integer.parseInt(args[1]);
			int j;
			char[] randomWordArray = randWord.toCharArray();
			for(j=0; j< guess; j++)
			{
				/*System.out.println("Please Enter letter or word");*/

				try
				{
				   enteredword = wordInputline.readLine();

				}

                 catch ( IOException ioe)
			    {
				System.out.println("I/O error");
				System.exit(3);
		     	}
			// end of file?
		     	if ( enteredword == null )
		    	{
				done = true;
		    	}  
		    	if( ! Alphabetic(enteredword))
 	            {
 		            System.out.println("Invalid Input" );
 	            	j=j-1;
             	}

                   char[] enteredWordArray = enteredword.toCharArray();
                   System.out.println(enteredWordArray[0]);
                   if(j<=guess){
                 for(int i=0; i<output.length; i++)
                 {
                 	if(randomWordArray[i]==enteredWordArray[0])
                 		output[i]=enteredWordArray[0];
                 }

			      wordArraytoString = new String(enteredWordArray); 
                    if (wordArraytoString.equals(randWord))
            	      System.out.println("winner");
            	  

                       System.out.println("Please Enter letter or word " +" "+String.valueOf(output));

                       }
              
                if(j>guess)
                	System.out.println("No more guessess");

		 	}
  
			System.out.println("the random word is " + randWord);
			System.out.println("number of guesses " + guess);

			System.exit(0);
        
	}
}