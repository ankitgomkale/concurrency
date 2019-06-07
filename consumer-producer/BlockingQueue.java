import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {
	private Queue<T> queue;
	private int capacity;
	public BlockingQueue(int capacity) {
		queue = new LinkedList<T>();
		this.capacity = capacity;
	}
	
	public void enqueue(T item) throws InterruptedException {
		synchronized (queue) {
			while(queue.size() == capacity) {
				queue.wait();
			}
			
			queue.offer(item);
			System.out.println("Produced: " + item);
			queue.notify();
		}
	}
	
	public T dequeue() throws InterruptedException {
		T item;
		synchronized (queue) {
			while(queue.size() == 0) {
				queue.wait();
			}
			
			item = queue.poll();
			System.out.println("Consumed: " + item);
			queue.notify();
		}
		return item;
	}
}
