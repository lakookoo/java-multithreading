public class App {
    public static void main(String[] args) throws InterruptedException {
       Thread thread = new NewThread();
       
       thread.start();
    }

    private static class NewThread extends Thread {
        @Override
        public void run() {
            // code that will run in a new thread
            
            System.out.println(" hello from " + Thread.currentThread().getName());
            
        }
    }
}
