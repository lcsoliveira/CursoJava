package Interfaces;

public class TestaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(MinhaPrimeiraInterface.MEU_VALOR);
		
		MinhaPrimeiraInterface objeto = new ImplementacaoDaInterface();
		
		objeto.fazAlgumaCoisa();
		
	}

}
