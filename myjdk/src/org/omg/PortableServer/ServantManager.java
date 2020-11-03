package org.omg.PortableServer;


/**
* org/omg/PortableServer/ServantManager.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ade/jenkins/workspace/8-2-build-windows-i586-cygwin/jdk8u241/331/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Wednesday, December 11, 2019 10:25:13 AM UTC
*/


/**
	 * A servant manager supplies a POA with the ability 
	 * to activate objects on demand when the POA receives 
	 * a request targeted at an inactive object. A servant 
	 * manager is registered with a POA as a callback object, 
	 * to be invoked by the POA when necessary.
	 * ServantManagers can either be ServantActivators or
	 * ServantLocators. A ServantManager object must be 
	 * local to the process containing the POA objects 
	 * it is registered with.
	 */
public interface ServantManager extends ServantManagerOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface ServantManager
