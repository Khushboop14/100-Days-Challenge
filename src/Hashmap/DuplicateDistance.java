//Ques: Given an integer array nums and an integer k,
    // return true if there are two distinct indices i and j in the array
    // such that nums[i] == nums[j] and distance(i - j) <= k.
    // example:
            //Input: nums = [1,0,1,1], k = 1
            //Output: true
    //description: index: [0,1,2,3] dis(0-2)>1 so we update the index for the '1' element from 0th to 2
    // and move further and check dis(2-3)=1, hence its output will be true.

package Hashmap;

import java.util.HashMap;

public class DuplicateDistance {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer, Integer> dmap = new HashMap<Integer, Integer>();
            for(int i = 0; i < nums.length; i++) {
                if(dmap.containsKey(nums[i])) {
                    int index = dmap.get(nums[i]);
                    if((i - index) <= k) {
                        return true;
                    }
                }
                dmap.put(nums[i], i);
            }
            return false;
        }
    }

}

