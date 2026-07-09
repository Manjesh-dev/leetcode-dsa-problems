class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }
}



class Trie {

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into Trie
    public void insert(String word) {

        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEnd = true;
    }

    // Find Longest Common Prefix
    public String longestPrefix() {

        StringBuilder ans = new StringBuilder();

        TrieNode current = root;

        while (true) {

            int count = 0;
            int childIndex = -1;

            // Count how many children exist
            for (int i = 0; i < 26; i++) {

                if (current.children[i] != null) {
                    count++;
                    childIndex = i;
                }
            }

            // Stop if more than one child or word ends here
            if (count != 1 || current.isEnd) {
                break;
            }

            ans.append((char) ('a' + childIndex));

            current = current.children[childIndex];
        }

        return ans.toString();
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) {

        //  if(strs == null || strs.length == 0)
        //     return "";

        // for(int i = 0; i < strs[0].length(); i++) {

        //     char ch = strs[0].charAt(i);
            

        //     for(int j = 1; j < strs.length; j++) {
                

        //         if(i >= strs[j].length() || strs[j].charAt(i) != ch) {
        //             return strs[0].substring(0, i);
        //         }

        //     }
        // }
        // return strs[0]

        
        if (strs == null || strs.length == 0) {
            return "";
        }

        Trie trie = new Trie();

        for (String word : strs) {
            trie.insert(word);
        }

        return trie.longestPrefix();
    }
}

