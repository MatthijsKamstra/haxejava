package;

import java.javax.swing.JFrame;
import java.javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * @author Matthijs Kamstra aka [mck]
 */
class Main extends JFrame implements ActionListener {

	var button : JButton;

	public function new ()
	{
		super('test');

		button = new JButton('Press me to quit');
		button.addActionListener(this);
		// button.addMouseListener(this);

		var pane = this.getContentPane();
		var layout = new java.javax.swing.GroupLayout(pane);
		pane.setLayout(layout);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(button));
		layout.setVerticalGroup(layout.createSequentialGroup().addComponent(button));

		this.setTitle('Hello');
		this.setSize(400, 300);
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		this.setVisible(true);
	}

	public function actionPerformed( e : ActionEvent)	{
		button.setText('no worries');
		haxe.Timer.delay(kill, 1000);
	}
	// public function mousePressed( e : MouseEvent ) {
	// 	button.setText('no worries');
	// 	haxe.Timer.delay(kill, 1000);
	// }
	// public function mouseClicked( e : MouseEvent ) {}
	// public function mouseEntered( e : MouseEvent ) {}
	// public function mouseExited( e : MouseEvent ) {}
	// public function mouseReleased( e : MouseEvent ) {}


	function kill (){
		Sys.exit(0);
	}



/**
src/Main.hx:13: lines 13-44 : Field mouseClicked needed by java.awt.event.MouseListener is missing
src/Main.hx:13: lines 13-44 : Field mouseEntered needed by java.awt.event.MouseListener is missing
src/Main.hx:13: lines 13-44 : Field mouseExited needed by java.awt.event.MouseListener is missing
src/Main.hx:13: lines 13-44 : Field mouseReleased needed by java.awt.event.MouseListener is missing
 */


	static public function main () {
		var app = new Main ();
	}
}