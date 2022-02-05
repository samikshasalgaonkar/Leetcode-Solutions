class Solution {
    int output = 0;
    
    public int finalValueAfterOperations(String[] operations) {
        for(String element : operations) {
            if(element.equals("--X") || element.equals("X--")) {
                output = output - 1;
            } else if(element.equals("++X") || element.equals("X++")) {
                output = output + 1;
            }
        }
        return output;
    }
    
}