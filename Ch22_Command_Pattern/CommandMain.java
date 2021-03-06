package ch22;

import ch22_command.*;
import ch22_drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CommandMain extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
	//그림 그린 이력
	private MacroCommand history = new MacroCommand();
	//그림 그리는 영역
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	//제거 버튼
	private JButton clearButton = new JButton("clear");
	//빨간 버튼
	private JButton redButton = new JButton("red");
	//녹색 버튼
	private JButton greenButton = new JButton("green");
	//파란 버튼
	private JButton blueButton = new JButton("blue");
	//undo버튼
	private JButton undoButton = new JButton("undo");
	
	//생성자
	public CommandMain(String title) {
		super(title);
		
		this.addWindowListener(this);
		canvas.addMouseMotionListener(this);
		clearButton.addActionListener(this);
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
		undoButton.addActionListener(this);
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		buttonBox.add(redButton);
		buttonBox.add(greenButton);
		buttonBox.add(blueButton);
		buttonBox.add(undoButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);
		
		pack();
		show();
	}
	
	//ActionListener용
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clearButton) {
			history.clear();
			canvas.init();
			canvas.repaint();
		} else if (e.getSource() == redButton) {
			Command cmd = new ColorCommand(canvas, Color.red);
			history.append(cmd);
			cmd.execute();
		} else if (e.getSource() == greenButton) {
			Command cmd = new ColorCommand(canvas, Color.green);
			history.append(cmd);
			cmd.execute();
		} else if (e.getSource() == blueButton) {
			Command cmd = new ColorCommand(canvas, Color.blue);
			history.append(cmd);
			cmd.execute();
		} else if (e.getSource() == undoButton) {
			history.undo();
			canvas.repaint();
		}
	}
	//MouseMotionListener용
	@Override
	public void mouseMoved(MouseEvent e) {
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		Command cmd = new DrawCommand(canvas, e.getPoint());
		history.append(cmd);
		cmd.execute();
	}
	//WindowListener용
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowOpened(WindowEvent e) {}

	public static void main(String[] args) {
		new CommandMain("Command Pattern Sample");
	}
}
