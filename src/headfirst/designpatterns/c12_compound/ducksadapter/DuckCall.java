package headfirst.designpatterns.c12_compound.ducksadapter;

public class DuckCall implements Quackable {
	public void quack() {
		System.out.println("Kwak");
	}
}
