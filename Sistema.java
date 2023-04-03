package Atividade;

public class Sistema {
	
	public static void main(String[] args) {
		
		Carros carro1 = new Carros();
		
		carro1.placa = new PlacaCarro();
		
		System.out.println("Placa de carro: "+carro1.placa.dadosPlaca);
		
	}

}
