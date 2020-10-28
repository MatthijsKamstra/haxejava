#Hello World Example

Check the [code folder](https://github.com/MatthijsKamstra/haxejava/tree/master/00helloworld/code) for more comments.

Create a folder named **foobar** (please use a better name; any name will do) and create folders **bin** and **src**.
See example below:

```
+ foobar
	+ bin
	+ src
		- Main.hx
	- java.hxml
```

## The Main.hx

Open your favorite editor, copy/paste the code and save it in the `src` folder.

```
package ;

class Main
{
	function new()
	{
		trace("Hello world");
	}

    static public function main()
    {
        var main = new Main();
	}
}
```

## The Haxe build file, build.hxml

There are a lot of different arguments that you are able to pass to the Haxe compiler.
These arguments can also be placed into a text file of one per line with the extension hxml. This file can then be passed directly to the Haxe compiler as a build script.

```
# // build.hxml
-cp src
-main Main
-java bin/java
-dce full
-cmd cd bin/java
-cmd java -jar Main-Debug.jar
```


## Build Java with Haxe

To finish and see what we have, build the file and see the result

1. Open your terminal
2. `cd ` to the correct folder where you have saved the `java.hxml`
3. type `haxe java.hxml`
4. press enter





You could build everything directly in the terminal.

```
haxe -cp src -main Main -java bin/java -dce full -cmd cd bin/java -cmd java -jar Main-Debug.jar
```

It will have the same result

