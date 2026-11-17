class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word.toLowerCase());
        }

        Map<String, Integer> map = new HashMap<>();
        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        String ans = "";
        int max = 0;

        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }
            int count = map.getOrDefault(word, 0) + 1;
            map.put(word, count);
            if (count > max) {
                max = count;
                ans = word;
            }
        }
        
        return ans;
    }
}