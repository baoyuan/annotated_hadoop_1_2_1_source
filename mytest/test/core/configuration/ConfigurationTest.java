package test.core.configuration;


import org.apache.hadoop.conf.Configuration;
import org.junit.Test;

public class ConfigurationTest {

	@Test
	public void testNewConfiguration() {
		Configuration conf = new Configuration();
		System.out.println(conf);
	}
	
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		System.out.println(conf);
	}
}
