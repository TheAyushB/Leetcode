class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();

        if(!expression.contains("+") && !expression.contains("-") && !expression.contains("*")) {
            ans.add(Integer.parseInt(expression));
            return ans;
        }

        int len = expression.length();
        for(int i = 0; i < len; i++) {
            char ch = expression.charAt(i);
            if(!Character.isDigit(ch)) { // operand 
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1, len));
                for(int x : left)
                    for(int y : right){
                        switch(ch) {
                            case '+': ans.add(x + y);
                                        break;
                            case '-': ans.add(x - y);
                                        break;
                            case '*': ans.add(x * y);
                                        break;
                        }
                    }
            }
        }
        return ans;
    }
}