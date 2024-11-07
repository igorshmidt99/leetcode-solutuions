public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sol = new StringBuilder(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(sol.toString()) && sol.length() != 0) {
                sol.deleteCharAt(sol.length() - 1);
            }
        }

        return sol.toString();
    }

}
