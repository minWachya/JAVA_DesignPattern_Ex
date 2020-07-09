package ch13;
import java.util.Iterator;

public class ListVisitor extends Visitor {
	private String currentdir = "";				//현재 주목하고 있는 디렉터리의 이름
		
	@Override
	public void visit(File file) {				//파일을 방문할 때 호출된다.
		System.out.println(currentdir + "/" + file);
	}
	@Override
	public void visit(Directory directory) {	//디렉터리를 방문할 때 호출된다.
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		Iterator it = directory.iterator();
		while(it.hasNext()) {
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}
		
}
