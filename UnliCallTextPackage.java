public class UnliCallTextPackage implements UnliCallsTextOffer {

    @Override
    public String showUnliCallsTextOffer(TelcoSubscription subscription) {
        Telco telco = (Telco) subscription;
        String telcoName = telco.getTelcoName();
        boolean unliCallText = telco.getUnliCallText();

        if (!unliCallText) {
            return "Not offered, will be charged extra per usage.";
        }

        if (telcoName.equalsIgnoreCase("Smart")) {
            return "Not offered, will be charged extra per usage.";
        } 
        else if (telcoName.equalsIgnoreCase("Globe")) {
            return "Exclusively for Globe Network, calling and texting outside network will be charged per usage.";
        } 
        else if (telcoName.equalsIgnoreCase("Dito")) {
            return "Offered to all networks";
        } 
        else {
            return "Telco not supported.";
        }
    }
}