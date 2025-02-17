package DBs;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Vector;

public class ReaderWriter {
	
	public static boolean serialize(Object o, String filePath) {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(o);
			
			oos.close();
			fos.close();
			
			return true;
		} catch (IOException exp) {
			exp.printStackTrace();
			return false;
		}
	}
	
	public static Object deserialize(String filePath) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object o = ois.readObject();
			
			ois.close();
			fis.close();
			return o;
		} catch (IOException | ClassNotFoundException io) {
			io.printStackTrace();
			return null;
		}
	}
}