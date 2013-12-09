package test.fs;

import org.apache.hadoop.fs.permission.FsAction;

public class FsActionTest {
	public static void main(String[] args) {
		FsAction fa = FsAction.READ_EXECUTE;
		System.out.println(fa);
		System.out.println(fa.implies(FsAction.READ));
	}

}
