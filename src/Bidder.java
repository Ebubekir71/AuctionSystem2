public class Bidder implements BidListener{
    String name;

    public String getName() {




        return name;
    }

    @Override
    public void notifyBidUpdate(String message) {
        System.out.println("Yeni teklif geldi : " + message);
    }
}
