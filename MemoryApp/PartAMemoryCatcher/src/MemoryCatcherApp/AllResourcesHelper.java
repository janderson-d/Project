package MemoryCatcherApp;


/**
* MemoryCatcherApp/AllResourcesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/Users/Arnis/Desktop/Project/MemoryApp/PartAMemoryCatcher/src/partamemorycatcher/MemoryCatcher.idl
* 03 December 2014 22:31:05 o'clock GMT
*/

abstract public class AllResourcesHelper
{
  private static String  _id = "IDL:MemoryCatcherApp/AllResources:1.0";

  public static void insert (org.omg.CORBA.Any a, MemoryCatcherApp.Resources[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static MemoryCatcherApp.Resources[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = MemoryCatcherApp.ResourcesHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (MemoryCatcherApp.AllResourcesHelper.id (), "AllResources", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static MemoryCatcherApp.Resources[] read (org.omg.CORBA.portable.InputStream istream)
  {
    MemoryCatcherApp.Resources value[] = null;
    int _len0 = istream.read_long ();
    value = new MemoryCatcherApp.Resources[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = MemoryCatcherApp.ResourcesHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, MemoryCatcherApp.Resources[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      MemoryCatcherApp.ResourcesHelper.write (ostream, value[_i0]);
  }

}
