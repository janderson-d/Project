package MemoryCatcherApp;

/**
* MemoryCatcherApp/MemoryCatcherHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Barry/Desktop/College/Network programming and distributed systems/Project/New folder/Project/MemoryApp/PartAMemoryCatcher/src/partamemorycatcher/MemoryCatcher.idl
* Friday, 5 December 2014 14:28:25 o'clock GMT
*/

public final class MemoryCatcherHolder implements org.omg.CORBA.portable.Streamable
{
  public MemoryCatcherApp.MemoryCatcher value = null;

  public MemoryCatcherHolder ()
  {
  }

  public MemoryCatcherHolder (MemoryCatcherApp.MemoryCatcher initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MemoryCatcherApp.MemoryCatcherHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MemoryCatcherApp.MemoryCatcherHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MemoryCatcherApp.MemoryCatcherHelper.type ();
  }

}
