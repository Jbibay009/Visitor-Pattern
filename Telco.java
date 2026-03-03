public class Telco implements TelcoSubscription{
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText)
    {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dataAllowance = dataAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo){
        return promo.showAllowance(this);
    }

    @Override
    public String accept(UnliCallsTextOffer offer) {
        return offer.showUnliCallsTextOffer(this);
    }

    //getters
    public String getTelcoName(){
        return telcoName;
    }

    public double getPromoPrice(){
        return promoPrice;
    }

    public int getDataAllowance(){
        return dataAllowance;
    }

    public boolean getUnliCallText(){
        return unliCallText;
    }
}