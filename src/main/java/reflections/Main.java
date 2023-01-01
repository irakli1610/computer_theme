package reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args)
			throws IllegalAccessException, InvocationTargetException, InstantiationException, IllegalArgumentException {


		
		Person Shio = new Person("Shio", "11886475309");

		Method[] personMethods = Shio.getClass().getDeclaredMethods();

		for (Method method : personMethods) {
			System.out.println("method name "+method.getName());
		}
		System.out.println("--------------------------------------------------------------");
		for (Method method : personMethods) {
			System.out.println("method modifier "+method.getModifiers());
		}
		System.out.println("--------------------------------------------------------------");
		for (Method method : personMethods) {
			System.out.println("method return type "+method.getReturnType());
		}
		System.out.println("--------------------------------------------------------------");
		for (Method method : personMethods) {
			System.out.println("method default value "+method.getDefaultValue());
		}
		System.out.println("--------------------------------------------------------------");
		for (Method method : personMethods) {
			System.out.println("method parameter count "+method.getParameterCount());
		}
		System.out.println("--------------------------------------------------------------");

		// --------method invocation using reflections.-------------------------------------

		for (Method method : personMethods) {
			if(method.getName().equals("getNAME")) {
			System.out.println("method \"getNAME\" invocation for object \"Shio\": "+method.invoke(Shio)	);
			}
		}
		for (Method method : personMethods) {
			if (method.getName().equals("shout")) {
				method.invoke(Shio);
			}
		}
		for (Method method : personMethods) {
			if (method.getName().equals("run")) {
				method.setAccessible(true);
				method.invoke(Person.class);
			}
		}

		// ---------------------------------------

		Field[] personFields = Person.class.getDeclaredFields();
		
		for (Field field : personFields) {
				System.out.println("field name: "+field.getName());   
		}
		for (Field field : personFields) {
			System.out.println("field modifier: "+field.getModifiers());    
		}
		
		
		//------------------------------constructor   info-------
		
		
		Constructor[] personConstructors=Shio.getClass().getConstructors();
		
		for (Constructor constructor : personConstructors) {
			System.out.println(constructor.getName());
			System.out.println(constructor.getParameterCount());
			System.out.println(constructor.getModifiers());
			System.out.println(constructor.getDeclaringClass());


		}

		Person ika=(Person) Person.class.getConstructors()[0].newInstance("ika","23");
	
		
		System.out.println("id value for object \"ika\" is: "+ika.getId());
	
	}
}
