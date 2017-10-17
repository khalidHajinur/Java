public class Polygon extends Isosceles{
	public Polygon( double lengthValue, double sidesValue )	
		{
			super(lengthValue);
			sides=sidesValue;

		}
		public double polygonArea(){
			double polyArea = area(360/sides) * sides;
			return polyArea;

		}
		public double polygonPerimeter(){
			double perimeter = baseLength(360/sides) * sides ;
			return perimeter;
		}
		private double sides;

}