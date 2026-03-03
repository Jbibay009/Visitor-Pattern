import java.util.HashMap;
import java.util.Map;

public class TelcoPromo {
    public static void main(String[] args) {
        // Initialize subscriptions using HashMap
        Map<String, TelcoSubscription> subscriptions = new HashMap<>();

        subscriptions.put("Smart", new Telco(15, 500, "Smart", false));
        subscriptions.put("Globe", new Telco(10, 450, "Globe", true));
        subscriptions.put("Dito", new Telco(8, 400, "Dito", true));

        // Initialize promo visitors
        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        // Display data usage offers
        TelcoSubscription smartSub = subscriptions.get("Smart");
        TelcoSubscription globeSub = subscriptions.get("Globe");
        TelcoSubscription ditoSub = subscriptions.get("Dito");

        System.out.println("Smart Data Usage Offer and price: " +
                smartSub.accept(promo, ((Telco) smartSub).getPromoPrice()));

        System.out.println("Globe Data Usage Offer and price: " +
                globeSub.accept(promo, ((Telco) globeSub).getPromoPrice()));

        System.out.println("Dito Data Usage Offer and price: " +
                ditoSub.accept(promo, ((Telco) ditoSub).getPromoPrice()));

        // Display unlimited calls and text packages
        System.out.println("\nSmart unlimited calls and text package: " +
                smartSub.accept(unli, ((Telco) smartSub).getUnliCallText()));

        System.out.println("Globe unlimited calls and text package: " +
                globeSub.accept(unli, ((Telco) globeSub).getUnliCallText()));

        System.out.println("Ditto unlimited calls and text package: " +
                ditoSub.accept(unli, ((Telco) ditoSub).getUnliCallText()));
    }
}