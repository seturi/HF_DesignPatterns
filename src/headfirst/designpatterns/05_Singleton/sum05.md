> ## 싱글턴 패턴(Singleton Pattern)
클래스 인스턴스 하나만 만들어지도록 하고, 그 인스턴스에 대한 전역 접근을 제공한다. 애플리케이션에서 특정 클래스의 인스턴스가 하나만 있어야 하는 경우에 그 클래스를 싱글컨으로 만들면 된다.

+ 어떤 클래스에 싱글턴 패턴을 적용하면 애플리케이션에 그 클래스의 인스턴스가 최대 1개까지만 있도록 할 수 있다.
+ 싱글턴 패턴을 이용하면 유일한 인스턴스를 어디서든지 접근할 수 있도록 할 수 있다.
+ 자바에서 싱글턴 패턴을 구현할 때는 private 생성자와 정적 메소드, 정적 변수를 사용한다.
+ 다중 스레드를 사용하는 애플리케이션에서는 속도와 자원 문제를 파악해보고 적절한 구현법을 사용해야 한다.(사실 모든 애플리케이션에서 멀티 스레딩을 쓸 수 있다고 생각해야 한다.)
+ DCL(Double- Checking Locking)을 사용하는 방법은 자바 1.5 이전 버전에서는 사용할 수 없다.
+ 클래스 로더가 여러 개 있으면 싱글턴이 제대로 작동하지 않고, 여러 개의 인스턴스가 생길 수 있다.
+ 1.2버전보다 전에 나온 JVM을 사용하는 경우에는 가비지 컬렉터 관력 버그 때문에 싱글턴 레지스트리를 사용해야 할 수도 있다.