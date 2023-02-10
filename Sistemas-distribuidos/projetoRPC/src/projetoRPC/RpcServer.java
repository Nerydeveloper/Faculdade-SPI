package projetoRPC;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfig;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

public class RpcServer {
	public static void main(String[] args) throws XmlRpcException {
		int port = 4500;
		
		WebServer webServer = new WebServer(port);
		XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();
		
		PropertyHandlerMapping phm = new PropertyHandlerMapping();
		phm.addHandler("xmlRpcService", RpcService.class);
		
		xmlRpcServer.setHandlerMapping(phm);
		XmlRpcServerConfig serverConfig = (XmlRpcServerConfigImpl) xmlRpcServer.getConfig();
		
		serverConfig.setEnabledForExeptions(true);
		serverConfig.setEnabledForExeptions(false);
		webServer.start();
		
		System.out.println("---------------------------------------------------");
		System.out.println("Servidor iniciado no endereço 127.0.0.1:");
		System.out.println("---------------------------------------------------");
		
	}
}
