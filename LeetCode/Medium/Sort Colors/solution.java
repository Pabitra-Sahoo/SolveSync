class Solution {
    public void sortColors(int[] arr) {
        int C0=0;
        int C1=0;
        int C2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                C0++;
            }
            else if(arr[i]==1){
                C1++;
            }
            else{
                C2++;
            }
        }
        for(int i=0;i<C0;i++){
            arr[i]=0;
        }
        for(int i=C0;i<C0+C1;i++){
            arr[i]=1;
        }
        for(int i=C0+C1;i<arr.length;i++){
            arr[i]=2;
        }
    }
}