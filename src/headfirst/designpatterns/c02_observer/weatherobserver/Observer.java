package headfirst.designpatterns.c02_observer.weatherobserver;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
