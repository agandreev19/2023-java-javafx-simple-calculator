public class Utils {
    public static void log(String msg){
        var tid=Thread.currentThread().getId();
        System.out.printf("%d: %s" , tid , msg );

    }
}

