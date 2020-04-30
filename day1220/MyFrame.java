package com.bit.exam01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame implements ActionListener {

	Button btn01;
	Button btn02;
	

	public MyFrame(String title) {
		super(title);
		// TODO Auto-generated constructor stub
		
		btn01 = new Button("남자");
		btn02 = new Button("여자");
		
		setLayout(new FlowLayout());
		add(btn01);
		add(btn02);
		
		btn01.addActionListener(this);
		btn02.addActionListener(this);
		setSize(400, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String cmd = e.getActionCommand();
		if(cmd.equals("남자")) {
			System.out.println("당신은 남자입니다.");
		}else {
			System.out.println("당신은 여자입니다.");
		}
	}

}
