package ch21;

public interface Printable {
	public abstract void setPrinterName(String name);	//�̸��� ����
	public abstract String getPrinterName();			//�̸��� ���
	public abstract void print(String string);			//���ڿ� ǥ��(����Ʈ �ƿ�)
}