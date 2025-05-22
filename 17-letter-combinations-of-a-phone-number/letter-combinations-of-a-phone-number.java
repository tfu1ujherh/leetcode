class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        
        // Edge case: if digits is empty, return empty list
        if (digits == null || digits.length() == 0) {
            return res;
        }

        HashMap<Character, String> dail = new HashMap<>();
        dail.put('2', "abc");
        dail.put('3', "def");
        dail.put('4', "ghi");
        dail.put('5', "jkl");
        dail.put('6', "mno");
        dail.put('7', "pqrs");
        dail.put('8', "tuv");
        dail.put('9', "wxyz");

        solve(digits, res, dail, new StringBuilder(), 0);
        return res;
    }

    public static void solve(String digits, List<String> res, HashMap<Character, String> dail, StringBuilder ans, int i) {
        // Base case: if the current combination is complete, add it to the result
        if (i == digits.length()) {
            res.add(ans.toString());
            return;
        }

        // Get the letters corresponding to the current digit
        String pair = dail.get(digits.charAt(i));

        // Iterate through all possible letters for the current digit
        for (int j = 0; j < pair.length(); j++) {
            ans.append(pair.charAt(j)); // Add the letter to the current combination
            solve(digits, res, dail, ans, i + 1); // Recur for the next digit
            ans.deleteCharAt(ans.length() - 1); // Backtrack (remove the last letter)
        }
    }
}