class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        
        
        
        if(word.contains(Character.toString(ch)) == false)
            return word;
        
        int cnt = 0;
        
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != ch){
                stack.push(word.charAt(i));
                cnt++;
            }else if(word.charAt(i) == ch){
                stack.push(word.charAt(i));
                cnt++;
                break;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        while(cnt < word.length()){
            sb.append(word.charAt(cnt));
            cnt++;
        }
        
        return sb.toString();
        
    }
}