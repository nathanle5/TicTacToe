package com.github.nathanle5;

import java.awt.GridBagLayout;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
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
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 7952751144657907378L;

	private ButtonGroup gameModeRadioItems;
	private ButtonGroup gameSymbolRadioItems;
	private ButtonGroup gameStartingRadioItems;
	private ButtonGroup gameDifficultyRadioItems;
	private ButtonGroup windowStyleRadioItems;

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
	private JMenuItem gameNewRoundMenuItem;
	private JSeparator gameSeparator1;
	private JMenu gameModeMenu;
	private JRadioButtonMenuItem gameModePvcRadioItem;
	private JRadioButtonMenuItem gameModePvpRadioItem;
	private JMenu gameSymbolMenu;
	private JRadioButtonMenuItem gameSymbolRandomRadioItem;
	private JRadioButtonMenuItem gameSymbolXsRadioItem;
	private JRadioButtonMenuItem gameSymbolOsRadioItem;
	private JMenu gameStartingMenu;
	private JRadioButtonMenuItem gameStartingRandomRadioItem;
	private JRadioButtonMenuItem gameStartingPlayerRadioItem;
	private JRadioButtonMenuItem gameStartingComputerRadioItem;
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
	private JRadioButtonMenuItem windowStyle01RadioItem;
	private JRadioButtonMenuItem windowStyle02RadioItem;
	private JRadioButtonMenuItem windowStyle03RadioItem;
	private JRadioButtonMenuItem windowStyle04RadioItem;
	private JRadioButtonMenuItem windowStyle05RadioItem;
	private JSeparator separator;
	private JMenu helpMenu;
	private JMenuItem helpAboutMenuItem;

	private JPanel contentPane;

	/**
	 * Create the application.
	 */
	public GameFrame() {
		initialize();
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

	/**
	 * Create the frame.
	 */
	private void initialize() {
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {

				gameModeRadioItems = new ButtonGroup();
				gameModeRadioItems.add(gameModePvcRadioItem);
				gameModeRadioItems.add(gameModePvpRadioItem);

				gameSymbolRadioItems = new ButtonGroup();
				gameSymbolRadioItems.add(gameSymbolRandomRadioItem);
				gameSymbolRadioItems.add(gameSymbolXsRadioItem);
				gameSymbolRadioItems.add(gameSymbolOsRadioItem);

				gameStartingRadioItems = new ButtonGroup();
				gameStartingRadioItems.add(gameStartingRandomRadioItem);
				gameStartingRadioItems.add(gameStartingPlayerRadioItem);
				gameStartingRadioItems.add(gameStartingComputerRadioItem);

				gameDifficultyRadioItems = new ButtonGroup();
				gameDifficultyRadioItems.add(gameDifficultyRandomRadioItem);
				gameDifficultyRadioItems.add(gameDifficultyAimlessRadioItem);
				gameDifficultyRadioItems.add(gameDifficultyEasyRadioItem);
				gameDifficultyRadioItems.add(gameDifficultyNormalRadioItem);
				gameDifficultyRadioItems.add(gameDifficultyHardRadioItem);
				gameDifficultyRadioItems.add(gameDifficultyInsaneRadioItem);

				windowStyleRadioItems = new ButtonGroup();
				windowStyleRadioItems.add(windowStyle01RadioItem);
				windowStyleRadioItems.add(windowStyle02RadioItem);
				windowStyleRadioItems.add(windowStyle03RadioItem);
				windowStyleRadioItems.add(windowStyle04RadioItem);
				windowStyleRadioItems.add(windowStyle05RadioItem);

				findCurrentLookAndFeel(UIManager.getLookAndFeel().getName());
			}
		});
		setBounds(100, 100, 450, 300);

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
		gameStartMatchMenuItem.setMnemonic(KeyEvent.VK_S);
		gameMenu.add(gameStartMatchMenuItem);

		gameEndMatchMenuItem = new JMenuItem("End Match");
		gameEndMatchMenuItem.setMnemonic(KeyEvent.VK_E);
		gameMenu.add(gameEndMatchMenuItem);

		gameSeparator0 = new JSeparator();
		gameMenu.add(gameSeparator0);

		gameNewRoundMenuItem = new JMenuItem("New Round");
		gameNewRoundMenuItem.setMnemonic(KeyEvent.VK_N);
		gameMenu.add(gameNewRoundMenuItem);

		gameSeparator1 = new JSeparator();
		gameMenu.add(gameSeparator1);

		gameModeMenu = new JMenu("Mode");
		gameModeMenu.setMnemonic(KeyEvent.VK_M);
		gameMenu.add(gameModeMenu);

		gameModePvcRadioItem = new JRadioButtonMenuItem("PvC");
		gameModePvcRadioItem.setMnemonic(KeyEvent.VK_C);
		gameModePvcRadioItem.setSelected(true);
		gameModeMenu.add(gameModePvcRadioItem);

		gameModePvpRadioItem = new JRadioButtonMenuItem("PvP");
		gameModePvpRadioItem.setMnemonic(KeyEvent.VK_P);
		gameModeMenu.add(gameModePvpRadioItem);

		gameSymbolMenu = new JMenu("Symbol");
		gameSymbolMenu.setMnemonic(KeyEvent.VK_Y);
		gameMenu.add(gameSymbolMenu);

		gameSymbolRandomRadioItem = new JRadioButtonMenuItem("Random");
		gameSymbolRandomRadioItem.setMnemonic(KeyEvent.VK_R);
		gameSymbolRandomRadioItem.setSelected(true);
		gameSymbolMenu.add(gameSymbolRandomRadioItem);

		gameSymbolXsRadioItem = new JRadioButtonMenuItem("X");
		gameSymbolXsRadioItem.setMnemonic(KeyEvent.VK_X);
		gameSymbolMenu.add(gameSymbolXsRadioItem);

		gameSymbolOsRadioItem = new JRadioButtonMenuItem("O");
		gameSymbolOsRadioItem.setMnemonic(KeyEvent.VK_O);
		gameSymbolMenu.add(gameSymbolOsRadioItem);

		gameStartingMenu = new JMenu("Starting");
		gameStartingMenu.setMnemonic(KeyEvent.VK_T);
		gameMenu.add(gameStartingMenu);

		gameStartingRandomRadioItem = new JRadioButtonMenuItem("Random");
		gameStartingRandomRadioItem.setMnemonic(KeyEvent.VK_R);
		gameStartingRandomRadioItem.setSelected(true);
		gameStartingMenu.add(gameStartingRandomRadioItem);

		gameStartingPlayerRadioItem = new JRadioButtonMenuItem("Player");
		gameStartingPlayerRadioItem.setMnemonic(KeyEvent.VK_P);
		gameStartingMenu.add(gameStartingPlayerRadioItem);

		gameStartingComputerRadioItem = new JRadioButtonMenuItem("Computer");
		gameStartingComputerRadioItem.setMnemonic(KeyEvent.VK_C);
		gameStartingMenu.add(gameStartingComputerRadioItem);

		gameDifficultyMenu = new JMenu("Difficulty");
		gameDifficultyMenu.setMnemonic(KeyEvent.VK_D);
		gameMenu.add(gameDifficultyMenu);

		gameDifficultyRandomRadioItem = new JRadioButtonMenuItem("Random");
		gameDifficultyRandomRadioItem.setMnemonic(KeyEvent.VK_R);
		gameDifficultyRandomRadioItem.setSelected(true);
		gameDifficultyMenu.add(gameDifficultyRandomRadioItem);

		gameDifficultyAimlessRadioItem = new JRadioButtonMenuItem("Aimless");
		gameDifficultyAimlessRadioItem.setMnemonic(KeyEvent.VK_A);
		gameDifficultyMenu.add(gameDifficultyAimlessRadioItem);

		gameDifficultyEasyRadioItem = new JRadioButtonMenuItem("Easy");
		gameDifficultyEasyRadioItem.setMnemonic(KeyEvent.VK_E);
		gameDifficultyMenu.add(gameDifficultyEasyRadioItem);

		gameDifficultyNormalRadioItem = new JRadioButtonMenuItem("Normal");
		gameDifficultyNormalRadioItem.setMnemonic(KeyEvent.VK_N);
		gameDifficultyMenu.add(gameDifficultyNormalRadioItem);

		gameDifficultyHardRadioItem = new JRadioButtonMenuItem("Hard");
		gameDifficultyHardRadioItem.setMnemonic(KeyEvent.VK_H);
		gameDifficultyMenu.add(gameDifficultyHardRadioItem);

		gameDifficultyInsaneRadioItem = new JRadioButtonMenuItem("Insane");
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

		separator = new JSeparator();
		windowStyleMenu.add(separator);

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
		gbl_contentPane.columnWidths = new int[] { 0 };
		gbl_contentPane.rowHeights = new int[] { 0 };
		gbl_contentPane.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);
	}

}
