package ie.tudublin;

import processing.core.PApplet;

public class Gantt extends PApplet
{	
	//declaring an ArrayList to hold instances of the Task class
	public ArrayList<Task> tasks = new ArrayList<Task>();
	
	public void settings()
	{
		size(800, 600);
	}

	
	public void loadTasks()
	{
		
	}

	public void printTasks()
	{
		
	}
	
	public void mousePressed()
	{
		println("Mouse pressed");	
	}

	public void mouseDragged()
	{
		println("Mouse dragged");
	}

	
	
	public void setup() 
	{
	}
	
	public void draw()
	{			
		background(0);
	}
}
