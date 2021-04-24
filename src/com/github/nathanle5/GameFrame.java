package com.github.nathanle5;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 4543273208336829L;

	private static final int defaultWindowStyleIndex = 1;

	private String[] windowStyleNames;

	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem fileExitMenuItem;
	private JMenu dataMenu;
	private JMenuItem dataImportPvcStatMenuItem;
	private JMenuItem dataExportPvcStatMenuItem;
	private JSeparator dataSeparator0;
	private JMenuItem dataViewPvcStatMenuItem;
	private JMenuItem dataResetPvcStatMenuItem;
	private JSeparator dataSeparator1;
	private JMenuItem dataViewPvpStatMenuItem;
	private JMenuItem dataResetPvpStatMenuItem;
	private JMenu gameMenu;
	private JMenuItem gameStartMatchMenuItem;
	private JMenuItem gameEndMatchMenuItem;
	private JSeparator gameSeparator0;
	private JMenu gameSpotMenuItem;
	private JMenuItem gameSpots0MenuItem;
	private JMenuItem gameSpots1MenuItem;
	private JMenuItem gameSpots2MenuItem;
	private JSeparator gameSpotSeparator0;
	private JMenuItem gameSpot00MenuItem;
	private JMenuItem gameSpot01MenuItem;
	private JMenuItem gameSpot02MenuItem;
	private JSeparator gameSpotSeparator1;
	private JMenuItem gameSpot10MenuItem;
	private JMenuItem gameSpot11MenuItem;
	private JMenuItem gameSpot12MenuItem;
	private JSeparator gameSpotSeparator2;
	private JMenuItem gameSpot20MenuItem;
	private JMenuItem gameSpot21MenuItem;
	private JMenuItem gameSpot22MenuItem;
	private JMenuItem gameNewRoundMenuItem;
	private JSeparator gameSeparator1;
	private JMenuItem gameViewSettingMenuItem;
	private JMenu gameSettingModeMenu;
	private JRadioButtonMenuItem gameModePvcRadioItem;
	private JRadioButtonMenuItem gameModePvpRadioItem;
	private JSeparator gameSeparator2;
	private JMenuItem gameSettingPvcMenuItem;
	private JMenu gameSettingPvcDifficultyMenu;
	private JRadioButtonMenuItem gameSettingPvcDifficultyRandomRadioItem;
	private JSeparator gameSettingPvcDifficultySeparator;
	private JRadioButtonMenuItem gameSettingPvcDifficultyAimlessRadioItem;
	private JRadioButtonMenuItem gameSettingPvcDifficultyEasyRadioItem;
	private JRadioButtonMenuItem gameSettingPvcDifficultyNormalRadioItem;
	private JRadioButtonMenuItem gameSettingPvcDifficultyHardRadioItem;
	private JRadioButtonMenuItem gameSettingPvcDifficultyInsaneRadioItem;
	private JMenu gameSettingPvcStartMenu;
	private JRadioButtonMenuItem gameSettingPvcStartRandomRadioItem;
	private JSeparator gameSettingPvcStartSeparator;
	private JRadioButtonMenuItem gameSettingPvcStartPlayerRadioItem;
	private JRadioButtonMenuItem gameSettingPvcStartComputerRadioItem;
	private JMenu gameSettingPvcSymbolMenu;
	private JRadioButtonMenuItem gameSettingPvcSymbolNsRadioItem;
	private JSeparator gameSettingPvcSymbolSeparator;
	private JRadioButtonMenuItem gameSettingPvcSymbolXsRadioItem;
	private JRadioButtonMenuItem gameSettingPvcSymbolOsRadioItem;
	private JSeparator gameSeparator3;
	private JMenuItem gameSettingPvpMenuItem;
	private JMenu gameSettingPvpStartMenu;
	private JRadioButtonMenuItem gameSettingPvpStartRandomRadioItem;
	private JSeparator gameSettingPvpStartSeparator;
	private JRadioButtonMenuItem gameSettingPvpStartPlayer1RadioItem;
	private JRadioButtonMenuItem gameSettingPvpStartPlayer2RadioItem;
	private JMenu gameSettingPvpSymbolMenu;
	private JRadioButtonMenuItem gameSettingPvpSymbolNsRadioItem;
	private JSeparator gameSettingPvpSymbolSeparator;
	private JRadioButtonMenuItem gameSettingPvpSymbolXsRadioItem;
	private JRadioButtonMenuItem gameSettingPvpSymbolOsRadioItem;
	private JMenu windowMenu;
	private JMenu windowStyleMenu;
	private JMenuItem windowStyleSystemMenuItem;
	private JSeparator windowStyleSeparator;
	private JRadioButtonMenuItem[] windowStyleRadioItems;
	private JMenu helpMenu;
	private JMenuItem helpAboutMenuItem;

	private JPanel contentPane;
	private JPanel gameSpotPane;
	private JButton gameSpot00Button;
	private JButton gameSpot01Button;
	private JButton gameSpot02Button;
	private JButton gameSpot10Button;
	private JButton gameSpot11Button;
	private JButton gameSpot12Button;
	private JButton gameSpot20Button;
	private JButton gameSpot21Button;
	private JButton gameSpot22Button;
	private JPanel gameControlPane;
	private JButton gameStartMatchButton;
	private JButton gameEndMatchButton;
	private JButton gameNewRoundButton;
	private JPanel gameSettingPane;
	private JPanel gameModeHintPane;
	private JLabel gameModeValueLabel;
	private JPanel gameDifficultyHintPane;
	private JLabel gameDifficultyValueLabel;
	private JPanel gameStartHintPane;
	private JLabel gameStartValueLabel;
	private JPanel gameSymbolHintPane;
	private JLabel gameSymbolValueLabel;
	private JPanel gameStatisticPane;
	private JPanel gameStatisticData1Pane;
	private JPanel gameStatisticData1WinHintPane;
	private JLabel gameStatisticData1WinValueLabel;
	private JPanel gameStatisticData1WinPercentHintPane;
	private JLabel gameStatisticData1WinPercentValueLabel;
	private JPanel gameStatisticData1LossHintPane;
	private JLabel gameStatisticData1LossValueLabel;
	private JPanel gameStatisticData1LossPercentHintPane;
	private JLabel gameStatisticData1LossPercentValueLabel;
	private JPanel gameStatisticData1TieHintPane;
	private JLabel gameStatisticData1TieValueLabel;
	private JPanel gameStatisticData1TiePercentHintPane;
	private JLabel gameStatisticData1TiePercentValueLabel;
	private JPanel gameStatisticData1RoundHintPane;
	private JLabel gameStatisticData1RoundValueLabel;
	private JPanel gameStatisticData2Pane;
	private JPanel gameStatisticData2WinHintPane;
	private JLabel gameStatisticData2WinValueLabel;
	private JPanel gameStatisticData2WinPercentHintPane;
	private JLabel gameStatisticData2WinPercentValueLabel;
	private JPanel gameStatisticData2LossHintPane;
	private JLabel gameStatisticData2LossValueLabel;
	private JPanel gameStatisticData2LossPercentHintPane;
	private JLabel gameStatisticData2LossPercentValueLabel;
	private JPanel gameStatisticData2TieHintPane;
	private JLabel gameStatisticData2TieValueLabel;
	private JPanel gameStatisticData2TiePercentHintPane;
	private JLabel gameStatisticData2TiePercentValueLabel;
	private JPanel gameStatisticData2RoundHintPane;
	private JLabel gameStatisticData2RoundValueLabel;

	/**
	 * Create the frame.
	 */
	public GameFrame() {
		preinitialize();
		initialize();
	}

	/**
	 * Before the user interface is created in {@link #initialize()}, define the
	 * default look-and-feel.
	 */
	private void preinitialize() {
		try {
			LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
			windowStyleNames = new String[lookAndFeelInfos.length];
			for (int i = 0; i < lookAndFeelInfos.length; i++) {
				LookAndFeelInfo lookAndFeelInfo = lookAndFeelInfos[i];
				windowStyleNames[i] = lookAndFeelInfo.getName();
			}
			if (windowStyleNames.length >= defaultWindowStyleIndex) {
				for (LookAndFeelInfo lookAndFeelInfo : UIManager.getInstalledLookAndFeels()) {
					if (windowStyleNames[defaultWindowStyleIndex].equals(lookAndFeelInfo.getName())) {
						UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());
						break;
					}
				}
			}
			windowStyleRadioItems = new JRadioButtonMenuItem[lookAndFeelInfos.length];
		} catch (Exception e) {
		}
	}

	/**
	 * Create the user interface.
	 */
	private void initialize() {
		setPreferredSize(new Dimension(708, 591));
		setFont(new Font("Segoe UI", Font.PLAIN, 12));
		setResizable(false);
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(414, 117, 708, 572);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(fileMenu);

		fileExitMenuItem = new JMenuItem("Exit");
		fileExitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_DOWN_MASK));
		fileExitMenuItem.setMnemonic(KeyEvent.VK_X);
		fileMenu.add(fileExitMenuItem);

		dataMenu = new JMenu("Data");
		dataMenu.setMnemonic(KeyEvent.VK_D);
		menuBar.add(dataMenu);

		dataImportPvcStatMenuItem = new JMenuItem("Import PvC Stats...");
		dataImportPvcStatMenuItem.setMnemonic(KeyEvent.VK_I);
		dataMenu.add(dataImportPvcStatMenuItem);

		dataExportPvcStatMenuItem = new JMenuItem("Export PvC Stats...");
		dataExportPvcStatMenuItem.setMnemonic(KeyEvent.VK_E);
		dataMenu.add(dataExportPvcStatMenuItem);

		dataSeparator0 = new JSeparator();
		dataMenu.add(dataSeparator0);

		dataViewPvcStatMenuItem = new JMenuItem("View PvC Stats...");
		dataViewPvcStatMenuItem.setMnemonic(KeyEvent.VK_C);
		dataMenu.add(dataViewPvcStatMenuItem);

		dataResetPvcStatMenuItem = new JMenuItem("Reset PvC Stats...");
		dataResetPvcStatMenuItem.setMnemonic(KeyEvent.VK_R);
		dataMenu.add(dataResetPvcStatMenuItem);

		dataSeparator1 = new JSeparator();
		dataMenu.add(dataSeparator1);

		dataViewPvpStatMenuItem = new JMenuItem("View PvP Stats...");
		dataViewPvpStatMenuItem.setMnemonic(KeyEvent.VK_P);
		dataMenu.add(dataViewPvpStatMenuItem);

		dataResetPvpStatMenuItem = new JMenuItem("Reset PvP Stats...");
		dataResetPvpStatMenuItem.setMnemonic(KeyEvent.VK_E);
		dataMenu.add(dataResetPvpStatMenuItem);

		gameMenu = new JMenu("Game");
		gameMenu.setMnemonic(KeyEvent.VK_G);
		menuBar.add(gameMenu);

		gameStartMatchMenuItem = new JMenuItem("Start Match");
		gameStartMatchMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0));
		gameStartMatchMenuItem.setMnemonic(KeyEvent.VK_S);
		gameMenu.add(gameStartMatchMenuItem);

		gameEndMatchMenuItem = new JMenuItem("End Match");
		gameEndMatchMenuItem.setEnabled(false);
		gameEndMatchMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, 0));
		gameEndMatchMenuItem.setMnemonic(KeyEvent.VK_E);
		gameMenu.add(gameEndMatchMenuItem);

		gameSeparator0 = new JSeparator();
		gameMenu.add(gameSeparator0);

		gameSpotMenuItem = new JMenu("Spot");
		gameSpotMenuItem.setEnabled(false);
		gameSpotMenuItem.setMnemonic(KeyEvent.VK_P);
		gameMenu.add(gameSpotMenuItem);

		gameSpots0MenuItem = new JMenuItem("7,8,9: ? ? ?");
		gameSpots0MenuItem.setEnabled(false);
		gameSpotMenuItem.add(gameSpots0MenuItem);

		gameSpots1MenuItem = new JMenuItem("4,5,6: ? ? ?");
		gameSpots1MenuItem.setEnabled(false);
		gameSpotMenuItem.add(gameSpots1MenuItem);

		gameSpots2MenuItem = new JMenuItem("1,2,3: ? ? ?");
		gameSpots2MenuItem.setEnabled(false);
		gameSpotMenuItem.add(gameSpots2MenuItem);

		gameSpotSeparator0 = new JSeparator();
		gameSpotMenuItem.add(gameSpotSeparator0);

		gameSpot00MenuItem = new JMenuItem("7: ?");
		gameSpot00MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0));
		gameSpot00MenuItem.setMnemonic(KeyEvent.VK_7);
		gameSpotMenuItem.add(gameSpot00MenuItem);

		gameSpot01MenuItem = new JMenuItem("8: ?");
		gameSpot01MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0));
		gameSpot01MenuItem.setMnemonic(KeyEvent.VK_8);
		gameSpotMenuItem.add(gameSpot01MenuItem);

		gameSpot02MenuItem = new JMenuItem("9: ?");
		gameSpot02MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0));
		gameSpot02MenuItem.setMnemonic(KeyEvent.VK_9);
		gameSpotMenuItem.add(gameSpot02MenuItem);

		gameSpotSeparator1 = new JSeparator();
		gameSpotMenuItem.add(gameSpotSeparator1);

		gameSpot10MenuItem = new JMenuItem("4: ?");
		gameSpot10MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0));
		gameSpot10MenuItem.setMnemonic(KeyEvent.VK_4);
		gameSpotMenuItem.add(gameSpot10MenuItem);

		gameSpot11MenuItem = new JMenuItem("5: ?");
		gameSpot11MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0));
		gameSpot11MenuItem.setMnemonic(KeyEvent.VK_5);
		gameSpotMenuItem.add(gameSpot11MenuItem);

		gameSpot12MenuItem = new JMenuItem("6: ?");
		gameSpot12MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0));
		gameSpot12MenuItem.setMnemonic(KeyEvent.VK_6);
		gameSpotMenuItem.add(gameSpot12MenuItem);

		gameSpotSeparator2 = new JSeparator();
		gameSpotMenuItem.add(gameSpotSeparator2);

		gameSpot20MenuItem = new JMenuItem("1: ?");
		gameSpot20MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0));
		gameSpot20MenuItem.setMnemonic(KeyEvent.VK_1);
		gameSpotMenuItem.add(gameSpot20MenuItem);

		gameSpot21MenuItem = new JMenuItem("2: ?");
		gameSpot21MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0));
		gameSpot21MenuItem.setMnemonic(KeyEvent.VK_2);
		gameSpotMenuItem.add(gameSpot21MenuItem);

		gameSpot22MenuItem = new JMenuItem("3: ?");
		gameSpot22MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0));
		gameSpot22MenuItem.setMnemonic(KeyEvent.VK_3);
		gameSpotMenuItem.add(gameSpot22MenuItem);

		gameNewRoundMenuItem = new JMenuItem("New Round");
		gameNewRoundMenuItem.setEnabled(false);
		gameNewRoundMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, 0));
		gameNewRoundMenuItem.setMnemonic(KeyEvent.VK_N);
		gameMenu.add(gameNewRoundMenuItem);

		gameSeparator1 = new JSeparator();
		gameMenu.add(gameSeparator1);

		gameViewSettingMenuItem = new JMenuItem("View Settings...");
		gameViewSettingMenuItem.setMnemonic(KeyEvent.VK_V);
		gameMenu.add(gameViewSettingMenuItem);

		gameSettingModeMenu = new JMenu("Mode");
		gameSettingModeMenu.setMnemonic(KeyEvent.VK_M);
		gameMenu.add(gameSettingModeMenu);

		gameModePvcRadioItem = new JRadioButtonMenuItem("PvC - Player vs. Computer");
		gameModePvcRadioItem.setMnemonic(KeyEvent.VK_C);
		gameModePvcRadioItem.setSelected(true);
		gameSettingModeMenu.add(gameModePvcRadioItem);

		gameModePvpRadioItem = new JRadioButtonMenuItem("PvP - Player vs. Player");
		gameModePvpRadioItem.setMnemonic(KeyEvent.VK_P);
		gameSettingModeMenu.add(gameModePvpRadioItem);

		gameSeparator2 = new JSeparator();
		gameMenu.add(gameSeparator2);

		gameSettingPvcMenuItem = new JMenuItem("PvC Settings:");
		gameSettingPvcMenuItem.setEnabled(false);
		gameMenu.add(gameSettingPvcMenuItem);

		gameSettingPvcDifficultyMenu = new JMenu("Difficulty");
		gameSettingPvcDifficultyMenu.setMnemonic(KeyEvent.VK_D);
		gameMenu.add(gameSettingPvcDifficultyMenu);

		gameSettingPvcDifficultyRandomRadioItem = new JRadioButtonMenuItem("Random");
		gameSettingPvcDifficultyRandomRadioItem.setMnemonic(KeyEvent.VK_R);
		gameSettingPvcDifficultyMenu.add(gameSettingPvcDifficultyRandomRadioItem);

		gameSettingPvcDifficultySeparator = new JSeparator();
		gameSettingPvcDifficultyMenu.add(gameSettingPvcDifficultySeparator);

		gameSettingPvcDifficultyAimlessRadioItem = new JRadioButtonMenuItem("Aimless");
		gameSettingPvcDifficultyAimlessRadioItem.setMnemonic(KeyEvent.VK_A);
		gameSettingPvcDifficultyAimlessRadioItem.setSelected(true);
		gameSettingPvcDifficultyMenu.add(gameSettingPvcDifficultyAimlessRadioItem);

		gameSettingPvcDifficultyEasyRadioItem = new JRadioButtonMenuItem("Easy");
		gameSettingPvcDifficultyEasyRadioItem.setMnemonic(KeyEvent.VK_E);
		gameSettingPvcDifficultyMenu.add(gameSettingPvcDifficultyEasyRadioItem);

		gameSettingPvcDifficultyNormalRadioItem = new JRadioButtonMenuItem("Normal");
		gameSettingPvcDifficultyNormalRadioItem.setMnemonic(KeyEvent.VK_N);
		gameSettingPvcDifficultyMenu.add(gameSettingPvcDifficultyNormalRadioItem);

		gameSettingPvcDifficultyHardRadioItem = new JRadioButtonMenuItem("Hard");
		gameSettingPvcDifficultyHardRadioItem.setMnemonic(KeyEvent.VK_H);
		gameSettingPvcDifficultyMenu.add(gameSettingPvcDifficultyHardRadioItem);

		gameSettingPvcDifficultyInsaneRadioItem = new JRadioButtonMenuItem("Insane");
		gameSettingPvcDifficultyInsaneRadioItem.setMnemonic(KeyEvent.VK_I);
		gameSettingPvcDifficultyMenu.add(gameSettingPvcDifficultyInsaneRadioItem);

		gameSettingPvcStartMenu = new JMenu("Starting");
		gameSettingPvcStartMenu.setMnemonic(KeyEvent.VK_T);
		gameMenu.add(gameSettingPvcStartMenu);

		gameSettingPvcStartRandomRadioItem = new JRadioButtonMenuItem("Random");
		gameSettingPvcStartRandomRadioItem.setMnemonic(KeyEvent.VK_R);
		gameSettingPvcStartMenu.add(gameSettingPvcStartRandomRadioItem);

		gameSettingPvcStartSeparator = new JSeparator();
		gameSettingPvcStartMenu.add(gameSettingPvcStartSeparator);

		gameSettingPvcStartPlayerRadioItem = new JRadioButtonMenuItem("Player");
		gameSettingPvcStartPlayerRadioItem.setMnemonic(KeyEvent.VK_P);
		gameSettingPvcStartPlayerRadioItem.setSelected(true);
		gameSettingPvcStartMenu.add(gameSettingPvcStartPlayerRadioItem);

		gameSettingPvcStartComputerRadioItem = new JRadioButtonMenuItem("Computer");
		gameSettingPvcStartComputerRadioItem.setMnemonic(KeyEvent.VK_C);
		gameSettingPvcStartMenu.add(gameSettingPvcStartComputerRadioItem);

		gameSettingPvcSymbolMenu = new JMenu("Symbol");
		gameSettingPvcSymbolMenu.setMnemonic(KeyEvent.VK_Y);
		gameMenu.add(gameSettingPvcSymbolMenu);

		gameSettingPvcSymbolNsRadioItem = new JRadioButtonMenuItem("Random");
		gameSettingPvcSymbolNsRadioItem.setMnemonic(KeyEvent.VK_R);
		gameSettingPvcSymbolMenu.add(gameSettingPvcSymbolNsRadioItem);

		gameSettingPvcSymbolSeparator = new JSeparator();
		gameSettingPvcSymbolMenu.add(gameSettingPvcSymbolSeparator);

		gameSettingPvcSymbolXsRadioItem = new JRadioButtonMenuItem("X");
		gameSettingPvcSymbolXsRadioItem.setMnemonic(KeyEvent.VK_X);
		gameSettingPvcSymbolXsRadioItem.setSelected(true);
		gameSettingPvcSymbolMenu.add(gameSettingPvcSymbolXsRadioItem);

		gameSettingPvcSymbolOsRadioItem = new JRadioButtonMenuItem("O");
		gameSettingPvcSymbolOsRadioItem.setMnemonic(KeyEvent.VK_O);
		gameSettingPvcSymbolMenu.add(gameSettingPvcSymbolOsRadioItem);

		gameSeparator3 = new JSeparator();
		gameMenu.add(gameSeparator3);

		gameSettingPvpMenuItem = new JMenuItem("PvP Settings:");
		gameSettingPvpMenuItem.setEnabled(false);
		gameMenu.add(gameSettingPvpMenuItem);

		gameSettingPvpStartMenu = new JMenu("Starting");
		gameSettingPvpStartMenu.setEnabled(false);
		gameSettingPvpStartMenu.setMnemonic(KeyEvent.VK_T);
		gameMenu.add(gameSettingPvpStartMenu);

		gameSettingPvpStartRandomRadioItem = new JRadioButtonMenuItem("Random");
		gameSettingPvpStartRandomRadioItem.setMnemonic(KeyEvent.VK_R);
		gameSettingPvpStartMenu.add(gameSettingPvpStartRandomRadioItem);

		gameSettingPvpStartSeparator = new JSeparator();
		gameSettingPvpStartMenu.add(gameSettingPvpStartSeparator);

		gameSettingPvpStartPlayer1RadioItem = new JRadioButtonMenuItem("Player 1, Player 2");
		gameSettingPvpStartPlayer1RadioItem.setMnemonic(KeyEvent.VK_1);
		gameSettingPvpStartPlayer1RadioItem.setSelected(true);
		gameSettingPvpStartMenu.add(gameSettingPvpStartPlayer1RadioItem);

		gameSettingPvpStartPlayer2RadioItem = new JRadioButtonMenuItem("Player 2, Player 1");
		gameSettingPvpStartPlayer2RadioItem.setMnemonic(KeyEvent.VK_2);
		gameSettingPvpStartMenu.add(gameSettingPvpStartPlayer2RadioItem);

		gameSettingPvpSymbolMenu = new JMenu("Symbol");
		gameSettingPvpSymbolMenu.setEnabled(false);
		gameSettingPvpSymbolMenu.setMnemonic(KeyEvent.VK_Y);
		gameMenu.add(gameSettingPvpSymbolMenu);

		gameSettingPvpSymbolNsRadioItem = new JRadioButtonMenuItem("Random");
		gameSettingPvpSymbolNsRadioItem.setMnemonic(KeyEvent.VK_R);
		gameSettingPvpSymbolMenu.add(gameSettingPvpSymbolNsRadioItem);

		gameSettingPvpSymbolSeparator = new JSeparator();
		gameSettingPvpSymbolMenu.add(gameSettingPvpSymbolSeparator);

		gameSettingPvpSymbolXsRadioItem = new JRadioButtonMenuItem("X, O");
		gameSettingPvpSymbolXsRadioItem.setMnemonic(KeyEvent.VK_X);
		gameSettingPvpSymbolXsRadioItem.setSelected(true);
		gameSettingPvpSymbolMenu.add(gameSettingPvpSymbolXsRadioItem);

		gameSettingPvpSymbolOsRadioItem = new JRadioButtonMenuItem("O, X");
		gameSettingPvpSymbolOsRadioItem.setMnemonic(KeyEvent.VK_O);
		gameSettingPvpSymbolMenu.add(gameSettingPvpSymbolOsRadioItem);

		windowMenu = new JMenu("Window");
		windowMenu.setMnemonic(KeyEvent.VK_W);
		menuBar.add(windowMenu);

		windowStyleMenu = new JMenu("Style");
		windowStyleMenu.setMnemonic(KeyEvent.VK_S);
		windowMenu.add(windowStyleMenu);

		windowStyleSystemMenuItem = new JMenuItem("<System>");
		windowStyleSystemMenuItem.setMnemonic(KeyEvent.VK_S);
		windowStyleMenu.add(windowStyleSystemMenuItem);

		windowStyleSeparator = new JSeparator();
		windowStyleMenu.add(windowStyleSeparator);

		for (int i = 0; i < windowStyleNames.length; i++) {
			JRadioButtonMenuItem radioButtonMenuItem = new JRadioButtonMenuItem(windowStyleNames[i]);
			if (i == defaultWindowStyleIndex) {
				radioButtonMenuItem.setSelected(true);
			}
			windowStyleMenu.add(radioButtonMenuItem);
			windowStyleRadioItems[i] = radioButtonMenuItem;
		}

		helpMenu = new JMenu("Help");
		helpMenu.setMnemonic(KeyEvent.VK_H);
		menuBar.add(helpMenu);

		helpAboutMenuItem = new JMenuItem("About...");
		helpAboutMenuItem.setMnemonic(KeyEvent.VK_A);
		helpMenu.add(helpAboutMenuItem);

		contentPane = new JPanel();
		contentPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		gameSpotPane = new JPanel();
		gameSpotPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameSpotPane = new GridBagConstraints();
		gbc_gameSpotPane.insets = new Insets(0, 0, 5, 5);
		gbc_gameSpotPane.fill = GridBagConstraints.BOTH;
		gbc_gameSpotPane.gridx = 0;
		gbc_gameSpotPane.gridy = 0;
		contentPane.add(gameSpotPane, gbc_gameSpotPane);
		GridBagLayout gbl_gameSpotPane = new GridBagLayout();
		gbl_gameSpotPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_gameSpotPane.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_gameSpotPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_gameSpotPane.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gameSpotPane.setLayout(gbl_gameSpotPane);

		gameSpot00Button = new JButton("?");
		gameSpot00Button.setEnabled(false);
		gameSpot00Button.setPreferredSize(new Dimension(100, 100));
		gameSpot00Button.setFont(new Font("Segoe UI", Font.PLAIN, 64));
		GridBagConstraints gbc_gameSpot00Button = new GridBagConstraints();
		gbc_gameSpot00Button.insets = new Insets(0, 0, 5, 5);
		gbc_gameSpot00Button.gridx = 1;
		gbc_gameSpot00Button.gridy = 0;
		gameSpotPane.add(gameSpot00Button, gbc_gameSpot00Button);

		gameSpot01Button = new JButton("?");
		gameSpot01Button.setEnabled(false);
		gameSpot01Button.setPreferredSize(new Dimension(100, 100));
		gameSpot01Button.setFont(new Font("Segoe UI", Font.PLAIN, 64));
		GridBagConstraints gbc_gameSpot01Button = new GridBagConstraints();
		gbc_gameSpot01Button.insets = new Insets(0, 0, 5, 5);
		gbc_gameSpot01Button.gridx = 2;
		gbc_gameSpot01Button.gridy = 0;
		gameSpotPane.add(gameSpot01Button, gbc_gameSpot01Button);

		gameSpot02Button = new JButton("?");
		gameSpot02Button.setEnabled(false);
		gameSpot02Button.setPreferredSize(new Dimension(100, 100));
		gameSpot02Button.setFont(new Font("Segoe UI", Font.PLAIN, 64));
		GridBagConstraints gbc_gameSpot02Button = new GridBagConstraints();
		gbc_gameSpot02Button.insets = new Insets(0, 0, 5, 5);
		gbc_gameSpot02Button.gridx = 3;
		gbc_gameSpot02Button.gridy = 0;
		gameSpotPane.add(gameSpot02Button, gbc_gameSpot02Button);

		gameSpot10Button = new JButton("?");
		gameSpot10Button.setEnabled(false);
		gameSpot10Button.setPreferredSize(new Dimension(100, 100));
		gameSpot10Button.setFont(new Font("Segoe UI", Font.PLAIN, 64));
		GridBagConstraints gbc_gameSpot10Button = new GridBagConstraints();
		gbc_gameSpot10Button.insets = new Insets(0, 0, 5, 5);
		gbc_gameSpot10Button.gridx = 1;
		gbc_gameSpot10Button.gridy = 1;
		gameSpotPane.add(gameSpot10Button, gbc_gameSpot10Button);

		gameSpot11Button = new JButton("?");
		gameSpot11Button.setEnabled(false);
		gameSpot11Button.setPreferredSize(new Dimension(100, 100));
		gameSpot11Button.setFont(new Font("Segoe UI", Font.PLAIN, 64));
		GridBagConstraints gbc_gameSpot11Button = new GridBagConstraints();
		gbc_gameSpot11Button.insets = new Insets(0, 0, 5, 5);
		gbc_gameSpot11Button.gridx = 2;
		gbc_gameSpot11Button.gridy = 1;
		gameSpotPane.add(gameSpot11Button, gbc_gameSpot11Button);

		gameSpot12Button = new JButton("?");
		gameSpot12Button.setEnabled(false);
		gameSpot12Button.setPreferredSize(new Dimension(100, 100));
		gameSpot12Button.setFont(new Font("Segoe UI", Font.PLAIN, 64));
		GridBagConstraints gbc_gameSpot12Button = new GridBagConstraints();
		gbc_gameSpot12Button.insets = new Insets(0, 0, 5, 5);
		gbc_gameSpot12Button.gridx = 3;
		gbc_gameSpot12Button.gridy = 1;
		gameSpotPane.add(gameSpot12Button, gbc_gameSpot12Button);

		gameSpot20Button = new JButton("?");
		gameSpot20Button.setEnabled(false);
		gameSpot20Button.setPreferredSize(new Dimension(100, 100));
		gameSpot20Button.setFont(new Font("Segoe UI", Font.PLAIN, 64));
		GridBagConstraints gbc_gameSpot20Button = new GridBagConstraints();
		gbc_gameSpot20Button.insets = new Insets(0, 0, 0, 5);
		gbc_gameSpot20Button.gridx = 1;
		gbc_gameSpot20Button.gridy = 2;
		gameSpotPane.add(gameSpot20Button, gbc_gameSpot20Button);

		gameSpot21Button = new JButton("?");
		gameSpot21Button.setEnabled(false);
		gameSpot21Button.setPreferredSize(new Dimension(100, 100));
		gameSpot21Button.setFont(new Font("Segoe UI", Font.PLAIN, 64));
		GridBagConstraints gbc_gameSpot21Button = new GridBagConstraints();
		gbc_gameSpot21Button.insets = new Insets(0, 0, 0, 5);
		gbc_gameSpot21Button.gridx = 2;
		gbc_gameSpot21Button.gridy = 2;
		gameSpotPane.add(gameSpot21Button, gbc_gameSpot21Button);

		gameSpot22Button = new JButton("?");
		gameSpot22Button.setEnabled(false);
		gameSpot22Button.setPreferredSize(new Dimension(100, 100));
		gameSpot22Button.setFont(new Font("Segoe UI", Font.PLAIN, 64));
		GridBagConstraints gbc_gameSpot22Button = new GridBagConstraints();
		gbc_gameSpot22Button.insets = new Insets(0, 0, 0, 5);
		gbc_gameSpot22Button.gridx = 3;
		gbc_gameSpot22Button.gridy = 2;
		gameSpotPane.add(gameSpot22Button, gbc_gameSpot22Button);

		gameStatisticPane = new JPanel();
		gameStatisticPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticPane
				.setBorder(new TitledBorder(null, "Statistics:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticPane = new GridBagConstraints();
		gbc_gameStatisticPane.gridheight = 4;
		gbc_gameStatisticPane.insets = new Insets(0, 0, 5, 0);
		gbc_gameStatisticPane.fill = GridBagConstraints.BOTH;
		gbc_gameStatisticPane.gridx = 1;
		gbc_gameStatisticPane.gridy = 0;
		contentPane.add(gameStatisticPane, gbc_gameStatisticPane);
		GridBagLayout gbl_gameStatisticPane = new GridBagLayout();
		gbl_gameStatisticPane.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_gameStatisticPane.rowHeights = new int[] { 0, 0, 0 };
		gbl_gameStatisticPane.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_gameStatisticPane.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gameStatisticPane.setLayout(gbl_gameStatisticPane);
		
		gameStatisticData1Pane = new JPanel();
		gameStatisticData1Pane.setBorder(new TitledBorder(null, "Human:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		gameStatisticData1Pane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData1Pane = new GridBagConstraints();
		gbc_gameStatisticData1Pane.insets = new Insets(0, 0, 5, 5);
		gbc_gameStatisticData1Pane.fill = GridBagConstraints.BOTH;
		gbc_gameStatisticData1Pane.gridx = 1;
		gbc_gameStatisticData1Pane.gridy = 0;
		gameStatisticPane.add(gameStatisticData1Pane, gbc_gameStatisticData1Pane);
		GridBagLayout gbl_gameStatisticData1Pane = new GridBagLayout();
		gbl_gameStatisticData1Pane.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_gameStatisticData1Pane.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_gameStatisticData1Pane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_gameStatisticData1Pane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gameStatisticData1Pane.setLayout(gbl_gameStatisticData1Pane);

		gameStatisticData1WinHintPane = new JPanel();
		gameStatisticData1WinHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData1WinHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData1WinHintPane
				.setBorder(new TitledBorder(null, "Win Count:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData1WinHintPane = new GridBagConstraints();
		gbc_gameStatisticData1WinHintPane.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1WinHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData1WinHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData1WinHintPane.gridx = 1;
		gbc_gameStatisticData1WinHintPane.gridy = 0;
		gameStatisticData1Pane.add(gameStatisticData1WinHintPane, gbc_gameStatisticData1WinHintPane);
		GridBagLayout gbl_gameStatisticData1WinHintPane = new GridBagLayout();
		gbl_gameStatisticData1WinHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData1WinHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData1WinHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData1WinHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData1WinHintPane.setLayout(gbl_gameStatisticData1WinHintPane);

		gameStatisticData1WinValueLabel = new JLabel("N/A");
		gameStatisticData1WinValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData1WinValueLabel = new GridBagConstraints();
		gbc_gameStatisticData1WinValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1WinValueLabel.gridx = 1;
		gbc_gameStatisticData1WinValueLabel.gridy = 0;
		gameStatisticData1WinHintPane.add(gameStatisticData1WinValueLabel, gbc_gameStatisticData1WinValueLabel);

		gameStatisticData1WinPercentHintPane = new JPanel();
		gameStatisticData1WinPercentHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData1WinPercentHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData1WinPercentHintPane
				.setBorder(new TitledBorder(null, "Win Percent:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData1WinPercentHintPane = new GridBagConstraints();
		gbc_gameStatisticData1WinPercentHintPane.anchor = GridBagConstraints.WEST;
		gbc_gameStatisticData1WinPercentHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData1WinPercentHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData1WinPercentHintPane.gridx = 2;
		gbc_gameStatisticData1WinPercentHintPane.gridy = 0;
		gameStatisticData1Pane.add(gameStatisticData1WinPercentHintPane, gbc_gameStatisticData1WinPercentHintPane);
		GridBagLayout gbl_gameStatisticData1WinPercentHintPane = new GridBagLayout();
		gbl_gameStatisticData1WinPercentHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData1WinPercentHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData1WinPercentHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData1WinPercentHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData1WinPercentHintPane.setLayout(gbl_gameStatisticData1WinPercentHintPane);

		gameStatisticData1WinPercentValueLabel = new JLabel("N/A");
		gameStatisticData1WinPercentValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData1WinPercentValueLabel = new GridBagConstraints();
		gbc_gameStatisticData1WinPercentValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1WinPercentValueLabel.gridx = 1;
		gbc_gameStatisticData1WinPercentValueLabel.gridy = 0;
		gameStatisticData1WinPercentHintPane.add(gameStatisticData1WinPercentValueLabel,
				gbc_gameStatisticData1WinPercentValueLabel);

		gameStatisticData1LossHintPane = new JPanel();
		gameStatisticData1LossHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData1LossHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData1LossHintPane
				.setBorder(new TitledBorder(null, "Loss Count:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData1LossHintPane = new GridBagConstraints();
		gbc_gameStatisticData1LossHintPane.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1LossHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData1LossHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData1LossHintPane.gridx = 1;
		gbc_gameStatisticData1LossHintPane.gridy = 1;
		gameStatisticData1Pane.add(gameStatisticData1LossHintPane, gbc_gameStatisticData1LossHintPane);
		GridBagLayout gbl_gameStatisticData1LossHintPane = new GridBagLayout();
		gbl_gameStatisticData1LossHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData1LossHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData1LossHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData1LossHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData1LossHintPane.setLayout(gbl_gameStatisticData1LossHintPane);

		gameStatisticData1LossValueLabel = new JLabel("N/A");
		gameStatisticData1LossValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData1LossValueLabel = new GridBagConstraints();
		gbc_gameStatisticData1LossValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1LossValueLabel.gridx = 1;
		gbc_gameStatisticData1LossValueLabel.gridy = 0;
		gameStatisticData1LossHintPane.add(gameStatisticData1LossValueLabel, gbc_gameStatisticData1LossValueLabel);

		gameStatisticData1LossPercentHintPane = new JPanel();
		gameStatisticData1LossPercentHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData1LossPercentHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData1LossPercentHintPane
				.setBorder(new TitledBorder(null, "Loss Percent:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData1LossPercentHintPane = new GridBagConstraints();
		gbc_gameStatisticData1LossPercentHintPane.anchor = GridBagConstraints.WEST;
		gbc_gameStatisticData1LossPercentHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData1LossPercentHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData1LossPercentHintPane.gridx = 2;
		gbc_gameStatisticData1LossPercentHintPane.gridy = 1;
		gameStatisticData1Pane.add(gameStatisticData1LossPercentHintPane, gbc_gameStatisticData1LossPercentHintPane);
		GridBagLayout gbl_gameStatisticData1LossPercentHintPane = new GridBagLayout();
		gbl_gameStatisticData1LossPercentHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData1LossPercentHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData1LossPercentHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData1LossPercentHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData1LossPercentHintPane.setLayout(gbl_gameStatisticData1LossPercentHintPane);

		gameStatisticData1LossPercentValueLabel = new JLabel("N/A");
		gameStatisticData1LossPercentValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData1LossPercentValueLabel = new GridBagConstraints();
		gbc_gameStatisticData1LossPercentValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1LossPercentValueLabel.gridx = 1;
		gbc_gameStatisticData1LossPercentValueLabel.gridy = 0;
		gameStatisticData1LossPercentHintPane.add(gameStatisticData1LossPercentValueLabel,
				gbc_gameStatisticData1LossPercentValueLabel);

		gameStatisticData1TieHintPane = new JPanel();
		gameStatisticData1TieHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData1TieHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData1TieHintPane
				.setBorder(new TitledBorder(null, "Tie Count:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData1TieHintPane = new GridBagConstraints();
		gbc_gameStatisticData1TieHintPane.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1TieHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData1TieHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData1TieHintPane.gridx = 1;
		gbc_gameStatisticData1TieHintPane.gridy = 2;
		gameStatisticData1Pane.add(gameStatisticData1TieHintPane, gbc_gameStatisticData1TieHintPane);
		GridBagLayout gbl_gameStatisticData1TieHintPane = new GridBagLayout();
		gbl_gameStatisticData1TieHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData1TieHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData1TieHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData1TieHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData1TieHintPane.setLayout(gbl_gameStatisticData1TieHintPane);

		gameStatisticData1TieValueLabel = new JLabel("N/A");
		gameStatisticData1TieValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData1TieValueLabel = new GridBagConstraints();
		gbc_gameStatisticData1TieValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1TieValueLabel.gridx = 1;
		gbc_gameStatisticData1TieValueLabel.gridy = 0;
		gameStatisticData1TieHintPane.add(gameStatisticData1TieValueLabel, gbc_gameStatisticData1TieValueLabel);

		gameStatisticData1TiePercentHintPane = new JPanel();
		gameStatisticData1TiePercentHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData1TiePercentHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData1TiePercentHintPane
				.setBorder(new TitledBorder(null, "Tie Percent:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData1TiePercentHintPane = new GridBagConstraints();
		gbc_gameStatisticData1TiePercentHintPane.anchor = GridBagConstraints.WEST;
		gbc_gameStatisticData1TiePercentHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData1TiePercentHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData1TiePercentHintPane.gridx = 2;
		gbc_gameStatisticData1TiePercentHintPane.gridy = 2;
		gameStatisticData1Pane.add(gameStatisticData1TiePercentHintPane, gbc_gameStatisticData1TiePercentHintPane);
		GridBagLayout gbl_gameStatisticData1TiePercentHintPane = new GridBagLayout();
		gbl_gameStatisticData1TiePercentHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData1TiePercentHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData1TiePercentHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData1TiePercentHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData1TiePercentHintPane.setLayout(gbl_gameStatisticData1TiePercentHintPane);

		gameStatisticData1TiePercentValueLabel = new JLabel("N/A");
		gameStatisticData1TiePercentValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData1TiePercentValueLabel = new GridBagConstraints();
		gbc_gameStatisticData1TiePercentValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1TiePercentValueLabel.gridx = 1;
		gbc_gameStatisticData1TiePercentValueLabel.gridy = 0;
		gameStatisticData1TiePercentHintPane.add(gameStatisticData1TiePercentValueLabel,
				gbc_gameStatisticData1TiePercentValueLabel);

		gameStatisticData1RoundHintPane = new JPanel();
		gameStatisticData1RoundHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData1RoundHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData1RoundHintPane
				.setBorder(new TitledBorder(null, "Round Count:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData1RoundHintPane = new GridBagConstraints();
		gbc_gameStatisticData1RoundHintPane.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1RoundHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData1RoundHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData1RoundHintPane.gridx = 1;
		gbc_gameStatisticData1RoundHintPane.gridy = 3;
		gameStatisticData1Pane.add(gameStatisticData1RoundHintPane, gbc_gameStatisticData1RoundHintPane);
		GridBagLayout gbl_gameStatisticData1RoundHintPane = new GridBagLayout();
		gbl_gameStatisticData1RoundHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData1RoundHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData1RoundHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData1RoundHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData1RoundHintPane.setLayout(gbl_gameStatisticData1RoundHintPane);

		gameStatisticData1RoundValueLabel = new JLabel("N/A");
		gameStatisticData1RoundValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData1RoundValueLabel = new GridBagConstraints();
		gbc_gameStatisticData1RoundValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData1RoundValueLabel.gridx = 1;
		gbc_gameStatisticData1RoundValueLabel.gridy = 0;
		gameStatisticData1RoundHintPane.add(gameStatisticData1RoundValueLabel, gbc_gameStatisticData1RoundValueLabel);

		gameStatisticData2Pane = new JPanel();
		gameStatisticData2Pane
				.setBorder(new TitledBorder(null, "Computer:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		gameStatisticData2Pane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData2Pane = new GridBagConstraints();
		gbc_gameStatisticData2Pane.insets = new Insets(0, 0, 5, 5);
		gbc_gameStatisticData2Pane.fill = GridBagConstraints.BOTH;
		gbc_gameStatisticData2Pane.gridx = 1;
		gbc_gameStatisticData2Pane.gridy = 1;
		gameStatisticPane.add(gameStatisticData2Pane, gbc_gameStatisticData2Pane);
		GridBagLayout gbl_gameStatisticData2Pane = new GridBagLayout();
		gbl_gameStatisticData2Pane.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_gameStatisticData2Pane.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_gameStatisticData2Pane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_gameStatisticData2Pane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gameStatisticData2Pane.setLayout(gbl_gameStatisticData2Pane);

		gameStatisticData2WinHintPane = new JPanel();
		gameStatisticData2WinHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData2WinHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData2WinHintPane
				.setBorder(new TitledBorder(null, "Win Count:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData2WinHintPane = new GridBagConstraints();
		gbc_gameStatisticData2WinHintPane.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2WinHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData2WinHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData2WinHintPane.gridx = 1;
		gbc_gameStatisticData2WinHintPane.gridy = 0;
		gameStatisticData2Pane.add(gameStatisticData2WinHintPane, gbc_gameStatisticData2WinHintPane);
		GridBagLayout gbl_gameStatisticData2WinHintPane = new GridBagLayout();
		gbl_gameStatisticData2WinHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData2WinHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData2WinHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData2WinHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData2WinHintPane.setLayout(gbl_gameStatisticData2WinHintPane);

		gameStatisticData2WinValueLabel = new JLabel("N/A");
		gameStatisticData2WinValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData2WinValueLabel = new GridBagConstraints();
		gbc_gameStatisticData2WinValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2WinValueLabel.gridx = 1;
		gbc_gameStatisticData2WinValueLabel.gridy = 0;
		gameStatisticData2WinHintPane.add(gameStatisticData2WinValueLabel, gbc_gameStatisticData2WinValueLabel);

		gameStatisticData2WinPercentHintPane = new JPanel();
		gameStatisticData2WinPercentHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData2WinPercentHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData2WinPercentHintPane
				.setBorder(new TitledBorder(null, "Win Percent:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData2WinPercentHintPane = new GridBagConstraints();
		gbc_gameStatisticData2WinPercentHintPane.anchor = GridBagConstraints.WEST;
		gbc_gameStatisticData2WinPercentHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData2WinPercentHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData2WinPercentHintPane.gridx = 2;
		gbc_gameStatisticData2WinPercentHintPane.gridy = 0;
		gameStatisticData2Pane.add(gameStatisticData2WinPercentHintPane, gbc_gameStatisticData2WinPercentHintPane);
		GridBagLayout gbl_gameStatisticData2WinPercentHintPane = new GridBagLayout();
		gbl_gameStatisticData2WinPercentHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData2WinPercentHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData2WinPercentHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData2WinPercentHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData2WinPercentHintPane.setLayout(gbl_gameStatisticData2WinPercentHintPane);

		gameStatisticData2WinPercentValueLabel = new JLabel("N/A");
		gameStatisticData2WinPercentValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData2WinPercentValueLabel = new GridBagConstraints();
		gbc_gameStatisticData2WinPercentValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2WinPercentValueLabel.gridx = 1;
		gbc_gameStatisticData2WinPercentValueLabel.gridy = 0;
		gameStatisticData2WinPercentHintPane.add(gameStatisticData2WinPercentValueLabel,
				gbc_gameStatisticData2WinPercentValueLabel);

		gameStatisticData2LossHintPane = new JPanel();
		gameStatisticData2LossHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData2LossHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData2LossHintPane
				.setBorder(new TitledBorder(null, "Loss Count:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData2LossHintPane = new GridBagConstraints();
		gbc_gameStatisticData2LossHintPane.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2LossHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData2LossHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData2LossHintPane.gridx = 1;
		gbc_gameStatisticData2LossHintPane.gridy = 1;
		gameStatisticData2Pane.add(gameStatisticData2LossHintPane, gbc_gameStatisticData2LossHintPane);
		GridBagLayout gbl_gameStatisticData2LossHintPane = new GridBagLayout();
		gbl_gameStatisticData2LossHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData2LossHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData2LossHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData2LossHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData2LossHintPane.setLayout(gbl_gameStatisticData2LossHintPane);

		gameStatisticData2LossValueLabel = new JLabel("N/A");
		gameStatisticData2LossValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData2LossValueLabel = new GridBagConstraints();
		gbc_gameStatisticData2LossValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2LossValueLabel.gridx = 1;
		gbc_gameStatisticData2LossValueLabel.gridy = 0;
		gameStatisticData2LossHintPane.add(gameStatisticData2LossValueLabel, gbc_gameStatisticData2LossValueLabel);

		gameStatisticData2LossPercentHintPane = new JPanel();
		gameStatisticData2LossPercentHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData2LossPercentHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData2LossPercentHintPane
				.setBorder(new TitledBorder(null, "Loss Percent:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData2LossPercentHintPane = new GridBagConstraints();
		gbc_gameStatisticData2LossPercentHintPane.anchor = GridBagConstraints.WEST;
		gbc_gameStatisticData2LossPercentHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData2LossPercentHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData2LossPercentHintPane.gridx = 2;
		gbc_gameStatisticData2LossPercentHintPane.gridy = 1;
		gameStatisticData2Pane.add(gameStatisticData2LossPercentHintPane, gbc_gameStatisticData2LossPercentHintPane);
		GridBagLayout gbl_gameStatisticData2LossPercentHintPane = new GridBagLayout();
		gbl_gameStatisticData2LossPercentHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData2LossPercentHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData2LossPercentHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData2LossPercentHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData2LossPercentHintPane.setLayout(gbl_gameStatisticData2LossPercentHintPane);

		gameStatisticData2LossPercentValueLabel = new JLabel("N/A");
		gameStatisticData2LossPercentValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData2LossPercentValueLabel = new GridBagConstraints();
		gbc_gameStatisticData2LossPercentValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2LossPercentValueLabel.gridx = 1;
		gbc_gameStatisticData2LossPercentValueLabel.gridy = 0;
		gameStatisticData2LossPercentHintPane.add(gameStatisticData2LossPercentValueLabel,
				gbc_gameStatisticData2LossPercentValueLabel);

		gameStatisticData2TieHintPane = new JPanel();
		gameStatisticData2TieHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData2TieHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData2TieHintPane
				.setBorder(new TitledBorder(null, "Tie Count:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData2TieHintPane = new GridBagConstraints();
		gbc_gameStatisticData2TieHintPane.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2TieHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData2TieHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData2TieHintPane.gridx = 1;
		gbc_gameStatisticData2TieHintPane.gridy = 2;
		gameStatisticData2Pane.add(gameStatisticData2TieHintPane, gbc_gameStatisticData2TieHintPane);
		GridBagLayout gbl_gameStatisticData2TieHintPane = new GridBagLayout();
		gbl_gameStatisticData2TieHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData2TieHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData2TieHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData2TieHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData2TieHintPane.setLayout(gbl_gameStatisticData2TieHintPane);

		gameStatisticData2TieValueLabel = new JLabel("N/A");
		gameStatisticData2TieValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData2TieValueLabel = new GridBagConstraints();
		gbc_gameStatisticData2TieValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2TieValueLabel.gridx = 1;
		gbc_gameStatisticData2TieValueLabel.gridy = 0;
		gameStatisticData2TieHintPane.add(gameStatisticData2TieValueLabel, gbc_gameStatisticData2TieValueLabel);

		gameStatisticData2TiePercentHintPane = new JPanel();
		gameStatisticData2TiePercentHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData2TiePercentHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData2TiePercentHintPane
				.setBorder(new TitledBorder(null, "Tie Percent:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData2TiePercentHintPane = new GridBagConstraints();
		gbc_gameStatisticData2TiePercentHintPane.anchor = GridBagConstraints.WEST;
		gbc_gameStatisticData2TiePercentHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData2TiePercentHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData2TiePercentHintPane.gridx = 2;
		gbc_gameStatisticData2TiePercentHintPane.gridy = 2;
		gameStatisticData2Pane.add(gameStatisticData2TiePercentHintPane, gbc_gameStatisticData2TiePercentHintPane);
		GridBagLayout gbl_gameStatisticData2TiePercentHintPane = new GridBagLayout();
		gbl_gameStatisticData2TiePercentHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData2TiePercentHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData2TiePercentHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData2TiePercentHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData2TiePercentHintPane.setLayout(gbl_gameStatisticData2TiePercentHintPane);

		gameStatisticData2TiePercentValueLabel = new JLabel("N/A");
		gameStatisticData2TiePercentValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData2TiePercentValueLabel = new GridBagConstraints();
		gbc_gameStatisticData2TiePercentValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2TiePercentValueLabel.gridx = 1;
		gbc_gameStatisticData2TiePercentValueLabel.gridy = 0;
		gameStatisticData2TiePercentHintPane.add(gameStatisticData2TiePercentValueLabel,
				gbc_gameStatisticData2TiePercentValueLabel);

		gameStatisticData2RoundHintPane = new JPanel();
		gameStatisticData2RoundHintPane.setPreferredSize(new Dimension(140, 50));
		gameStatisticData2RoundHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStatisticData2RoundHintPane
				.setBorder(new TitledBorder(null, "Round Count:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStatisticData2RoundHintPane = new GridBagConstraints();
		gbc_gameStatisticData2RoundHintPane.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2RoundHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_gameStatisticData2RoundHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStatisticData2RoundHintPane.gridx = 1;
		gbc_gameStatisticData2RoundHintPane.gridy = 3;
		gameStatisticData2Pane.add(gameStatisticData2RoundHintPane, gbc_gameStatisticData2RoundHintPane);
		GridBagLayout gbl_gameStatisticData2RoundHintPane = new GridBagLayout();
		gbl_gameStatisticData2RoundHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStatisticData2RoundHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStatisticData2RoundHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStatisticData2RoundHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStatisticData2RoundHintPane.setLayout(gbl_gameStatisticData2RoundHintPane);

		gameStatisticData2RoundValueLabel = new JLabel("N/A");
		gameStatisticData2RoundValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStatisticData2RoundValueLabel = new GridBagConstraints();
		gbc_gameStatisticData2RoundValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStatisticData2RoundValueLabel.gridx = 1;
		gbc_gameStatisticData2RoundValueLabel.gridy = 0;
		gameStatisticData2RoundHintPane.add(gameStatisticData2RoundValueLabel, gbc_gameStatisticData2RoundValueLabel);

		gameControlPane = new JPanel();
		gameControlPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameControlPane = new GridBagConstraints();
		gbc_gameControlPane.insets = new Insets(0, 0, 5, 5);
		gbc_gameControlPane.fill = GridBagConstraints.BOTH;
		gbc_gameControlPane.gridx = 0;
		gbc_gameControlPane.gridy = 1;
		contentPane.add(gameControlPane, gbc_gameControlPane);
		GridBagLayout gbl_gameControlPane = new GridBagLayout();
		gbl_gameControlPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_gameControlPane.rowHeights = new int[] { 0, 0 };
		gbl_gameControlPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_gameControlPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameControlPane.setLayout(gbl_gameControlPane);

		gameStartMatchButton = new JButton("Start Match");
		gameStartMatchButton.setPreferredSize(new Dimension(100, 30));
		gameStartMatchButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStartMatchButton = new GridBagConstraints();
		gbc_gameStartMatchButton.fill = GridBagConstraints.BOTH;
		gbc_gameStartMatchButton.insets = new Insets(0, 0, 0, 5);
		gbc_gameStartMatchButton.gridx = 1;
		gbc_gameStartMatchButton.gridy = 0;
		gameControlPane.add(gameStartMatchButton, gbc_gameStartMatchButton);

		gameEndMatchButton = new JButton("End Match");
		gameEndMatchButton.setEnabled(false);
		gameEndMatchButton.setPreferredSize(new Dimension(100, 30));
		gameEndMatchButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameEndMatchButton = new GridBagConstraints();
		gbc_gameEndMatchButton.fill = GridBagConstraints.BOTH;
		gbc_gameEndMatchButton.insets = new Insets(0, 0, 0, 5);
		gbc_gameEndMatchButton.gridx = 2;
		gbc_gameEndMatchButton.gridy = 0;
		gameControlPane.add(gameEndMatchButton, gbc_gameEndMatchButton);

		gameNewRoundButton = new JButton("New Round");
		gameNewRoundButton.setEnabled(false);
		gameNewRoundButton.setPreferredSize(new Dimension(100, 30));
		gameNewRoundButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameNewRoundButton = new GridBagConstraints();
		gbc_gameNewRoundButton.fill = GridBagConstraints.BOTH;
		gbc_gameNewRoundButton.insets = new Insets(0, 0, 0, 5);
		gbc_gameNewRoundButton.gridx = 3;
		gbc_gameNewRoundButton.gridy = 0;
		gameControlPane.add(gameNewRoundButton, gbc_gameNewRoundButton);

		gameSettingPane = new JPanel();
		gameSettingPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameSettingPane.setBorder(
				new TitledBorder(null, "Game Settings:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameSettingPane = new GridBagConstraints();
		gbc_gameSettingPane.insets = new Insets(0, 0, 5, 5);
		gbc_gameSettingPane.fill = GridBagConstraints.BOTH;
		gbc_gameSettingPane.gridx = 0;
		gbc_gameSettingPane.gridy = 2;
		contentPane.add(gameSettingPane, gbc_gameSettingPane);
		GridBagLayout gbl_gameSettingPane = new GridBagLayout();
		gbl_gameSettingPane.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_gameSettingPane.rowHeights = new int[] { 0, 0, 0 };
		gbl_gameSettingPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_gameSettingPane.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gameSettingPane.setLayout(gbl_gameSettingPane);

		gameModeHintPane = new JPanel();
		gameModeHintPane.setPreferredSize(new Dimension(140, 50));
		gameModeHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameModeHintPane.setBorder(new TitledBorder(null, "Mode:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameModeHintPane = new GridBagConstraints();
		gbc_gameModeHintPane.anchor = GridBagConstraints.EAST;
		gbc_gameModeHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_gameModeHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameModeHintPane.gridx = 1;
		gbc_gameModeHintPane.gridy = 0;
		gameSettingPane.add(gameModeHintPane, gbc_gameModeHintPane);
		GridBagLayout gbl_gameModeHintPane = new GridBagLayout();
		gbl_gameModeHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameModeHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameModeHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameModeHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameModeHintPane.setLayout(gbl_gameModeHintPane);

		gameModeValueLabel = new JLabel("N/A");
		gameModeValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameModeValueLabel = new GridBagConstraints();
		gbc_gameModeValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameModeValueLabel.gridx = 1;
		gbc_gameModeValueLabel.gridy = 0;
		gameModeHintPane.add(gameModeValueLabel, gbc_gameModeValueLabel);

		gameDifficultyHintPane = new JPanel();
		gameDifficultyHintPane.setPreferredSize(new Dimension(140, 50));
		gameDifficultyHintPane
				.setBorder(new TitledBorder(null, "Difficulty:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameDifficultyHintPane = new GridBagConstraints();
		gbc_gameDifficultyHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_gameDifficultyHintPane.anchor = GridBagConstraints.WEST;
		gbc_gameDifficultyHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameDifficultyHintPane.gridx = 2;
		gbc_gameDifficultyHintPane.gridy = 0;
		gameSettingPane.add(gameDifficultyHintPane, gbc_gameDifficultyHintPane);
		GridBagLayout gbl_gameDifficultyHintPane = new GridBagLayout();
		gbl_gameDifficultyHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameDifficultyHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameDifficultyHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameDifficultyHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameDifficultyHintPane.setLayout(gbl_gameDifficultyHintPane);

		gameDifficultyValueLabel = new JLabel("N/A");
		gameDifficultyValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameDifficultyValueLabel = new GridBagConstraints();
		gbc_gameDifficultyValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameDifficultyValueLabel.gridx = 1;
		gbc_gameDifficultyValueLabel.gridy = 0;
		gameDifficultyHintPane.add(gameDifficultyValueLabel, gbc_gameDifficultyValueLabel);

		gameStartHintPane = new JPanel();
		gameStartHintPane.setPreferredSize(new Dimension(140, 50));
		gameStartHintPane.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		gameStartHintPane
				.setBorder(new TitledBorder(null, "Starting:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameStartHintPane = new GridBagConstraints();
		gbc_gameStartHintPane.anchor = GridBagConstraints.EAST;
		gbc_gameStartHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_gameStartHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameStartHintPane.gridx = 1;
		gbc_gameStartHintPane.gridy = 1;
		gameSettingPane.add(gameStartHintPane, gbc_gameStartHintPane);
		GridBagLayout gbl_gameStartHintPane = new GridBagLayout();
		gbl_gameStartHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameStartHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameStartHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameStartHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameStartHintPane.setLayout(gbl_gameStartHintPane);

		gameStartValueLabel = new JLabel("N/A");
		gameStartValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameStartValueLabel = new GridBagConstraints();
		gbc_gameStartValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameStartValueLabel.gridx = 1;
		gbc_gameStartValueLabel.gridy = 0;
		gameStartHintPane.add(gameStartValueLabel, gbc_gameStartValueLabel);

		gameSymbolHintPane = new JPanel();
		gameSymbolHintPane.setPreferredSize(new Dimension(140, 50));
		gameSymbolHintPane
				.setBorder(new TitledBorder(null, "Symbol:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_gameSymbolHintPane = new GridBagConstraints();
		gbc_gameSymbolHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_gameSymbolHintPane.anchor = GridBagConstraints.WEST;
		gbc_gameSymbolHintPane.fill = GridBagConstraints.VERTICAL;
		gbc_gameSymbolHintPane.gridx = 2;
		gbc_gameSymbolHintPane.gridy = 1;
		gameSettingPane.add(gameSymbolHintPane, gbc_gameSymbolHintPane);
		GridBagLayout gbl_gameSymbolHintPane = new GridBagLayout();
		gbl_gameSymbolHintPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_gameSymbolHintPane.rowHeights = new int[] { 0, 0 };
		gbl_gameSymbolHintPane.columnWeights = new double[] { 1.0, 0.0, Double.MIN_VALUE };
		gbl_gameSymbolHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gameSymbolHintPane.setLayout(gbl_gameSymbolHintPane);

		gameSymbolValueLabel = new JLabel("N/A");
		gameSymbolValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints gbc_gameSymbolValueLabel = new GridBagConstraints();
		gbc_gameSymbolValueLabel.anchor = GridBagConstraints.EAST;
		gbc_gameSymbolValueLabel.gridx = 1;
		gbc_gameSymbolValueLabel.gridy = 0;
		gameSymbolHintPane.add(gameSymbolValueLabel, gbc_gameSymbolValueLabel);
	}

}
