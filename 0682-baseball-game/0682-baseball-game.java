class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                st.pop();
            }else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }else if(operations[i].equals("+")){
                int n = st.pop();
                int n1 = st.peek();
                st.push(n);
                st.push(n+n1);
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        
        int sum =0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}