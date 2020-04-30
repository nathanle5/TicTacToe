package com.github.nathanle5;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class StatisticsFrame extends JFrame {

	private static final long serialVersionUID = 1682641777422903089L;

	private JPanel contentPane;

	private final JPanel pvePane = new JPanel();
	private final JPanel pveDifficultyPane = new JPanel();
	private final JRadioButton pveDifficultyRandomRadioButton = new JRadioButton("Random");
	private final JRadioButton pveDifficultyEasyRadioButton = new JRadioButton("Easy");
	private final JRadioButton pveDifficultyMediumRadioButton = new JRadioButton("Medium");
	private final JRadioButton pveDifficultyHardRadioButton = new JRadioButton("Hard");
	private final JPanel pvePlrStatsPane = new JPanel();
	private final JPanel pvePlrWinCountPane = new JPanel();
	private final JLabel pvePlrWinCountLabel = new JLabel("0");
	private final JPanel pvePlrWinPercentPane = new JPanel();
	private final JLabel pvePlrWinPercentLabel = new JLabel("0.00");
	private final JPanel pvePlrLossCountPane = new JPanel();
	private final JLabel pvePlrLossCountLabel = new JLabel("0");
	private final JPanel pvePlrLossPercentPane = new JPanel();
	private final JLabel pvePlrLossPercentLabel = new JLabel("0.00");
	private final JPanel pvePlrMatchesPane = new JPanel();
	private final JLabel pvePlrMatchCountLabel = new JLabel("0");
	private final JPanel pveCpuStatsPane = new JPanel();
	private final JPanel pveCpuWinCountPane = new JPanel();
	private final JLabel pveCpuWinCountLabel = new JLabel("0");
	private final JPanel pveCpuWinPercentPane = new JPanel();
	private final JLabel pveCpuWinPercentLabel = new JLabel("0.00");
	private final JPanel pveCpuLossCountPane = new JPanel();
	private final JLabel pveCpuLossCountLabel = new JLabel("0");
	private final JPanel pveCpuLossPercentPane = new JPanel();
	private final JLabel pveCpuLossPercentLabel = new JLabel("0.00");
	private final JPanel pveCpuMatchesPane = new JPanel();
	private final JLabel pveCpuMatchCountLabel = new JLabel("0");

	private final JPanel pvpPane = new JPanel();
	private final JPanel pvpPlr1StatsPane = new JPanel();
	private final JPanel pvpPlr1WinCountPane = new JPanel();
	private final JLabel pvpPlr1WinCountLabel = new JLabel("0");
	private final JPanel pvpPlr1WinPercentPane = new JPanel();
	private final JLabel pvpPlr1WinPercentLabel = new JLabel("0.00");
	private final JPanel pvpPlr1LossCountPane = new JPanel();
	private final JLabel pvpPlr1LossCountLabel = new JLabel("0");
	private final JPanel pvpPlr1LossPercentPane = new JPanel();
	private final JLabel pvpPlr1LossPercentLabel = new JLabel("0.00");
	private final JPanel pvpPlr1MatchesPane = new JPanel();
	private final JLabel pvpPlr1MatchCountLabel = new JLabel("0");
	private final JPanel pvpPlr2StatsPane = new JPanel();
	private final JPanel pvpPlr2WinCountPane = new JPanel();
	private final JLabel pvpPlr2WinCountLabel = new JLabel("0");
	private final JPanel pvpPlr2WinPercentPane = new JPanel();
	private final JLabel pvpPlr2WinPercentLabel = new JLabel("0.00");
	private final JPanel pvpPlr2LossCountPane = new JPanel();
	private final JLabel pvpPlr2LossCountLabel = new JLabel("0");
	private final JPanel pvpPlr2LossPercentPane = new JPanel();
	private final JLabel pvpPlr2LossPercentLabel = new JLabel("0.00");
	private final JPanel pvpPlr2MatchesPane = new JPanel();
	private final JLabel pvpPlr2MatchCountLabel = new JLabel("0");

	/**
	 * Create the frame.
	 */
	public StatisticsFrame() {
		initialize();
		setTitle("Statistics");
	}

	/**
	 * Create the frame.
	 */
	public StatisticsFrame(String title) {
		initialize();
		setTitle(title + " Statistics");
	}

	private void initialize() {
		ButtonGroup bg = new ButtonGroup();
		bg.add(pveDifficultyRandomRadioButton);
		bg.add(pveDifficultyEasyRadioButton);
		bg.add(pveDifficultyMediumRadioButton);
		bg.add(pveDifficultyHardRadioButton);

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 630, 460);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		GridBagConstraints gbc_pvePane = new GridBagConstraints();
		gbc_pvePane.insets = new Insets(0, 0, 5, 5);
		gbc_pvePane.fill = GridBagConstraints.BOTH;
		gbc_pvePane.gridx = 1;
		gbc_pvePane.gridy = 1;
		pvePane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Player vs. Computer", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pvePane, gbc_pvePane);
		GridBagLayout gbl_pvePane = new GridBagLayout();
		gbl_pvePane.columnWidths = new int[] { 0, 0, 0 };
		gbl_pvePane.rowHeights = new int[] { 0, 0, 0 };
		gbl_pvePane.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gbl_pvePane.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		pvePane.setLayout(gbl_pvePane);

		GridBagConstraints gbc_pveDifficultyPane = new GridBagConstraints();
		gbc_pveDifficultyPane.gridwidth = 2;
		gbc_pveDifficultyPane.insets = new Insets(0, 0, 5, 5);
		gbc_pveDifficultyPane.fill = GridBagConstraints.BOTH;
		gbc_pveDifficultyPane.gridx = 0;
		gbc_pveDifficultyPane.gridy = 0;
		pveDifficultyPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveDifficultyPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Computer Difficulty:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvePane.add(pveDifficultyPane, gbc_pveDifficultyPane);
		GridBagLayout gbl_pveDifficultyPane = new GridBagLayout();
		gbl_pveDifficultyPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_pveDifficultyPane.rowHeights = new int[]{0, 0};
		gbl_pveDifficultyPane.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pveDifficultyPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pveDifficultyPane.setLayout(gbl_pveDifficultyPane);

		GridBagConstraints gbc_pveDifficultyRandomRadioButton = new GridBagConstraints();
		gbc_pveDifficultyRandomRadioButton.insets = new Insets(0, 0, 0, 5);
		gbc_pveDifficultyRandomRadioButton.gridx = 1;
		gbc_pveDifficultyRandomRadioButton.gridy = 0;
		pveDifficultyRandomRadioButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveDifficultyRandomRadioButton.setSelected(true);
		pveDifficultyPane.add(pveDifficultyRandomRadioButton, gbc_pveDifficultyRandomRadioButton);

		GridBagConstraints gbc_pveDifficultyEasyRadioButton = new GridBagConstraints();
		gbc_pveDifficultyEasyRadioButton.insets = new Insets(0, 0, 0, 5);
		gbc_pveDifficultyEasyRadioButton.gridx = 2;
		gbc_pveDifficultyEasyRadioButton.gridy = 0;
		pveDifficultyEasyRadioButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveDifficultyPane.add(pveDifficultyEasyRadioButton, gbc_pveDifficultyEasyRadioButton);

		GridBagConstraints gbc_pveDifficultyMediumRadioButton = new GridBagConstraints();
		gbc_pveDifficultyMediumRadioButton.insets = new Insets(0, 0, 0, 5);
		gbc_pveDifficultyMediumRadioButton.gridx = 3;
		gbc_pveDifficultyMediumRadioButton.gridy = 0;
		pveDifficultyMediumRadioButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveDifficultyPane.add(pveDifficultyMediumRadioButton, gbc_pveDifficultyMediumRadioButton);

		GridBagConstraints gbc_pveDifficultyHardRadioButton = new GridBagConstraints();
		gbc_pveDifficultyHardRadioButton.insets = new Insets(0, 0, 0, 5);
		gbc_pveDifficultyHardRadioButton.gridx = 4;
		gbc_pveDifficultyHardRadioButton.gridy = 0;
		pveDifficultyHardRadioButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveDifficultyPane.add(pveDifficultyHardRadioButton, gbc_pveDifficultyHardRadioButton);

		GridBagConstraints gbc_pvePlrStatsPane = new GridBagConstraints();
		gbc_pvePlrStatsPane.insets = new Insets(0, 0, 0, 5);
		gbc_pvePlrStatsPane.fill = GridBagConstraints.BOTH;
		gbc_pvePlrStatsPane.gridx = 0;
		gbc_pvePlrStatsPane.gridy = 1;
		pvePlrStatsPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrStatsPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Player:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvePane.add(pvePlrStatsPane, gbc_pvePlrStatsPane);
		GridBagLayout gbl_pvePlrStatsPane = new GridBagLayout();
		gbl_pvePlrStatsPane.columnWidths = new int[] { 0, 205, 70, 0, 0 };
		gbl_pvePlrStatsPane.rowHeights = new int[] { 40, 40, 40, 0 };
		gbl_pvePlrStatsPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pvePlrStatsPane.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pvePlrStatsPane.setLayout(gbl_pvePlrStatsPane);

		GridBagConstraints gbc_pvePlrWinCountPane = new GridBagConstraints();
		gbc_pvePlrWinCountPane.fill = GridBagConstraints.BOTH;
		gbc_pvePlrWinCountPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvePlrWinCountPane.gridx = 1;
		gbc_pvePlrWinCountPane.gridy = 0;
		pvePlrWinCountPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrWinCountPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Wins:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvePlrStatsPane.add(pvePlrWinCountPane, gbc_pvePlrWinCountPane);
		GridBagLayout gbl_pvePlrWinCountPane = new GridBagLayout();
		gbl_pvePlrWinCountPane.columnWidths = new int[] { 0, 0 };
		gbl_pvePlrWinCountPane.rowHeights = new int[] { 0, 0 };
		gbl_pvePlrWinCountPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvePlrWinCountPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvePlrWinCountPane.setLayout(gbl_pvePlrWinCountPane);

		GridBagConstraints gbc_pvePlrWinCountLabel = new GridBagConstraints();
		gbc_pvePlrWinCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pvePlrWinCountLabel.gridx = 0;
		gbc_pvePlrWinCountLabel.gridy = 0;
		pvePlrWinCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrWinCountPane.add(pvePlrWinCountLabel, gbc_pvePlrWinCountLabel);

		GridBagConstraints gbc_pvePlrWinPercentPane = new GridBagConstraints();
		gbc_pvePlrWinPercentPane.fill = GridBagConstraints.BOTH;
		gbc_pvePlrWinPercentPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvePlrWinPercentPane.gridx = 2;
		gbc_pvePlrWinPercentPane.gridy = 0;
		pvePlrWinPercentPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrWinPercentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Win %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvePlrStatsPane.add(pvePlrWinPercentPane, gbc_pvePlrWinPercentPane);
		GridBagLayout gbl_pvePlrWinPercentPane = new GridBagLayout();
		gbl_pvePlrWinPercentPane.columnWidths = new int[] { 0, 0 };
		gbl_pvePlrWinPercentPane.rowHeights = new int[] { 0, 0 };
		gbl_pvePlrWinPercentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvePlrWinPercentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvePlrWinPercentPane.setLayout(gbl_pvePlrWinPercentPane);

		GridBagConstraints gbc_pvePlrWinPercentLabel = new GridBagConstraints();
		gbc_pvePlrWinPercentLabel.anchor = GridBagConstraints.EAST;
		gbc_pvePlrWinPercentLabel.gridx = 0;
		gbc_pvePlrWinPercentLabel.gridy = 0;
		pvePlrWinPercentLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrWinPercentPane.add(pvePlrWinPercentLabel, gbc_pvePlrWinPercentLabel);

		GridBagConstraints gbc_pvePlrLossCountPane = new GridBagConstraints();
		gbc_pvePlrLossCountPane.fill = GridBagConstraints.BOTH;
		gbc_pvePlrLossCountPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvePlrLossCountPane.gridx = 1;
		gbc_pvePlrLossCountPane.gridy = 1;
		pvePlrLossCountPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrLossCountPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Losses:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvePlrStatsPane.add(pvePlrLossCountPane, gbc_pvePlrLossCountPane);
		GridBagLayout gbl_pvePlrLossCountPane = new GridBagLayout();
		gbl_pvePlrLossCountPane.columnWidths = new int[] { 0, 0 };
		gbl_pvePlrLossCountPane.rowHeights = new int[] { 0, 0 };
		gbl_pvePlrLossCountPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvePlrLossCountPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvePlrLossCountPane.setLayout(gbl_pvePlrLossCountPane);

		GridBagConstraints gbc_pvePlrLossCountLabel = new GridBagConstraints();
		gbc_pvePlrLossCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pvePlrLossCountLabel.gridx = 0;
		gbc_pvePlrLossCountLabel.gridy = 0;
		pvePlrLossCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrLossCountPane.add(pvePlrLossCountLabel, gbc_pvePlrLossCountLabel);

		GridBagConstraints gbc_pvePlrLossPercentPane = new GridBagConstraints();
		gbc_pvePlrLossPercentPane.fill = GridBagConstraints.BOTH;
		gbc_pvePlrLossPercentPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvePlrLossPercentPane.gridx = 2;
		gbc_pvePlrLossPercentPane.gridy = 1;
		pvePlrLossPercentPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrLossPercentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Loss %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvePlrStatsPane.add(pvePlrLossPercentPane, gbc_pvePlrLossPercentPane);
		GridBagLayout gbl_pvePlrLossPercentPane = new GridBagLayout();
		gbl_pvePlrLossPercentPane.columnWidths = new int[] { 0, 0 };
		gbl_pvePlrLossPercentPane.rowHeights = new int[] { 0, 0 };
		gbl_pvePlrLossPercentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvePlrLossPercentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvePlrLossPercentPane.setLayout(gbl_pvePlrLossPercentPane);

		GridBagConstraints gbc_pvePlrLossPercentLabel = new GridBagConstraints();
		gbc_pvePlrLossPercentLabel.anchor = GridBagConstraints.EAST;
		gbc_pvePlrLossPercentLabel.gridx = 0;
		gbc_pvePlrLossPercentLabel.gridy = 0;
		pvePlrLossPercentLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrLossPercentPane.add(pvePlrLossPercentLabel, gbc_pvePlrLossPercentLabel);

		GridBagConstraints gbc_pvePlrMatchesPane = new GridBagConstraints();
		gbc_pvePlrMatchesPane.fill = GridBagConstraints.BOTH;
		gbc_pvePlrMatchesPane.insets = new Insets(0, 0, 0, 5);
		gbc_pvePlrMatchesPane.gridx = 1;
		gbc_pvePlrMatchesPane.gridy = 2;
		pvePlrMatchesPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrMatchesPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Matches:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvePlrStatsPane.add(pvePlrMatchesPane, gbc_pvePlrMatchesPane);
		GridBagLayout gbl_pvePlrMatchesPane = new GridBagLayout();
		gbl_pvePlrMatchesPane.columnWidths = new int[] { 0, 0 };
		gbl_pvePlrMatchesPane.rowHeights = new int[] { 0, 0 };
		gbl_pvePlrMatchesPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvePlrMatchesPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvePlrMatchesPane.setLayout(gbl_pvePlrMatchesPane);

		GridBagConstraints gbc_pvePlrMatchCountLabel = new GridBagConstraints();
		gbc_pvePlrMatchCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pvePlrMatchCountLabel.gridx = 0;
		gbc_pvePlrMatchCountLabel.gridy = 0;
		pvePlrMatchCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvePlrMatchesPane.add(pvePlrMatchCountLabel, gbc_pvePlrMatchCountLabel);

		GridBagConstraints gbc_pveCpuStatsPane = new GridBagConstraints();
		gbc_pveCpuStatsPane.insets = new Insets(0, 0, 0, 5);
		gbc_pveCpuStatsPane.fill = GridBagConstraints.BOTH;
		gbc_pveCpuStatsPane.gridx = 1;
		gbc_pveCpuStatsPane.gridy = 1;
		pveCpuStatsPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuStatsPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Computer:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvePane.add(pveCpuStatsPane, gbc_pveCpuStatsPane);
		GridBagLayout gbl_pveCpuStatsPane = new GridBagLayout();
		gbl_pveCpuStatsPane.columnWidths = new int[] { 0, 205, 70, 0, 0 };
		gbl_pveCpuStatsPane.rowHeights = new int[] { 40, 40, 40, 0 };
		gbl_pveCpuStatsPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pveCpuStatsPane.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pveCpuStatsPane.setLayout(gbl_pveCpuStatsPane);

		GridBagConstraints gbc_pveCpuWinCountPane = new GridBagConstraints();
		gbc_pveCpuWinCountPane.fill = GridBagConstraints.BOTH;
		gbc_pveCpuWinCountPane.insets = new Insets(0, 0, 5, 5);
		gbc_pveCpuWinCountPane.gridx = 1;
		gbc_pveCpuWinCountPane.gridy = 0;
		pveCpuWinCountPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuWinCountPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Wins:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pveCpuStatsPane.add(pveCpuWinCountPane, gbc_pveCpuWinCountPane);
		GridBagLayout gbl_pveCpuWinCountPane = new GridBagLayout();
		gbl_pveCpuWinCountPane.columnWidths = new int[] { 0, 0 };
		gbl_pveCpuWinCountPane.rowHeights = new int[] { 0, 0 };
		gbl_pveCpuWinCountPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pveCpuWinCountPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pveCpuWinCountPane.setLayout(gbl_pveCpuWinCountPane);

		GridBagConstraints gbc_pveCpuWinCountLabel = new GridBagConstraints();
		gbc_pveCpuWinCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pveCpuWinCountLabel.gridx = 0;
		gbc_pveCpuWinCountLabel.gridy = 0;
		pveCpuWinCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuWinCountPane.add(pveCpuWinCountLabel, gbc_pveCpuWinCountLabel);

		GridBagConstraints gbc_pveCpuWinPercentPane = new GridBagConstraints();
		gbc_pveCpuWinPercentPane.fill = GridBagConstraints.BOTH;
		gbc_pveCpuWinPercentPane.insets = new Insets(0, 0, 5, 5);
		gbc_pveCpuWinPercentPane.gridx = 2;
		gbc_pveCpuWinPercentPane.gridy = 0;
		pveCpuWinPercentPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuWinPercentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Win %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pveCpuStatsPane.add(pveCpuWinPercentPane, gbc_pveCpuWinPercentPane);
		GridBagLayout gbl_pveCpuWinPercentPane = new GridBagLayout();
		gbl_pveCpuWinPercentPane.columnWidths = new int[] { 0, 0 };
		gbl_pveCpuWinPercentPane.rowHeights = new int[] { 0, 0 };
		gbl_pveCpuWinPercentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pveCpuWinPercentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pveCpuWinPercentPane.setLayout(gbl_pveCpuWinPercentPane);

		GridBagConstraints gbc_pveCpuWinPercentLabel = new GridBagConstraints();
		gbc_pveCpuWinPercentLabel.anchor = GridBagConstraints.EAST;
		gbc_pveCpuWinPercentLabel.gridx = 0;
		gbc_pveCpuWinPercentLabel.gridy = 0;
		pveCpuWinPercentLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuWinPercentPane.add(pveCpuWinPercentLabel, gbc_pveCpuWinPercentLabel);

		GridBagConstraints gbc_pveCpuLossCountPane = new GridBagConstraints();
		gbc_pveCpuLossCountPane.fill = GridBagConstraints.BOTH;
		gbc_pveCpuLossCountPane.insets = new Insets(0, 0, 5, 5);
		gbc_pveCpuLossCountPane.gridx = 1;
		gbc_pveCpuLossCountPane.gridy = 1;
		pveCpuLossCountPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuLossCountPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Losses:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pveCpuStatsPane.add(pveCpuLossCountPane, gbc_pveCpuLossCountPane);
		GridBagLayout gbl_pveCpuLossCountPane = new GridBagLayout();
		gbl_pveCpuLossCountPane.columnWidths = new int[] { 0, 0 };
		gbl_pveCpuLossCountPane.rowHeights = new int[] { 0, 0 };
		gbl_pveCpuLossCountPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pveCpuLossCountPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pveCpuLossCountPane.setLayout(gbl_pveCpuLossCountPane);

		GridBagConstraints gbc_pveCpuLossCountLabel = new GridBagConstraints();
		gbc_pveCpuLossCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pveCpuLossCountLabel.gridx = 0;
		gbc_pveCpuLossCountLabel.gridy = 0;
		pveCpuLossCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuLossCountPane.add(pveCpuLossCountLabel, gbc_pveCpuLossCountLabel);

		GridBagConstraints gbc_pveCpuLossPercentPane = new GridBagConstraints();
		gbc_pveCpuLossPercentPane.fill = GridBagConstraints.BOTH;
		gbc_pveCpuLossPercentPane.insets = new Insets(0, 0, 5, 5);
		gbc_pveCpuLossPercentPane.gridx = 2;
		gbc_pveCpuLossPercentPane.gridy = 1;
		pveCpuLossPercentPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuLossPercentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Loss %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pveCpuStatsPane.add(pveCpuLossPercentPane, gbc_pveCpuLossPercentPane);
		GridBagLayout gbl_pveCpuLossPercentPane = new GridBagLayout();
		gbl_pveCpuLossPercentPane.columnWidths = new int[] { 0, 0 };
		gbl_pveCpuLossPercentPane.rowHeights = new int[] { 0, 0 };
		gbl_pveCpuLossPercentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pveCpuLossPercentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pveCpuLossPercentPane.setLayout(gbl_pveCpuLossPercentPane);

		GridBagConstraints gbc_pveCpuLossPercentLabel = new GridBagConstraints();
		gbc_pveCpuLossPercentLabel.anchor = GridBagConstraints.EAST;
		gbc_pveCpuLossPercentLabel.gridx = 0;
		gbc_pveCpuLossPercentLabel.gridy = 0;
		pveCpuLossPercentLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuLossPercentPane.add(pveCpuLossPercentLabel, gbc_pveCpuLossPercentLabel);

		GridBagConstraints gbc_pveCpuMatchesPane = new GridBagConstraints();
		gbc_pveCpuMatchesPane.fill = GridBagConstraints.BOTH;
		gbc_pveCpuMatchesPane.insets = new Insets(0, 0, 0, 5);
		gbc_pveCpuMatchesPane.gridx = 1;
		gbc_pveCpuMatchesPane.gridy = 2;
		pveCpuMatchesPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuMatchesPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Matches:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pveCpuStatsPane.add(pveCpuMatchesPane, gbc_pveCpuMatchesPane);
		GridBagLayout gbl_pveCpuMatchesPane = new GridBagLayout();
		gbl_pveCpuMatchesPane.columnWidths = new int[] { 0, 0 };
		gbl_pveCpuMatchesPane.rowHeights = new int[] { 0, 0 };
		gbl_pveCpuMatchesPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pveCpuMatchesPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pveCpuMatchesPane.setLayout(gbl_pveCpuMatchesPane);

		GridBagConstraints gbc_pveCpuMatchCountLabel = new GridBagConstraints();
		gbc_pveCpuMatchCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pveCpuMatchCountLabel.gridx = 0;
		gbc_pveCpuMatchCountLabel.gridy = 0;
		pveCpuMatchCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pveCpuMatchesPane.add(pveCpuMatchCountLabel, gbc_pveCpuMatchCountLabel);

		GridBagConstraints gbc_pvpPane = new GridBagConstraints();
		gbc_pvpPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvpPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPane.gridx = 1;
		gbc_pvpPane.gridy = 2;
		pvpPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Player vs. Player", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pvpPane, gbc_pvpPane);
		GridBagLayout gbl_pvpPane = new GridBagLayout();
		gbl_pvpPane.columnWidths = new int[] { 0, 0, 0 };
		gbl_pvpPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPane.columnWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		gbl_pvpPane.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		pvpPane.setLayout(gbl_pvpPane);

		GridBagConstraints gbc_pvpPlr1StatsPane = new GridBagConstraints();
		gbc_pvpPlr1StatsPane.insets = new Insets(0, 0, 0, 5);
		gbc_pvpPlr1StatsPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr1StatsPane.gridx = 0;
		gbc_pvpPlr1StatsPane.gridy = 0;
		pvpPlr1StatsPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1StatsPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Player 1:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPane.add(pvpPlr1StatsPane, gbc_pvpPlr1StatsPane);
		GridBagLayout gbl_pvpPlr1StatsPane = new GridBagLayout();
		gbl_pvpPlr1StatsPane.columnWidths = new int[] { 0, 205, 70, 0, 0 };
		gbl_pvpPlr1StatsPane.rowHeights = new int[] { 40, 40, 40, 0 };
		gbl_pvpPlr1StatsPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pvpPlr1StatsPane.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pvpPlr1StatsPane.setLayout(gbl_pvpPlr1StatsPane);

		GridBagConstraints gbc_pvpPlr1WinCountPane = new GridBagConstraints();
		gbc_pvpPlr1WinCountPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr1WinCountPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvpPlr1WinCountPane.gridx = 1;
		gbc_pvpPlr1WinCountPane.gridy = 0;
		pvpPlr1WinCountPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1WinCountPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Wins:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPlr1StatsPane.add(pvpPlr1WinCountPane, gbc_pvpPlr1WinCountPane);
		GridBagLayout gbl_pvpPlr1WinCountPane = new GridBagLayout();
		gbl_pvpPlr1WinCountPane.columnWidths = new int[] { 0, 0 };
		gbl_pvpPlr1WinCountPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPlr1WinCountPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvpPlr1WinCountPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvpPlr1WinCountPane.setLayout(gbl_pvpPlr1WinCountPane);

		GridBagConstraints gbc_pvpPlr1WinCountLabel = new GridBagConstraints();
		gbc_pvpPlr1WinCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pvpPlr1WinCountLabel.gridx = 0;
		gbc_pvpPlr1WinCountLabel.gridy = 0;
		pvpPlr1WinCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1WinCountPane.add(pvpPlr1WinCountLabel, gbc_pvpPlr1WinCountLabel);

		GridBagConstraints gbc_pvpPlr1WinPercentPane = new GridBagConstraints();
		gbc_pvpPlr1WinPercentPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr1WinPercentPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvpPlr1WinPercentPane.gridx = 2;
		gbc_pvpPlr1WinPercentPane.gridy = 0;
		pvpPlr1WinPercentPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1WinPercentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Win %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPlr1StatsPane.add(pvpPlr1WinPercentPane, gbc_pvpPlr1WinPercentPane);
		GridBagLayout gbl_pvpPlr1WinPercentPane = new GridBagLayout();
		gbl_pvpPlr1WinPercentPane.columnWidths = new int[] { 0, 0 };
		gbl_pvpPlr1WinPercentPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPlr1WinPercentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvpPlr1WinPercentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvpPlr1WinPercentPane.setLayout(gbl_pvpPlr1WinPercentPane);

		GridBagConstraints gbc_pvpPlr1WinPercentLabel = new GridBagConstraints();
		gbc_pvpPlr1WinPercentLabel.anchor = GridBagConstraints.EAST;
		gbc_pvpPlr1WinPercentLabel.gridx = 0;
		gbc_pvpPlr1WinPercentLabel.gridy = 0;
		pvpPlr1WinPercentLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1WinPercentPane.add(pvpPlr1WinPercentLabel, gbc_pvpPlr1WinPercentLabel);

		GridBagConstraints gbc_pvpPlr1LossCountPane = new GridBagConstraints();
		gbc_pvpPlr1LossCountPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr1LossCountPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvpPlr1LossCountPane.gridx = 1;
		gbc_pvpPlr1LossCountPane.gridy = 1;
		pvpPlr1LossCountPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1LossCountPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Losses:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPlr1StatsPane.add(pvpPlr1LossCountPane, gbc_pvpPlr1LossCountPane);
		GridBagLayout gbl_pvpPlr1LossCountPane = new GridBagLayout();
		gbl_pvpPlr1LossCountPane.columnWidths = new int[] { 0, 0 };
		gbl_pvpPlr1LossCountPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPlr1LossCountPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvpPlr1LossCountPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvpPlr1LossCountPane.setLayout(gbl_pvpPlr1LossCountPane);

		GridBagConstraints gbc_pvpPlr1LossCountLabel = new GridBagConstraints();
		gbc_pvpPlr1LossCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pvpPlr1LossCountLabel.gridx = 0;
		gbc_pvpPlr1LossCountLabel.gridy = 0;
		pvpPlr1LossCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1LossCountPane.add(pvpPlr1LossCountLabel, gbc_pvpPlr1LossCountLabel);

		GridBagConstraints gbc_pvpPlr1LossPercentPane = new GridBagConstraints();
		gbc_pvpPlr1LossPercentPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr1LossPercentPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvpPlr1LossPercentPane.gridx = 2;
		gbc_pvpPlr1LossPercentPane.gridy = 1;
		pvpPlr1LossPercentPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1LossPercentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Loss %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPlr1StatsPane.add(pvpPlr1LossPercentPane, gbc_pvpPlr1LossPercentPane);
		GridBagLayout gbl_pvpPlr1LossPercentPane = new GridBagLayout();
		gbl_pvpPlr1LossPercentPane.columnWidths = new int[] { 0, 0 };
		gbl_pvpPlr1LossPercentPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPlr1LossPercentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvpPlr1LossPercentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvpPlr1LossPercentPane.setLayout(gbl_pvpPlr1LossPercentPane);

		GridBagConstraints gbc_pvpPlr1LossPercentLabel = new GridBagConstraints();
		gbc_pvpPlr1LossPercentLabel.anchor = GridBagConstraints.EAST;
		gbc_pvpPlr1LossPercentLabel.gridx = 0;
		gbc_pvpPlr1LossPercentLabel.gridy = 0;
		pvpPlr1LossPercentLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1LossPercentPane.add(pvpPlr1LossPercentLabel, gbc_pvpPlr1LossPercentLabel);

		GridBagConstraints gbc_pvpPlr1MatchesPane = new GridBagConstraints();
		gbc_pvpPlr1MatchesPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr1MatchesPane.insets = new Insets(0, 0, 0, 5);
		gbc_pvpPlr1MatchesPane.gridx = 1;
		gbc_pvpPlr1MatchesPane.gridy = 2;
		pvpPlr1MatchesPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1MatchesPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Matches:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPlr1StatsPane.add(pvpPlr1MatchesPane, gbc_pvpPlr1MatchesPane);
		GridBagLayout gbl_pvpPlr1MatchesPane = new GridBagLayout();
		gbl_pvpPlr1MatchesPane.columnWidths = new int[] { 0, 0 };
		gbl_pvpPlr1MatchesPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPlr1MatchesPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvpPlr1MatchesPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvpPlr1MatchesPane.setLayout(gbl_pvpPlr1MatchesPane);

		GridBagConstraints gbc_pvpPlr1MatchCountLabel = new GridBagConstraints();
		gbc_pvpPlr1MatchCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pvpPlr1MatchCountLabel.gridx = 0;
		gbc_pvpPlr1MatchCountLabel.gridy = 0;
		pvpPlr1MatchCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr1MatchesPane.add(pvpPlr1MatchCountLabel, gbc_pvpPlr1MatchCountLabel);

		GridBagConstraints gbc_pvpPlr2StatsPane = new GridBagConstraints();
		gbc_pvpPlr2StatsPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr2StatsPane.gridx = 1;
		gbc_pvpPlr2StatsPane.gridy = 0;
		pvpPlr2StatsPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2StatsPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Player 2", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPane.add(pvpPlr2StatsPane, gbc_pvpPlr2StatsPane);
		GridBagLayout gbl_pvpPlr2StatsPane = new GridBagLayout();
		gbl_pvpPlr2StatsPane.columnWidths = new int[] { 0, 205, 70, 0, 0 };
		gbl_pvpPlr2StatsPane.rowHeights = new int[] { 40, 40, 40, 0 };
		gbl_pvpPlr2StatsPane.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pvpPlr2StatsPane.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pvpPlr2StatsPane.setLayout(gbl_pvpPlr2StatsPane);

		GridBagConstraints gbc_pvpPlr2WinCountPane = new GridBagConstraints();
		gbc_pvpPlr2WinCountPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr2WinCountPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvpPlr2WinCountPane.gridx = 1;
		gbc_pvpPlr2WinCountPane.gridy = 0;
		pvpPlr2WinCountPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2WinCountPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Wins:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPlr2StatsPane.add(pvpPlr2WinCountPane, gbc_pvpPlr2WinCountPane);
		GridBagLayout gbl_pvpPlr2WinCountPane = new GridBagLayout();
		gbl_pvpPlr2WinCountPane.columnWidths = new int[] { 0, 0 };
		gbl_pvpPlr2WinCountPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPlr2WinCountPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvpPlr2WinCountPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvpPlr2WinCountPane.setLayout(gbl_pvpPlr2WinCountPane);

		GridBagConstraints gbc_pvpPlr2WinCountLabel = new GridBagConstraints();
		gbc_pvpPlr2WinCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pvpPlr2WinCountLabel.gridx = 0;
		gbc_pvpPlr2WinCountLabel.gridy = 0;
		pvpPlr2WinCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2WinCountPane.add(pvpPlr2WinCountLabel, gbc_pvpPlr2WinCountLabel);

		GridBagConstraints gbc_pvpPlr2WinPercentPane = new GridBagConstraints();
		gbc_pvpPlr2WinPercentPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr2WinPercentPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvpPlr2WinPercentPane.gridx = 2;
		gbc_pvpPlr2WinPercentPane.gridy = 0;
		pvpPlr2WinPercentPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2WinPercentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Win %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPlr2StatsPane.add(pvpPlr2WinPercentPane, gbc_pvpPlr2WinPercentPane);
		GridBagLayout gbl_pvpPlr2WinPercentPane = new GridBagLayout();
		gbl_pvpPlr2WinPercentPane.columnWidths = new int[] { 0, 0 };
		gbl_pvpPlr2WinPercentPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPlr2WinPercentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvpPlr2WinPercentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvpPlr2WinPercentPane.setLayout(gbl_pvpPlr2WinPercentPane);

		GridBagConstraints gbc_pvpPlr2WinPercentLabel = new GridBagConstraints();
		gbc_pvpPlr2WinPercentLabel.anchor = GridBagConstraints.EAST;
		gbc_pvpPlr2WinPercentLabel.gridx = 0;
		gbc_pvpPlr2WinPercentLabel.gridy = 0;
		pvpPlr2WinPercentLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2WinPercentPane.add(pvpPlr2WinPercentLabel, gbc_pvpPlr2WinPercentLabel);

		GridBagConstraints gbc_pvpPlr2LossCountPane = new GridBagConstraints();
		gbc_pvpPlr2LossCountPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr2LossCountPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvpPlr2LossCountPane.gridx = 1;
		gbc_pvpPlr2LossCountPane.gridy = 1;
		pvpPlr2LossCountPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2LossCountPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Losses:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPlr2StatsPane.add(pvpPlr2LossCountPane, gbc_pvpPlr2LossCountPane);
		GridBagLayout gbl_pvpPlr2LossCountPane = new GridBagLayout();
		gbl_pvpPlr2LossCountPane.columnWidths = new int[] { 0, 0 };
		gbl_pvpPlr2LossCountPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPlr2LossCountPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvpPlr2LossCountPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvpPlr2LossCountPane.setLayout(gbl_pvpPlr2LossCountPane);

		GridBagConstraints gbc_pvpPlr2LossCountLabel = new GridBagConstraints();
		gbc_pvpPlr2LossCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pvpPlr2LossCountLabel.gridx = 0;
		gbc_pvpPlr2LossCountLabel.gridy = 0;
		pvpPlr2LossCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2LossCountPane.add(pvpPlr2LossCountLabel, gbc_pvpPlr2LossCountLabel);

		GridBagConstraints gbc_pvpPlr2LossPercentPane = new GridBagConstraints();
		gbc_pvpPlr2LossPercentPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr2LossPercentPane.insets = new Insets(0, 0, 5, 5);
		gbc_pvpPlr2LossPercentPane.gridx = 2;
		gbc_pvpPlr2LossPercentPane.gridy = 1;
		pvpPlr2LossPercentPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2LossPercentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Loss %:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPlr2StatsPane.add(pvpPlr2LossPercentPane, gbc_pvpPlr2LossPercentPane);
		GridBagLayout gbl_pvpPlr2LossPercentPane = new GridBagLayout();
		gbl_pvpPlr2LossPercentPane.columnWidths = new int[] { 0, 0 };
		gbl_pvpPlr2LossPercentPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPlr2LossPercentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvpPlr2LossPercentPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvpPlr2LossPercentPane.setLayout(gbl_pvpPlr2LossPercentPane);

		GridBagConstraints gbc_pvpPlr2LossPercentLabel = new GridBagConstraints();
		gbc_pvpPlr2LossPercentLabel.anchor = GridBagConstraints.EAST;
		gbc_pvpPlr2LossPercentLabel.gridx = 0;
		gbc_pvpPlr2LossPercentLabel.gridy = 0;
		pvpPlr2LossPercentLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2LossPercentPane.add(pvpPlr2LossPercentLabel, gbc_pvpPlr2LossPercentLabel);

		GridBagConstraints gbc_pvpPlr2MatchesPane = new GridBagConstraints();
		gbc_pvpPlr2MatchesPane.fill = GridBagConstraints.BOTH;
		gbc_pvpPlr2MatchesPane.insets = new Insets(0, 0, 0, 5);
		gbc_pvpPlr2MatchesPane.gridx = 1;
		gbc_pvpPlr2MatchesPane.gridy = 2;
		pvpPlr2MatchesPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2MatchesPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Matches:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		pvpPlr2StatsPane.add(pvpPlr2MatchesPane, gbc_pvpPlr2MatchesPane);
		GridBagLayout gbl_pvpPlr2MatchesPane = new GridBagLayout();
		gbl_pvpPlr2MatchesPane.columnWidths = new int[] { 0, 0 };
		gbl_pvpPlr2MatchesPane.rowHeights = new int[] { 0, 0 };
		gbl_pvpPlr2MatchesPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_pvpPlr2MatchesPane.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		pvpPlr2MatchesPane.setLayout(gbl_pvpPlr2MatchesPane);

		GridBagConstraints gbc_pvpPlr2MatchCountLabel = new GridBagConstraints();
		gbc_pvpPlr2MatchCountLabel.anchor = GridBagConstraints.EAST;
		gbc_pvpPlr2MatchCountLabel.gridx = 0;
		gbc_pvpPlr2MatchCountLabel.gridy = 0;
		pvpPlr2MatchCountLabel.setFont(new Font("Verdana", Font.PLAIN, 12));
		pvpPlr2MatchesPane.add(pvpPlr2MatchCountLabel, gbc_pvpPlr2MatchCountLabel);
	}

}
