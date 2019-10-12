package test1;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        int corePoolSize = 500;
        int maximumPoolSize = 10000;
        int keepAliveTime = 200;
        TimeUnit unit = TimeUnit.MILLISECONDS;
        BlockingQueue queue = new ArrayBlockingQueue(10000, true);
//        ThreadFactory threadFactory =
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, queue);
        for (int i = 0; i < 15000; i++) {
            Runnable task = new Task(i);
            try{
                threadPool.execute(task);
            }catch (RejectedExecutionException e){
                queue.add(task);
            }
            System.out.println("线程池中线程数目：" + threadPool.getPoolSize() + "，队列中等待执行的任务数目：" +
                    threadPool.getQueue().size() + "，已执行玩的任务数目：" + threadPool.getCompletedTaskCount());
        }
        threadPool.shutdown();
    }
}
