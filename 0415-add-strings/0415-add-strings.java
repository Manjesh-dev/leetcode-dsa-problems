class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans  = new StringBuilder();

        int l = num1.length()-1;
        int r = num2.length()-1;

        int c=0;
        while (l>=0 || r>=0) {
            int d = 0;
            int d2 = 0;
            if(l>=0){
                d = (int)(num1.charAt(l) - '0') ;
            }
            if(r>=0){
                d2 = (int)(num2.charAt(r) - '0');
            }
            int sum = d + d2 + c;
            c = 0;
            if(sum > 9){
                while (sum > 1){
                    int rem = sum %10;
                    ans.append(rem);
                    sum /= 10;
                }
                c = sum;
            }else{
                ans.append(sum);
            }
            l--;
            r--;   
        }
        if(c!=0){
            ans.append(c);
        }
        return new String(ans.reverse());
    }
}