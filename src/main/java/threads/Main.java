package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {

//		Multi sample = new Multi(1);
//		sample.start();
//		
//		
//		Multi sample2 = new Multi(2);
//		sample2.start();

		MultiWithInterface example = new MultiWithInterface(1);
		Thread first = new Thread(example);
		// first.start();

		MultiWithInterface example2 = new MultiWithInterface(2);
		Thread second = new Thread(example2);
		// second.start();

		Thread third = new Thread(new MultiWithInterface(3));
		Thread fourth = new Thread(new MultiWithInterface(4));
		Thread fifth = new Thread(new MultiWithInterface(5));
		Thread sixth = new Thread(new MultiWithInterface(6));
		Thread seventh = new Thread(new MultiWithInterface(7));

		ExecutorService es = Executors.newFixedThreadPool(5);

		es.execute(second);
		es.execute(first);
		es.execute(third);
		es.execute(fourth);
		es.execute(fifth);
		es.execute(sixth);
		es.execute(seventh);
		es.shutdown();
		// es.execute(first); // this causes exception because we already used shutdown

	}

}
