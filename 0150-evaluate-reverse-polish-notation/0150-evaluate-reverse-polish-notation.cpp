class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<long long> stack;
        for(auto i : tokens){
            if(i != "+" && i != "-" && i != "*" && i != "/"){
                stack.push(stoi(i));
                continue;
            }else{
                long long a = stack.top();
                stack.pop();
                long long b = stack.top();
                stack.pop();

                if(i == "+")
                    stack.push(a+b);
                else if( i == "-")
                    stack.push(b-a);
                else if(i == "*")
                    stack.push(a*b);
                else
                    stack.push(b/a);
            }
        }
        return stack.top();
    }
};