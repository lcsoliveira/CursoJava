package ExercicioAreaInterface;

public class TestaArea {

	public static void main(String[] args) {
	
		
		Circulo 	circulo		= 		new Circulo();
		Quadrado 	quadrado 	= 		new Quadrado();
		Retangulo 	retangulo 	=	 	new Retangulo();
		
		System.out.println(new CalculadoraArea().calcular(circulo));
		System.out.println(new CalculadoraArea().calcular(quadrado));
		System.out.println(new CalculadoraArea().calcular(retangulo));
		
		

	}

}
