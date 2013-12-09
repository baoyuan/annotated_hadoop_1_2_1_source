package org.hadoopinternal.ipc;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface IPCQueryStatus extends VersionedProtocol {
	IPCFileStatus getFileStatus(String filename);
}
