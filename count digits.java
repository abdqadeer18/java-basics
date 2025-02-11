class Solution {
    static int evenlyDivides(int n) {
        // code here
        Integer temp = new Integer(n);
        int c=0;
        while(temp>0){
            int t=temp%10;
            if(t!= 0 && n%t==0){
                c++;
            }
            temp=temp/10;
        
        }
        return c;
    }
}