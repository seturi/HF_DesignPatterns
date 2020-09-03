package headfirst.designpatterns.c01_strategy.DuckClient;

import headfirst.designpatterns.c01_strategy.FlyMethod.FlyNoWay;
import headfirst.designpatterns.c01_strategy.QuackMethod.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
