package;


import java.io.*;
import java.util.*;


/**
 * @author Matthijs Kamstra aka [mck]
 */
class Main  {

	public function new () {
        // trace("\nRunning! Point your browsers to http://localhost:8080/ \n");

        var server = new WebServer();
        trace ("Web server initialized.");
	}

	static public function main () {
		var app = new Main ();
	}
}