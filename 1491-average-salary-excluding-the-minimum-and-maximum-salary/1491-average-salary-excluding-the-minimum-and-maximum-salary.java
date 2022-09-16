class Solution {
    public double average(int[] salary) {
       Arrays.sort(salary);
       int size = salary.length; 
       int minSal = salary[0];
       int maxSal = salary[size-1];
       int n=size-2; 
       double sum=0;
       for(int i=1;i<size-1;i++){
           sum+=salary[i];
       } 
        double average = sum/n;
        return average;
           
    }
}