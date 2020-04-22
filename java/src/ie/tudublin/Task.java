package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

//class called Task
public class Task
{
    
    private int Start;
    private int End;


    public Task(int Start, int End)
    {
        this.Start = Start;
        this.End = End;
    }

    //constuctor that takes processing table row as a parameter
    public Task(TableRow tr)
    {
        this( tr.getInt("Start"), tr.getInt("End"));
    }

    //toString method
    public String toString()
    {
        return  this.Start + ", " + this.End;
    }


    public int getStart() {
        return Start;
    }

    public void setStart(int start) {
        Start = start;
    }

    public int getEnd() {
        return End;
    }

    public void setEnd(int end) {
        End = end;
    }

}
