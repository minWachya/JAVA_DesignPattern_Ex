package test;

public abstract class Entry {
	public abstract String getName();	//이름을 얻는다.
	public abstract int getSize();		//크기를 얻는다.
	public Entry add(Entry entry) throws FileTreatmentException {
		//엔트리를 추가한다.
		throw new FileTreatmentException();
	}
	public void printList() {	//일람을 표시한다.
		printList("");
	}
	protected abstract void printList(String prefix);	//prefix를 앞에 붙여서 종류를 표시한다.
	public String toString() {	//문자열 표현
		return getName() + " <" + getSize() + ">";
	}
}
