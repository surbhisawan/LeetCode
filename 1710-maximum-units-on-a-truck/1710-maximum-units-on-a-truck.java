class Solution {
    public static void sorting(int[][]box , final int col){
        Arrays.sort(box,new Comparator<int[]>(){
            public int compare(int[] first, int[] second) {
               if(first[col-1] > second[col-1]) return 1;
               else return -1;
            }
        });
    }
    
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        sorting(boxTypes,2);
        int val = 0 ;
        for(int i = boxTypes.length-1 ; i>=0 && truckSize>0; i--){
            if(truckSize >boxTypes[i][0]){
                val += boxTypes[i][0]*boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            }
            else {
                val += boxTypes[i][1]*truckSize;
                truckSize = 0;
            }  
        }
        return val;
    }
}