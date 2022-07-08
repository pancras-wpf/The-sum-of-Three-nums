package 三数之和;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {34,55,79,28,46,33,2,48,31,-3,84,71,52,-3,93,15,21,-43,57,-6,86,56,94,74,83,-14,28,
                -66,46,-49,62,-11,43,65,77,12,47,61,26,1,13,29,55,-82,76,26,15,-29,36,-29,10,-70,69,17,49};
        Solution solution = new Solution();
        solution.threeSum(nums);
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();


        for(int i = 0; i < nums.length-2; i ++){

            boolean flag = false;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int m = i + 1;
            int n = nums.length - 1;
            while(m < n){

                if( nums[i] + nums[m] + nums[n] > 0){
                    n --;
                    flag =false;

                }else if(nums[i] + nums[m] + nums[n] < 0 ){
                    m ++;
                    flag = false;

                }else{
                    if(!flag || nums[m] != nums[m-1]){
                        List<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[m]);
                        a.add(nums[n]);
                        list.add(a);
                        flag = true;
                    }
                    m ++;
                }
            }
        }

        return list;
    }
}