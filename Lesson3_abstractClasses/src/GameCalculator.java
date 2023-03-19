
public abstract class GameCalculator { //base class

	public abstract void calculate();				// varje anv�ndare har egen calculate ekvation f�r po�ngsystem. M�ste ha egen override f�r varje anv�ndare
	
	public final void gameOver() {					// samma resultat f�r alla anv�ndare, ingen m�jlighet f�r override!
		System.out.println("Game over! You lost!");
		
	}
}
