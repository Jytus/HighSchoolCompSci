/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleprogram;


public class Rectangle {
    public double length;
    public double width;
    // we make public, non-static variables
    
    //constructor
    // has the same name as the class
    // it is run when we make a rectangle
    public Rectangle(double L, double W){       
        //when we make a rectangle we recieve an initial length and width
        length = L;
        width = W;
        // takes in inputted variables and assigns them
    }
    public Rectangle(double S){
        // this is a second contructor
        //this has the same name as the other constructor, but accepts only
        //one input
        //it will execute instead of the other constructor if we only send
        // one double value
        // this is known as overloading
        width = S;
        length = S;
        // this constructor makes the rectangle a square, with side length
        // being the sent value
    }
    
    public double Area(){
        return length*width;
    }
    
    public void SetLength(double L){
        length = L;
    }

    public void SetWidth(double W){
        width = W;
    }
    
    public double Length(){
        return length;
    }
    
    public double Width(){
        return width;
    }
    
    public double Perimeter(){
        return width*2+length*2;
    }
}
