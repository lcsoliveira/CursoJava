package ExercicioAreaInterface;

public class Quadrado implements AreaCalculavel {

	
		double lado;
		
	
	public double getArea() {
		
		return Math.pow(lado, 2);
	}

}
