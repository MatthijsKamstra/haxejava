#About Graphics2DExample


<http://old.haxe.org/doc/java/graphics2d#graphics2dexample-hx>

For developing Java for desktop and browser, we can use easily use AWT and Swing libraries since they are supported out of the box since Haxe3. There are lots of libraries and approaches to developing with Java but for simple graphics, and components, AWT and Swing are a good place to start, unless you want to target phone apps. To be honest there is probably little reason in creating a Java applet to run in the browser except that it is an easier way to display something cool you made for the desktop.

Swing and AWT overlap in terms of component functionality, but Swing is more recent, so will be our preferred approach for components and structures, but AWT is useful for more basic functionality. The relationship and logic behind AWT and Swing is well beyond the scope of this tutorial, but for instance, our Main haxe class can extend a Frame ( AWT ) or a JFrame ( Swing ) both will work for creating applications, and to create a browser applet we would extend an Applet ( AWT ) or a JApplet ( Swing ) but lets stick with the Swing approaches.

I am very new to Java so this tutorial will not explain all aspects but rather provide workflows that work well in Haxe based on lots of reading around and practical application and hopefully save you a lot of time when trying to draw to your Java application.

Setup the Main class

So lets start looking at how we use Java 2D api's in Haxe. We create a main class and setup the view window, it needs to extend a frame, since we are using Swing components this frame is a JFrame
Let call our Main class Graphics2DExample.hx
