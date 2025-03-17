public class alternatestring {
    
    void string(String word1, String word2) {
        int l = word1.length();
        int m = word2.length();
        int minLen = Math.min(l, m);

        // Merging alternately
        for (int i = 0; i < minLen; i++) {
            System.out.print(word1.charAt(i));
            System.out.print(word2.charAt(i));
        }

        // Printing remaining characters of the longer string
        if (l > m) {
            System.out.print(word1.substring(m));
        } else if (m > l) {
            System.out.print(word2.substring(l));
        }

        System.out.println();
    }

    public static void main(String[] args) {
        alternatestring obj = new alternatestring();
        obj.string("hey", "you");       // Output: hyeyou
        obj.string("honey", "yoyo");    // Output: hoynoeyn
        obj.string("hello", "world");   // Output: hweolrllod
        obj.string("abc", "xyz123");    // Output: axbycz123
    }
}
