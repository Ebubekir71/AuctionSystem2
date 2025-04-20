public class AuctionTimer implements Runnable{
    Auction auction;
    int durationSeconds;

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            auction.stop();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
