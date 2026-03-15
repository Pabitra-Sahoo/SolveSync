class Solution {
    public int reverse(int x) {
        int temp=x;
        long rev=0;
        while(temp!=0){
            int k=temp%10;
            rev=(rev*10)+k;
            temp=temp/10;
        }
        if(rev<=Integer.MIN_VALUE || rev>=Integer.MAX_VALUE)return 0;
        else {
            int h=(int)rev;
            return h;
        }
    }
}