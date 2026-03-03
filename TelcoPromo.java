public class TelcoPromo {
    public static void main(String[] args) {

        TelcoSubscription smart = new Telco(15, 500, "Smart", false);
        TelcoSubscription globe = new Telco(10, 450, "Globe", true);
        TelcoSubscription dito = new Telco(8, 400, "Dito", true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " +
                smart.accept(promo));

        System.out.println("Globe Data Usage Offer and price: " +
                globe.accept(promo));

        System.out.println("Dito Data Usage Offer and price: " +
                dito.accept(promo));

        System.out.println("\nSmart unlimited calls and text package: " +
                smart.accept(unli));

        System.out.println("Globe unlimited calls and text package: " +
                globe.accept(unli));

        System.out.println("Ditto unlimited calls and text package: " +
                dito.accept(unli));
    }
}