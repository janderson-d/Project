package MemoryCatcherApp;

/**
* MemoryCatcherApp/ResourcesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Barry/Desktop/College/Network programming and distributed systems/Project/New folder/Project/MemoryApp/PartAMemoryCatcher/src/partamemorycatcher/MemoryCatcher.idl
* Friday, 5 December 2014 14:00:54 o'clock GMT
*/

public final class ResourcesHolder implements org.omg.CORBA.portable.Streamable
{
  public MemoryCatcherApp.Resources value = null;

  public ResourcesHolder ()
  {
  }

  public ResourcesHolder (MemoryCatcherApp.Resources initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MemoryCatcherApp.ResourcesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MemoryCatcherApp.ResourcesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MemoryCatcherApp.ResourcesHelper.type ();
  }

}
