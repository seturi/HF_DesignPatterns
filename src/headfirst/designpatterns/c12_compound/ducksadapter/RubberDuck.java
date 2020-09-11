package headfirst.designpatterns.c12_compound.ducksadapter;

public class RubberDuck implements Quackable {
	public void quack() {
		System.out.println("Squeak");
	}
}
