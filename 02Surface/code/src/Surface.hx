package;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
import java.javax.swing.JPanel;
// extend a component to draw on

/**
 * @author Matthijs Kamstra aka [mck]
 */ 
class Surface extends JPanel
{
	public function new () 
	{
		// turn on doublebuffering
		super( true );   
	}
	
	// draw in an overriden painting method
	@:overload override public function paintComponent( g: Graphics ){
		// magic used to stop flickering when redrawing for animation later.
		super.paintComponent( g );
		// Strange but we need to cast so we can paint
		var g2D: Graphics2D = cast g;
		// make drawing antialias so smooth not pixelated edges
		g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
							 RenderingHints.VALUE_ANTIALIAS_ON );
		g2D.setRenderingHint(RenderingHints.KEY_RENDERING,
							RenderingHints.VALUE_RENDER_QUALITY );
		// set drawing color
		g2D.setColor(Color.red);
		// draw a fill oval, x, y, wide, hi
		g2D.fillOval( 300, 120, 150, 150 );
		// release memory of graphics2d after finished drawing with it.
		g2D.dispose();
	}
}