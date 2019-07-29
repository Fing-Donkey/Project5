public class Pascal {
	   
	   public static int[] pascal(int n) {
	   
	      if (n == 1) {
	         int[] result = {1};
	         return result;
	      } else {
	         int[] prev = pascal(n - 1);
	         int[] result = new int[n];
	         
	         result[0] = 1; result[n-1] = 1;
	         
	         for (int i = 1; i < n-1; i++) {
	            result[i] = prev[i-1] + prev[i];
	         }
	         return result;
	      }
	      
	   }

}