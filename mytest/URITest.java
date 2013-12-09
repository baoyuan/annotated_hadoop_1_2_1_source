import java.io.DataInputStream;
import java.net.URI;


public class URITest {

	public static void main(String[] args) {
		URI uri = URI.create("http://localhost:8080/index.html");
		System.out.println(uri.getScheme());
		System.out.println(uri.getHost());
		System.out.println(uri.getPath());
		//DataInputStream
	}

}
