/*SlidePuzzle.java - Puzzle to slide pieces to correct position.
The SlidePuzzle program consists of three files:
SlidePuzzle.java      - this file with main to create window.
SlidePuzzleGUI.java   - implements the GUI interface.
SlidePuzzleModel.java - the logical functioning.*/

package pkg8puzzle;
import javax.swing.JFrame;
public class SlidePuzzle {

    public static void main(String[] args) 
    {
     JFrame window = new JFrame("Slide Puzzle");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new SlidePuzzleGUI());
        window.pack();  // finalize layout
        window.show();  // make window visible
        window.setResizable(false);
    }//end main   
}//endclass SlidePuzzle