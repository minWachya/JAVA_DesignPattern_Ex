package ch13;

public class File extends Entry {
	private String name;	//가상 파일 이름
	private int size;		//가상 파일 크기
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getSize() {
		return size;
	}
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
