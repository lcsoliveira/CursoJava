package ClassesAbstract;

public abstract class Forma {
		
	
	public abstract void desenhar ();
	
	public void colorir(String cor){
		System.out.println("Aplicando cor " + cor );
		
		desenhar();
	}
	
}
