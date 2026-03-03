import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
    private static final Map<String, Integer> ALLOWANCE_MAP = new HashMap<>();

    static {
        ALLOWANCE_MAP.put("Smart", 15);
        ALLOWANCE_MAP.put("Globe", 10);
        ALLOWANCE_MAP.put("Dito", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        Integer allowance = ALLOWANCE_MAP.get(telcoName);

        if (allowance == null) {
            return "Telco not supported.";
        }

        return allowance + "GB for " + String.format("%.2f", money) + " PHP";
    }
}