package ExercicioAreaInterface;

public class Circulo implements AreaCalculavel{

	double raio;
	
	double pi = Math.PI;
	
	
	
	public double getArea() {
		 
		return pi * Math.pow(raio,2);
	}

}
