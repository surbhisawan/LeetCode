class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int ccnt = 0, scnt = 0;
        
        for(int student : students){
            if(student == 0){
                ccnt++;
            }else{
                scnt++;
            }
        }
        
        for(int sandwich : sandwiches){
            
            if(sandwich == 0 && ccnt == 0)
                return scnt;
            
            if(sandwich == 1 && scnt == 0)
                return ccnt;
            
            if(sandwich == 0){
                ccnt--;
            }else{
                scnt--;
            }
        }
        
        return 0;
    }
}