import java.awt.Graphics;
import java.awt.*;

public class Paddle {
private int xPos;
private int yPos;
private int width;
private int length;
private int velocity;
private int x;
private int height;
	//your code here!
	
	//don't forget you need instance variables:
	
	
	//constructor(s):
	public Paddle (int initXPos, int initYPos, int initWidth, int initLength){
		xPos = initXPos;
		yPos = initYPos;
		width = initWidth;
		length = initLength;
	}

	//Setters & Getters
	//Pre-Conditions: None
	public int getXPos(){
		return xPos;
	}
	public int getYPos(){
		return yPos;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public int setVelocity(){
		return velocity;
	}
	public int setX(){
		return xPos;
	}
	public int setY(){
		return yPos;
	}
	public int getVelocity(){
		return velocity;
	}
	
	//methods:
	public void setVelocity(int velocity){
		velocity = x;
	}
	
	public void setY(int y){
		y = yPos;
	}
	public void setX(int x){
		x = xPos;
	}
	public int getX(){
		return xPos;
	}
	public int getY(){
		return yPos;
	}
	public void reverseX(){
		velocity = (velocity*-1);
	}
	public void addVelocity(int speed){
		velocity+=speed;
		if (velocity>0){
			velocity-=1;
		}
		if (velocity<0){
			velocity+=1;
		}
	}
	public void move(){
		xPos += (velocity);
		if (velocity > 3){
			velocity-=1;
		} else if (velocity < -3){
			velocity+=1;
		}
	}
	//Pre-Condition: g cannot be null.
	public void draw(Graphics g){
		g.setColor(Color.MAGENTA);
		g.fillRect(xPos, yPos, width, length);
		
	}
	
}
