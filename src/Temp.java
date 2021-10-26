import java.util.HashMap;
import java.util.Map;

public class Temp {
    public static void main(String[] args) {
        Map<Long, Map<Integer, Double>> debtors = new HashMap<>();
        Map<Integer, Double> debtFirst = new HashMap<>();
        debtFirst.put(1, 2000.0);
        debtFirst.put(2, 1000.0);
        debtFirst.put(3, 500.0);
        debtFirst.put(4, 700.0);
        debtors.put(111L, debtFirst);

        Map<Integer, Double> debtSecond = new HashMap<>();
        debtFirst.put(1, 1000.0);
        debtFirst.put(2, 700.0);
        debtFirst.put(3, 500.0);
        debtFirst.put(4, 300.0);
        debtors.put(222L, debtSecond);

        for (Map.Entry<Long, Map<Integer, Double>> pair : debtors.entrySet()) {
            System.out.println("SSN: " + pair.getKey());

            Map<Integer, Double> innerMap = pair.getValue();

            for (Map.Entry<Integer, Double> innerPair : innerMap.entrySet()) {
                System.out.println(innerPair.getKey() + ": " + innerPair.getValue() + " ,");
            }
            System.out.println();
        }
        Double sum = 0.0;
        for (Map.Entry<Long, Map<Integer, Double>> pair : debtors.entrySet()) {
            Map<Integer, Double> innerMap = pair.getValue();
            for (Map.Entry<Integer, Double> innerPair : innerMap.entrySet()) {
                sum += innerPair.getValue();
            }
        }
        System.out.println(sum);


    }
}

