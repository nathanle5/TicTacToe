package com.github.nathanle5;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
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
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 7952751144657907378L;

	private Board board;

	private char[][] spotSymbols;
	private JMenuItem[][] spotMenuItems;
	private JButton[][] spotButtons;

	private GameMode currentGameMode;
	private GameSymbol currentGameSymbol;
	private GameStart currentGameStart;
	private GameDifficulty currentGameDifficulty;

	private ButtonGroup gameModeRadioItems;
	private ButtonGroup gameSymbolRadioItems;
	private ButtonGroup gameStartRadioItems;
	private ButtonGroup gameDifficultyRadioItems;
	private ButtonGroup windowStyleRadioItems;
	private ButtonGroup windowNumberRadioItems;

	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem fileExitMenuItem;
	private JMenu dataMenu;
	private JMenuItem dataViewPvpStatMenuItem;
	private JMenuItem dataViewPvcStatMenuItem;
	private JSeparator dataSeparator0;
	private JMenuItem dataImportPvcStatMenuItem;
	private JMenuItem dataExportPvcStatMenuItem;
	private JSeparator dataSeparator1;
	private JMenuItem dataResetPvcStatMenuItem;
	private JMenu gameMenu;
	private JMenuItem gameStartMatchMenuItem;
	private JMenuItem gameEndMatchMenuItem;
	private JSeparator gameSeparator0;
	private JMenu gameSpotMenuItem;
	private JMenuItem gameSpot00MenuItem;
	private JMenuItem gameSpot01MenuItem;
	private JMenuItem gameSpot02MenuItem;
	private JSeparator gameSpotSeparator0;
	private JMenuItem gameSpot10MenuItem;
	private JMenuItem gameSpot11MenuItem;
	private JMenuItem gameSpot12MenuItem;
	private JSeparator gameSpotSeparator1;
	private JMenuItem gameSpot20MenuItem;
	private JMenuItem gameSpot21MenuItem;
	private JMenuItem gameSpot22MenuItem;
	private JSeparator gameSpotSeparator2;
	private JMenu gameSpotNumberMenu;
	private JRadioButtonMenuItem gameSpotNumberShowRadioItem;
	private JRadioButtonMenuItem gameSpotNumberHideRadioItem;
	private JMenuItem gameNewRoundMenuItem;
	private JSeparator gameSeparator1;
	private JMenu gameModeMenu;
	private JRadioButtonMenuItem gameModePvcRadioItem;
	private JRadioButtonMenuItem gameModePvpRadioItem;
	private JMenu gameSymbolMenu;
	private JRadioButtonMenuItem gameSymbolXsRadioItem;
	private JRadioButtonMenuItem gameSymbolOsRadioItem;
	private JMenu gameStartingMenu;
	private JRadioButtonMenuItem gameStartRandomRadioItem;
	private JRadioButtonMenuItem gameStartPlayerRadioItem;
	private JRadioButtonMenuItem gameStartComputerRadioItem;
	private JMenu gameDifficultyMenu;
	private JRadioButtonMenuItem gameDifficultyRandomRadioItem;
	private JRadioButtonMenuItem gameDifficultyAimlessRadioItem;
	private JRadioButtonMenuItem gameDifficultyEasyRadioItem;
	private JRadioButtonMenuItem gameDifficultyNormalRadioItem;
	private JRadioButtonMenuItem gameDifficultyHardRadioItem;
	private JRadioButtonMenuItem gameDifficultyInsaneRadioItem;
	private JMenu windowMenu;
	private JMenu windowStyleMenu;
	private JMenuItem windowStyleSystemMenuItem;
	private JSeparator windowStyleSeparator;
	private JRadioButtonMenuItem windowStyle01RadioItem;
	private JRadioButtonMenuItem windowStyle02RadioItem;
	private JRadioButtonMenuItem windowStyle03RadioItem;
	private JRadioButtonMenuItem windowStyle04RadioItem;
	private JRadioButtonMenuItem windowStyle05RadioItem;
	private JMenu helpMenu;
	private JMenuItem helpAboutMenuItem;

	private JPanel contentPane;
	private JPanel spotPane;
	private JButton spot00Button;
	private JButton spot01Button;
	private JButton spot02Button;
	private JButton spot10Button;
	private JButton spot11Button;
	private JButton spot12Button;
	private JButton spot20Button;
	private JButton spot21Button;
	private JButton spot22Button;
	private JPanel gamePane;
	private JButton gameStartMatchButton;
	private JButton gameEndMatchButton;
	private JButton gameNewRoundButton;
	private JPanel optionPane;
	private JPanel optionModeHintPane;
	private JLabel optionModeValueLabel;
	private JPanel optionSymbolHintPane;
	private JLabel optionSymbolValueLabel;
	private JPanel optionStartingHintPane;
	private JLabel optionStartingValueLabel;
	private JPanel optionDifficultyHintPane;
	private JLabel optionDifficultyValueLabel;
	private JPanel dataPane;
	private JPanel dataWinCountHintPane;
	private JLabel dataWinCountValueLabel;
	private JPanel dataWinPercentHintPane;
	private JLabel dataWinPercentValueLabel;
	private JPanel dataTieCountHintPane;
	private JLabel dataTieCountValueLabel;
	private JPanel dataTiePercentHintPane;
	private JLabel dataTiePercentValueLabel;
	private JPanel dataLossCountHintPane;
	private JLabel dataLossCountValueLabel;
	private JPanel dataLossPercentHintPane;
	private JLabel dataLossPercentValueLabel;
	private JPanel dataMatchCountHintPane;
	private JLabel dataMatchCountValueLabel;

	/**
	 * Create the application.
	 */
	public GameFrame() {
		initialize();
		complete();
		refresh();
	}

	private void updateDataCountValueText(JLabel label, long maxValue) {
		label.setText(String.format("%,d", maxValue));
	}

	private void updateDataPercentValueText(JLabel label, double value) {
		label.setText(String.format("%.2f", value));
	}

	private void findCurrentLookAndFeel(String name) {
		for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			// if (UIManager.getSystemLookAndFeelClassName().equals(info.getClassName())) {
			if (name.equals(info.getName())) {
				Vector<AbstractButton> abv = new Vector<AbstractButton>(windowStyleRadioItems.getButtonCount());
				Iterator<AbstractButton> abi = windowStyleRadioItems.getElements().asIterator();
				while (abi.hasNext()) {
					abv.add(abi.next());
				}
				for (AbstractButton ab : abv) {
					if (info.getName().equals(ab.getText())) {
						ab.setSelected(true);
						break;
					}
				}
				break;
			}
		}
	}

	private void changeGameMode(GameMode gm) {
		currentGameMode = gm;
		refresh();
	}

	private void changeGameSymbol(GameSymbol gs) {
		currentGameSymbol = gs;
		refresh();
	}

	private void changeGameStart(GameStart gs) {
		currentGameStart = gs;
		refresh();
	}

	private void changeGameDifficulty(GameDifficulty gd) {
		currentGameDifficulty = gd;
		refresh();
	}

	/**
	 * Obtain the RadioButton's text.
	 * 
	 * @param bg The ButtonGroup to loop through.
	 * @return The RadioButton's text; otherwise, N/A.
	 */
	private String getSelectedRadioButtonText(ButtonGroup bg) {
		Enumeration<AbstractButton> abs = bg.getElements();
		while (abs.hasMoreElements()) {
			AbstractButton ab = abs.nextElement();
			if (ab.isSelected()) {
				return ab.getText();
			}
		}
		return "N/A";
	}

	/**
	 * Updates the user interface text for settings.
	 */
	private void refresh() {
		optionModeValueLabel.setText(getSelectedRadioButtonText(gameModeRadioItems));
		optionSymbolValueLabel.setText(getSelectedRadioButtonText(gameSymbolRadioItems));
		optionStartingValueLabel.setText(getSelectedRadioButtonText(gameStartRadioItems));
		optionDifficultyValueLabel.setText(getSelectedRadioButtonText(gameDifficultyRadioItems));
	}

	/**
	 * Complete any actions needed after creating the frame.
	 */
	private void complete() {
		gameModeRadioItems = new ButtonGroup();
		gameModeRadioItems.add(gameModePvcRadioItem);
		gameModeRadioItems.add(gameModePvpRadioItem);
		if (gameModePvcRadioItem.isSelected()) {
			currentGameMode = GameMode.PLAYER_VS_COMPUTER;
		} else {
			currentGameMode = GameMode.PLAYER_VS_PLAYER;
		}

		gameSymbolRadioItems = new ButtonGroup();
		gameSymbolRadioItems.add(gameSymbolXsRadioItem);
		gameSymbolRadioItems.add(gameSymbolOsRadioItem);
		if (gameSymbolXsRadioItem.isSelected()) {
			currentGameSymbol = GameSymbol.X;
		} else {
			currentGameSymbol = GameSymbol.O;
		}

		gameStartRadioItems = new ButtonGroup();
		gameStartRadioItems.add(gameStartRandomRadioItem);
		gameStartRadioItems.add(gameStartPlayerRadioItem);
		gameStartRadioItems.add(gameStartComputerRadioItem);
		if (gameStartRandomRadioItem.isSelected()) {
			currentGameStart = GameStart.RANDOM;
		} else if (gameStartPlayerRadioItem.isSelected()) {
			currentGameStart = GameStart.PLAYER;
		} else {
			currentGameStart = GameStart.COMPUTER;
		}

		gameDifficultyRadioItems = new ButtonGroup();
		gameDifficultyRadioItems.add(gameDifficultyRandomRadioItem);
		gameDifficultyRadioItems.add(gameDifficultyAimlessRadioItem);
		gameDifficultyRadioItems.add(gameDifficultyEasyRadioItem);
		gameDifficultyRadioItems.add(gameDifficultyNormalRadioItem);
		gameDifficultyRadioItems.add(gameDifficultyHardRadioItem);
		gameDifficultyRadioItems.add(gameDifficultyInsaneRadioItem);
		if (gameDifficultyRandomRadioItem.isSelected()) {
			currentGameDifficulty = GameDifficulty.RANDOM;
		} else if (gameDifficultyAimlessRadioItem.isSelected()) {
			currentGameDifficulty = GameDifficulty.AIMLESS;
		} else if (gameDifficultyEasyRadioItem.isSelected()) {
			currentGameDifficulty = GameDifficulty.EASY;
		} else if (gameDifficultyNormalRadioItem.isSelected()) {
			currentGameDifficulty = GameDifficulty.NORMAL;
		} else if (gameDifficultyHardRadioItem.isSelected()) {
			currentGameDifficulty = GameDifficulty.HARD;
		} else {
			currentGameDifficulty = GameDifficulty.INSANE;
		}

		windowStyleRadioItems = new ButtonGroup();
		windowStyleRadioItems.add(windowStyle01RadioItem);
		windowStyleRadioItems.add(windowStyle02RadioItem);
		windowStyleRadioItems.add(windowStyle03RadioItem);
		windowStyleRadioItems.add(windowStyle04RadioItem);
		windowStyleRadioItems.add(windowStyle05RadioItem);

		windowNumberRadioItems = new ButtonGroup();
		windowNumberRadioItems.add(gameSpotNumberShowRadioItem);
		windowNumberRadioItems.add(gameSpotNumberHideRadioItem);
	}

	/**
	 * Create the frame.
	 */
	private void initialize() {
		ArrayList<JMenuItem> mnms = new ArrayList<JMenuItem>(Board.MAX_SIZE);
		mnms.add(gameSpot00MenuItem);
		mnms.add(gameSpot01MenuItem);
		mnms.add(gameSpot02MenuItem);
		mnms.add(gameSpot10MenuItem);
		mnms.add(gameSpot11MenuItem);
		mnms.add(gameSpot12MenuItem);
		mnms.add(gameSpot20MenuItem);
		mnms.add(gameSpot21MenuItem);
		mnms.add(gameSpot22MenuItem);
		ArrayList<JButton> btns = new ArrayList<JButton>(Board.MAX_SIZE);
		btns.add(spot00Button);
		btns.add(spot01Button);
		btns.add(spot02Button);
		btns.add(spot10Button);
		btns.add(spot11Button);
		btns.add(spot12Button);
		btns.add(spot20Button);
		btns.add(spot21Button);
		btns.add(spot22Button);
		board = new Board(btns, mnms);

		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				findCurrentLookAndFeel(UIManager.getLookAndFeel().getName());
			}
		});
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

		dataViewPvpStatMenuItem = new JMenuItem("View PvP Stats...");
		dataViewPvpStatMenuItem.setMnemonic(KeyEvent.VK_P);
		dataMenu.add(dataViewPvpStatMenuItem);

		dataViewPvcStatMenuItem = new JMenuItem("View PvC Stats...");
		dataViewPvcStatMenuItem.setMnemonic(KeyEvent.VK_C);
		dataMenu.add(dataViewPvcStatMenuItem);

		dataSeparator0 = new JSeparator();
		dataMenu.add(dataSeparator0);

		dataImportPvcStatMenuItem = new JMenuItem("Import PvC Stats...");
		dataImportPvcStatMenuItem.setMnemonic(KeyEvent.VK_I);
		dataMenu.add(dataImportPvcStatMenuItem);

		dataExportPvcStatMenuItem = new JMenuItem("Export PvC Stats...");
		dataExportPvcStatMenuItem.setMnemonic(KeyEvent.VK_E);
		dataMenu.add(dataExportPvcStatMenuItem);

		dataSeparator1 = new JSeparator();
		dataMenu.add(dataSeparator1);

		dataResetPvcStatMenuItem = new JMenuItem("Reset PvC Stats...");
		dataResetPvcStatMenuItem.setMnemonic(KeyEvent.VK_R);
		dataMenu.add(dataResetPvcStatMenuItem);

		gameMenu = new JMenu("Game");
		gameMenu.setMnemonic(KeyEvent.VK_G);
		menuBar.add(gameMenu);

		gameStartMatchMenuItem = new JMenuItem("Start Match");
		gameStartMatchMenuItem.addActionListener(startMatchActionListener);
		gameStartMatchMenuItem.setMnemonic(KeyEvent.VK_S);
		gameMenu.add(gameStartMatchMenuItem);

		gameEndMatchMenuItem = new JMenuItem("End Match");
		gameEndMatchMenuItem.addActionListener(endMatchActionListener);
		gameEndMatchMenuItem.setEnabled(false);
		gameEndMatchMenuItem.setMnemonic(KeyEvent.VK_E);
		gameMenu.add(gameEndMatchMenuItem);

		gameSeparator0 = new JSeparator();
		gameMenu.add(gameSeparator0);

		gameSpotMenuItem = new JMenu("Spot");
		gameSpotMenuItem.setMnemonic(KeyEvent.VK_P);
		gameMenu.add(gameSpotMenuItem);

		gameSpot00MenuItem = new JMenuItem("7: ?");
		gameSpot00MenuItem.setEnabled(false);
		gameSpot00MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD7, 0));
		gameSpot00MenuItem.setMnemonic(KeyEvent.VK_7);
		gameSpotMenuItem.add(gameSpot00MenuItem);

		gameSpot01MenuItem = new JMenuItem("8: ?");
		gameSpot01MenuItem.setEnabled(false);
		gameSpot01MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD8, 0));
		gameSpot01MenuItem.setMnemonic(KeyEvent.VK_8);
		gameSpotMenuItem.add(gameSpot01MenuItem);

		gameSpot02MenuItem = new JMenuItem("9: ?");
		gameSpot02MenuItem.setEnabled(false);
		gameSpot02MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD9, 0));
		gameSpot02MenuItem.setMnemonic(KeyEvent.VK_9);
		gameSpotMenuItem.add(gameSpot02MenuItem);

		gameSpotSeparator0 = new JSeparator();
		gameSpotMenuItem.add(gameSpotSeparator0);

		gameSpot10MenuItem = new JMenuItem("4: ?");
		gameSpot10MenuItem.setEnabled(false);
		gameSpot10MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD4, 0));
		gameSpot10MenuItem.setMnemonic(KeyEvent.VK_4);
		gameSpotMenuItem.add(gameSpot10MenuItem);

		gameSpot11MenuItem = new JMenuItem("5: ?");
		gameSpot11MenuItem.setEnabled(false);
		gameSpot11MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD5, 0));
		gameSpot11MenuItem.setMnemonic(KeyEvent.VK_5);
		gameSpotMenuItem.add(gameSpot11MenuItem);

		gameSpot12MenuItem = new JMenuItem("6: ?");
		gameSpot12MenuItem.setEnabled(false);
		gameSpot12MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD6, 0));
		gameSpot12MenuItem.setMnemonic(KeyEvent.VK_6);
		gameSpotMenuItem.add(gameSpot12MenuItem);

		gameSpotSeparator1 = new JSeparator();
		gameSpotMenuItem.add(gameSpotSeparator1);

		gameSpot20MenuItem = new JMenuItem("1: ?");
		gameSpot20MenuItem.setEnabled(false);
		gameSpot20MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD1, 0));
		gameSpot20MenuItem.setMnemonic(KeyEvent.VK_1);
		gameSpotMenuItem.add(gameSpot20MenuItem);

		gameSpot21MenuItem = new JMenuItem("2: ?");
		gameSpot21MenuItem.setEnabled(false);
		gameSpot21MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD2, 0));
		gameSpot21MenuItem.setMnemonic(KeyEvent.VK_2);
		gameSpotMenuItem.add(gameSpot21MenuItem);

		gameSpot22MenuItem = new JMenuItem("3: ?");
		gameSpot22MenuItem.setEnabled(false);
		gameSpot22MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_NUMPAD3, 0));
		gameSpot22MenuItem.setMnemonic(KeyEvent.VK_3);
		gameSpotMenuItem.add(gameSpot22MenuItem);

		gameSpotSeparator2 = new JSeparator();
		gameSpotMenuItem.add(gameSpotSeparator2);

		gameSpotNumberMenu = new JMenu("Numbering");
		gameSpotNumberMenu.setMnemonic(KeyEvent.VK_N);
		gameSpotMenuItem.add(gameSpotNumberMenu);

		gameSpotNumberShowRadioItem = new JRadioButtonMenuItem("Show");
		gameSpotNumberShowRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Show number "1: ?" etc. in menuitems and buttons.
			}
		});
		gameSpotNumberShowRadioItem.setMnemonic(KeyEvent.VK_S);
		gameSpotNumberShowRadioItem.setSelected(true);
		gameSpotNumberMenu.add(gameSpotNumberShowRadioItem);

		gameSpotNumberHideRadioItem = new JRadioButtonMenuItem("Hide");
		gameSpotNumberHideRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Hide number "1: ?" etc. in menuitems and buttons.
			}
		});
		gameSpotNumberHideRadioItem.setMnemonic(KeyEvent.VK_H);
		gameSpotNumberMenu.add(gameSpotNumberHideRadioItem);

		gameNewRoundMenuItem = new JMenuItem("New Round");
		gameNewRoundMenuItem.addActionListener(newRoundActionListener);
		gameNewRoundMenuItem.setEnabled(false);
		gameNewRoundMenuItem.setMnemonic(KeyEvent.VK_N);
		gameMenu.add(gameNewRoundMenuItem);

		gameSeparator1 = new JSeparator();
		gameMenu.add(gameSeparator1);

		gameModeMenu = new JMenu("Mode");
		gameModeMenu.setMnemonic(KeyEvent.VK_M);
		gameMenu.add(gameModeMenu);

		gameModePvcRadioItem = new JRadioButtonMenuItem("Player vs. Computer (PvC)");
		gameModePvcRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameMode(GameMode.PLAYER_VS_COMPUTER);
			}
		});
		gameModePvcRadioItem.setMnemonic(KeyEvent.VK_C);
		gameModePvcRadioItem.setSelected(true);
		gameModeMenu.add(gameModePvcRadioItem);

		gameModePvpRadioItem = new JRadioButtonMenuItem("Player vs. Player (PvP)");
		gameModePvpRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameMode(GameMode.PLAYER_VS_PLAYER);
			}
		});
		gameModePvpRadioItem.setMnemonic(KeyEvent.VK_P);
		gameModeMenu.add(gameModePvpRadioItem);

		gameSymbolMenu = new JMenu("Symbol");
		gameSymbolMenu.setMnemonic(KeyEvent.VK_Y);
		gameMenu.add(gameSymbolMenu);

		gameSymbolXsRadioItem = new JRadioButtonMenuItem("X");
		gameSymbolXsRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameSymbol(GameSymbol.X);
			}
		});
		gameSymbolXsRadioItem.setMnemonic(KeyEvent.VK_X);
		gameSymbolXsRadioItem.setSelected(true);
		gameSymbolMenu.add(gameSymbolXsRadioItem);

		gameSymbolOsRadioItem = new JRadioButtonMenuItem("O");
		gameSymbolOsRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameSymbol(GameSymbol.O);
			}
		});
		gameSymbolOsRadioItem.setMnemonic(KeyEvent.VK_O);
		gameSymbolMenu.add(gameSymbolOsRadioItem);

		gameStartingMenu = new JMenu("Starting");
		gameStartingMenu.setMnemonic(KeyEvent.VK_T);
		gameMenu.add(gameStartingMenu);

		gameStartRandomRadioItem = new JRadioButtonMenuItem("Random");
		gameStartRandomRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameStart(GameStart.RANDOM);
			}
		});
		gameStartRandomRadioItem.setMnemonic(KeyEvent.VK_R);
		gameStartingMenu.add(gameStartRandomRadioItem);

		gameStartPlayerRadioItem = new JRadioButtonMenuItem("Player");
		gameStartPlayerRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameStart(GameStart.PLAYER);
			}
		});
		gameStartPlayerRadioItem.setMnemonic(KeyEvent.VK_P);
		gameStartPlayerRadioItem.setSelected(true);
		gameStartingMenu.add(gameStartPlayerRadioItem);

		gameStartComputerRadioItem = new JRadioButtonMenuItem("Computer");
		gameStartComputerRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameStart(GameStart.COMPUTER);
			}
		});
		gameStartComputerRadioItem.setMnemonic(KeyEvent.VK_C);
		gameStartingMenu.add(gameStartComputerRadioItem);

		gameDifficultyMenu = new JMenu("Difficulty");
		gameDifficultyMenu.setMnemonic(KeyEvent.VK_D);
		gameMenu.add(gameDifficultyMenu);

		gameDifficultyRandomRadioItem = new JRadioButtonMenuItem("Random");
		gameDifficultyRandomRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameDifficulty(GameDifficulty.RANDOM);
			}
		});
		gameDifficultyRandomRadioItem.setMnemonic(KeyEvent.VK_R);
		gameDifficultyMenu.add(gameDifficultyRandomRadioItem);

		gameDifficultyAimlessRadioItem = new JRadioButtonMenuItem("Aimless");
		gameDifficultyAimlessRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameDifficulty(GameDifficulty.AIMLESS);
			}
		});
		gameDifficultyAimlessRadioItem.setMnemonic(KeyEvent.VK_A);
		gameDifficultyAimlessRadioItem.setSelected(true);
		gameDifficultyMenu.add(gameDifficultyAimlessRadioItem);

		gameDifficultyEasyRadioItem = new JRadioButtonMenuItem("Easy");
		gameDifficultyEasyRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameDifficulty(GameDifficulty.EASY);
			}
		});
		gameDifficultyEasyRadioItem.setMnemonic(KeyEvent.VK_E);
		gameDifficultyMenu.add(gameDifficultyEasyRadioItem);

		gameDifficultyNormalRadioItem = new JRadioButtonMenuItem("Normal");
		gameDifficultyNormalRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameDifficulty(GameDifficulty.NORMAL);
			}
		});
		gameDifficultyNormalRadioItem.setMnemonic(KeyEvent.VK_N);
		gameDifficultyMenu.add(gameDifficultyNormalRadioItem);

		gameDifficultyHardRadioItem = new JRadioButtonMenuItem("Hard");
		gameDifficultyHardRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameDifficulty(GameDifficulty.HARD);
			}
		});
		gameDifficultyHardRadioItem.setMnemonic(KeyEvent.VK_H);
		gameDifficultyMenu.add(gameDifficultyHardRadioItem);

		gameDifficultyInsaneRadioItem = new JRadioButtonMenuItem("Insane");
		gameDifficultyInsaneRadioItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeGameDifficulty(GameDifficulty.INSANE);
			}
		});
		gameDifficultyInsaneRadioItem.setMnemonic(KeyEvent.VK_I);
		gameDifficultyMenu.add(gameDifficultyInsaneRadioItem);

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

		windowStyle01RadioItem = new JRadioButtonMenuItem("Metal");
		windowStyleMenu.add(windowStyle01RadioItem);

		windowStyle02RadioItem = new JRadioButtonMenuItem("Nimbus");
		windowStyleMenu.add(windowStyle02RadioItem);

		windowStyle03RadioItem = new JRadioButtonMenuItem("CDE/Motif");
		windowStyleMenu.add(windowStyle03RadioItem);

		windowStyle04RadioItem = new JRadioButtonMenuItem("Windows");
		windowStyleMenu.add(windowStyle04RadioItem);

		windowStyle05RadioItem = new JRadioButtonMenuItem("Windows Classic");
		windowStyleMenu.add(windowStyle05RadioItem);

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
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		spotPane = new JPanel();
		spotPane.setBorder(null);
		GridBagConstraints gbc_spotPane = new GridBagConstraints();
		gbc_spotPane.insets = new Insets(0, 0, 5, 0);
		gbc_spotPane.fill = GridBagConstraints.BOTH;
		gbc_spotPane.gridx = 0;
		gbc_spotPane.gridy = 0;
		contentPane.add(spotPane, gbc_spotPane);
		GridBagLayout gbl_spotPane = new GridBagLayout();
		gbl_spotPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_spotPane.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_spotPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_spotPane.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		spotPane.setLayout(gbl_spotPane);

		spot00Button = new JButton("7: ?");
		spot00Button.setEnabled(false);
		GridBagConstraints gbc_spot00Button = new GridBagConstraints();
		gbc_spot00Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot00Button.gridx = 1;
		gbc_spot00Button.gridy = 0;
		spotPane.add(spot00Button, gbc_spot00Button);

		spot01Button = new JButton("8: ?");
		spot01Button.setEnabled(false);
		GridBagConstraints gbc_spot01Button = new GridBagConstraints();
		gbc_spot01Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot01Button.gridx = 2;
		gbc_spot01Button.gridy = 0;
		spotPane.add(spot01Button, gbc_spot01Button);

		spot02Button = new JButton("9: ?");
		spot02Button.setEnabled(false);
		GridBagConstraints gbc_spot02Button = new GridBagConstraints();
		gbc_spot02Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot02Button.gridx = 3;
		gbc_spot02Button.gridy = 0;
		spotPane.add(spot02Button, gbc_spot02Button);

		spot10Button = new JButton("4: ?");
		spot10Button.setEnabled(false);
		GridBagConstraints gbc_spot10Button = new GridBagConstraints();
		gbc_spot10Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot10Button.gridx = 1;
		gbc_spot10Button.gridy = 1;
		spotPane.add(spot10Button, gbc_spot10Button);

		spot11Button = new JButton("5: ?");
		spot11Button.setEnabled(false);
		GridBagConstraints gbc_spot11Button = new GridBagConstraints();
		gbc_spot11Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot11Button.gridx = 2;
		gbc_spot11Button.gridy = 1;
		spotPane.add(spot11Button, gbc_spot11Button);

		spot12Button = new JButton("6: ?");
		spot12Button.setEnabled(false);
		GridBagConstraints gbc_spot12Button = new GridBagConstraints();
		gbc_spot12Button.insets = new Insets(0, 0, 5, 5);
		gbc_spot12Button.gridx = 3;
		gbc_spot12Button.gridy = 1;
		spotPane.add(spot12Button, gbc_spot12Button);

		spot20Button = new JButton("1: ?");
		spot20Button.setEnabled(false);
		GridBagConstraints gbc_spot20Button = new GridBagConstraints();
		gbc_spot20Button.insets = new Insets(0, 0, 0, 5);
		gbc_spot20Button.gridx = 1;
		gbc_spot20Button.gridy = 2;
		spotPane.add(spot20Button, gbc_spot20Button);

		spot21Button = new JButton("2: ?");
		spot21Button.setEnabled(false);
		GridBagConstraints gbc_spot21Button = new GridBagConstraints();
		gbc_spot21Button.insets = new Insets(0, 0, 0, 5);
		gbc_spot21Button.gridx = 2;
		gbc_spot21Button.gridy = 2;
		spotPane.add(spot21Button, gbc_spot21Button);

		spot22Button = new JButton("3: ?");
		spot22Button.setEnabled(false);
		GridBagConstraints gbc_spot22Button = new GridBagConstraints();
		gbc_spot22Button.insets = new Insets(0, 0, 0, 5);
		gbc_spot22Button.gridx = 3;
		gbc_spot22Button.gridy = 2;
		spotPane.add(spot22Button, gbc_spot22Button);

		gamePane = new JPanel();
		GridBagConstraints gbc_gamePane = new GridBagConstraints();
		gbc_gamePane.insets = new Insets(0, 0, 5, 0);
		gbc_gamePane.fill = GridBagConstraints.BOTH;
		gbc_gamePane.gridx = 0;
		gbc_gamePane.gridy = 1;
		contentPane.add(gamePane, gbc_gamePane);
		GridBagLayout gbl_gamePane = new GridBagLayout();
		gbl_gamePane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_gamePane.rowHeights = new int[] { 0, 0 };
		gbl_gamePane.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_gamePane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		gamePane.setLayout(gbl_gamePane);

		gameStartMatchButton = new JButton("Start Match");
		gameStartMatchButton.addActionListener(startMatchActionListener);
		GridBagConstraints gbc_gameStartMatchButton = new GridBagConstraints();
		gbc_gameStartMatchButton.insets = new Insets(0, 0, 0, 5);
		gbc_gameStartMatchButton.gridx = 1;
		gbc_gameStartMatchButton.gridy = 0;
		gamePane.add(gameStartMatchButton, gbc_gameStartMatchButton);

		gameEndMatchButton = new JButton("End Match");
		gameEndMatchButton.addActionListener(endMatchActionListener);
		gameEndMatchButton.setEnabled(false);
		GridBagConstraints gbc_gameEndMatchButton = new GridBagConstraints();
		gbc_gameEndMatchButton.insets = new Insets(0, 0, 0, 5);
		gbc_gameEndMatchButton.gridx = 2;
		gbc_gameEndMatchButton.gridy = 0;
		gamePane.add(gameEndMatchButton, gbc_gameEndMatchButton);

		gameNewRoundButton = new JButton("New Round");
		gameNewRoundButton.addActionListener(newRoundActionListener);
		gameNewRoundButton.setEnabled(false);
		GridBagConstraints gbc_gameNewRoundButton = new GridBagConstraints();
		gbc_gameNewRoundButton.insets = new Insets(0, 0, 0, 5);
		gbc_gameNewRoundButton.gridx = 3;
		gbc_gameNewRoundButton.gridy = 0;
		gamePane.add(gameNewRoundButton, gbc_gameNewRoundButton);

		optionPane = new JPanel();
		GridBagConstraints gbc_optionPane = new GridBagConstraints();
		gbc_optionPane.insets = new Insets(0, 0, 5, 0);
		gbc_optionPane.fill = GridBagConstraints.BOTH;
		gbc_optionPane.gridx = 0;
		gbc_optionPane.gridy = 2;
		contentPane.add(optionPane, gbc_optionPane);
		GridBagLayout gbl_optionPane = new GridBagLayout();
		gbl_optionPane.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_optionPane.rowHeights = new int[] { 0, 0, 0 };
		gbl_optionPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_optionPane.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		optionPane.setLayout(gbl_optionPane);

		optionModeHintPane = new JPanel();
		optionModeHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Mode:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_optionModeHintPane = new GridBagConstraints();
		gbc_optionModeHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_optionModeHintPane.fill = GridBagConstraints.BOTH;
		gbc_optionModeHintPane.gridx = 1;
		gbc_optionModeHintPane.gridy = 0;
		optionPane.add(optionModeHintPane, gbc_optionModeHintPane);
		GridBagLayout gbl_optionModeHintPane = new GridBagLayout();
		gbl_optionModeHintPane.columnWidths = new int[] { 5, 98, 5, 0 };
		gbl_optionModeHintPane.rowHeights = new int[] { 0, 0 };
		gbl_optionModeHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_optionModeHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		optionModeHintPane.setLayout(gbl_optionModeHintPane);

		optionModeValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_optionModeValueLabel = new GridBagConstraints();
		gbc_optionModeValueLabel.anchor = GridBagConstraints.WEST;
		gbc_optionModeValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_optionModeValueLabel.gridx = 1;
		gbc_optionModeValueLabel.gridy = 0;
		optionModeHintPane.add(optionModeValueLabel, gbc_optionModeValueLabel);

		optionSymbolHintPane = new JPanel();
		optionSymbolHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Symbol:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_optionSymbolHintPane = new GridBagConstraints();
		gbc_optionSymbolHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_optionSymbolHintPane.fill = GridBagConstraints.BOTH;
		gbc_optionSymbolHintPane.gridx = 2;
		gbc_optionSymbolHintPane.gridy = 0;
		optionPane.add(optionSymbolHintPane, gbc_optionSymbolHintPane);
		GridBagLayout gbl_optionSymbolHintPane = new GridBagLayout();
		gbl_optionSymbolHintPane.columnWidths = new int[] { 5, 58, 5, 0 };
		gbl_optionSymbolHintPane.rowHeights = new int[] { 0, 0 };
		gbl_optionSymbolHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_optionSymbolHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		optionSymbolHintPane.setLayout(gbl_optionSymbolHintPane);

		optionSymbolValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_optionSymbolValueLabel = new GridBagConstraints();
		gbc_optionSymbolValueLabel.anchor = GridBagConstraints.WEST;
		gbc_optionSymbolValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_optionSymbolValueLabel.gridx = 1;
		gbc_optionSymbolValueLabel.gridy = 0;
		optionSymbolHintPane.add(optionSymbolValueLabel, gbc_optionSymbolValueLabel);

		optionStartingHintPane = new JPanel();
		optionStartingHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Starting:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_optionStartingHintPane = new GridBagConstraints();
		gbc_optionStartingHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_optionStartingHintPane.fill = GridBagConstraints.BOTH;
		gbc_optionStartingHintPane.gridx = 1;
		gbc_optionStartingHintPane.gridy = 1;
		optionPane.add(optionStartingHintPane, gbc_optionStartingHintPane);
		GridBagLayout gbl_optionStartingHintPane = new GridBagLayout();
		gbl_optionStartingHintPane.columnWidths = new int[] { 5, 98, 5, 0 };
		gbl_optionStartingHintPane.rowHeights = new int[] { 0, 0 };
		gbl_optionStartingHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_optionStartingHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		optionStartingHintPane.setLayout(gbl_optionStartingHintPane);

		optionStartingValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_optionStartingValueLabel = new GridBagConstraints();
		gbc_optionStartingValueLabel.anchor = GridBagConstraints.WEST;
		gbc_optionStartingValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_optionStartingValueLabel.gridx = 1;
		gbc_optionStartingValueLabel.gridy = 0;
		optionStartingHintPane.add(optionStartingValueLabel, gbc_optionStartingValueLabel);

		optionDifficultyHintPane = new JPanel();
		optionDifficultyHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Difficulty:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_optionDifficultyHintPane = new GridBagConstraints();
		gbc_optionDifficultyHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_optionDifficultyHintPane.fill = GridBagConstraints.BOTH;
		gbc_optionDifficultyHintPane.gridx = 2;
		gbc_optionDifficultyHintPane.gridy = 1;
		optionPane.add(optionDifficultyHintPane, gbc_optionDifficultyHintPane);
		GridBagLayout gbl_optionDifficultyHintPane = new GridBagLayout();
		gbl_optionDifficultyHintPane.columnWidths = new int[] { 5, 58, 5, 0 };
		gbl_optionDifficultyHintPane.rowHeights = new int[] { 0, 0 };
		gbl_optionDifficultyHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_optionDifficultyHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		optionDifficultyHintPane.setLayout(gbl_optionDifficultyHintPane);

		optionDifficultyValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_optionDifficultyValueLabel = new GridBagConstraints();
		gbc_optionDifficultyValueLabel.anchor = GridBagConstraints.WEST;
		gbc_optionDifficultyValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_optionDifficultyValueLabel.gridx = 1;
		gbc_optionDifficultyValueLabel.gridy = 0;
		optionDifficultyHintPane.add(optionDifficultyValueLabel, gbc_optionDifficultyValueLabel);

		dataPane = new JPanel();
		GridBagConstraints gbc_dataPane = new GridBagConstraints();
		gbc_dataPane.fill = GridBagConstraints.BOTH;
		gbc_dataPane.gridx = 0;
		gbc_dataPane.gridy = 3;
		contentPane.add(dataPane, gbc_dataPane);
		GridBagLayout gbl_dataPane = new GridBagLayout();
		gbl_dataPane.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_dataPane.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_dataPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_dataPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		dataPane.setLayout(gbl_dataPane);

		dataWinCountHintPane = new JPanel();
		dataWinCountHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Wins:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_dataWinCountHintPane = new GridBagConstraints();
		gbc_dataWinCountHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_dataWinCountHintPane.fill = GridBagConstraints.BOTH;
		gbc_dataWinCountHintPane.gridx = 1;
		gbc_dataWinCountHintPane.gridy = 0;
		dataPane.add(dataWinCountHintPane, gbc_dataWinCountHintPane);
		GridBagLayout gbl_dataWinCountHintPane = new GridBagLayout();
		gbl_dataWinCountHintPane.columnWidths = new int[] { 5, 158, 5, 0 };
		gbl_dataWinCountHintPane.rowHeights = new int[] { 0, 0 };
		gbl_dataWinCountHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_dataWinCountHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		dataWinCountHintPane.setLayout(gbl_dataWinCountHintPane);

		dataWinCountValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_dataWinCountValueLabel = new GridBagConstraints();
		gbc_dataWinCountValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_dataWinCountValueLabel.anchor = GridBagConstraints.EAST;
		gbc_dataWinCountValueLabel.gridx = 1;
		gbc_dataWinCountValueLabel.gridy = 0;
		dataWinCountHintPane.add(dataWinCountValueLabel, gbc_dataWinCountValueLabel);

		dataWinPercentHintPane = new JPanel();
		dataWinPercentHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Win %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_dataWinPercentHintPane = new GridBagConstraints();
		gbc_dataWinPercentHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_dataWinPercentHintPane.fill = GridBagConstraints.BOTH;
		gbc_dataWinPercentHintPane.gridx = 2;
		gbc_dataWinPercentHintPane.gridy = 0;
		dataPane.add(dataWinPercentHintPane, gbc_dataWinPercentHintPane);
		GridBagLayout gbl_dataWinPercentHintPane = new GridBagLayout();
		gbl_dataWinPercentHintPane.columnWidths = new int[] { 5, 58, 5, 0 };
		gbl_dataWinPercentHintPane.rowHeights = new int[] { 0, 0 };
		gbl_dataWinPercentHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_dataWinPercentHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		dataWinPercentHintPane.setLayout(gbl_dataWinPercentHintPane);

		dataWinPercentValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_dataWinPercentValueLabel = new GridBagConstraints();
		gbc_dataWinPercentValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_dataWinPercentValueLabel.anchor = GridBagConstraints.EAST;
		gbc_dataWinPercentValueLabel.gridx = 1;
		gbc_dataWinPercentValueLabel.gridy = 0;
		dataWinPercentHintPane.add(dataWinPercentValueLabel, gbc_dataWinPercentValueLabel);

		dataTieCountHintPane = new JPanel();
		dataTieCountHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Ties:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_dataTieCountHintPane = new GridBagConstraints();
		gbc_dataTieCountHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_dataTieCountHintPane.fill = GridBagConstraints.BOTH;
		gbc_dataTieCountHintPane.gridx = 1;
		gbc_dataTieCountHintPane.gridy = 1;
		dataPane.add(dataTieCountHintPane, gbc_dataTieCountHintPane);
		GridBagLayout gbl_dataTieCountHintPane = new GridBagLayout();
		gbl_dataTieCountHintPane.columnWidths = new int[] { 5, 158, 5, 0 };
		gbl_dataTieCountHintPane.rowHeights = new int[] { 0, 0 };
		gbl_dataTieCountHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_dataTieCountHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		dataTieCountHintPane.setLayout(gbl_dataTieCountHintPane);

		dataTieCountValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_dataTieCountValueLabel = new GridBagConstraints();
		gbc_dataTieCountValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_dataTieCountValueLabel.anchor = GridBagConstraints.EAST;
		gbc_dataTieCountValueLabel.gridx = 1;
		gbc_dataTieCountValueLabel.gridy = 0;
		dataTieCountHintPane.add(dataTieCountValueLabel, gbc_dataTieCountValueLabel);

		dataTiePercentHintPane = new JPanel();
		dataTiePercentHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Tie %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_dataTiePercentHintPane = new GridBagConstraints();
		gbc_dataTiePercentHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_dataTiePercentHintPane.fill = GridBagConstraints.BOTH;
		gbc_dataTiePercentHintPane.gridx = 2;
		gbc_dataTiePercentHintPane.gridy = 1;
		dataPane.add(dataTiePercentHintPane, gbc_dataTiePercentHintPane);
		GridBagLayout gbl_dataTiePercentHintPane = new GridBagLayout();
		gbl_dataTiePercentHintPane.columnWidths = new int[] { 5, 58, 5, 0 };
		gbl_dataTiePercentHintPane.rowHeights = new int[] { 0, 0 };
		gbl_dataTiePercentHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_dataTiePercentHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		dataTiePercentHintPane.setLayout(gbl_dataTiePercentHintPane);

		dataTiePercentValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_dataTiePercentValueLabel = new GridBagConstraints();
		gbc_dataTiePercentValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_dataTiePercentValueLabel.anchor = GridBagConstraints.EAST;
		gbc_dataTiePercentValueLabel.gridx = 1;
		gbc_dataTiePercentValueLabel.gridy = 0;
		dataTiePercentHintPane.add(dataTiePercentValueLabel, gbc_dataTiePercentValueLabel);

		dataLossCountHintPane = new JPanel();
		dataLossCountHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Losses:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_dataLossCountHintPane = new GridBagConstraints();
		gbc_dataLossCountHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_dataLossCountHintPane.fill = GridBagConstraints.BOTH;
		gbc_dataLossCountHintPane.gridx = 1;
		gbc_dataLossCountHintPane.gridy = 2;
		dataPane.add(dataLossCountHintPane, gbc_dataLossCountHintPane);
		GridBagLayout gbl_dataLossCountHintPane = new GridBagLayout();
		gbl_dataLossCountHintPane.columnWidths = new int[] { 5, 158, 5, 0 };
		gbl_dataLossCountHintPane.rowHeights = new int[] { 0, 0 };
		gbl_dataLossCountHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_dataLossCountHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		dataLossCountHintPane.setLayout(gbl_dataLossCountHintPane);

		dataLossCountValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_dataLossCountValueLabel = new GridBagConstraints();
		gbc_dataLossCountValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_dataLossCountValueLabel.anchor = GridBagConstraints.EAST;
		gbc_dataLossCountValueLabel.gridx = 1;
		gbc_dataLossCountValueLabel.gridy = 0;
		dataLossCountHintPane.add(dataLossCountValueLabel, gbc_dataLossCountValueLabel);

		dataLossPercentHintPane = new JPanel();
		dataLossPercentHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Loss %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_dataLossPercentHintPane = new GridBagConstraints();
		gbc_dataLossPercentHintPane.insets = new Insets(0, 0, 5, 5);
		gbc_dataLossPercentHintPane.fill = GridBagConstraints.BOTH;
		gbc_dataLossPercentHintPane.gridx = 2;
		gbc_dataLossPercentHintPane.gridy = 2;
		dataPane.add(dataLossPercentHintPane, gbc_dataLossPercentHintPane);
		GridBagLayout gbl_dataLossPercentHintPane = new GridBagLayout();
		gbl_dataLossPercentHintPane.columnWidths = new int[] { 5, 58, 5, 0 };
		gbl_dataLossPercentHintPane.rowHeights = new int[] { 0, 0 };
		gbl_dataLossPercentHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_dataLossPercentHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		dataLossPercentHintPane.setLayout(gbl_dataLossPercentHintPane);

		dataLossPercentValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_dataLossPercentValueLabel = new GridBagConstraints();
		gbc_dataLossPercentValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_dataLossPercentValueLabel.anchor = GridBagConstraints.EAST;
		gbc_dataLossPercentValueLabel.gridx = 1;
		gbc_dataLossPercentValueLabel.gridy = 0;
		dataLossPercentHintPane.add(dataLossPercentValueLabel, gbc_dataLossPercentValueLabel);

		dataMatchCountHintPane = new JPanel();
		dataMatchCountHintPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Matches:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_dataMatchCountHintPane = new GridBagConstraints();
		gbc_dataMatchCountHintPane.insets = new Insets(0, 0, 0, 5);
		gbc_dataMatchCountHintPane.fill = GridBagConstraints.BOTH;
		gbc_dataMatchCountHintPane.gridx = 1;
		gbc_dataMatchCountHintPane.gridy = 3;
		dataPane.add(dataMatchCountHintPane, gbc_dataMatchCountHintPane);
		GridBagLayout gbl_dataMatchCountHintPane = new GridBagLayout();
		gbl_dataMatchCountHintPane.columnWidths = new int[] { 5, 158, 5, 0 };
		gbl_dataMatchCountHintPane.rowHeights = new int[] { 0, 0 };
		gbl_dataMatchCountHintPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_dataMatchCountHintPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		dataMatchCountHintPane.setLayout(gbl_dataMatchCountHintPane);

		dataMatchCountValueLabel = new JLabel("N/A");
		GridBagConstraints gbc_dataMatchCountValueLabel = new GridBagConstraints();
		gbc_dataMatchCountValueLabel.insets = new Insets(0, 0, 0, 5);
		gbc_dataMatchCountValueLabel.anchor = GridBagConstraints.EAST;
		gbc_dataMatchCountValueLabel.gridx = 1;
		gbc_dataMatchCountValueLabel.gridy = 0;
		dataMatchCountHintPane.add(dataMatchCountValueLabel, gbc_dataMatchCountValueLabel);
	}

	private ActionListener startMatchActionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO
		}
	};

	private ActionListener endMatchActionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO
		}
	};

	private ActionListener newRoundActionListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO
		}
	};

}
