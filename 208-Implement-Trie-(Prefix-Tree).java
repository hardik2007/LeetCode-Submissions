class TrieNode{
    HashMap<Character,TrieNode> children;
    boolean end;

    TrieNode(){
        children = new HashMap<>();
        end = false;
    }
}
class Trie {
    public TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current = root;
        int n = word.length();
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(current.children.get(ch) == null){
                current.children.put(ch,new TrieNode());
            }
            current = current.children.get(ch);
        }
        current.end = true;
    }
    
    public boolean search(String word) {
        TrieNode current = root;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(current.children.get(ch) == null){
                return false;
            }
            current = current.children.get(ch);
        }
        return current.end;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            if(current.children.get(ch) == null){
                return false;
            }
            current = current.children.get(ch);
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */