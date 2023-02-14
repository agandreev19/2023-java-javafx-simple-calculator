public class counter implements Runnable{
    @Override
    public void run() {
        var tid = Thread.currentThread().getId();
        System.out.printf("%d: Hello from the other side!", tid);

    }
}
