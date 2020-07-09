package ch13;
import java.util.Iterator;

public class ListVisitor extends Visitor {
	private String currentdir = "";				//���� �ָ��ϰ� �ִ� ���͸��� �̸�
		
	@Override
	public void visit(File file) {				//������ �湮�� �� ȣ��ȴ�.
		System.out.println(currentdir + "/" + file);
	}
	@Override
	public void visit(Directory directory) {	//���͸��� �湮�� �� ȣ��ȴ�.
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
