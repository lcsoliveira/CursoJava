package ExercicioCollectionsGeradorDeSenha;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeSenha {
	
	
	private String senhaPadrao;
	private String senhaIdoso;
	
	int contadorP;
	int contadorI; 
	
	
	

	public String gerarSenhaPadrao(){
		
		List<String> senhaPadrao = new ArrayList<>();
		
		senhaPadrao.add("P"+contadorP++);
		
		
		return this.senhaPadrao;
		
	}
	
	public String gerarSenhaIdoso(){
		
		
		List<String> senhaIdoso = new ArrayList <>();
		
		return null;
		
	}
		
	
}
