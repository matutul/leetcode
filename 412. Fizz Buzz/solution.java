class Solution {
    public List<String> fizzBuzz(int n) {
        String[] answerArray = new String[n];
        for(int i = 1; i <= n; i++){
            if(i%3==0 && i%5==0){
                answerArray[i-1] = "FizzBuzz";
            }
            else if(i%3==0){
                answerArray[i-1] = "Fizz";
            }
            else if(i%5==0){
                answerArray[i-1] = "Buzz";
            }
            else{
                answerArray[i-1] = String.valueOf(i);
            }
        }
        return new ArrayList<String>(Arrays.asList(answerArray));
    }
}