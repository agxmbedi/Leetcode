class Solution {
    public int fib(int n) {
        // if(n<=1)
        //     return n;
        //     return fib(n-1)+fib(n-2);
         int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
        
        }
        
    }
