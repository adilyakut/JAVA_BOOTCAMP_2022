
public abstract class GameCalculator { //base class

	public abstract void calculate();				// varje användare har egen calculate ekvation för poängsystem. Måste ha egen override för varje användare
	
	public final void gameOver() {					// samma resultat för alla användare, ingen möjlighet för override!
		System.out.println("Game over! You lost!");
		
	}
}
