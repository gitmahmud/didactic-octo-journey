package DP;

public class TripleStep {
    public static int numberOfHops(int n){
        if(n <1){
            return 0;
        }
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] =1;

        for(int i = 2 ; i<=n ; i++){
            if(i-1 >=0){
                arr[i] += arr[i-1];
            }
            if(i-2 >=0){
                arr[i] += arr[i-2];
            }
            if(i-3 >=0){
                arr[i] += arr[i-3];
            }
        }

        return arr[n];
    }
}
