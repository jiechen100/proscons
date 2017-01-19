package com.jie.multithreading;

import java.util.ArrayList;
import java.util.List;

public class OneProducerOneConsumer {

	public static void main(String args[]) {
		List<Integer> sharedQueue = new ArrayList<Integer>();
		int qSize = 10;

		Thread prodThread = new Thread(new Producer("Producer", sharedQueue,
				qSize));
		Thread consThread = new Thread(new Consumer("Consumer", sharedQueue));

		prodThread.start();
		consThread.start();
	}

	static class Producer implements Runnable {
		private final String name;
		private final List<Integer> taskQueue;
		private final int MAX_CAPACITY;

		public Producer(String name, List<Integer> sharedQueue, int size) {
			this.name = name;
			this.taskQueue = sharedQueue;
			this.MAX_CAPACITY = size;
		}

		@Override
		public void run() {
			int counter = 0;
			while (true) {
				try {
					produce(counter++);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}

		private void produce(int i) throws InterruptedException {
			synchronized (taskQueue) {
				while (taskQueue.size() == MAX_CAPACITY) {
					System.out.println("Queue is full " + name
							+ " is waiting , size: " + taskQueue.size());
					taskQueue.wait();
					System.out.println(name + " is notified , size: "
							+ taskQueue.size());
				}

				Thread.sleep(1000);
				taskQueue.add(i);
				System.out.println(name + " produced: " + i);
				taskQueue.notifyAll();
			}
		}
	}

	static class Consumer implements Runnable {
		private final String name;
		private final List<Integer> taskQueue;

		public Consumer(String name, List<Integer> sharedQueue) {
			this.name = name;
			this.taskQueue = sharedQueue;
		}

		@Override
		public void run() {
			while (true) {
				try {
					consume();
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}

		private void consume() throws InterruptedException {
			synchronized (taskQueue) {
				while (taskQueue.isEmpty()) {
					System.out.println("Queue is empty " + name
							+ " is waiting , size: " + taskQueue.size());
					taskQueue.wait();
					System.out.println(name + " is notified , size: "
							+ taskQueue.size());
				}
				Thread.sleep(1000);
				int i = (Integer) taskQueue.remove(0);
				System.out.println(name + " consumed: " + i);
				taskQueue.notifyAll();
			}
		}
	}

}