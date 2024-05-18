public class App {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new BlockingTask());
        thread.start();
        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(5000000);
            } catch (Exception e) {
                System.out.println("Exiting blocking thread");
            }
        }
    }
}
