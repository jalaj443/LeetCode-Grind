class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num: nums){
            if(isEven(num))
            count++;
        }
        return count;
    }
    static int digit(int num){
        int digitcount=0;
        while(num>0){
            digitcount++;
            num/=10;
        }
        return digitcount;
    }
    static boolean isEven(int num){   
        int a= digit(num);
        if(a%2==0){  
        return true;
    }
    return false;
    }
}
