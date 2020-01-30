package com.ccx.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MianFrm extends JFrame {

	private JPanel contentPane;
	private JDesktopPane table_1=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MianFrm frame = new MianFrm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MianFrm() {
		setTitle("图书管理系统主界面");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 437);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("基本数据维护");
		menu.setIcon(new ImageIcon(MianFrm.class.getResource("/images/base.png")));
		menuBar.add(menu);
		
		JMenu menu_2 = new JMenu("图书类别管理");
		menu_2.setIcon(new ImageIcon(MianFrm.class.getResource("/images/bookTypeManager.png")));
		menu.add(menu_2);
		
		JMenuItem menuItem = new JMenuItem("图书类别添加");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookTypeAddInterFrm  bookTypeAddInterFrm=new BookTypeAddInterFrm();
				bookTypeAddInterFrm.setVisible(true);
				table_1.add(bookTypeAddInterFrm);
			}
		});
		menuItem.setIcon(new ImageIcon(MianFrm.class.getResource("/images/add.png")));
		menu_2.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("图书类别维护");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BookTypeManagerInterFrm  bookTypeManagerInterFrm=new BookTypeManagerInterFrm();
				bookTypeManagerInterFrm.setVisible(true);
				table_1.add(bookTypeManagerInterFrm);
			}
		});
		menuItem_1.setIcon(new ImageIcon(MianFrm.class.getResource("/images/edit.png")));
		menu_2.add(menuItem_1);
		
		JMenu menu_3 = new JMenu("图书管理");
		menu_3.setIcon(new ImageIcon(MianFrm.class.getResource("/images/bookManager.png")));
		menu.add(menu_3);
		
		JMenuItem menuItem_2 = new JMenuItem("图书添加");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAddInterFrm  bookAddInterFrm=new BookAddInterFrm();
				bookAddInterFrm.setVisible(true);
				table_1.add(bookAddInterFrm);
			}
		});
		menuItem_2.setIcon(new ImageIcon(MianFrm.class.getResource("/images/add.png")));
		menu_3.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("图书维护");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookManagerInterFrm  bookManagerInterFrm=new BookManagerInterFrm();
				bookManagerInterFrm.setVisible(true);
				table_1.add(bookManagerInterFrm);
			}
		});
		menuItem_3.setIcon(new ImageIcon(MianFrm.class.getResource("/images/edit.png")));
		menu_3.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("安全退出");
		menuItem_4.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				int result=JOptionPane.showConfirmDialog(null, "是否退出系统");
				//System.out.println(result);
				if(result==0) {
					dispose();
				}
			}
		});
		menuItem_4.setIcon(new ImageIcon(MianFrm.class.getResource("/images/exit.png")));
		menu.add(menuItem_4);
		
		JMenu menu_1 = new JMenu("关于我们");
		menu_1.setIcon(new ImageIcon(MianFrm.class.getResource("/images/about.png")));
		menuBar.add(menu_1);
		
		JMenuItem mntmccx = new JMenuItem("关于ccx");
		mntmccx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Java javainter=new Java();
				javainter.setVisible(true);
				table_1.add(javainter);
			}
		});
		mntmccx.setIcon(new ImageIcon(MianFrm.class.getResource("/images/about.png")));
		menu_1.add(mntmccx);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		table_1 = new JDesktopPane();
		table_1.setBackground(Color.WHITE);
		contentPane.add(table_1, BorderLayout.CENTER);
		
		//设置JFrame最大化
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
