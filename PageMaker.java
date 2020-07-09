package ch15_pagemaker;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
	private PageMaker() {}	//�ν��Ͻ��� ������ �ʱ� ������ private ����
	
	public static void makeWelcomPage(String mailaddr, String filename) {
		try {
			Properties mailprop = Database.getProperties("C://StudyJAVA//maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcom to " + username + "'s page!");
			writer.paragraph(username + "�� �������� ���� �� ȯ���մϴ�.");
			writer.paragraph("������ ��ٸ��� �ֽ��ϴ�.");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
