package;

import java.lang.System;
import java.javax.swing.JPanel;
import java.javax.swing.JFrame;
import java.awt.Color;


/**
 * @author Matthijs Kamstra aka [mck]
 */ 
class Main extends JFrame
{
	
	public function new () 
	{
		// The view windows title.
		super('Graphics 2D Example');

		// Specify to use Hardware rendering.
		System.setProperty("sun.java2d.opengl","True");
		
		// Set window size to 700 pixels wide by 500 pixels high.
		setSize( 700, 500 );
		
		// Add a close button to window.
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// Set the background to black.
		setBackground( Color.BLACK );
		
		// Centre the view window in centre of users screen.
		setLocationRelativeTo(null);
		
		// Show the view window.
		setVisible( true );
	}

	static public function main () {
		var app = new Main ();
	}
}