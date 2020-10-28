package;

import java.util.Map;
import java.util.logging.Logger;

import fi.iki.elonen.NanoHTTPD.NanoHTTPD_IHTTPSession;
import fi.iki.elonen.NanoHTTPD;
import fi.iki.elonen.NanoHTTPD.NanoHTTPD_Response;
import fi.iki.elonen.NanoHTTPD.NanoHTTPD_Method;

// import org.nanohttpd.protocols.http.IHTTPSession;
// import org.nanohttpd.protocols.http.NanoHTTPD;
// import org.nanohttpd.protocols.http.request.Method;
// import org.nanohttpd.protocols.http.response.Response;


// import fi.iki.elonen.NanoHTTPD.Response.IStatus;
// import fi.iki.elonen.NanoHTTPD.Response.Status;


import fi.iki.elonen.NanoHTTPD.NanoHTTPD_Response_IStatus;
import fi.iki.elonen.NanoHTTPD.NanoHTTPD_Response_Status;


// import fi.iki.elonen.ServerRunner.ServerRunner.run
import fi.iki.elonen.SimpleWebServer;
import fi.iki.elonen.NanoHTTPD.NanoHTTPD;

import fi.iki.elonen.*;

@:build(hxAnonCls.Macros.build())
class WebServer extends NanoHTTPD {

	public function new() {
		super(8080);
	}

	@:overload
	override public function serve(session:NanoHTTPD_IHTTPSession ) : NanoHTTPD_Response {
       var msg = "<html><body><h1>Hello server</h1>\n";

       var xx = new NanoHTTPD_Response(msg);
       return xx;
        // return NanoHTTPD_Response.newFixedLengthResponse(msg);
    }

}