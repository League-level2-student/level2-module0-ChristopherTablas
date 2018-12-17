package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] rob = new Robot[5];
for(int i = 0; i < rob.length; i++){
	rob[i] = new Robot();
}
for(int i = 0; i < rob.length; i++){
rob[i].setX(200*i);
rob[i].setY(550);
rob[i].setSpeed(5);
}
//2. create an array of 5 robots.
//3. use a for loop to initialize the robots.
//4. make each robot start at the bottom of the screen, side by side, facing up
Random ran = new Random();
for(int i = 0; i < rob.length;i++){
	rob[i].move(ran.nextInt(50));
	
}
//5. use another for loop to iterate through the array and make each robot move 
//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
for(int i = 0; i < rob.length; i++){
while(rob[i].getY() > 0){
	for(int x = 0; x < rob.length;x++){
		rob[x].move(ran.nextInt(50));
		
	if(rob[x].getY() == 0){
		System.out.println("Party time!!!");
	}	
	}
	}
}

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}