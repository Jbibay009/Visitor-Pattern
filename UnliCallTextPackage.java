public class UnliCallTextPackage implements UnliCallsTextOffer {

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {

        if (!unliCallText) {
            return "Not offered";
        }

        if (telcoName.equalsIgnoreCase("Smart")) {
            return "Not offered, will be charged extra per usage.";
        } 
        else if (telcoName.equalsIgnoreCase("Globe")) {
            return "Offered for Globe Subscribers, calling and texting outside network will be charged per usage.";
        } 
        else if (telcoName.equalsIgnoreCase("Dito")) {
            return "Offered to all networks";
        } 
        else {
            return "Telco not supported.";
        }
    }
}