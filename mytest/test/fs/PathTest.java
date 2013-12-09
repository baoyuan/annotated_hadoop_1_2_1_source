package test.fs;

import org.apache.hadoop.fs.Path;

public class PathTest {

	public static void main(String[] args) {
		Path path = new Path("hdfs://localhost:9000/");
		Path parent = path.getParent();
		if(parent != null)
			System.out.println(parent.getName());
		else 
			System.out.println("****null***");
	}

}
