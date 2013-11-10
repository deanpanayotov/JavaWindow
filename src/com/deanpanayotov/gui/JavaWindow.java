package com.deanpanayotov.gui;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * My default implementation of a java window.
 * 
 * @author 073468
 * 
 */
public class JavaWindow extends JFrame {
	///////////////////////////////////////////////////////////////	@formatter:off

	private static final int 		DEFAULT_WIDTH 		= 300;
	private static final int 		DEFAULT_HEIGHT 		= 300;
	private static final boolean 	DEFAULT_VISIBLE 	= true;
	private static final boolean 	DEFAULT_RESIZEABLE 	= false;
	
	///////////////////////////////////////////////////////////////	@formatter:on
	/**
	 * @see {@link JavaWindow#DEFAULT_WIDTH}
	 * @see {@link JavaWindow#DEFAULT_HEIGHT}
	 * @see {@link JavaWindow#DEFAULT_VISIBLE}
	 * @see {@link JavaWindow#DEFAULT_RESIZEABLE}
	 */
	public JavaWindow() {
		this(DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_VISIBLE, DEFAULT_RESIZEABLE);
	}

	/**
	 * @see {@link JavaWindow#DEFAULT_VISIBLE}
	 * @see {@link JavaWindow#DEFAULT_RESIZEABLE}
	 * @param width
	 * @param height
	 */
	public JavaWindow(int width, int height) {
		this(width, height, DEFAULT_VISIBLE, DEFAULT_RESIZEABLE);
	}

	/**
	 * @see {@link JavaWindow#DEFAULT_WIDTH}
	 * @see {@link JavaWindow#DEFAULT_HEIGHT}
	 * @param visible
	 * @param resizable
	 */
	public JavaWindow(boolean visible, boolean resizable) {
		this(DEFAULT_WIDTH, DEFAULT_HEIGHT, visible, resizable);
	}

	/**
	 * Full constructor.
	 * 
	 * @param width
	 * @param height
	 * @param visible
	 * @param resizable
	 */
	public JavaWindow(int width, int height, boolean visible, boolean resizable) {
		super("JavaWindow");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(visible);
		this.setResizable(resizable);
		this.setBounds(new Rectangle(width, height));
		this.center();
		this.setLayout(null);

	}

	/**
	 * Puts the window in the center of the screen.
	 */
	private void center() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension scrnsize = toolkit.getScreenSize();
		this.setBounds((int) (scrnsize.getWidth() / 2 - this.getWidth() / 2),
				(int) (scrnsize.getHeight() / 2 - this.getHeight() / 2),
				this.getWidth(), this.getHeight());

	}
}
