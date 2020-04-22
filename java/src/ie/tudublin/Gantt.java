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
	
	
	public void displayTasks()
	{
		//these are the code for the task words
		text("Research", 50, 100);
		textSize(10);
		fill(map(150, 800, 200, 0, 255), 0, 0);//red
		rect(150, 75, 80, 30); //x,y,w,h
		fill(255);

		text("Design", 50, 150);
		textSize(10);
		fill(map(250, 800, 200, 0, 255), 102, 0);//orange
		rect(250, 120, 80, 30); //x,y,w,h
		fill(255);

		text("Phase 1", 50, 200);
		textSize(10);
		fill(map(350, 800, 200, 0, 255), 255, 0); //yellow
		rect(350, 165, 40, 30); //x,y,w,h
		fill(255);

		text("Phase 2", 50, 250);
		textSize(10);
		fill(map(750, 800, 200, 0, 255), 200, 0);//green
		rect(370, 220, 80, 30); //x,y,w,h
		fill(255);

		text("Phase 3", 50, 300);
		textSize(10);
		fill(map(450, 800, 200, 0, 255), 255, 255);//turquoise
		rect(450, 270, 60, 30); //x,y,w,h
		fill(255);

		text("Integration", 50, 350);
		textSize(10);
		fill(map(550, 800, 200, 0, 255), 0, 205);
		fill(map(550, 800, 200, 0, 255), 150, 255);//light blue
		rect(550, 325, 40, 30); //x,y,w,h
		fill(255);

		text("Testing", 50, 400);
		textSize(10);
		fill(map(610, 800, 200, 0, 255), 0, 235);//couldn't get dark blue, so i had to settle for dark purple
		rect(550, 380, 80, 30); //x,y,w,h
		fill(255);

		text("Evaluation", 50, 450);
		textSize(10);
		fill(map(500, 800, 200, 0, 255), 0, 255);//purple
		rect(610, 435, 80, 30); //x,y,w,h
		fill(255);

		text("Release", 50, 500);
		textSize(10);
		fill(map(150, 800, 200, 0, 255), 50, 255);//pink
		rect(690, 490, 40, 30); //x,y,w,h
		fill(255);
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
