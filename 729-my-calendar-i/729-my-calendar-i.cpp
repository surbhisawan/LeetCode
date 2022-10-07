class MyCalendar {
public:
    vector<pair<int,int>> vec;
    MyCalendar() {
        
    }
    
    bool book(int start, int end) {
        for(auto i:vec){
            if(start<i.second and i.first<end) 
                return false;
        }
        
        vec.push_back({start,end});
        return true;
    }
};

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar* obj = new MyCalendar();
 * bool param_1 = obj->book(start,end);
 */