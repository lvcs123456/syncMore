package com.sun.corba.se.PortableActivationIDL.RepositoryPackage;


/**
* com/sun/corba/se/PortableActivationIDL/RepositoryPackage/ServerDef.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ade/jenkins/workspace/8-2-build-windows-i586-cygwin/jdk8u241/331/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, December 11, 2019 10:25:11 AM UTC
*/

public final class ServerDef implements org.omg.CORBA.portable.IDLEntity
{
  public String applicationName = null;

  // serverName values.
  public String serverName = null;

  // Class name of server's main class.
  public String serverClassPath = null;

  // class path used to run the server.
  public String serverArgs = null;

  // arguments passed to the server
  public String serverVmArgs = null;

  // arguments passed to the server's Java VM1
  public boolean isInstalled = false;

  public ServerDef ()
  {
  } // ctor

  public ServerDef (String _applicationName, String _serverName, String _serverClassPath, String _serverArgs, String _serverVmArgs, boolean _isInstalled)
  {
    applicationName = _applicationName;
    serverName = _serverName;
    serverClassPath = _serverClassPath;
    serverArgs = _serverArgs;
    serverVmArgs = _serverVmArgs;
    isInstalled = _isInstalled;
  } // ctor

} // class ServerDef
