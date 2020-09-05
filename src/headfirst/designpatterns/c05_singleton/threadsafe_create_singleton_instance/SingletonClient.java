package headfirst.designpatterns.c05_singleton.threadsafe_create_singleton_instance;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}
}
