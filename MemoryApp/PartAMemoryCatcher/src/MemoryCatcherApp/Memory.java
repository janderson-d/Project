package MemoryCatcherApp;


/**
* MemoryCatcherApp/Memory.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Barry/Desktop/College/Network programming and distributed systems/Project/New folder/Project/MemoryApp/PartAMemoryCatcher/src/partamemorycatcher/MemoryCatcher.idl
* Friday, 5 December 2014 14:00:54 o'clock GMT
*/

public final class Memory implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String description = null;
  public int id = (int)0;

  public Memory ()
  {
  } // ctor

  public Memory (String _name, String _description, int _id)
  {
    name = _name;
    description = _description;
    id = _id;
  } // ctor

} // class Memory
