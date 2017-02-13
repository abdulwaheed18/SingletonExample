package in.waheedtechblog.singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonExample {

	private static final String APP_FILE = "appcontext.xml";

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(APP_FILE);
		
		Singleton singleton1 = (Singleton) applicationContext.getBean("singleton1");
		Singleton singleton2 = (Singleton) applicationContext.getBean("singleton2");
		
		if(singleton1.equals(singleton2)){
			 System.out.println("Singleton class are actually Singleton class");
		} else {
			 System.out.println("Singleton class are not Singleton class");
		}
		
		NonSingleton nonSingleton1 = (NonSingleton) applicationContext.getBean("nonSingleton1");
		NonSingleton nonSingleton2 = (NonSingleton) applicationContext.getBean("nonSingleton2");
		

		if(nonSingleton1.equals(nonSingleton2)){
			 System.out.println("Non-Singleton class are actually Singleton class");
		} else {
			 System.out.println("Non-Singleton class are not Singleton class");
		}
		
	}

}
