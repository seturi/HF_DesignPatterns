package headfirst.designpatterns.c01_strategy.QuackMethod;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
