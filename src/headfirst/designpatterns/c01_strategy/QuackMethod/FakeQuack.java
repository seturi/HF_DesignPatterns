package headfirst.designpatterns.c01_strategy.QuackMethod;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
