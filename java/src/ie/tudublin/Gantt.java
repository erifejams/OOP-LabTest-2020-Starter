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

	public void displayBarLines()
	{

		// these are the code for the bar lines
		stroke(255,255,255);
		line(150, 50, 150 , 550);
		line(170, 50, 170 , 550);
		line(190, 50, 190 , 550);
		line(210, 50, 210 , 550);
		line(230, 50, 230 , 550);
		line(250, 50, 250 , 550);//num6
		line(270, 50, 270 , 550);
		line(290, 50, 290 , 550);
		line(310, 50, 310 , 550);
		line(330, 50, 330 , 550);
		line(350, 50, 350 , 550);//num11
		line(370, 50, 370 , 550);//num12
		line(390, 50, 390 , 550);
		line(410, 50, 410 , 550);
		line(430, 50, 430 , 550);
		line(450, 50, 450 , 550);//num16
		line(470, 50, 470 , 550);
		line(490, 50, 490 , 550);
		line(510, 50, 510 , 550);
		line(530, 50, 530 , 550);
		line(550, 50, 550 , 550);//num21
		line(570, 50, 570 , 550);
		line(590, 50, 590 , 550);
		line(610, 50, 610 , 550);//num24
		line(630, 50, 630 , 550);
		line(650, 50, 650 , 550);
		line(670, 50, 670 , 550);
		line(690, 50, 690 , 550);//num28
		line(710, 50, 710 , 550);
		line(730, 50, 730 , 550);
	}

	public void displayNum()
	{
		// these are the code for the numbers on top of the bar lines
		text("1", 148, 45);
		text("2", 168, 45);
		text("3", 188, 45);
		text("4", 208, 45);
		text("5", 228, 45);
		text("6", 248, 45);
		text("7", 268, 45);
		text("8", 288, 45);
		text("9", 308, 45);
		text("10", 328, 45);
		text("11", 348, 45);
		text("12", 368, 45);
		text("13", 388, 45);
		text("14", 408, 45);
		text("15", 428, 45);
		text("16", 448, 45);
		text("17", 468, 45);
		text("18", 488, 45);
		text("19", 508, 45);
		text("20", 528, 45);
		text("21", 548, 45);
		text("22", 568, 45);
		text("23", 588, 45);
		text("24", 608, 45);
		text("25", 628, 45);
		text("26", 648, 45);
		text("27", 668, 45);
		text("28", 688, 45);
		text("29", 708, 45);
		text("30", 728, 45);
		stroke(255,255,255);
	}

	public void mousePressed()
	{
		println("Mouse pressed");

		/*the theory of my thought process, even though I could not implement it:
		if the mouseX is on rest than the x value of rectangle will be  else if the mouseX is moving the x value of the 
		rectangle will change. i*/
		int dx = mouseX;// this is the x value of the rectangle
		if (mouseX == 0)
		{
			dx = 0;
		} else
		{
			mouseX = dx;
		}
		
	}

	float beyondStartRange = 300;
	float beyondEndRange = 710;
	public void mouseDragged()
	{
		println("Mouse dragged");
		/*this is for the user will not be able to set the start or end of the task beyond the range 1-30 
		and also should not be able to set the duration to be less than 1.  I could not implement the  dragging of the squares*/
		if (mouseX < beyondStartRange) 
		{
			stop();
		}
		if (mouseX > beyondEndRange) 
		{
			stop();
		}

	}
	public void setup() 
	{
		loadTasks();
		printTasks();
	}
	
	public void draw()
	{		
		//calling those method to show
		background(0);
		displayBarLines();
		displayTasks();
		displayNum();
	}
}
