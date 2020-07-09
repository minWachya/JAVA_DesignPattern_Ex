package ch15_pagemaker;
import java.io.Writer;
import java.io.IOException;

public class HtmlWriter {
	private Writer writer;
	
	public HtmlWriter(Writer writer) {
		this.writer = writer;
	}
	
	public void title(String title) throws IOException {						//타이틀 출력
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>" + title + "</title>");
		writer.write("</head>");
		writer.write("<body>\n");
		writer.write("<h1>" + title + "</h1>\n");
	}
	public void paragraph(String msg) throws IOException {						//단락 출력
		writer.write("<p>" + msg + "</p>\n");
	}
	public void link(String href, String caption) throws IOException {			//링크 출력
		paragraph("<a href=\"" + href + "\">" + caption + "</a>");
	}
	public void mailto(String mailaddr, String username) throws IOException {	//메일 주소 출력
		link("mailto:" + mailaddr, username);
	}
	public void close() throws IOException {									//닫는다.
		writer.write("</body>");
		writer.write("</html>\n");
		writer.close();
	}
}
