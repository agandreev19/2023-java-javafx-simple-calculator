public class TrafficLights implements Runnable{
    @Override
    public void run() {
        Utils.log("Controller started");
        Utils.log("Light is RED");

        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }

        Utils.log("Light is YELLOW");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        Utils.log("Light is GREEN");

        Utils.log("Controller ended");


    }



}

