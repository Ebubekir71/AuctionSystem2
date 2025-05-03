import java.time.Duration;

public class RobotBidder implements Runnable {
    Auction auction;
    Bidder bidder;
    int maxBid;

    @Override
    public void run() {
        try{
            Thread.sleep(Duration.ofMinutes(2));


        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
