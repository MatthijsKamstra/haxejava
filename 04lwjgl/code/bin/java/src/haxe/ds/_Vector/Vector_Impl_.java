// Generated by Haxe 3.3.0
package haxe.ds._Vector;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class Vector_Impl_
{
	
	
	public static <T> haxe.root.Array<T> toArray(T[] this1)
	{
		//line 165 "/usr/local/lib/haxe/std/haxe/ds/Vector.hx"
		haxe.root.Array<T> a = new haxe.root.Array<T>();
		//line 166 "/usr/local/lib/haxe/std/haxe/ds/Vector.hx"
		int len = ((T[]) (this1) ).length;
		//line 171 "/usr/local/lib/haxe/std/haxe/ds/Vector.hx"
		{
			//line 171 "/usr/local/lib/haxe/std/haxe/ds/Vector.hx"
			int _g1 = 0;
			//line 171 "/usr/local/lib/haxe/std/haxe/ds/Vector.hx"
			while (( _g1 < len ))
			{
				//line 171 "/usr/local/lib/haxe/std/haxe/ds/Vector.hx"
				int i = _g1++;
				//line 172 "/usr/local/lib/haxe/std/haxe/ds/Vector.hx"
				a.__set(i, ((T) (((T[]) (this1) )[i]) ));
			}
			
		}
		
		//line 173 "/usr/local/lib/haxe/std/haxe/ds/Vector.hx"
		return a;
	}
	
	
}


