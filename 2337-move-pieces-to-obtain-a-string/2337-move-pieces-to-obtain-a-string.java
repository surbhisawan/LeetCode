class Solution {
    public boolean canChange(String start, String target) {
       Queue<Pair<Character,Integer>> startqueue = new LinkedList<>();
       Queue<Pair<Character,Integer>> targetqueue = new LinkedList<>();
        
        for(int i = 0; i < start.length(); i++){
            if(start.charAt(i)!='_'){
                startqueue.add(new Pair<>(start.charAt(i),i));
            }
            
            if(target.charAt(i)!='_'){
                targetqueue.add(new Pair<>(target.charAt(i),i));
            }
            
        }
        
        if(targetqueue.size()!=startqueue.size()){
            return false;
        }
        
        while(!startqueue.isEmpty()){
            Pair<Character,Integer> startpair = startqueue.poll();
            Pair<Character,Integer> targetpair = targetqueue.poll();
            
            char startChar = startpair.getKey();
            int startIdx = startpair.getValue();
            char targetChar = targetpair.getKey();
            int targetIdx = targetpair.getValue();
            
            
            if(startChar!=targetChar || (startChar == 'L' && startIdx < targetIdx) || (startChar == 'R' && startIdx > targetIdx)){
                return false;
            }
        }
       return true;
    }
}