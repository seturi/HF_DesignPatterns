package headfirst.designpatterns.c01_strategy.DuckClient;

import headfirst.designpatterns.c01_strategy.FlyMethod.FlyBehavior;
import headfirst.designpatterns.c01_strategy.FlyMethod.FlyNoWay;
import headfirst.designpatterns.c01_strategy.QuackMethod.QuackBehavior;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		//quackBehavior = new Squeak();
		quackBehavior = () -> System.out.println("Squeak");
	}
	
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior; 
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
