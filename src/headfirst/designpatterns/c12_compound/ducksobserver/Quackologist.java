package headfirst.designpatterns.c12_compound.ducksobserver;

public class Quackologist implements Observer {
 
	public void update(QuackObservable duck) {
		System.out.println("Quackologist: " + duck + " just quacked.");
	}
 
	public String toString() {
		return "Quackologist";
	}
}
