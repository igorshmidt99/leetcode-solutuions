package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Deque<String> str = new ArrayDeque<>();
        Map<String, Boolean> pairs = new HashMap<>();
        pairs.put("()", true);
        pairs.put("[]", true);
        pairs.put("{}", true);

        for (int i = 0; i < s.length(); i++) {
            var last = str.peek();
            var next = String.valueOf(s.charAt(i));
            if (last != null && pairs.get(last + next) != null) {
                str.pop();
                continue;
            }
            str.push(next);
        }
        return str.size() == 0;
    }

}
