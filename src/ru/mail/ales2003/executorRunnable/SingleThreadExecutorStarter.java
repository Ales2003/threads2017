package ru.mail.ales2003.executorRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.ExecutorService;

public class SingleThreadExecutorStarter {

	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor(); 
				
		for (int i = 0; i < 5; i++) {
			executorService.execute(new MyExecutorRunnable("I'm Runnable from SingleThreadExecutor " + i));
				}
		
		executorService.shutdown();
		
}

}
