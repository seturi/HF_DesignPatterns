package headfirst.designpatterns.c01_strategy.DuckClient;

import headfirst.designpatterns.c01_strategy.FlyMethod.FlyNoWay;
import headfirst.designpatterns.c01_strategy.QuackMethod.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
