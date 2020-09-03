package headfirst.designpatterns.c01_strategy.DuckClient;

import headfirst.designpatterns.c01_strategy.FlyMethod.FlyWithWings;
import headfirst.designpatterns.c01_strategy.QuackMethod.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
