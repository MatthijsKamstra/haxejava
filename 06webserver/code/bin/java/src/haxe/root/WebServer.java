// Generated by Haxe 3.3.0
package haxe.root;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class WebServer extends fi.iki.elonen.NanoHTTPD implements haxe.lang.IHxObject
{
	public WebServer(haxe.lang.EmptyObject empty)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		super(0);
	}
	
	
	public WebServer()
	{
		//line 35 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		super(8080);
	}
	
	
	public static java.lang.Object __hx_createEmpty()
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		return new haxe.root.WebServer(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static java.lang.Object __hx_create(haxe.root.Array arr)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		return new haxe.root.WebServer();
	}
	
	
	public boolean __hx_deleteField(java.lang.String field)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		return false;
	}
	
	
	public java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		if (isCheck) 
		{
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			return haxe.lang.Runtime.undefined;
		}
		else
		{
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			if (throwErrors) 
			{
				//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
				throw haxe.lang.HaxeException.wrap("Field not found.");
			}
			else
			{
				//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
				return null;
			}
			
		}
		
	}
	
	
	public double __hx_lookupField_f(java.lang.String field, boolean throwErrors)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		if (throwErrors) 
		{
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			throw haxe.lang.HaxeException.wrap("Field not found or incompatible field type.");
		}
		else
		{
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			return 0.0;
		}
		
	}
	
	
	public java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing.");
	}
	
	
	public double __hx_lookupSetField_f(java.lang.String field, double value)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		throw haxe.lang.HaxeException.wrap("Cannot access field for writing or incompatible type.");
	}
	
	
	public double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		{
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			{
				//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
				return this.__hx_lookupSetField_f(field, value);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		{
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			{
				//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
				return this.__hx_lookupSetField(field, value);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		{
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			boolean __temp_executeDef1 = true;
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			switch (field.hashCode())
			{
				case 109757538:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("start")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "start")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case -881923281:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("setTempFileManagerFactory")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setTempFileManagerFactory")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case 3540994:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("stop")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "stop")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case 1452653322:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("setAsyncRunner")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "setAsyncRunner")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case 573495777:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("registerConnection")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "registerConnection")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case -1511448968:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("decodeParameters")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "decodeParameters")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case -870346662:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("unRegisterConnection")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "unRegisterConnection")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case -706674057:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("decodePercent")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "decodePercent")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case 971752716:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("closeAllConnections")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "closeAllConnections")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case 109327119:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("serve")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "serve")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case -1371745242:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("getListeningPort")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "getListeningPort")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case 2054309315:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("isAlive")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "isAlive")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
				case 1482466648:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (field.equals("wasStarted")) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return ((haxe.lang.Function) (new haxe.lang.Closure(this, "wasStarted")) );
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
			}
			
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			if (__temp_executeDef1) 
			{
				//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
				return this.__hx_lookupField(field, throwErrors, isCheck);
			}
			else
			{
				//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		{
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			{
				//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
				return this.__hx_lookupField_f(field, throwErrors);
			}
			
		}
		
	}
	
	
	public java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
		{
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			int __temp_hash2 = field.hashCode();
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			boolean __temp_executeDef1 = true;
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			switch (__temp_hash2)
			{
				case 109757538:
				case 3540994:
				case 573495777:
				case -870346662:
				case 971752716:
				case -1371745242:
				case 1482466648:
				case 2054309315:
				case 109327119:
				case -706674057:
				case -1511448968:
				case 1452653322:
				case -881923281:
				{
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					if (( (( ( __temp_hash2 == 109757538 ) && field.equals("start") )) || ( (( ( __temp_hash2 == 3540994 ) && field.equals("stop") )) || ( (( ( __temp_hash2 == 573495777 ) && field.equals("registerConnection") )) || ( (( ( __temp_hash2 == -870346662 ) && field.equals("unRegisterConnection") )) || ( (( ( __temp_hash2 == 971752716 ) && field.equals("closeAllConnections") )) || ( (( ( __temp_hash2 == -1371745242 ) && field.equals("getListeningPort") )) || ( (( ( __temp_hash2 == 1482466648 ) && field.equals("wasStarted") )) || ( (( ( __temp_hash2 == 2054309315 ) && field.equals("isAlive") )) || ( (( ( __temp_hash2 == 109327119 ) && field.equals("serve") )) || ( (( ( __temp_hash2 == -706674057 ) && field.equals("decodePercent") )) || ( (( ( __temp_hash2 == -1511448968 ) && field.equals("decodeParameters") )) || ( (( ( __temp_hash2 == 1452653322 ) && field.equals("setAsyncRunner") )) || field.equals("setTempFileManagerFactory") ) ) ) ) ) ) ) ) ) ) ) )) 
					{
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						__temp_executeDef1 = false;
						//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
						return haxe.lang.Runtime.slowCallField(this, field, dynargs);
					}
					
					//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
					break;
				}
				
				
			}
			
			//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
			if (__temp_executeDef1) 
			{
				//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
				return ((haxe.lang.Function) (this.__hx_getField(field, true, false, false)) ).__hx_invokeDynamic(dynargs);
			}
			else
			{
				//line 32 "/Users/matthijs/Documents/workingdir/haxe/haxejava/06webserver/code/src/WebServer.hx"
				throw null;
			}
			
		}
		
	}
	
	
	public void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
	}
	
	
}


