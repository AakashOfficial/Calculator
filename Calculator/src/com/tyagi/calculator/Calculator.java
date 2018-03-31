/**
 * 
 */
package com.tyagi.calculator;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author mr tyagi
 *
 */
public class Calculator implements ActionListener, WindowListener {

	/**
	 * 
	 */
	
	/*Elements for Calculator*/
	JFrame calculatorframe;
    JTextField inputtextfield;
    JButton btnfor1,btnfor2,btnfor3,btnfor4,btnfor5,btnfor6,btnfor7,btnfor8,btnfor9,btnfor0,dividebtn,multiplicationbtn,subtractionbtn,additionbtn,decimalbtn,equalsbtn,deletebtn,clearbtn;
 
    /*Ststic Integers for Inner Use*/
    	static double a=0,b=0,result=0;
    	static int symbol=0;
    
	
	public Calculator() {
		// TODO Auto-generated constructor stub
		
		calculatorframe=new JFrame("Calculator");
        inputtextfield=new JTextField();
        btnfor1=new JButton("1");
        btnfor2=new JButton("2");
        btnfor3=new JButton("3");
        btnfor4=new JButton("4");
        btnfor5=new JButton("5");
        btnfor6=new JButton("6");
        btnfor7=new JButton("7");
        btnfor8=new JButton("8");
        btnfor9=new JButton("9");
        btnfor0=new JButton("0");
        dividebtn=new JButton("/");
        multiplicationbtn=new JButton("*");
        subtractionbtn=new JButton("-");
        additionbtn=new JButton("+");
        decimalbtn=new JButton(".");
        equalsbtn=new JButton("=");
        deletebtn=new JButton("Delete");
        clearbtn=new JButton("Clear");
        
        /*For Taking input from user*/
        inputtextfield.setBounds(30,40,280,30);
        
        /*for buttons in line 1*/
        btnfor1.setBounds(40,240,50,40);
        btnfor2.setBounds(110,240,50,40);
        btnfor3.setBounds(180,240,50,40);
        subtractionbtn.setBounds(250,240,50,40);
        
        btnfor4.setBounds(40,170,50,40);
        btnfor5.setBounds(110,170,50,40);
        btnfor6.setBounds(180,170,50,40);
        multiplicationbtn.setBounds(250,170,50,40);
        
        btnfor7.setBounds(40,100,50,40);
        btnfor8.setBounds(110,100,50,40);
        btnfor9.setBounds(180,100,50,40);
        dividebtn.setBounds(250,100,50,40);
        
        decimalbtn.setBounds(40,310,50,40);
        btnfor0.setBounds(110,310,50,40);
        equalsbtn.setBounds(180,310,50,40);
        additionbtn.setBounds(250,310,50,40);
        
        deletebtn.setBounds(60,380,100,40);
        clearbtn.setBounds(180,380,100,40);
        
        calculatorframe.add(inputtextfield);
        calculatorframe.add(btnfor7);
        calculatorframe.add(btnfor8);
        calculatorframe.add(btnfor9);
        calculatorframe.add(dividebtn);
        calculatorframe.add(btnfor4);
        calculatorframe.add(btnfor5);
        calculatorframe.add(btnfor6);
        calculatorframe.add(multiplicationbtn);
        calculatorframe.add(btnfor1);
        calculatorframe.add(btnfor2);
        calculatorframe.add(btnfor3);
        calculatorframe.add(subtractionbtn);
        calculatorframe.add(decimalbtn);
        calculatorframe.add(btnfor0);
        calculatorframe.add(equalsbtn);
        calculatorframe.add(additionbtn);
        calculatorframe.add(deletebtn);
        calculatorframe.add(clearbtn);
        
        calculatorframe.setLayout(null);
        calculatorframe.setVisible(true);
        calculatorframe.setSize(350,500);
        calculatorframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorframe.setResizable(false);
        
        btnfor1.addActionListener(this);
        btnfor2.addActionListener(this);
        btnfor3.addActionListener(this);
        btnfor4.addActionListener(this);
        btnfor5.addActionListener(this);
        btnfor6.addActionListener(this);
        btnfor7.addActionListener(this);
        btnfor8.addActionListener(this);
        btnfor9.addActionListener(this);
        btnfor0.addActionListener(this);
        additionbtn.addActionListener(this);
        dividebtn.addActionListener(this);
        multiplicationbtn.addActionListener(this);
        subtractionbtn.addActionListener(this);
        decimalbtn.addActionListener(this);
        equalsbtn.addActionListener(this);
        deletebtn.addActionListener(this);
        clearbtn.addActionListener(this);
        calculatorframe.addWindowListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnfor1)
            inputtextfield.setText(inputtextfield.getText().concat("1"));
        
        if(e.getSource()==btnfor2)
            inputtextfield.setText(inputtextfield.getText().concat("2"));
        
        if(e.getSource()==btnfor3)
            inputtextfield.setText(inputtextfield.getText().concat("3"));
        
        if(e.getSource()==btnfor4)
            inputtextfield.setText(inputtextfield.getText().concat("4"));
        
        if(e.getSource()==btnfor5)
            inputtextfield.setText(inputtextfield.getText().concat("5"));
        
        if(e.getSource()==btnfor6)
            inputtextfield.setText(inputtextfield.getText().concat("6"));
        
        if(e.getSource()==btnfor7)
            inputtextfield.setText(inputtextfield.getText().concat("7"));
        
        if(e.getSource()==btnfor8)
            inputtextfield.setText(inputtextfield.getText().concat("8"));
        
        if(e.getSource()==btnfor9)
            inputtextfield.setText(inputtextfield.getText().concat("9"));
        
        if(e.getSource()==btnfor0)
            inputtextfield.setText(inputtextfield.getText().concat("0"));
        
        if(e.getSource()==decimalbtn)
            inputtextfield.setText(inputtextfield.getText().concat("."));
        
        if(e.getSource()==additionbtn)
        {
            a=Double.parseDouble(inputtextfield.getText());
            symbol=1;
            inputtextfield.setText("");
        } 
        
        if(e.getSource()==subtractionbtn)
        {
            a=Double.parseDouble(inputtextfield.getText());
            symbol=2;
            inputtextfield.setText("");
        }
        
        if(e.getSource()==multiplicationbtn)
        {
            a=Double.parseDouble(inputtextfield.getText());
            symbol=3;
            inputtextfield.setText("");
        }
        
        if(e.getSource()==dividebtn)
        {
            a=Double.parseDouble(inputtextfield.getText());
            symbol=4;
            inputtextfield.setText("");
        }
        
        if(e.getSource()==equalsbtn)
        {
            b=Double.parseDouble(inputtextfield.getText());
        
            switch(symbol)
            {
                case 1: result=a+b;
                    break;
        
                case 2: result=a-b;
                    break;
        
                case 3: result=a*b;
                    break;
        
                case 4: result=a/b;
                    break;
    default: result=0;
            }
        
            inputtextfield.setText(""+result);
        }
        
        if(e.getSource()==clearbtn)
            inputtextfield.setText("");
        
        if(e.getSource()==deletebtn)
        {
            String s=inputtextfield.getText();
            inputtextfield.setText("");
            for(int i=0;i<s.length()-1;i++)
            inputtextfield.setText(inputtextfield.getText()+s.charAt(i));
        }        
    }
	
	/*Window listeners*/
	public void windowOpened(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {
       System.exit(0);     
    }
    
    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Calculator();
	}

}
