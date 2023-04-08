class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();

        for(int i = 1; i <= n; i++){
            boolean divisibleBy3 = (i % 3 == 0);
            boolean divisibleBy5 = (i % 5 == 0);

            String numAnsStr = "";
            if(divisibleBy3){
                numAnsStr += "Fizz";
            }
            if(divisibleBy5){
                numAnsStr += "Buzz";
            }
            if(numAnsStr.equals("")){
                numAnsStr += Integer.toString(i);
            }
            ans.add(numAnsStr);
        }
        return ans;
    }
}
