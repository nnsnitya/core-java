package work.thread.desktopapp;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {
	public static void main(String[] args) {
		
		//window: object JFrame
		JFrame frame = new JFrame("My Window");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		
		//create button and add on jframe
		JButton button = new JButton("Click Me");
		frame.add(button);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
