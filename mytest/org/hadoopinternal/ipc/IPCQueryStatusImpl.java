package org.hadoopinternal.ipc;

import java.io.IOException;

public class IPCQueryStatusImpl implements IPCQueryStatus {	
	public IPCQueryStatusImpl() {
	}

	@Override
	public IPCFileStatus getFileStatus(String filename) {
		IPCFileStatus status=new IPCFileStatus(filename);
		System.out.println("Method getFileStatus Called, return: "+status);
		return status;
	}
	/**
	 * 用于服务器与客户端，进行IPC接口版本检查，再服务器返回给客户端时调用，如果服务器端的IPC版本与客户端不一致
	 * 那么就会抛出版本不一致的异常
	 */
	@Override
	public long getProtocolVersion(String protocol, long clientVersion) throws IOException {
		System.out.println("protocol: "+protocol);
		System.out.println("clientVersion: "+clientVersion);
		return IPCQueryServer.IPC_VER;
	}
}