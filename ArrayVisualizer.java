package sortingAlgorithms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ArrayVisualizer {
	public static void main(String[] args) {

		//create large window frame for drawing
		JFrame graphicWindow;
		graphicWindow = new JFrame("Array Visualizer");
		graphicWindow.setTitle("Array Visualizer");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		graphicWindow.setSize(screenSize.width, screenSize.height);
		graphicWindow.setLocation(0,0);
		graphicWindow.setVisible(true);
		graphicWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

		//Create and define a graphics container object
		Container graphicContentPane;
		graphicContentPane = graphicWindow.getContentPane();

		//Initialize a graphics object and link it to the frame's pane
		Graphics graphicDrawer;
		graphicDrawer = graphicContentPane.getGraphics();
		graphicDrawer.setColor(Color.BLACK);
		
		//create a randomized array
		int arrayLength = 30;
		int[] unsortedArray = new int[arrayLength];
		graphicDrawer.drawString("Unsorted Array", 40, 15);
		for(int i = 0; i < unsortedArray.length; i++ ) {
			unsortedArray[i] = (int)(Math.random()*20);
		}
		
		int totalNumberArrays = 0;
		totalNumberArrays = visualizeArray(unsortedArray, graphicDrawer, totalNumberArrays);
		totalNumberArrays = visualizeArray(unsortedArray, graphicDrawer, totalNumberArrays);
	}
	
	//Display an array in boxes
	private static int visualizeArray(int[] unsortedArray, Graphics graphicDrawer, int totalNumberArrays) {
		for(int i = 0; i < unsortedArray.length; i++ ) {
			//draw array
			try { Thread.sleep(10) ; }catch(Exception e) {}
			graphicDrawer.drawRect( 40+(40*i), 40+totalNumberArrays*80, 40, 40);
			graphicDrawer.drawString( String.valueOf(unsortedArray[i]), 55+40*i, 65+totalNumberArrays*80);
		}
		return totalNumberArrays+1;
	}
}
