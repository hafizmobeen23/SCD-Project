public class BackgroundTask implements Runnable {
    private final String taskName;

    public BackgroundTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Starting task: " + taskName);
        try {
            Thread.sleep(2000); // Simulating a long-running task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed task: " + taskName);
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new BackgroundTask("Task 1"));
        Thread thread2 = new Thread(new BackgroundTask("Task 2"));
        
        thread1.start();
        thread2.start();
    }
}
