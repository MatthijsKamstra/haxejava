// Generated by Haxe 3.3.0
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Main extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		Sys._args = args;
		main();
	}
	
	public Main(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public Main()
	{
		//line 18 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
		haxe.root.Main.__hx_ctor__Main(this);
	}
	
	
	public static void __hx_ctor__Main(haxe.root.Main __temp_me4)
	{
		//line 26 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
		org.lwjgl.glfw.GLFW.glfwWindowHint(((int) (org.lwjgl.glfw.GLFW.GLFW_RESIZABLE) ), ((int) (org.lwjgl.opengl.GL11.GL_TRUE) ));
		//line 27 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
		org.lwjgl.glfw.GLFW.glfwWindowHint(((int) (org.lwjgl.glfw.GLFW.GLFW_CONTEXT_VERSION_MAJOR) ), ((int) (3) ));
		//line 28 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
		org.lwjgl.glfw.GLFW.glfwWindowHint(((int) (org.lwjgl.glfw.GLFW.GLFW_CONTEXT_VERSION_MINOR) ), ((int) (3) ));
		//line 29 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
		org.lwjgl.glfw.GLFW.glfwWindowHint(((int) (org.lwjgl.glfw.GLFW.GLFW_OPENGL_PROFILE) ), ((int) (org.lwjgl.glfw.GLFW.GLFW_OPENGL_CORE_PROFILE) ));
		//line 30 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
		long window = org.lwjgl.glfw.GLFW.glfwCreateWindow(((int) (640) ), ((int) (480) ), ((java.lang.CharSequence) ("Basic test of lwjgl and OpenGL in Java") ), ((long) (0) ), ((long) (0) ));
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
		if (( ((long) (window) ) == ((long) (0) ) )) 
		{
			//line 34 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
			haxe.root.Sys.exit(1);
		}
		
	}
	
	
	public static void main()
	{
		//line 52 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
		new haxe.root.Main();
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 16 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
		return new haxe.root.Main(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 16 "/Users/matthijs/Documents/workingdir/haxe/haxejava/04lwjgl/code/src/Main.hx"
		return new haxe.root.Main();
	}
	
	
}


