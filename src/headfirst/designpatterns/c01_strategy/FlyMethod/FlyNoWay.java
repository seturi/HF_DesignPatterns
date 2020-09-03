package headfirst.designpatterns.c01_strategy.FlyMethod;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
