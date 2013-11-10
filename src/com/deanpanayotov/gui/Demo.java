package com.deanpanayotov.gui;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo {
	public static void main(String[] args) {
		JFrame window = new DemoWindow(300, 200, true, false);
	}

	/**
	 * a rather bad example (static inner..)
	 * 
	 * @author 073468
	 * 
	 */
	private static class DemoWindow extends JavaWindow {
		public DemoWindow(int width, int height, boolean visible,
				boolean resizable) {
			super(width, height, visible, resizable);
			this.setName("Demo Window");
			JButton buttonTest = new JButton("Test");
			JLabel labelDescription = new JLabel("This is a test window.");
			this.setLayout(new BoxLayout(this.getContentPane(),
					BoxLayout.Y_AXIS));
			this.add(labelDescription);
			this.add(buttonTest);
		}
	}
}
