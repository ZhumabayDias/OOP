package bonus3;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
public class FileOut 
{

	public static void main(String[] args) {
		String path = "/Users/apple/Desktop/java_file";
		String originalInput = "Bobby age is 2";
		String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
		try {
			FileOutputStream outfile = new FileOutputStream(path+"/out.txt");
			outfile.write(encodedString.getBytes());
			outfile.close();
			System.out.println("Успешно");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}
