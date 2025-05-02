import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits; // method exits here
            }
        }
        // if else section returns in loop this part is ignored
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
        //return [int(x) for x in str(int(''.join([str(x) for x in digits])) + 1)]
    }

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
        return k;
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) { // i loop runs then j loop
            //System.out.println("i: "+i);
            for (int j = i + 1; j < nums.length; j++) { // j loop runs till it finishes then i loop runs again then j loops runs till it finishes and repeat...
                //System.out.println("j: "+j);
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

//    public int removeDuplicates(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length;i++){
//            for (int j = i+1; j < nums.length;j++){
//                if (nums[i]==nums[j]){
//                    nums[i] = 0;
//                    count++;
//                    System.out.println(Arrays.toString(nums));
//                }
//            }
//        }
//        System.out.println("---+++---");
//        for (int i = 1; i <= nums.length;i++){
//            if (nums[nums.length-i]!=0){
//                nums[i-1] = nums[nums.length-i];
//                //nums[nums.length-i] = nums[i-1];
//                System.out.println(Arrays.toString(nums));
//            }
//        }
//        return count;
//    }

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i - 1];
                count++;
                //System.out.println(Arrays.toString(nums));
            }
        }
        nums[count] = nums[nums.length - 1];
        System.out.println("Sorted array: " + Arrays.toString(nums));
        return count + 1;
    }

    public int searchInsert(int[] nums, int target) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                temp = i;
                break;
            } else {
                temp = i + 1;
            }
        }
        return temp;
    }

    public boolean isBadVersion(int n) {
        if (n == 1702766719) {
            return true;
        } else if (n == 1860909217) {
            return true;
        }
        return false;
    }

    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int index = 0;
        while (low <= high) { // binary search
            int mid = low + ((high - low) / 2);
            if (!isBadVersion(mid)) {
                low = mid + 1;
            } else if (isBadVersion(mid)) {
                high = mid - 1;
                index = mid;
            }
        }
        return index;
    }

    public int maxProfit(int[] prices) {
        int low = prices[0];
        int profit = 0;

        //find the lowest value in array
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < low) { // second element vs first element whichever makes true then turns low as defined above to the lowest (prices[i])
                low = prices[i]; //assign
            }
            if ((prices[i] - low) > profit) { // this runs first time if profit turns to be something else than 0
                profit = prices[i] - low; //assign
            }
        }
        return profit;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && nums1[i + 1] == nums2[j + 1]) {
                    int temp = nums1[i];
                    int temp2 = nums2[j + 1];
                    return new int[]{temp, temp2};
                }
            }
        }
        return null;
    }

    //nested loops version
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) { //O(n^2) time complexity
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String[] letter = str[str.length - 1].split("");
        int count = 0;
        for (int i = 0; i < letter.length; i++) {
            count = i + 1;
        }
        //return str[str.length-1].length();
        return count;
    }

//    public String longestCommonPrefix(String[] strs) {
//        String prefix = strs[0];
//    }

    public static void main(String[] args) {

        //initialize to call methods
        Main main = new Main();
        ArrayQuestions questions = new ArrayQuestions();
        MathQuestions mathQuestions = new MathQuestions();
        AlgorithmQuestions algorithmQuestions = new AlgorithmQuestions();
        StringQuestions stringQuestions = new StringQuestions();

        // arrays:
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 4, 4, 4, 4, 1};
        int[] twosumnums = {2, 7, 11, 15};
        int[] duplicatesnums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] numsinsert = {1, 3, 5, 6};
        int[] prices = {2, 4, 1};
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] nearbynums1 = {1, 2, 3, 1, 2, 3};
        int[] singlenums1 = {4, 1, 2, 1, 2};
        int[] duplicatenums = {1, 2, 3, 4};
        String[] strs = {"flower", "flow", "flight"};

        Scanner sc = new Scanner(System.in);

        // Print answers:
        while (true) {
            System.out.println("LeetCode Solutions\n" +
                    "1 ArrayQuestions\n" +
                    "2 StringQuestions\n" +
                    "3 MathQuestions\n" +
                    "4 AlgorithmQuestions\n" +
                    "0 Exit Program");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("ArrayQuestions");
                    System.out.println("test intersections with hashset: " + Arrays.toString(questions.intersection(nums1, nums2)));
                    System.out.println("Contains Duplicate 2 (Contains Nearby Duplicate): " + questions.containsNearbyDuplicate(nearbynums1, 2));
                    System.out.println("Intersection of Two Arrays: " + Arrays.toString(main.intersection(nums1, nums2)));
                    System.out.println("Best Time to Buy and Sell Stock: " + main.maxProfit(prices));
                    System.out.println("searchInsert: " + main.searchInsert(numsinsert, 9));
                    System.out.println("removeDuplicates: " + main.removeDuplicates(duplicatesnums));
                    System.out.println("twoSum: " + Arrays.toString(main.twoSum(twosumnums, 9)));
                    System.out.println("Two Sum Optimal Solution: " + Arrays.toString(algorithmQuestions.twoSum(twosumnums, 9)));
                    System.out.println("plusOne: " + Arrays.toString(main.plusOne(new int[]{8, 9, 9})));
                    System.out.println("removeElement: " + main.removeElement(nums, 4));
                    System.out.println("Single Number: " + questions.singleNumber(singlenums1));

                    for (int i : nums) {
                        System.out.print(i + " ");
                    }

                    break;
                case 2:
                    System.out.println("StringQuestions");
                    System.out.println(stringQuestions.longestCommonPrefix(strs));
                    break;
                case 3:
                    System.out.println("MathQuestions");
                    System.out.println("Pow(x,n): " + mathQuestions.myPow(2.00000, -2147483648));
                    System.out.println("Sqrt(x): " + mathQuestions.mySqrt(8));
                    break;
                case 4:
                    System.out.println("AlgorithmQuestions");
                    System.out.println("FirstBadVersion: " + main.firstBadVersion(2126753390));
                    System.out.println("(Amazon OA Question 2) getDataDependenceSum: " + algorithmQuestions.getDataDependenceSum(13));
                    System.out.println("*NeetCode* Contains Duplicate: " + questions.hasDuplicate(duplicatenums));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}