class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }else{
                
                if(stack.empty()){
                    return false;
                }
                
                char c = stack.peek();
                
              if(c == '(' && ch == ')'  || c == '{' && ch == '}' || c == '['&& ch == ']')
               {
                  stack.pop();
               }  else{
                  return false;
              }
            } 
        }
        return stack.size() == 0 ? true : false;
    }
}