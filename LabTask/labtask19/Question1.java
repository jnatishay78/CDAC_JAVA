package labtask19;
import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static void main(String[] args) {
        Map<String, Integer> populationMap = new HashMap<>();
        populationMap.put("New York", 8537673);
        populationMap.put("Los Angeles", 39776830);
        populationMap.put("Chicago", 2716000);
        populationMap.put("Houston", 2320268);
        populationMap.put("Phoenix", 1680992);

        String cityToRetrieve = "Los Angeles";
        if (populationMap.containsKey(cityToRetrieve)) {
            int population = populationMap.get(cityToRetrieve);
            System.out.println("Population of " + cityToRetrieve + ": " + population);
        } else {
            System.out.println(cityToRetrieve + " not found in the map.");
        }

        System.out.println("City Populations:");
        for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String cityToRemove = "Chicago";
        if (populationMap.containsKey(cityToRemove)) {
            populationMap.remove(cityToRemove);
            System.out.println(cityToRemove + " has been removed from the map.");
        } else {
            System.out.println(cityToRemove + " not found in the map.");
        }

        String cityToCheck = "Houston";
        if (populationMap.containsKey(cityToCheck)) {
            System.out.println(cityToCheck + " exists in the map.");
        } else {
            System.out.println(cityToCheck + " does not exist in the map.");
        }
        
        String cityToCheck1 = "Chicago";
        if (populationMap.containsKey(cityToCheck1)) {
            System.out.println(cityToCheck1 + " exists in the map.");
        } else {
            System.out.println(cityToCheck1 + " does not exist in the map.");
        }
    }
}
