package headfirst.designpatterns.c12_compound.ducks;

public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
