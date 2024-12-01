class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int it : arr){
            if(set.contains(2*it) ||(it%2==0 && set.contains(it/2))){
                return true;
            }
            set.add(it);
        }
        return false;
    }
}