package com.github.nathanle5;

import java.awt.Color;
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
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

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
	private final JPanel buttonPane = new JPanel();
	private final JButton startGameButton = new JButton("Start Game");
	private final JButton endGameButton = new JButton("End Game");
	private final JButton newGameButton = new JButton("New Match");

	private final JPanel statsPane = new JPanel();
	private final JPanel winsPane = new JPanel();
	private final JLabel winCountLabel = new JLabel("0");
	private final JPanel lossesPane = new JPanel();
	private final JLabel lossCountLabel = new JLabel("0");
	private final JPanel matchesPane = new JPanel();
	private final JLabel matchCountLabel = new JLabel("0");
	private final JPanel winPercentPane = new JPanel();
	private final JLabel winPercentLabel = new JLabel("0");
	private final JPanel lossPercentPane = new JPanel();
	private final JLabel lossPercentLabel = new JLabel("0");

	private final JButton[][] spotButtons = new JButton[3][3];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					final MainFrame frame = new MainFrame();
					frame.setLocationRelativeTo(null);
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
		setBounds(100, 100, 425, 595);
		setFont(UI_TEXT_FONT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO implement about frame
			}
		});
		mntmHelpAboutMenuItem.setMnemonic(KeyEvent.VK_A);
		mnHelpMenu.add(mntmHelpAboutMenuItem);

		// Spots Panel:
		GridBagConstraints gbc_spotsPane = new GridBagConstraints();
		gbc_spotsPane.insets = new Insets(0, 0, 5, 0);
		gbc_spotsPane.fill = GridBagConstraints.BOTH;
		gbc_spotsPane.gridx = 0;
		gbc_spotsPane.gridy = 0;
		spotsPane.setFont(UI_SPOT_FONT);
		spotsPane.setBorder(null);
		contentPane.add(spotsPane, gbc_spotsPane);
		GridBagLayout gbl_spotsPane = new GridBagLayout();
		gbl_spotsPane.columnWidths = new int[] { 0, 100, 100, 100, 0, 0 };
		gbl_spotsPane.rowHeights = new int[] { 100, 100, 100, 0 };
		gbl_spotsPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_spotsPane.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		spotsPane.setLayout(gbl_spotsPane);

		// Spots Panel -> Spot (0,0) Button:
		GridBagConstraints gbc_spot00Button = new GridBagConstraints();
		gbc_spot00Button.fill = GridBagConstraints.BOTH;
		gbc_spot00Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot00Button.gridx = 1;
		gbc_spot00Button.gridy = 0;
		spot00Button.setEnabled(false);
		spot00Button.addActionListener(new ActionListener() {
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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
			@Override
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

		// Button Panel:
		GridBagConstraints gbc_buttonPane = new GridBagConstraints();
		gbc_buttonPane.insets = new Insets(0, 0, 5, 0);
		gbc_buttonPane.fill = GridBagConstraints.BOTH;
		gbc_buttonPane.gridx = 0;
		gbc_buttonPane.gridy = 1;
		buttonPane.setBorder(null);
		buttonPane.setFont(UI_TEXT_FONT);
		contentPane.add(buttonPane, gbc_buttonPane);
		GridBagLayout gbl_buttonPane = new GridBagLayout();
		gbl_buttonPane.columnWidths = new int[] { 0, 125, 125, 125, 0, 0 };
		gbl_buttonPane.rowHeights = new int[] { 25, 0 };
		gbl_buttonPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_buttonPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		buttonPane.setLayout(gbl_buttonPane);

		// Button Panel -> Start Button:
		GridBagConstraints gbc_startGameButton = new GridBagConstraints();
		gbc_startGameButton.fill = GridBagConstraints.BOTH;
		gbc_startGameButton.insets = new Insets(0, 0, 0, 5);
		gbc_startGameButton.gridx = 1;
		gbc_startGameButton.gridy = 0;
		startGameButton.setFont(UI_TEXT_FONT);
		startGameButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO implement start
			}
		});
		buttonPane.add(startGameButton, gbc_startGameButton);

		// Button Panel -> End Button:
		GridBagConstraints gbc_endGameButton = new GridBagConstraints();
		gbc_endGameButton.fill = GridBagConstraints.BOTH;
		gbc_endGameButton.insets = new Insets(0, 0, 0, 5);
		gbc_endGameButton.gridx = 2;
		gbc_endGameButton.gridy = 0;
		endGameButton.setFont(UI_TEXT_FONT);
		endGameButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO implement end
			}
		});
		endGameButton.setEnabled(false);
		buttonPane.add(endGameButton, gbc_endGameButton);

		// Button Panel -> New Button:
		GridBagConstraints gbc_newGameButton = new GridBagConstraints();
		gbc_newGameButton.fill = GridBagConstraints.BOTH;
		gbc_newGameButton.insets = new Insets(0, 0, 0, 5);
		gbc_newGameButton.gridx = 3;
		gbc_newGameButton.gridy = 0;
		newGameButton.setFont(UI_TEXT_FONT);
		newGameButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO implement new
			}
		});
		newGameButton.setEnabled(false);
		buttonPane.add(newGameButton, gbc_newGameButton);

		// Stats Panel:
		GridBagConstraints gbc_statsPane = new GridBagConstraints();
		gbc_statsPane.insets = new Insets(0, 0, 5, 0);
		gbc_statsPane.fill = GridBagConstraints.BOTH;
		gbc_statsPane.gridx = 0;
		gbc_statsPane.gridy = 2;
		statsPane.setBorder(null);
		statsPane.setFont(UI_TEXT_FONT);
		contentPane.add(statsPane, gbc_statsPane);
		GridBagLayout gbl_statsPane = new GridBagLayout();
		gbl_statsPane.columnWidths = new int[] { 0, 205, 70, 0, 0 };
		gbl_statsPane.rowHeights = new int[] { 40, 40, 40, 0 };
		gbl_statsPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_statsPane.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		statsPane.setLayout(gbl_statsPane);

		// Stats Panel -> Wins Panel:
		GridBagConstraints gbc_winsPane = new GridBagConstraints();
		gbc_winsPane.insets = new Insets(0, 0, 5, 5);
		gbc_winsPane.fill = GridBagConstraints.BOTH;
		gbc_winsPane.gridx = 1;
		gbc_winsPane.gridy = 0;
		winsPane.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Wins:",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		winsPane.setFont(UI_TEXT_FONT);
		statsPane.add(winsPane, gbc_winsPane);
		GridBagLayout gbl_winsPane = new GridBagLayout();
		gbl_winsPane.columnWidths = new int[] { 0, 0 };
		gbl_winsPane.rowHeights = new int[] { 0, 0 };
		gbl_winsPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_winsPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		winsPane.setLayout(gbl_winsPane);

		// Stats Panel -> Wins Panel -> Wins Label:
		GridBagConstraints gbc_winCountLabel = new GridBagConstraints();
		gbc_winCountLabel.anchor = GridBagConstraints.EAST;
		gbc_winCountLabel.gridx = 0;
		gbc_winCountLabel.gridy = 0;
		winCountLabel.setFont(UI_TEXT_FONT);
		winsPane.add(winCountLabel, gbc_winCountLabel);

		// Stats Panel -> Wins Percent Panel:
		GridBagConstraints gbc_winPercentPane = new GridBagConstraints();
		gbc_winPercentPane.insets = new Insets(0, 0, 5, 5);
		gbc_winPercentPane.fill = GridBagConstraints.BOTH;
		gbc_winPercentPane.gridx = 2;
		gbc_winPercentPane.gridy = 0;
		winPercentPane.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Win %:",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		winPercentPane.setFont(UI_TEXT_FONT);
		statsPane.add(winPercentPane, gbc_winPercentPane);
		GridBagLayout gbl_winPercentPane = new GridBagLayout();
		gbl_winPercentPane.columnWidths = new int[] { 0, 0 };
		gbl_winPercentPane.rowHeights = new int[] { 0, 0 };
		gbl_winPercentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_winPercentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		winPercentPane.setLayout(gbl_winPercentPane);

		// Stats Panel -> Wins Percent Panel -> Wins Percent Label:
		GridBagConstraints gbc_winPercentLabel = new GridBagConstraints();
		gbc_winPercentLabel.anchor = GridBagConstraints.EAST;
		gbc_winPercentLabel.gridx = 0;
		gbc_winPercentLabel.gridy = 0;
		winPercentLabel.setFont(UI_TEXT_FONT);
		winPercentPane.add(winPercentLabel, gbc_winPercentLabel);

		// Stats Panel -> Losses Panel:
		GridBagConstraints gbc_lossesPane = new GridBagConstraints();
		gbc_lossesPane.insets = new Insets(0, 0, 5, 5);
		gbc_lossesPane.fill = GridBagConstraints.BOTH;
		gbc_lossesPane.gridx = 1;
		gbc_lossesPane.gridy = 1;
		lossesPane.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Losses:",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		lossesPane.setFont(UI_TEXT_FONT);
		statsPane.add(lossesPane, gbc_lossesPane);
		GridBagLayout gbl_lossesPane = new GridBagLayout();
		gbl_lossesPane.columnWidths = new int[] { 0, 0 };
		gbl_lossesPane.rowHeights = new int[] { 0, 0 };
		gbl_lossesPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_lossesPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		lossesPane.setLayout(gbl_lossesPane);

		// Stats Panel -> Losses Panel -> Losses Label:
		GridBagConstraints gbc_lossCountLabel = new GridBagConstraints();
		gbc_lossCountLabel.anchor = GridBagConstraints.EAST;
		gbc_lossCountLabel.gridx = 0;
		gbc_lossCountLabel.gridy = 0;
		lossCountLabel.setFont(UI_TEXT_FONT);
		lossesPane.add(lossCountLabel, gbc_lossCountLabel);

		// Stats Panel -> Losses Percent Panel:
		GridBagConstraints gbc_lossPercentPane = new GridBagConstraints();
		gbc_lossPercentPane.insets = new Insets(0, 0, 5, 5);
		gbc_lossPercentPane.fill = GridBagConstraints.BOTH;
		gbc_lossPercentPane.gridx = 2;
		gbc_lossPercentPane.gridy = 1;
		lossPercentPane.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Loss %:",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		lossPercentPane.setFont(UI_TEXT_FONT);
		statsPane.add(lossPercentPane, gbc_lossPercentPane);
		GridBagLayout gbl_lossPercentPane = new GridBagLayout();
		gbl_lossPercentPane.columnWidths = new int[] { 0, 0 };
		gbl_lossPercentPane.rowHeights = new int[] { 0, 0 };
		gbl_lossPercentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_lossPercentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		lossPercentPane.setLayout(gbl_lossPercentPane);

		// Stats Panel -> Losses Percent Panel -> Losses Percent Label:
		GridBagConstraints gbc_lossPercentLabel = new GridBagConstraints();
		gbc_lossPercentLabel.anchor = GridBagConstraints.EAST;
		gbc_lossPercentLabel.gridx = 0;
		gbc_lossPercentLabel.gridy = 0;
		lossPercentLabel.setFont(UI_TEXT_FONT);
		lossPercentPane.add(lossPercentLabel, gbc_lossPercentLabel);

		// Stats Panel -> Matches Panel:
		GridBagConstraints gbc_matchesPane = new GridBagConstraints();
		gbc_matchesPane.insets = new Insets(0, 0, 0, 5);
		gbc_matchesPane.fill = GridBagConstraints.BOTH;
		gbc_matchesPane.gridx = 1;
		gbc_matchesPane.gridy = 2;
		matchesPane.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Matches:",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		matchesPane.setFont(UI_TEXT_FONT);
		statsPane.add(matchesPane, gbc_matchesPane);
		GridBagLayout gbl_matchesPane = new GridBagLayout();
		gbl_matchesPane.columnWidths = new int[] { 0, 0 };
		gbl_matchesPane.rowHeights = new int[] { 0, 0 };
		gbl_matchesPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_matchesPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		matchesPane.setLayout(gbl_matchesPane);

		// Stats Panel -> Matches Panel -> Matches Label:
		GridBagConstraints gbc_matchCountLabel = new GridBagConstraints();
		gbc_matchCountLabel.anchor = GridBagConstraints.EAST;
		gbc_matchCountLabel.gridx = 0;
		gbc_matchCountLabel.gridy = 0;
		matchCountLabel.setFont(UI_TEXT_FONT);
		matchesPane.add(matchCountLabel, gbc_matchCountLabel);
	}

}
