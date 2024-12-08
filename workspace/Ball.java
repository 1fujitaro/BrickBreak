import java.awt.*;
//
//  Class author:  Eric Hsu
//  Date created:  12/4/24
//  General description: Used in BrickBreak.java as the properties of the ball the player uses in the game.
//

public class Ball {
	//your code here!
	private int xPos;
	private int yPos;
	private int xVelocity = 1;
	private int yVelocity = 1;
	private int size;

	
	//don't forget you need instance variables:
	
	
	//constructor(s):
	public Ball(int initXPos, int initYPos, int initSize){
		size = initSize;
		xPos = initXPos;
		yPos = initYPos;
	}

	//Setters & Getters

	//Pre-Condition: None

	public int getXpos(){
		return xPos;
	}
	public int getYpos(){
		return yPos;
	}
	public int getSize(){
		return size;
	}

	public void setXVelocity(int x){
		x = xVelocity;
	}
	public void setYVelocity(int y){
		y = yVelocity;
	}
	public void setY(int y){
		y = yPos;
	}
	public void setX(int x){
		x = xPos;
	}
	
	//methods:
	public void reverseX(){
		xVelocity*=-1;
	}
	public void reverseY(){
		yVelocity*=-1;
	}
	public void move(){
		xPos += xVelocity;
		yPos += yVelocity;
	}

	//Pre-Condition: g cannot be null.
	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillOval(xPos, yPos, size, size);
	}


}
