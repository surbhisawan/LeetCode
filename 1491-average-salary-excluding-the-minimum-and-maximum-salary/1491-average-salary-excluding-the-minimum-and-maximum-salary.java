class Solution {
    public double average(int[] salary) {
        int maxSal = Integer.MIN_VALUE;
        int minSal = Integer.MAX_VALUE;
        int n = salary.length;
        int sum=0;
        for(int i=0;i<n;i++){
            maxSal = Math.max(salary[i],maxSal);
            minSal = Math.min(salary[i],minSal);
            sum+=salary[i];
        }
        double total = (double)(sum - maxSal - minSal)/(n-2);
        return total;
    }
}