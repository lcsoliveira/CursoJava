package ClassesAbstract;

public class TestaCodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Jacare jacare = new Jacare(); // quando fazemos um NEW ele cria uma nova instancia do objeto na memória 
		Baleia baleia = new Baleia();
		Veterinario veterinario = new Veterinario();
		Humano humano = new Humano();
		
		Veterinario examinando = new Veterinario();
		
		
		examinando.examinar(jacare);
		examinando.examinar(baleia);
		//examinando.examinar(humano);
		//examinando.examinar(veterinario);
		
		
	}

}
