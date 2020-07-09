package club.banyuan;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SharedCounter extends Thread {

  static int counter = 0;

  public static void reset() {
    counter = 0;
  }

  public static int increment(int numThreads, int numIncrementsPerThread)
      throws InterruptedException {

//    for (int i = 0; i < numThreads; i++) {
//      Thread thread = new Thread(new Runnable() {
//        @Override
//        public void run() {
//          counter += numIncrementsPerThread;
//        }
//      });
//      thread.start();
//      thread.join();
//    }
//    return counter;
//  }

    ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
    for (int i = 0; i < numThreads; i++) {
      Future<Integer> future = executorService.submit(new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
          sleep(50);
          synchronized (SharedCounter.class) {
            return counter += numIncrementsPerThread;
          }
        }
      });
      try {
        future.get();
      } catch (ExecutionException e) {
        e.printStackTrace();
      }
    }
    executorService.shutdownNow();
    executorService.awaitTermination(1, TimeUnit.SECONDS);
    return counter;
  }
}
