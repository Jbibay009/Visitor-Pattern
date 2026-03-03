import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallsTextOffer {
    private static final Map<String, String> PACKAGE_MAP = new HashMap<>();

    static {
        PACKAGE_MAP.put("Smart", "Not offered, will be charged extra per usage.");
        PACKAGE_MAP.put("Globe", "Exclusively for Globe Network, calling and texting outside network will be charged per usage.");
        PACKAGE_MAP.put("Dito", "Offered to all networks");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return "Not offered, will be charged extra per usage.";
        }

        String packageOffer = PACKAGE_MAP.get(telcoName);

        if (packageOffer == null) {
            return "Telco not supported.";
        }

        return packageOffer;
    }
}