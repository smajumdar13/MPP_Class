package Lesson9.Part12;

import java.util.Optional;

public class MySingletonLazy {
	private static MySingletonLazy instance = null;
	private static int instanceCounter;

	private MySingletonLazy() {
		instanceCounter++;
	}
	private static MySingletonLazy create() {
		instance = new MySingletonLazy();
		return instance;
	}
	public static MySingletonLazy getInstance() {

		return Optional.ofNullable(instance).orElseGet(MySingletonLazy::create);
	}
	//just to verify
	public static int getCounter() {
		return instanceCounter;
	}
}
