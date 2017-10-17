public class validate{

public static boolean checkInt( String input )
 {
	 double points = 0;
	 boolean valid = true;
	 int length = input.length();
	 for ( int i = 0; i < length; i++ )
	 {
	 char character = input.charAt( i );
	 if ( character < '0' || character > '9' )
	 valid = false;
	}
	return valid;
 }
}