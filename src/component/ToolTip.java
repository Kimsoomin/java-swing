package component;

import javax.swing.*;

public class ToolTip {
	 private static void createAndShowGUI() {
	        JFrame frame = new JFrame("안녕 스윙 월드");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        JLabel label = new JLabel("안녕 스윙");
	        JToolTip tool = new JToolTip();
	        frame.getContentPane().add(label);
	        frame.pack();
	        frame.setVisible(true);
	    }
	 
	    public static void main(String[] args) {
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
}
