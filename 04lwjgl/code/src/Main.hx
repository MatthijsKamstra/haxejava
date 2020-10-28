package;

// import lwjgl specific libraries
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;

import org.lwjgl.glfw.Callbacks.*;
import org.lwjgl.glfw.GLFW.*;
import org.lwjgl.opengl.GL11.*;
import org.lwjgl.system.MemoryUtil.*;

/**
 * @author Matthijs Kamstra aka [mck]
 */
class Main {

	public function new()
	{
		// create OpenGL window with title.
		// Display.setDisplayMode(new DisplayMode(640, 480));
		// Display.setTitle("Basic test of lwjgl and OpenGL in Java");
		// Display.create();


		glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
		glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 3);
		glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
		var window = glfwCreateWindow(640, 480, "Basic test of lwjgl and OpenGL in Java", 0, 0);

		if(window == 0) {
    		// throw new RuntimeException("Failed to create window");
			Sys.exit(1);
		}

		// // short cut to the GL11 context for setting up drawing code, and for drawing with.
		// var gl = GL11;

		// // update window until user closes
		// while (!Display.isCloseRequested()) {
		// 	Display.update();
		// 	Display.sync(60);
		// }

		// // close nicely
		// Display.destroy();
		// Sys.exit(0);
	}

	static public function main () {
		var app = new Main ();
	}
}