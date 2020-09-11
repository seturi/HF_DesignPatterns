package headfirst.designpatterns.c12_compound.ducksobserver;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
