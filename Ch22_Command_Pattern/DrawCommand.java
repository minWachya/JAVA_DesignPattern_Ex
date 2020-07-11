package ch22_drawer;

import ch22_command.Command;
import java.awt.Point;

public class DrawCommand implements Command {
	//�׸� �׸��� ���
	protected Drawable drawable;
	//�׸� �׸��� ��ġ
	private Point position;
	
	//������
	public DrawCommand(Drawable drawable, Point position) {
		this.drawable = drawable;
		this.position = position;
	}
	
	//����
	@Override
	public void execute() {
		drawable.draw(position.x, position.y);
	}
}
