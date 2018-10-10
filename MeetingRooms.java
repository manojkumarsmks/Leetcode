// 252 - Meeting Rooms
import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

	public static void main(String[] args) {
		
		Interval[] intervalArray = { new Interval(0,30), new Interval(5,10), new Interval(15,20)};
		System.out.println(meeting(intervalArray));
		
		
	}
	
	// Straight forward solution
	public static boolean meetingRooms(Interval[] interval) {
		
		int[] start = new int[interval.length];
		int[] end = new int[interval.length];
		
		for(int i = 0; i < interval.length; i++) {
			start[i] = interval[i].start;
			end[i] = interval[i].end;
 		}
		
		Arrays.sort(start);
		Arrays.sort(end);
			
		for (int i = 0; i < end.length-2; i++) {
			if(start[i+1] < end[i])
				return false;
		}
		return true;
	}
	
	// With Comparator 
	public static boolean meeting(Interval[] interval) {
		Arrays.sort(interval, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});
		
		for (int i = 0; i <= interval.length-2; i++) {
			if(interval[i+1].start < interval[i].end)
				return false;
		}
		
		
		return true;
	}
	

}

class Interval {
	int start;
	int end;
	Interval() {
		this.start = 0;
		this.end = 0;
	}
	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}
}
