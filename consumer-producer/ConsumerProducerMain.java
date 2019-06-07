
public class ConsumerProducerMain {

	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new BlockingQueue<Integer>(5);
		
		Thread consumerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 20; i++) {
					try {
						queue.dequeue();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		Thread producerThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 20; i++) {
					try {
						queue.enqueue(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});

		
		consumerThread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		producerThread.start();
		
		try {
			producerThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			consumerThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
