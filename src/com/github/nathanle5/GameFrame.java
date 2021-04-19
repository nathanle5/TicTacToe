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
		setResizable(false);
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 415);

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
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		gameSpotPane = new JPanel();
		GridBagConstraints gbc_gameSpotPane = new GridBagConstraints();
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
	}

}
