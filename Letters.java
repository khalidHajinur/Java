import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
public class Letters
{
 public static void main( String[] args )
 {
 BufferedReader reader = null;
 // check number of command line arguments
 if ( args.length != 1 )
 {
 System.out.println( "No filename specified" );
 System.exit( 1 );
 }
 // open text file
 try
 {
 reader = new BufferedReader(
 new FileReader( args[0] ) );
 }
 catch ( FileNotFoundException fnfe )
 {
 System.out.println( "Error opening file '"
 +args[0] + "'" );
 System.exit( 2 );
 }
 // initialise word count to zero
 int counta=0;
 int countb=0;
 int countc=0;
 int countd=0;
 int counte=0;
 int countf=0;
 int countg=0;
 int counth=0;
 int counti=0;
 int countj=0;
 int countk=0;
 int countl=0;
 int countm=0;
 int countn=0;
 int counto=0;
 int countp=0;
 int countq=0;
 int countr=0;
 int counts=0;
 int countt=0;
 int countu=0;
 int countv=0;
 int countw=0;
 int countx=0;
 int county=0;
 int countz=0;
 // set file read variable to false
 boolean done = false;
 String inputLine = null;
 // read lines until end of file is reached
 while ( ! done )
 {
 try
 {
 inputLine = reader.readLine();
 }
 catch( IOException ioe )
 {
 System.out.println( "I/O error" );
 System.exit( 3 );
 }
 // end of file?
 if ( inputLine == null )
 {
 done = true;
 }
 
 else
 {
 // get length of line
 int nchars = inputLine.length();
 // scan line for letter A
 char[] lineArray = inputLine.toCharArray();
 for(int element=0; element<nchars; element++)
 {
 if ( lineArray[element] == 'A' ||
 lineArray[element] == 'a' )
 counta++;
if ( lineArray[element] == 'B' ||
       lineArray[element] == 'b' )
          countb++;
          if ( lineArray[element] == 'C' ||
       lineArray[element] == 'c' )
          countc++;
          if ( lineArray[element] == 'D' ||
       lineArray[element] == 'd' )
          countd++;
          if ( lineArray[element] == 'E' ||
       lineArray[element] == 'e' )
          counte++;
          if ( lineArray[element] == 'F' ||
       lineArray[element] == 'f' )
          countf++;
          if ( lineArray[element] == 'G' ||
       lineArray[element] == 'g' )
          countg++;
          if ( lineArray[element] == 'H' ||
       lineArray[element] == 'h' )
          counth++;
          if ( lineArray[element] == 'I' ||
       lineArray[element] == 'i' )
          counti++;
          if ( lineArray[element] == 'J' ||
       lineArray[element] == 'j' )
          countj++;
          if ( lineArray[element] == 'K' ||
       lineArray[element] == 'k' )
          countk++;
          if ( lineArray[element] == 'L' ||
       lineArray[element] == 'l' )
          countl++;
          if ( lineArray[element] == 'M' ||
       lineArray[element] == 'm' )
          countm++;
          if ( lineArray[element] == 'N' ||
       lineArray[element] == 'n' )
          countn++;
          if ( lineArray[element] == 'O' ||
       lineArray[element] == 'o' )
          counto++;
          if ( lineArray[element] == 'P' ||
       lineArray[element] == 'p' )
          countp++;
          if ( lineArray[element] == 'Q' ||
       lineArray[element] == 'q' )
          countq++;
          if ( lineArray[element] == 'R' ||
       lineArray[element] == 'r' )
          countr++;
          if ( lineArray[element] == 'S' ||
       lineArray[element] == 's' )
          counts++;
          if ( lineArray[element] == 'T' ||
       lineArray[element] == 't' )
          countt++;
          if ( lineArray[element] == 'U' ||
       lineArray[element] == 'u' )
          countu++;
          if ( lineArray[element] == 'V' ||
       lineArray[element] == 'v' )
          countv++;
          if ( lineArray[element] == 'W' ||
       lineArray[element] == 'w' )
          countw++;
          if ( lineArray[element] == 'X' ||
       lineArray[element] == 'x' )
          countx++;
          if ( lineArray[element] == 'Y' ||
       lineArray[element] == 'y' )
          county++;
          if ( lineArray[element] == 'Z' ||
       lineArray[element] == 'z' )
          countz++;
 }
 }
 }
 // close file
 try
 {
 reader.close();
 }
 catch( IOException ioe )
 {
 System.out.println( "Error closing file '"
 +args[0] + "'" );
 System.exit( 4 );
 }
 // output count of character A
System.out.println(" Letter   Frequency");
System.out.println("    A      " + counta);
System.out.println("    B      " + countb);
System.out.println("    C      " + countc);
System.out.println("    D      " + countd);
System.out.println("    E      " + counte);
System.out.println("    F      " + countf);
System.out.println("    G      " + countg);
System.out.println("    H      " + counth);
System.out.println("    I      " + counti);
System.out.println("    J      " + countj);
System.out.println("    K      " + countk);
System.out.println("    L      " + countl);
System.out.println("    M      " + countm);
System.out.println("    N      " + countn);
System.out.println("    O      " + counto);
System.out.println("    P      " + countp);
System.out.println("    Q      " + countq);
System.out.println("    R      " + countr);
System.out.println("    S      " + counts);
System.out.println("    T      " + countt);
System.out.println("    U      " + countu);
System.out.println("    V      " + countv);
System.out.println("    W      " + countw);
System.out.println("    X      " + countx);
System.out.println("    Y      " + county);
System.out.println("    Z      " + countz);
















 System.exit( 0 );
 }
}