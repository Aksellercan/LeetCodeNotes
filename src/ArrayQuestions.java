import java.util.*;

public class ArrayQuestions {
    //hashset version
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) { //O(n) time complexity
            if (seen.contains(nums[i])) { //if duplicate found enter the statement and return true
                return true;
            }
            seen.add(nums[i]); // add to hashset
            if (seen.size() > k) { //if hashset size exceeds k value
                seen.remove(nums[i - k]); //shift hashset to right by removing values on left
            }
        }
        return false; //if no duplicates found after looping once exit and return false
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums1set = new HashSet<>();
            for (int nums : nums1) {
                nums1set.add(nums);
            }
            HashSet<Integer> resulthashset = new HashSet<>();

            for (int nums : nums2) {
                if (nums1set.contains(nums)) {
                    resulthashset.add(nums);
                }
            }
            int[] result = new int[resulthashset.size()];
            int i = 0;
            for (int nums : resulthashset) {
                result[i++] = nums;
            }
        return result;
    }
    //find uniques
    public int singleNumber(int[] nums) {
        int n = 0;
        for (int u : nums)
            n ^= u; //XOR operator (n=n^u) n will equal truth table result as binary converted to decimal

        return n;
    }

    //amazon
    //sample questions
    public static String findNumber(List<Integer> arr, int k) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return "YES";
            }
        }
        return "NO";
    }

    public static List<Integer> oddNumbers(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if(i % 2 == 1){
                result.add(i);
            }
        }
        return result;
    }

    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(duplicate.contains(nums[i])){
                return true;
            }
            duplicate.add(nums[i]);
        }
        return false;
    }

    // Optimized Version
    public int NumOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplacedCount = 0;
        for (int fruit : fruits) {
            boolean placed = false;
            for (int j = 0; j < baskets.length; j++) {
                if (fruit <= baskets[j]) {
                    baskets[j] = -1;
                    placed = true;
                    break;
                }
            }
            if (!placed) unplacedCount++;
        }
        return unplacedCount;
    }

    // First attempt Brute Force
    public int NumOfUnplacedFruitsFirstAttempt(int[] fruits, int[] baskets) {
        int unplacedCount = 0;
        HashSet<Integer> usedBaskets = new HashSet<Integer>();
        for (int fruit : fruits) {
            boolean placed = false;
            for (int j = 0; j < baskets.length; j++) {
                if (!usedBaskets.contains(j)) {
                    if (fruit <= baskets[j]) {
                        usedBaskets.add(j);
                        placed = true;
                        break;
                    }
                }
            }
            if (!placed) unplacedCount++;
        }
        return unplacedCount;
    }

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}