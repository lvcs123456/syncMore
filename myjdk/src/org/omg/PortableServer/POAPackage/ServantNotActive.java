package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/ServantNotActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ade/jenkins/workspace/8-2-build-windows-i586-cygwin/jdk8u241/331/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, December 11, 2019 10:25:13 AM UTC
*/

public final class ServantNotActive extends org.omg.CORBA.UserException
{

  public ServantNotActive ()
  {
    super(ServantNotActiveHelper.id());
  } // ctor


  public ServantNotActive (String $reason)
  {
    super(ServantNotActiveHelper.id() + "  " + $reason);
  } // ctor

} // class ServantNotActive
