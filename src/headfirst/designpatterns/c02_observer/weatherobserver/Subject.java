package headfirst.designpatterns.c02_observer.weatherobserver;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
