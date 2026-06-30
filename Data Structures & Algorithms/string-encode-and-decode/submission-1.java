class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int j = i;

            // Find the '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Length of the next string
            int length = Integer.parseInt(str.substring(i, j));

            // Extract the string
            result.add(str.substring(j + 1, j + 1 + length));

            // Move to the next encoded string
            i = j + 1 + length;
        }

        return result;
    }
}