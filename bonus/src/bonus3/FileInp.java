package bonus3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Base64;
import java.io.IOException;
public class FileInp{
	public static void main(String[] args) {
		String path = "/Users/apple/Desktop/java_file";
		try {
			FileInputStream infile = new FileInputStream( path + "/out.txt");
			byte[] decodedBytes = Base64.getDecoder().decode(infile.readAllBytes());
			String decodedString = new String(decodedBytes);
			System.out.println(decodedString);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
