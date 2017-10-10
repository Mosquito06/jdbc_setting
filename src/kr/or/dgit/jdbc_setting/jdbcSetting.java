package kr.or.dgit.jdbc_setting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class jdbcSetting extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jdbcSetting frame = new jdbcSetting();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public jdbcSetting() {
		setTitle("\uB370\uC774\uD130\uBCA0\uC774\uC2A4 \uC138\uD305");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 120);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnInit = new JButton(new BtnAction("�ʱ�ȭ"));
		contentPane.add(btnInit);
		
		JButton btnExport = new JButton(new BtnAction("���"));
		contentPane.add(btnExport);
		
		JButton btnImport = new JButton(new BtnAction("����"));
		contentPane.add(btnImport);
	}

}
