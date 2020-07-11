package ch23_Ex;

import language.InterpreterFacade;
import turtle.TurtleCanvas;

import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Ch23_Ex_Main extends Frame implements ActionListener {
	private TurtleCanvas canvas = new TurtleCanvas(400, 400);
	private InterpreterFacade facade = new InterpreterFacade(canvas);
	private TextField programTextField = new TextField("program repeat 4 go right end end");
	
	//������
	public Ch23_Ex_Main(String title) {
		super(title);
		
		canvas.setExecutor(facade);
		
		setLayout(new BorderLayout());
		
		programTextField.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		add(programTextField, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		pack();
		parseAndExecute();
		show();
	}
	
	//ActionListener��
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == programTextField) parseAndExecute();
	}
	
	private void parseAndExecute() {
		String programText = programTextField.getText();
		System.out.println("programText = " + programText);
		facade.parse(programText);
		canvas.repaint();
	}
	
	public static void main(String[] args) {
		new Ch23_Ex_Main("Unterpreter Pattern Sample");
	}
}
