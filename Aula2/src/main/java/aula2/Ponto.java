package aula2;

public class Ponto {
	
	// inicializando com o valor que eu quero
	double  x=	0.0; 
	// inicializando com valor padrão
	double  y;
	
	/**
	 * Metodo deslocar que recebe dois parametros double
	 * @param deltax
	 * @param deltay
	 */
	
	public void deslocar(double deltax, double deltay){
		x += deltax;
		y += deltay;
	}
	
	public void zeraar(){
		x = 0;
		y = 0;
	}
	
	/**
	 * Exemplo de metódo com retorno
	 * @return
	 */
	public boolean isYMenorQueZero(){
		
		if(y < 0)
			return true;
		return false;
		
	}
	
	//Construtores
	public Ponto (double coordX, double coordY){
		 
		x = coordX;
		y = coordY;
	 
	}
	
	public Ponto (double coordX){
		x = coordX;
		y = 0; 
	}
}
