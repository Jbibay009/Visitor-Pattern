public interface TelcoSubscription{
    public String accept(UsagePromo promo, double price);
    public String accept(UnliCallsTextOffer offer, boolean unliCallText);
}