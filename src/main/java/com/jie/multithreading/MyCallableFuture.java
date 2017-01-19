package com.jie.multithreading;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableFuture implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}

	public static void main(String args[]) {
		int cnt = 10;
		ExecutorService executor = Executors.newFixedThreadPool(cnt);
		List<Future<String>> list = new ArrayList<Future<String>>();
		Callable<String> callable = new MyCallableFuture();
		for (int i = 0; i < cnt * cnt; i++) {
			Future<String> future = executor.submit(callable);
			list.add(future);
		}

		while (list.size() > 0) {
			for (int i = list.size() - 1; i >= 0; i--) {
				Future<String> fut = list.get(i);
				try {
					if (fut.isDone()) {
						System.out.println(new Date() + "::" + fut.get());
						list.remove(fut);
					}
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}
		}

		executor.shutdown();
	}

}