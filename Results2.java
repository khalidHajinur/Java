import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Random;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Vector;

public class Results2
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
     public static void bubble( Vector <Integer> marks, Vector <String> fullnames )
     {
     	int i, j, temp;
     	String temp2;
     	for (i=0;i<marks.size()-1 ; i++ ) 
     	{
     		for(j = marks.size() - 1; j > i; j--)
     	  {

     			if(((Integer)marks.get(j)).intValue()< ((Integer)marks.get(j-1)).intValue() )
			{
				temp = ((Integer)marks.get(j)).intValue();
				marks.set( j,new Integer((Integer)marks.get(j-1)).intValue() );
				marks.set( j-1 , new Integer( temp ) );
				temp2 = ((String)fullnames.get(j));
				fullnames.set( j,new String((String)fullnames.get(j-1)));
				fullnames.set( j-1 , new String( temp2) );


			}
		  }
     	}
     }
     	
		  
     	

 

	public static void main(String[] args)
	{
		PrintStream output = new PrintStream ( System.out);

		int count=0 ;
		boolean done = false;
		Vector <Integer> mark = new Vector<Integer>();
		Vector <String> surname = new Vector<String>();
		Vector <String> initials = new Vector<String>();
		Vector <String> fullname = new Vector<String>();


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
			//	System.out.println("args[" + i + "] contains " + args[i] );
			}
		}
		else
		{
			System.out.println( "arguments not supplied");
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
			    	surname.add(name);
                    String inits= tokenizer.nextToken();
                    initials.add(inits);
                    String mrk = tokenizer.nextToken();
                    mark.add( new Integer(Integer.parseInt(mrk)));
                    String full = inits + " " + name;
                    fullname.add(full); 
                    count++;

			    }

			}

		} 
		bubble(mark, fullname);
		System.out.println("Name" + "              " + "Mark");
		System.out.println("----" + "              " + "----");

		for ( int i=0; i<mark.size(); i++)
		{
			int number=
							((Integer)mark.get(i)).intValue();
			String letters =
			                    (String) fullname.get(i);
			                    
			//System.out.println(surname[i]);
			String data = String.format("%-10s        %3s   \n", letters, number);
			System.out.println(data);
		}
		
	}
}