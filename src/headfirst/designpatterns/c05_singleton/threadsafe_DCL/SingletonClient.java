package headfirst.designpatterns.c05_singleton.threadsafe_DCL;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
	}
}
