
public class Solution {
	public int numSquares(int n) {
        while(n % 4 == 0) 
        	n = n / 4;
        
        if(n % 8 == 7)
        	return 4;
        
        for(int i = 0; i * i <= n; i++){
        	int j = (int) Math.sqrt(n - i * i);
        	if(i * i + j * j == n)
        		if(i == 0 || j == 0)
        			return 1;
        		else
        			return 2;
        }
        
        return 3;
    }
}
