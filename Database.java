package ch15_pagemaker;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
	private Database() {}									//new���� �ν��Ͻ��� ������Ű�� �ʱ� ���� private ����
	
	public static Properties getProperties(String dbname) {	//�����ͺ��̽� �̸����� Properties�� ��´�.
		String filename = dbname + ".txt";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(filename));
		} catch(IOException e) {
			System.out.println("Warning: " + filename + " is not found.");
		}
		return prop;
	}
}
