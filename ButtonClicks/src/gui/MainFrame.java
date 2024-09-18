package gui;

import java.awt.BorderLayout;
//import java.awt.Color;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MainFrame(String appName) {
		super(appName);
		
		final MainPanel mainPanel = new MainPanel();
//		mainPanel.changeColor(Color.red);
		
		setLayout(new BorderLayout());
		add(new Toolbar(), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		this.setSize(600,400);
		this.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
