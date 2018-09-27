// https://leetcode.com/problems/walking-robot-simulation/description/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WalkingRobot {

	public static void main(String[] args) {
		int[] commands = {4,-1,3};
		int[][] obstacles = {{2,4},{3,5},{4,6}};
		WalkingRobot walkingRobot = new WalkingRobot();
		System.out.println(walkingRobot.robotSim(commands, obstacles));
	}
	
	public int robotSim(int[] commands, int[][] obstacles) {
		int x = 0, y = 0;
		char current  = 'N';
		
		Set<List<Integer>> obstacleSet = new HashSet<>();
		List<Integer> temp = new ArrayList<>();
		for (int i = 0; i < obstacles.length; i++) {
			for (int j = 0; j < obstacles[i].length; j++) {
				temp.add(obstacles[i][j]);
			}
			obstacleSet.add(temp);
		}
		
		for (int i = 0; i < commands.length; i++) {
			
			if((commands[i] == -1) || (commands[i] == -2)) {
				current = getDirection(commands[i],current);
			}
			else {
				if(current == 'N' || current == 'S') {
					y = commands[i];
				}
				else if(current == 'E' || current == 'W') {
					x = commands[i];
				}
			}
		}
		
		return calcuateDistance(x,y);
	}
	
	
	private int calcuateDistance(int x, int y) {
		
		return (x*x) + (y*y);
	}

	public char getDirection(int direction, char current) {
		/*-2: turn left 90 degrees
		  -1: turn right 90 degrees*/
		if(current == 'N' ) {
			if(direction == -1)
				return 'E';
			else if(direction == -2)
				return 'W';
		}
		else if(current == 'S') {
			if(direction == -1)
				return 'W';
			else if(direction == -2)
				return 'E';
		}
		else if (current == 'E') {
			if(direction == -1)
				return 'S';
			else if(direction == -2)
				return 'N';
		}
		else if(current == 'W') {
			if(direction == -1)
				return 'N';
			else if(direction == -2)
				return 'S';
		}
		return current;
	}

}
