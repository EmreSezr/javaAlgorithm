package org.emresezer.E4;
import java.util.HashMap;
import java.util.Map;

public class MostRepeatedNumber {
        public static void main(String[] args) {
            HashMap<String, Integer> numbers = new HashMap<>();

            // 0–100 arası her bir sayıyı 1 kere koyuyoruz
            for (int i = 0; i <= 100; i++) {
                numbers.put(Integer.toString(i), 1);
            }

            // 0–100 arası rastgele 101 sayı daha ekliyoruz
            for (int i = 0; i <= 100; i++) {
                String key = Integer.toString((int)(Math.random() * 101));
                numbers.put(key, numbers.get(key) + 1);
            }

            // En çok tekrar edeni bul
            String mostFreqKey = null;
            int maxCount = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostFreqKey = entry.getKey();
                }
            }

            System.out.printf("En çok tekrar eden sayı: %s (toplam %d kez)%n",
                    mostFreqKey, maxCount);
        }

}
