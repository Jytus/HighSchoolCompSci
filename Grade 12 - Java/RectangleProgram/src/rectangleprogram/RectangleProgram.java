/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleprogram;

/**
 *
 * @author kbatterink
 */
public class RectangleProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle swag = new Rectangle(4,7);
        // creates a rectangle called swag, with length = 4
        // width = 7
        Rectangle fink = new Rectangle(1,2);
        Rectangle square = new Rectangle(6);
        //square runs the second contructor because we are only sending
        // one double value
        System.out.println("The area of swag is "+swag.Area());
        swag.SetLength(7);
        swag.SetWidth(8);
        System.out.println("Swag is now "+swag.Length()+" by "+swag.Width());
        System.out.println("The perimeter of swag is "+swag.Perimeter());
        System.out.println("The perimeter of fink is "+fink.Perimeter());
        System.out.println("The area of square is "+square.Area());
    }
}
