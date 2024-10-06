class Node{
    Node[] link = new Node[26];
    boolean flag = false;
    
    Node(){
        flag = false;
        for(int i = 0; i < 26; i++){
            link[i] = null;
        }
    }
}

class Trie {
    Node root;
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node node = root; //dummy node
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            int idx = ch - 'a';
            if(node.link[idx] == null){
                node.link[idx] = new Node();
            }
            node = node.link[idx];
        }
        
        node.flag = true;
    }
    
    public boolean search(String word) {
        Node node = root; //dummy node
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            int idx = ch - 'a';
            if(node.link[idx] == null){
                return false;
            }
            node = node.link[idx];
        }
        
        if(node.flag){
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        Node node = root; //dummy node
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            int idx = ch - 'a';
            if(node.link[idx] == null){
                return false;
            }
            node = node.link[idx];
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