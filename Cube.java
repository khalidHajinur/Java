public class Cube
{
 public Cube( double lengthValue )
 {
 	length=lengthValue;
 
 }
 public double baseArea( )
 {
 	double baseA=Math.pow(length, 2);
 	return baseA;
 }
 public double totalSurfaceArea( )
 {
 	double surfaceA= 6* (Math.pow(length, 2));
 	return surfaceA;
 
 }
 public double volume( )
 {
 	double vol= Math.pow(length, 3);
 	return vol;
 }
 public double lengthOfBaseDiagonal( )
 {
 	double lengthBaseD= Math.sqrt( Math.pow(length, 2) + Math.pow(length, 2));
 	return lengthBaseD;
 
 }
 public double lengthOfBodyDiagonal( )
 {
 	double lengthOfbodayD =Math.sqrt(3)*length;

 	return lengthOfbodayD;
 
 }
 private double length;
}