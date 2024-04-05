class Solution {
    public String makeGood(String s) { 
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if((stack.peek() - 'A') == (c - 'a') || (stack.peek() - 'a') == (c - 'A')){
                     stack.pop(); 
                }else{
                    stack.push(c);
                }
            }
            
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }
        
        return sb.toString();
    }
}