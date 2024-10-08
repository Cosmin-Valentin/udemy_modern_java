package gui;

import java.awt.BorderLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private GamePanel gamePanel = new GamePanel();

	public MainFrame() {
		super("Game Of Life");

		setLayout(new BorderLayout());
		add(gamePanel, BorderLayout.CENTER);
		
		MenuItem openItem = new MenuItem("Open");
		MenuItem saveItem = new MenuItem("Save");
		
		Menu fileMenu = new Menu("File");
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		
		MenuBar menuBar = new MenuBar();
		menuBar.add(fileMenu);
		
		setMenuBar(menuBar);
		
		JFileChooser fileChooser = new JFileChooser();
		
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Open");
			}
		});
		saveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int userOption = fileChooser.showSaveDialog(MainFrame.this);
				
				if(userOption == JFileChooser.APPROVE_OPTION) {
					System.out.println("Save");
				}
			}
		});
		
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				
				switch(code) {
				case 32:
					gamePanel.next(); 
					break;
				case 8:
					gamePanel.clear();
					break;
				case 10:
					gamePanel.randomize();
					break;
				}
					
			}
		});

		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
