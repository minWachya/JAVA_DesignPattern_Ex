package IteratorPattern;

// ����ü ���Ҹ� �ϳ��ϳ� �����ϴ� for���� i���� ������ ��
public interface Iterator {
	public abstract boolean hasNext();	// ���� ���Ұ� �����ϴ���? O - true, X - false ��ȯ
	public abstract Object next();		// ���� ���� ������, �������� ���� ��ȯ���� Object
}
