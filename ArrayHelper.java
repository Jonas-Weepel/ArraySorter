package sortingAlgorithms;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ArrayHelper {
	private static JFrame graphicWindow;
	private static Container graphicContentPane;
	private static Graphics graphicDrawer;
	private static int numArraysDisplayed = 0;
	
	public ArrayHelper() {
		
		//create large window frame for drawing
		graphicWindow = new JFrame("Array Visualizer");
		graphicWindow.setTitle("Array Visualizer");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		graphicWindow.setSize(screenSize.width, screenSize.height);
		graphicWindow.setLocation(0,0);
		graphicWindow.setVisible(true);
		graphicWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

		//Create and define a graphics container object
		graphicContentPane = graphicWindow.getContentPane();

		//Initialize a graphics object and link it to the frame's pane
		graphicDrawer = graphicContentPane.getGraphics();
		graphicDrawer.setColor(Color.BLACK);
		
	}

	public void displayArray( String arrayName, int[] displayArray) {
		for(int i = 0; i < displayArray.length; i++ ) {
			//draw array
			try { Thread.sleep(10) ; }catch(Exception e) {}
			graphicDrawer.drawString(arrayName, 40, 35+numArraysDisplayed*80);
			graphicDrawer.drawRect( 40+(40*i), 40+numArraysDisplayed*80, 40, 40);
			graphicDrawer.drawString( String.valueOf(displayArray[i]), 55+40*i, 65+numArraysDisplayed*80);
		}
		numArraysDisplayed++;
	}

	public int[] getRandomArray(int size, int max) {
		int[] randomArray = new int[size];
		for(int i = 0; i < randomArray.length; i++ ) {
			randomArray[i] = (int)(Math.random()*max);
		}
		return randomArray;
	}


}