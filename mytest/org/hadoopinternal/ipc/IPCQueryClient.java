package org.hadoopinternal.ipc;

import java.net.InetSocketAddress;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

public class IPCQueryClient {
	public static void main(String[] args) {
		try {
			System.out.println("Interface name: "+IPCQueryStatus.class.getName());
			System.out.println("Interface name: "+IPCQueryStatus.class.getMethod("getFileStatus", String.class).getName());
			
			InetSocketAddress addr=new InetSocketAddress("localhost", IPCQueryServer.IPC_PORT);
			/*第一个参数是IPC接口对象，可以通过IPC接口的静态成员class直接获得。接口的静态成员class保存了该接口的java.lang.Class实例
			 * java.lang.Class类的实例表示正在运行的Java应用程序中的类和接口，提供来一系列与Java反射相关的重要功能
			 第二个参数是接口版本，接口会根据需求不断地进行升级，形成多个版本的IPC接口，如果客户端和服务器端使用的IPC接口版本不一致，结果
			 将是灾难性的，所以再建立IPC时，需要对IPC的双方进行版本检查
			 第三个参数是服务器的Socket地址，用于建立IPC的底层TCP连接
			 第四个参数是Configuration对象，用于定制IPC客户端参数*/
			IPCQueryStatus query=(IPCQueryStatus) RPC.getProxy(IPCQueryStatus.class, 
					                                           IPCQueryServer.IPC_VER, 
					                                           addr, 
					                                           new Configuration());
			IPCFileStatus status=query.getFileStatus("/tmp/testIPC");
			System.out.println(status);
			RPC.stopProxy(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
