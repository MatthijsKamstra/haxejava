package;

import java.io.*;
import java.net.*;
import java.util.*;

import org.jibble.simplewebserver.*;

class WebServer {

	public function new() {
		var server;
		try{
			server = new SimpleWebServer(new File("./"), 2000); // osx needs a port higher then 1024
		} catch (e:IOException ){
			trace(e);
		}
	}

}