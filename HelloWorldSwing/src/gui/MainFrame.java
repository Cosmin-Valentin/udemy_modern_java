package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MainFrame(String appName) {
		super(appName);
		
		setLayout(new BorderLayout());
		add(new Toolbar(), BorderLayout.NORTH);
		add(new MainPanel(), BorderLayout.CENTER);
		
		this.setSize(600,400);
		this.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
