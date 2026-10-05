class Solution {
    // public int scoreOfParentheses(String s) {
    //     int count = 0;
    //     Deque<Character> stack = new ArrayDeque<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         char c = s.charAt(i);
    //         if (stack.isEmpty() || stack.peek() == c)
    //             stack.push(c);
    //         else if (c == ')' && stack.peek() == '(') {
    //             count++;
    //             stack.pop();
    //         }
    //     }
    //     return count;
    // }

    public int scoreOfParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int count = 0;
        for(char c : s.toCharArray()){
            if(c=='(')
                stack.push(0);
            else{
                int inner = stack.pop();
                int score = inner==0 ? 1 : 2*inner;
                stack.push(stack.pop()+score);
            }
        }
        return stack.pop();
    }
}