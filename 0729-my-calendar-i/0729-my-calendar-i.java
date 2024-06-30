class MyCalendar {

    ArrayList<int[]> calender;
    
    public MyCalendar() {
        calender = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] i : calender){
            if(start<i[1] && end>i[0]){
                return false;
            }
        }
        
        calender.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */