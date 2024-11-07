import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public int romanToInt(String s) {
        Map<String, Integer> rToA = new HashMap<>();
        rToA.put("I", 1);
        rToA.put("IV", 4);
        rToA.put("V", 5);
        rToA.put("IX", 9);
        rToA.put("X", 10);
        rToA.put("XL", 40);
        rToA.put("L", 50);
        rToA.put("XC", 90);
        rToA.put("C", 100);
        rToA.put("CD", 400);
        rToA.put("D", 500);
        rToA.put("CM", 900);
        rToA.put("M", 1000);

        int sol = 0;
        int sLength = s.length();

        for (int i = 0; i < sLength; i++) {
            String r = s.substring(i, i + 1);
            var a = rToA.get(r);
            if (i + 1 != sLength) {
                String both = r + String.valueOf(s.charAt(i + 1));
                if (rToA.get(both) != null) {
                    a = rToA.get(both);
                    i++;
                }
            }
            sol += a;
        }
        return sol;
    }

}
