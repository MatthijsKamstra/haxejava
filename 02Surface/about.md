#About Graphics2DExample


<http://old.haxe.org/doc/java/graphics2d#drawing-a-circle-in-our-application>

Drawing a Circle in our Application

Java uses a lot of inheritance and sometimes using Java 2D api can seem like magic, it is important when using Swing to work with the structures and let them do our DoubleBuffering for us, we just have to add the right magic words to avoid flickering and other render issues. I have found often it is just about calling the correct super parameter when extending a class or overriding a method to make sure the relevant drawing structures are called and setup for double buffering, if you want to manually control your double buffering then you probably need to switch to an AWT component workflow and spend a lot of time reading.. good luck :). Lets just take advantage of the higher level structures provided, for drawing we need a Panel or component to draw in. Swing has lots of built in components we can extend a JPanel for custom drawing. If you are used to flash or Javascript you can think of a panel/component as being like a div/sprite/movieclip, but instead of appendChild or addChild we just add it to our main classes content pane, eg: getContentPane().add( surface ). The actual drawing code needs to be done in an overridden Painting method, it kind of annoying but it seems to be setup this way so that it can optimize rendering for you. The best Painting method to override is the paintComponent. So we need to create a class then extends JPanel and has a method that overrides paintComponent and make sure we call all the supers with parameters to turn on the double buffering when we animate. Lets call our class Surface because we are going to use it like a canvas surface to draw on.



