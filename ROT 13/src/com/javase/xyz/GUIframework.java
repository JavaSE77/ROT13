package com.javase.xyz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Stolen from https://www.geeksforgeeks.org/java-swing-jtextfield/
 * and 
 * http://ntci.on.ca/compsci/java/ch13/13_6.html
 * */

public class GUIframework extends JFrame implements ActionListener {

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Rotter rot;
	private JButton submitButton = new JButton("Rotate");
	private JTextField textToROT;

// JTextField
 static JTextField t;

 // JFrame
 static JFrame f;

 // JButton
 static JButton b;

 // label to display text
 static JLabel l;

 // default constructor
 GUIframework(Rotter rot)
 {
	 
	 this.rot = rot;
	 
	 
	      JFrame frame = new JFrame("ROT 13 by JavaSE");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      // Create fields for I/O
	      textToROT = new JTextField(10);
	      // Add labelled input fields to display
	      JPanel inFieldPane = new JPanel();
	      inFieldPane.setLayout(new GridLayout(2,2));
	      inFieldPane.add(new JLabel("Input text to rotate"));
	      inFieldPane.add(textToROT);
	      textToROT.addActionListener(this);
	      frame.add(inFieldPane,BorderLayout.NORTH);
	      // Add submission button
	      JPanel submitPane = new JPanel();
	      submitPane.setLayout(new FlowLayout());
	      submitPane.add(new JLabel("Press Button to Rotate"));
	      submitButton.addActionListener(this);
	      submitPane.add(submitButton);
	      frame.add(submitPane,BorderLayout.CENTER);
	      // Add Output fields
	      JPanel outFieldPane = new JPanel();
	      outFieldPane.setLayout(new GridLayout(1,2));
	      frame.add(outFieldPane,BorderLayout.SOUTH);
	      // Display the final product
	      frame.pack();
	      frame.setVisible(true);
	 
	 
 }


 // if the button is pressed
 public void actionPerformed(ActionEvent e)
 {
     // Display full name if and only if button was pushed
     if (e.getSource() == submitButton) {

    	 try {
			String rotatedText = rot.rotate(textToROT.getText());
			textToROT.setText(rotatedText);
		} catch (LetterOutOfACSIIRange e1) {
			textToROT.setText("An error occured");
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	 
     }
 }

}