package headfirst.designpatterns.c01_strategy.DuckClient;


import headfirst.designpatterns.c01_strategy.FlyMethod.FlyWithWings;
import headfirst.designpatterns.c01_strategy.QuackMethod.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
