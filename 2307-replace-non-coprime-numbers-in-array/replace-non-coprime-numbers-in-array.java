class Solution {
    public int gcd(int x,int y){
        return (y==0)?x: gcd(y,x%y);
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        
        for(int num : nums){   
            stack.push(num);
            
            while(stack.size() > 1){
                int a = stack.pop();
                int b = stack.pop();
                
                int g = gcd(a,b);
                if(g > 1){
                    int lcm = (int)((long)a * b / g); 
                    stack.push(lcm);
                } else {
                    stack.push(b);
                    stack.push(a);
                    break; 
                }
            }
        }

        return new ArrayList<>(stack);
    }
}