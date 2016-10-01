package Televisao;

public class TV {
	
	
	/**
	 * Sabemos que os métodos do tipo public ele pode ser acessado por
	 * qualquer classe
	 * Eles são public porque no caso o usuario interage diretamente com a tv 
	 * Depende de um comando dele para ligar, ou desligar, trocar de canal etc
	 */
	public void ligar(){
		System.out.println("a TV está ligada");
		
		ajustarVoltagem();
		regularDiodo();
		ligaTela();
	}
	
	public void Desligar(){
		System.out.println("a TV está desligada");
	}
	
	public void aumentarVolume(){
		System.out.println("o volume aumentou");
	}
	
	public void diminuirVolume(){
		System.out.println("o volume diminuiu");
	}
	
	public void aumentarCanal(){
		System.out.println("você aumentou  de canal");
	}
	
	public void diminuirCanal(){
		System.out.println("você diminuiu canal");
	}
	
	
	/**
	 * Já os dos tipo private eles somente serão acessado pela própia classe
	 * São private porque não dependem da interação direta do usuario mas
	 * sim quando for acionado o botão ligar é um comportamento interno da própia tv
	 */
	
	private void ligaTela(){
		System.out.println("A foi acionada");
		
	}

	private void ajustarVoltagem(){
		System.out.println("a voltagem foi ajustada");
	}
	
	private void regularDiodo(){
		System.out.println("O diodo foi ajustado");
	}
}
