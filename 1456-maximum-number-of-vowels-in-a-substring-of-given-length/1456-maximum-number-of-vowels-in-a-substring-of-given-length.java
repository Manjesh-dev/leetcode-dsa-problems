class Solution {
    public int maxVowels(String s, int k) {
        // brute force
        // StringBuilder t = new StringBuilder();
        // int maxC = 0;
        // int l = 0;
        // int r = k;
        // int m = 0;

        // while (r < s.length()) {
        //     int c = 0;
        //     for (int i = m; i < r; i++) {
        //         if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
        //                 || s.charAt(i) == 'u') {
        //             c++;
        //         }
        //         t.append(s.charAt(i));
        //     }
        //     t.deleteCharAt(l);
        //     maxC = Math.max(maxC, c);
        //     r++;
        //     m++;
        // }
        // int c1 =0;
        // for (int i = m; i < r; i++) {
        //     if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
        //             || s.charAt(i) == 'u') {
        //         c1++;
        //     }
        //     t.append(s.charAt(i));
        // }
        // maxC = Math.max(maxC, c1);

         int c = 0;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                c++;
            }
        }
        int maxC = c;
        int l = 0;
        int r = k;

        while (r < s.length()) {
            if(s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' || s.charAt(l) == 'o'
                    || s.charAt(l) == 'u'){
                        c--;

            }
            if (s.charAt(r) == 'a' || s.charAt(r) == 'e' || s.charAt(r) == 'i' || s.charAt(r) == 'o'
                    || s.charAt(r) == 'u') {
                c++;
            }
            maxC = Math.max(maxC, c);
            l++;
            r++;
        }
        return maxC;
    }
}