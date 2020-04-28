package com.github.nathanle5;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

/**
 * @author Nathan Le
 */
public class MainFrame extends JFrame {

	private static final long serialVersionUID = -5318939678677563092L;
	
	private static final Font UI_TEXT_FONT = new Font("Verdana", Font.PLAIN, 12);
	private static final int MIN_SPOT_FONT_SIZE = 60;
	private static final int MAX_SPOT_FONT_SIZE = 84;
	private static final Font UI_SPOT_FONT = new Font("Verdana", Font.PLAIN, MIN_SPOT_FONT_SIZE);
	
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFileMenu = new JMenu("File");
	private final JMenuItem mntmFileStartMenuItem = new JMenuItem("Start");
	private final JMenuItem mntmFileEndMenuItem = new JMenuItem("End");
	private final JSeparator mntmFileSeparator0 = new JSeparator();
	private final JMenuItem mntmFileNewMenuItem = new JMenuItem("New");
	private final JSeparator mntmFileSeparator1 = new JSeparator();
	private final JMenuItem mntmFileExitMenuItem = new JMenuItem("Exit");
	private final JMenu mnStatMenu = new JMenu("Stats");
	private final JMenuItem mntmStatViewMenuItem = new JMenuItem("View...");
	private final JSeparator mntmStatSeparator0 = new JSeparator();
	private final JMenuItem mntmStatImportMenuItem = new JMenuItem("Import...");
	private final JMenuItem mntmStatExportMenuItem = new JMenuItem("Export...");
	private final JSeparator mntmStatSeparator1 = new JSeparator();
	private final JMenuItem mntmStatResetMenuItem = new JMenuItem("Reset");
	private final JMenu mnToolMenu = new JMenu("Tools");
	private final JMenuItem mntmToolOptionMenuItem = new JMenuItem("Options...");
	private final JMenu mnHelpMenu = new JMenu("Help");
	private final JMenuItem mntmHelpAboutMenuItem = new JMenuItem("About...");
	
	private final JPanel contentPane = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setResizable(false);
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setFont(UI_TEXT_FONT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0};
		gbl_contentPane.rowHeights = new int[]{0};
		gbl_contentPane.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		setJMenuBar(menuBar);
		menuBar.add(mnFileMenu);
		menuBar.add(mnStatMenu);
		menuBar.add(mnToolMenu);
		menuBar.add(mnHelpMenu);
		
		// File Menu:
		mnFileMenu.setFont(UI_TEXT_FONT);
		mnFileMenu.setMnemonic(KeyEvent.VK_F);
		
		// File Menu -> Start Button:
		mntmFileStartMenuItem.setFont(UI_TEXT_FONT);
		mntmFileStartMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO implement start
			}
		});
		mntmFileStartMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0));
		mntmFileStartMenuItem.setMnemonic(KeyEvent.VK_S);
		mnFileMenu.add(mntmFileStartMenuItem);
		
		// File Menu -> End Button:
		mntmFileEndMenuItem.setFont(UI_TEXT_FONT);
		mntmFileEndMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO implement end
			}
		});
		mntmFileEndMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, 0));
		mntmFileEndMenuItem.setMnemonic(KeyEvent.VK_E);
		mntmFileEndMenuItem.setEnabled(false);
		mnFileMenu.add(mntmFileEndMenuItem);
		
		// File Menu -> Separator:
		mnFileMenu.add(mntmFileSeparator0);
		
		// File Menu -> New Button:
		mntmFileNewMenuItem.setFont(UI_TEXT_FONT);
		mntmFileNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO implement new
			}
		});
		mntmFileNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, 0));
		mntmFileNewMenuItem.setMnemonic(KeyEvent.VK_N);
		mntmFileNewMenuItem.setEnabled(false);
		mnFileMenu.add(mntmFileNewMenuItem);
		
		// File Menu -> Separator:
		mnFileMenu.add(mntmFileSeparator1);
		
		// File Menu -> Exit Button:
		mntmFileExitMenuItem.setFont(UI_TEXT_FONT);
		mntmFileExitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmFileExitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
		mntmFileExitMenuItem.setMnemonic(KeyEvent.VK_X);
		mnFileMenu.add(mntmFileExitMenuItem);
		
		// Stats Menu:
		mnStatMenu.setFont(UI_TEXT_FONT);
		mnStatMenu.setMnemonic(KeyEvent.VK_S);
		
		// Stats Menu -> View Button:
		mntmStatViewMenuItem.setFont(UI_TEXT_FONT);
		mntmStatViewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO implement view stats frame
			}
		});
		mntmStatViewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, 0));
		mntmStatViewMenuItem.setMnemonic(KeyEvent.VK_V);
		mnStatMenu.add(mntmStatViewMenuItem);
		
		// Stats Menu -> Separator:
		mnStatMenu.add(mntmStatSeparator0);
		
		// Stats Menu -> Import Button:
		mntmStatImportMenuItem.setFont(UI_TEXT_FONT);
		mntmStatImportMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO implement import stats
			}
		});
		mntmStatImportMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
		mntmStatImportMenuItem.setMnemonic(KeyEvent.VK_I);
		mnStatMenu.add(mntmStatImportMenuItem);
		
		// Stats Menu -> Export Button:
		mntmStatExportMenuItem.setFont(UI_TEXT_FONT);
		mntmStatExportMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO implement export stats
			}
		});
		mntmStatExportMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		mntmStatExportMenuItem.setMnemonic(KeyEvent.VK_E);
		mnStatMenu.add(mntmStatExportMenuItem);
		
		// Stats Menu -> Separator:
		mnStatMenu.add(mntmStatSeparator1);
		
		// Stats Menu -> Reset Button:
		mntmStatResetMenuItem.setFont(UI_TEXT_FONT);
		mntmStatResetMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO implement reset stats
			}
		});
		mntmStatResetMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.CTRL_DOWN_MASK));
		mntmStatResetMenuItem.setMnemonic(KeyEvent.VK_R);
		mnStatMenu.add(mntmStatResetMenuItem);
		
		// Tools Menu:
		mnToolMenu.setFont(UI_TEXT_FONT);
		mnToolMenu.setMnemonic(KeyEvent.VK_T);
		
		// Tools Menu -> Options Button:
		mntmToolOptionMenuItem.setFont(UI_TEXT_FONT);
		mntmToolOptionMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO implement options frame
			}
		});
		mntmToolOptionMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, 0));
		mntmToolOptionMenuItem.setMnemonic(KeyEvent.VK_O);
		mnToolMenu.add(mntmToolOptionMenuItem);
		
		// Help Menu:
		mnHelpMenu.setFont(UI_TEXT_FONT);
		mnHelpMenu.setMnemonic(KeyEvent.VK_H);
		
		// Help Menu -> About Button:
		mntmHelpAboutMenuItem.setFont(UI_TEXT_FONT);
		mntmHelpAboutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO implement about frame
			}
		});
		mntmHelpAboutMenuItem.setMnemonic(KeyEvent.VK_A);
		mnHelpMenu.add(mntmHelpAboutMenuItem);
	}

}
