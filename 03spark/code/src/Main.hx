package;


// import spark.Spark;
// import java.util.Optional;

import java.util.*;

import java.javax.*;

/**
 * @author Matthijs Kamstra aka [mck]
 */
class Main {

	public function new()
	{
		trace('hello');



	}

	static public function main () {
		var app = new Main ();

		spark.Spark.get('/hello', (req,res));


		// Spark.get("/hello", (req, res) -> "Hello World");
	}
}