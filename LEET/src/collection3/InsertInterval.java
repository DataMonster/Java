package collection3;

import java.util.ArrayList;

public class InsertInterval {

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int first = find(newInterval.start,intervals);
        int second = find(newInterval.end,intervals);
        
        if(first!=second){
        	intervals.get(first).end = intervals.get(second).end;
        	for(int i = 0;i<second-first;i++){
        		intervals.remove(first+1);
        	}
        }
        return intervals;
    }
	public static int find(int num, ArrayList<Interval> intervals){
		for(int i =0;i<intervals.size();i++){
			if(intervals.get(i).start<num &&intervals.get(i).end>num){
				return i;
			}
		}
		return intervals.size()-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Interval {
	      int start;
	      int end;
	     Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	  }