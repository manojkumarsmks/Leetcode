// 252 - Meeting Rooms
import java.util.Arrays;

public class MeetingRooms {

	public static void main(String[] args) {
		
		Interval[] intervalArray = {new Interval(7,10), new Interval(2,4)};
		System.out.println(meetingRooms(intervalArray));
		
		
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
