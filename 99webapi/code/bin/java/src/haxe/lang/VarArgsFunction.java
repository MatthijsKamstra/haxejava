package haxe.lang;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class VarArgsFunction extends haxe.lang.VarArgsBase
{
	public VarArgsFunction(haxe.lang.Function fun)
	{
		//line 54 "/usr/local/lib/haxe/std/java/internal/Function.hx"
		super(-1, -1);
		//line 55 "/usr/local/lib/haxe/std/java/internal/Function.hx"
		this.fun = fun;
	}
	
	
	public haxe.lang.Function fun;
	
	@Override public java.lang.Object __hx_invokeDynamic(haxe.root.Array dynArgs)
	{
		//line 60 "/usr/local/lib/haxe/std/java/internal/Function.hx"
		return ((java.lang.Object) (this.fun.__hx_invoke1_o(0.0, dynArgs)) );
	}
	
	
}


