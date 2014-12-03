package MemoryCatcherApp;


/**
* MemoryCatcherApp/MemoryCatcherOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/dropbox/School stuffffff/Barry`s stuff/Year 4/Network programming and distributed systems/Project/Project/DistributedProject/MemoryCatcher.idl
* 29 November 2014 01:21:22 o'clock GMT
*/

public interface MemoryCatcherOperations 
{
  boolean login (String username, String password);
  boolean register (String username, String password, String email);
  boolean addMemory (String memoryName, String memoryDescription, String username);
  boolean removeMemory (String memoryName);
  void buy (int amount);
  String getMemory (String memoryName, String memoryContext);
  int getResource ();
} // interface MemoryCatcherOperations
