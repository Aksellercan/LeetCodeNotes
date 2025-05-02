import java.util.ArrayList;
import java.util.HashMap;

public class AlgorithmQuestions {
    //amazon oa
    //debug
    public String getDataDependenceSumDebug(long n) {
        long sum = 0;
        long var1 = 0;
        long var2 = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Long> listk = new ArrayList<>();
        for (int x = 1; x <= n; x++) {
            long k = n/x;
            var1 = k;
            var2 = x;
            if(n/k == x){
                list.add(x);
                listk.add(k);
                //return "k is " + k + "\nk is "+ n/k + "\nx is " + x;
            }
        }
        for (int b : list){
            sum += b;
        }
        return "\nDebug\nShould return value long sum: " + sum + "\nValue of k is: " + var1 +
                "\nResult of n/k is: "+ n/var1 + "\nValue of x is: " + var2 + "\nX list:"+list +"\nK list: "+ listk+ "\nSum is: " + sum;
    }

    //question 2
    public Long getDataDependenceSum(long n) {
        long sum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int x = 1; x <= n; x++) {
            long k = n/x;
            if(n/k == x){
                list.add(x);
                //sum +=x;
            }
        }
        for (int b : list){
            sum += b;
        }
        return sum;
    }

    //Two Sum Hashmap (Optimal Solution)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int complement = 0;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
