import java.util.ArrayList;
import java.util.List;

public class Auction {
    String itemName;
    int currentBid;
    Bidder highestBidder;
    boolean running;
    List<BidListener> listeners = new ArrayList<>();



    void start() {
        running = true;
    }
    void stop() {
        running = false;
    }
    synchronized void placeBid(Bidder bidder, int amount) {
        if (!running) {
            return;
        } else if (currentBid < amount) {

            currentBid = amount;
            highestBidder = bidder;

        }
    }
    void addListener(BidListener listener) {
        listeners.add(listener);
    }
    void notifyListeners(String message) {
        for (BidListener listener : listeners) {
            listener.notifyBidUpdate(message);

        }
    }

}
