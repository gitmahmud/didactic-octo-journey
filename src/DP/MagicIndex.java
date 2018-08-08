package DP;

public class MagicIndex {
    public static int getMagicIndex(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == mid){
                return mid;
            }
            else if(arr[mid] > mid ){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return  -1;

    }
    public static int getMagicIndexFromDuplicate(int[] arr){
        return getMagicIndex(arr);

    }
}
