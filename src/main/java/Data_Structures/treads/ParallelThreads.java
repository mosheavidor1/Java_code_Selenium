package Data_Structures.treads;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelThreads {




        public static void main(String[] args) {
            ExecutorService executor = Executors.newFixedThreadPool(4);

            for (int i = 0; i < 3; i++) {
                executor.execute(new MyTask(i));
            }

            executor.shutdown();
        }
    }

    class MyTask implements Runnable {
        private int taskId;

        public MyTask(int taskId) {
            this.taskId = taskId;
        }

        public void run() {
            System.out.println("hello");
        }

    }
