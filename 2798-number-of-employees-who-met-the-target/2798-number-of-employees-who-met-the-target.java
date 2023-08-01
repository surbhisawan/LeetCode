class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = hours.length;
        Arrays.sort(hours);
        int count = 0;
        
        for(int ptr : hours){
            if(ptr<target){
                count++;
            }
        }
        return (n-count);
    }
}