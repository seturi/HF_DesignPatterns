package headfirst.designpatterns.c01_strategy.QuackMethod;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
