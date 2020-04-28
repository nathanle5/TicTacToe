package com.github.nathanle5;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
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
	private static final Font UI_SPOT_FONT = new Font("Verdana", Font.PLAIN, 84);

	private static final int MAX_ROW = 3;
	private static final int MAX_COL = 3;

	private static final char LETTER_E = ' ';
	private static final char LETTER_X = 'X';
	private static final char LETTER_O = 'O';

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
	private final JPanel spotsPane = new JPanel();
	private final JButton spot00Button = new JButton();
	private final JButton spot01Button = new JButton();
	private final JButton spot02Button = new JButton();
	private final JButton spot10Button = new JButton();
	private final JButton spot11Button = new JButton();
	private final JButton spot12Button = new JButton();
	private final JButton spot20Button = new JButton();
	private final JButton spot21Button = new JButton();
	private final JButton spot22Button = new JButton();

	private final JButton[][] spotButtons = new JButton[3][3];

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
		setBounds(100, 100, 425, 625);
		setFont(UI_TEXT_FONT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
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
		
		// Spots Panel:
		GridBagConstraints gbc_spotsPane = new GridBagConstraints();
		gbc_spotsPane.fill = GridBagConstraints.BOTH;
		gbc_spotsPane.gridx = 0;
		gbc_spotsPane.gridy = 0;
		spotsPane.setFont(UI_SPOT_FONT);
		spotsPane.setBorder(null);
		contentPane.add(spotsPane, gbc_spotsPane);
		GridBagLayout gbl_spotsPane = new GridBagLayout();
		gbl_spotsPane.columnWidths = new int[]{0, 100, 100, 100, 0, 0};
		gbl_spotsPane.rowHeights = new int[]{100, 100, 100, 0};
		gbl_spotsPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_spotsPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		spotsPane.setLayout(gbl_spotsPane);
		
		// Spots Panel -> Spot (0,0) Button:
		GridBagConstraints gbc_spot00Button = new GridBagConstraints();
		gbc_spot00Button.fill = GridBagConstraints.BOTH;
		gbc_spot00Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot00Button.gridx = 1;
		gbc_spot00Button.gridy = 0;
		spot00Button.setEnabled(false);
		spot00Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO trigger player took spot
			}
		});
		spot00Button.setFocusable(false);
		spot00Button.setFont(UI_SPOT_FONT);
		spotsPane.add(spot00Button, gbc_spot00Button);
		
		// Spots Panel -> Spot (0,1) Button:
		GridBagConstraints gbc_spot01Button = new GridBagConstraints();
		gbc_spot01Button.fill = GridBagConstraints.BOTH;
		gbc_spot01Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot01Button.gridx = 2;
		gbc_spot01Button.gridy = 0;
		spot01Button.setEnabled(false);
		spot01Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO trigger player took spot
			}
		});
		spot01Button.setFocusable(false);
		spot01Button.setFont(UI_SPOT_FONT);
		spotsPane.add(spot01Button, gbc_spot01Button);
		
		// Spots Panel -> Spot (0,2) Button:
		GridBagConstraints gbc_spot02Button = new GridBagConstraints();
		gbc_spot02Button.fill = GridBagConstraints.BOTH;
		gbc_spot02Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot02Button.gridx = 3;
		gbc_spot02Button.gridy = 0;
		spot02Button.setEnabled(false);
		spot02Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO trigger player took spot
			}
		});
		spot02Button.setFocusable(false);
		spot02Button.setFont(UI_SPOT_FONT);
		spotsPane.add(spot02Button, gbc_spot02Button);
		
		// Spots Panel -> Spot (1,0) Button:
		GridBagConstraints gbc_spot10Button = new GridBagConstraints();
		gbc_spot10Button.fill = GridBagConstraints.BOTH;
		gbc_spot10Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot10Button.gridx = 1;
		gbc_spot10Button.gridy = 1;
		spot10Button.setEnabled(false);
		spot10Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO trigger player took spot
			}
		});
		spot10Button.setFocusable(false);
		spot10Button.setFont(UI_SPOT_FONT);
		spotsPane.add(spot10Button, gbc_spot10Button);
		
		// Spots Panel -> Spot (1,1) Button:
		GridBagConstraints gbc_spot11Button = new GridBagConstraints();
		gbc_spot11Button.fill = GridBagConstraints.BOTH;
		gbc_spot11Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot11Button.gridx = 2;
		gbc_spot11Button.gridy = 1;
		spot11Button.setEnabled(false);
		spot11Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO trigger player took spot
			}
		});
		spot11Button.setFocusable(false);
		spot11Button.setFont(UI_SPOT_FONT);
		spotsPane.add(spot11Button, gbc_spot11Button);
		
		// Spots Panel -> Spot (1,2) Button:
		GridBagConstraints gbc_spot12Button = new GridBagConstraints();
		gbc_spot12Button.fill = GridBagConstraints.BOTH;
		gbc_spot12Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot12Button.gridx = 3;
		gbc_spot12Button.gridy = 1;
		spot12Button.setEnabled(false);
		spot12Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO trigger player took spot
			}
		});
		spot12Button.setFocusable(false);
		spot12Button.setFont(UI_SPOT_FONT);
		spotsPane.add(spot12Button, gbc_spot12Button);
		
		// Spots Panel -> Spot (2,0) Button:
		GridBagConstraints gbc_spot20Button = new GridBagConstraints();
		gbc_spot20Button.fill = GridBagConstraints.BOTH;
		gbc_spot20Button.insets = new Insets(0, 0, 0, 5);
		gbc_spot20Button.gridx = 1;
		gbc_spot20Button.gridy = 2;
		spot20Button.setEnabled(false);
		spot20Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO trigger player took spot
			}
		});
		spot20Button.setFocusable(false);
		spot20Button.setFont(UI_SPOT_FONT);
		spotsPane.add(spot20Button, gbc_spot20Button);
		
		// Spots Panel -> Spot (2,1) Button:
		GridBagConstraints gbc_spot21Button = new GridBagConstraints();
		gbc_spot21Button.fill = GridBagConstraints.BOTH;
		gbc_spot21Button.insets = new Insets(0, 0, 0, 5);
		gbc_spot21Button.gridx = 2;
		gbc_spot21Button.gridy = 2;
		spot21Button.setEnabled(false);
		spot21Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO trigger player took spot
			}
		});
		spot21Button.setFocusable(false);
		spot21Button.setFont(UI_SPOT_FONT);
		spotsPane.add(spot21Button, gbc_spot21Button);
		
		// Spots Panel -> Spot (2,2) Button:
		GridBagConstraints gbc_spot22Button = new GridBagConstraints();
		gbc_spot22Button.insets = new Insets(0, 0, 0, 5);
		gbc_spot22Button.fill = GridBagConstraints.BOTH;
		gbc_spot22Button.gridx = 3;
		gbc_spot22Button.gridy = 2;
		spot22Button.setEnabled(false);
		spot22Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO trigger player took spot
			}
		});
		spot22Button.setFocusable(false);
		spot22Button.setFont(UI_SPOT_FONT);
		spotsPane.add(spot22Button, gbc_spot22Button);
		
		// Add all the spot buttons to the array:
		spotButtons[0][0] = spot00Button;
		spotButtons[0][1] = spot01Button;
		spotButtons[0][2] = spot02Button;
		spotButtons[1][0] = spot10Button;
		spotButtons[1][1] = spot11Button;
		spotButtons[1][2] = spot12Button;
		spotButtons[2][0] = spot20Button;
		spotButtons[2][1] = spot21Button;
		spotButtons[2][2] = spot22Button;
		
		// Assign default text to each spot button:
		for (int row = 0; row < MAX_ROW; row++) {
			for (int col = 0; col < MAX_COL; col++) {
				spotButtons[row][col].setText(Character.toString(LETTER_E));
			}
		}
	}

}
