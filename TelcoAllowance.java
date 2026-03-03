public class TelcoAllowance implements UsagePromo {

    @Override
    public String showAllowance(String telcoName, double promoPrice) {

        int allowance;

        if (telcoName.equalsIgnoreCase("Smart")) {
            allowance = 15;
        } 
        else if (telcoName.equalsIgnoreCase("Globe")) {
            allowance = 10;
        } 
        else if (telcoName.equalsIgnoreCase("Dito")) {
            allowance = 8;
        } 
        else {
            return "Telco not supported.";
        }

        return allowance + "GB for " + String.format("%.2f", promoPrice) + " PHP";
    }
}