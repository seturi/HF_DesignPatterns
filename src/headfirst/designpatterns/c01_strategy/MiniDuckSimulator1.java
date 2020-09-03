package headfirst.designpatterns.c01_strategy;

import headfirst.designpatterns.c01_strategy.DuckClient.Duck;
import headfirst.designpatterns.c01_strategy.DuckClient.MallardDuck;
import headfirst.designpatterns.c01_strategy.DuckClient.ModelDuck;
import headfirst.designpatterns.c01_strategy.FlyMethod.FlyRocketPowered;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
