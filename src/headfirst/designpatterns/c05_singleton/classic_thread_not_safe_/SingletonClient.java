package headfirst.designpatterns.c05_singleton.classic_thread_not_safe_;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}
}
