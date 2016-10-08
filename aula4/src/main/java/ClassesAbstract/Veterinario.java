package ClassesAbstract;

public class Veterinario extends Humano{

	/**
	 * É mais facil para nós criarmos um método de veterinário que examina animal
	 * Pois assim ele examina todos os animais da Classe animais
	 * @param animal
	 */
	public void examinar(Examinavel animal) {
		if(animal instanceof Humano){
			throw new IllegalArgumentException("não posso examinar humanos!");
		}
		animal.emitirSom();
	}

	

}
