package headfirst.designpatterns.c12_compound.ducksadapter;

public class DecoyDuck implements Quackable {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
