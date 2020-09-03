package headfirst.designpatterns.c01_strategy.QuackMethod;

public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
