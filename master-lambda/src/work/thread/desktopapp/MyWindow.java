package work.thread.desktopapp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindow {
	public static void main(String[] args) {
		
		//window: object JFrame
		JFrame frame = new JFrame("My Window");
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		
		//create button and add on jframe
		JButton button = new JButton("Click Me");
		
		//implemented ActionListener(Functional interface) by anonymous class
		/*button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked");
				JOptionPane.showMessageDialog(null, "Hey!, Button is clicked.");
			}
		}); */
		
		button.addActionListener(e-> {
			System.out.println("Button Clicked");
			JOptionPane.showMessageDialog(null, "Hey!, Button is clicked.");
		});
		
		button.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				button.setForeground(Color.ORANGE);
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});
		
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
