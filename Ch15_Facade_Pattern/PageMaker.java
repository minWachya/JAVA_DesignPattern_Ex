package ch15_pagemaker;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
	private PageMaker() {}	//인스턴스는 만들지 않기 때문에 private 선언
	
	public static void makeWelcomPage(String mailaddr, String filename) {
		try {
			Properties mailprop = Database.getProperties("C://StudyJAVA//maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcom to " + username + "'s page!");
			writer.paragraph(username + "의 페이지에 오신 걸 환영합니다.");
			writer.paragraph("메일을 기다리고 있습니다.");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
