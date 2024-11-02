class Solution {
    public boolean isCircularSentence(String sentence) {
        
        String[] strArray = sentence.split(" ");
        int length = strArray.length-1;
        
        for(int i = 0; i < length; i++){
            int len1 = strArray[i].length()-1;
            // int len2 = strArray[i+1].length;
            if(strArray[i].charAt(len1) != strArray[i+1].charAt(0)){
                return false;
            }
        }
        
        int lastLen = strArray[length].length()-1;
        if(strArray[0].charAt(0) != strArray[length].charAt(lastLen)){
            return false;
        }
    
        
        return true;
    }
}