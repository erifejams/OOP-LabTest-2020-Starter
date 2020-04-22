package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
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
		Table t = loadTable("tasks.csv", "header");
		for(TableRow rows:t.rows())
		{
			Task ta = new Task(rows);
			tasks.add(ta);
		}
	}

	//need to work on this 
	public void printTasks()
	{
		for(Task ta:tasks)
		{	
			println(ta);
		}
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
		loadTasks();
		printTasks();
	}
	
	public void draw()
	{			
		background(0);
	}
}
