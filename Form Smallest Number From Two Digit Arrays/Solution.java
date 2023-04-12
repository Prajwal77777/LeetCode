Given two arrays of unique digits nums1 and nums2, return the smallest number that contains at least one digit from each array.
 

Example 1:

Input: nums1 = [4,1,3], nums2 = [5,7]
Output: 15
Explanation: The number 15 contains the digit 1 from nums1 and the digit 5 from nums2. It can be proven that 15 is the smallest number we can have.
Example 2:

Input: nums1 = [3,5,2,6], nums2 = [3,1,7]
Output: 3
Explanation: The number 3 contains the digit 3 which exists in both arrays.
  
  //SOLUTION
  class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
	   //Sorted to find smallest element which has elements in both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        Set<Integer> set = new HashSet<>(); //To avoid duplicate values
		
        for(int i : nums1) set.add(i);
        for(int n : nums2) if(set.contains(n)) return n; //If any common value found from both arrays, return it
        
       
       if(nums1[0] < nums2[0]) return nums1[0] * 10 + nums2[0];
       return nums2[0] * 10 + nums1[0];
    }
}
