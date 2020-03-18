package temaGit;

public class TestGit {

	public static void main(String[] args) {
		System.out.println("Hello Git ! Denumirea proiectului de licenta "
				+ "este Aplicatie mobila in domeniul scenaristicii.");
		
		Scena scena = new Scena("INT. Apartament - Dimineata",2,"Pe masa sunt doua cafele.");
		float costScena = scena.calculCostPerScena();
	}

}
