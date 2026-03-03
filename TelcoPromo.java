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
        System.out.println("Smart Data Usage Offer and price: " +
                subscriptions.get("Smart").accept(promo));

        System.out.println("Globe Data Usage Offer and price: " +
                subscriptions.get("Globe").accept(promo));

        System.out.println("Dito Data Usage Offer and price: " +
                subscriptions.get("Dito").accept(promo));

        // Display unlimited calls and text packages
        System.out.println("\nSmart unlimited calls and text package: " +
                subscriptions.get("Smart").accept(unli));

        System.out.println("Globe unlimited calls and text package: " +
                subscriptions.get("Globe").accept(unli));

        System.out.println("Ditto unlimited calls and text package: " +
                subscriptions.get("Dito").accept(unli));
    }
}