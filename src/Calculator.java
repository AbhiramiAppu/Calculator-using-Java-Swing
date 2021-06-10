import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	JFrame jf;
	JLabel displayLabel;
	JTextField textField; 
	JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton;
	JButton oneButton,twoButton,threeButton,dotButton,zeroButton,equalButton;
	JButton divButton,mulButton,minusButton,plusButton,clearButton,deleteButton,modButton;
	JButton reciprocalButton,squareButton,sqrtButton,signButton;
	String oldValue,newValue;
	Double number,answer;
	int calculation;
	Boolean isOperatorClicked = false;
	
	public Calculator(){
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(350,100);
		
		
		displayLabel = new JLabel();
		displayLabel.setBounds(30, 20 , 520, 40);
		//displayLabel.setBackground(Color.WHITE);
		//displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.BLACK);
		displayLabel.setFont(new Font("Arial",Font.PLAIN, 20));
		jf.add(displayLabel);
		
		textField = new JTextField();
		textField.setBounds(30,60 , 520, 40);
		textField.setBackground(Color.white);
		textField.setOpaque(true);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setForeground(Color.black);
        jf.add(textField);
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(60, 150, 60, 60);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 25));
		//sevenButton.setBackground(Color.white);
		sevenButton.setBackground(Color.darkGray);
		sevenButton.setForeground(Color.white);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(140, 150, 60, 60);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 25));
		//eightButton.setBackground(Color.white);
		eightButton.setBackground(Color.darkGray);
		eightButton.setForeground(Color.white);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(220, 150, 60, 60);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 25));
		//nineButton.setBackground(Color.white);
		nineButton.setBackground(Color.darkGray);
		nineButton.setForeground(Color.white);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(60, 230, 60, 60);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 25));
		//fourButton.setBackground(Color.white);
		fourButton.setBackground(Color.darkGray);
		fourButton.setForeground(Color.white);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(140, 230, 60, 60);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 25));
		//fiveButton.setBackground(Color.white);
		fiveButton.setBackground(Color.darkGray);
		fiveButton.setForeground(Color.white);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(220, 230, 60, 60);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 25));
		//sixButton.setBackground(Color.white);
		sixButton.setBackground(Color.darkGray);
		sixButton.setForeground(Color.white);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(60, 310, 60, 60);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 25));
		//oneButton.setBackground(Color.white);
		oneButton.setBackground(Color.darkGray);
		oneButton.setForeground(Color.white);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(140, 310, 60, 60);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 25));
		//twoButton.setBackground(Color.white);
		twoButton.setBackground(Color.darkGray);
		twoButton.setForeground(Color.white);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(220, 310, 60, 60);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 25));
		//threeButton.setBackground(Color.white);
		threeButton.setBackground(Color.darkGray);
		threeButton.setForeground(Color.white);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton = new JButton(".");
		dotButton.setBounds(60, 390, 60, 60);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		//dotButton.setBackground(Color.white);
		dotButton.setBackground(Color.darkGray);
		dotButton.setForeground(Color.white);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(140, 390, 60, 60);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 25));
		//zeroButton.setBackground(Color.white);
		zeroButton.setBackground(Color.darkGray);
		zeroButton.setForeground(Color.white);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(220, 390, 60, 60);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 25));
		equalButton.setBackground(Color.cyan);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divButton = new JButton("/");
		divButton.setBounds(300, 150, 60, 60);
		divButton.setFont(new Font("Arial", Font.PLAIN, 25));
		divButton.setBackground(Color.pink);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton = new JButton("x");
		mulButton.setBounds(300, 230, 60, 60);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 25));
		mulButton.setBackground(Color.pink);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton = new JButton("-");
		minusButton.setBounds(300, 310, 60, 60);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 30));
		minusButton.setBackground(Color.pink);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton = new JButton("+");
		plusButton.setBounds(300, 390, 60, 60);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 25));
		plusButton.setBackground(Color.pink);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		modButton = new JButton("%");
		modButton.setBounds(380, 150, 60, 60);
		modButton.setFont(new Font("Arial", Font.PLAIN, 25));
		modButton.setBackground(Color.pink);
		modButton.addActionListener(this);
		jf.add(modButton);
		
		reciprocalButton = new JButton("1/x");
		reciprocalButton.setBounds(380, 230, 60, 60);
		reciprocalButton.setFont(new Font("Arial", Font.PLAIN, 20));
		reciprocalButton.setBackground(Color.pink);
		reciprocalButton.addActionListener(this);
		jf.add(reciprocalButton);
		
		squareButton = new JButton("x\u00B2");
		squareButton.setBounds(380, 310, 60, 60);
		squareButton.setFont(new Font("Arial", Font.PLAIN, 25));
		squareButton.setBackground(Color.pink);
		squareButton.addActionListener(this);
		jf.add(squareButton);
		
		sqrtButton = new JButton("\u221A");
		sqrtButton.setBounds(380, 390, 60, 60);
		sqrtButton.setFont(new Font("Arial", Font.PLAIN, 25));
		sqrtButton.setBackground(Color.pink);
		sqrtButton.addActionListener(this);
		jf.add(sqrtButton);
		
		deleteButton = new JButton("DEL");
		deleteButton.setBounds(460, 230, 60, 60);
		deleteButton.setFont(new Font("Arial", Font.PLAIN, 13));
		deleteButton.setBackground(Color.white);
		deleteButton.setForeground(Color.black);
		deleteButton.addActionListener(this);
		jf.add(deleteButton);
		
		clearButton = new JButton("C");
		clearButton.setBounds(460, 310, 60, 60);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 25));
		clearButton.setBackground(Color.white);
		clearButton.setForeground(Color.black);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		signButton = new JButton("+/-");
		signButton.setBounds(460, 390, 60, 60);
		signButton.setFont(new Font("Arial", Font.PLAIN, 22));
		signButton.setBackground(Color.white);
		signButton.setForeground(Color.black);
		signButton.addActionListener(this);
		jf.add(signButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sevenButton) {
			//if(isOperatorClicked == true) {
				//textField.setText("7");
				//isOperatorClicked = false;
			//}else {
				textField.setText(textField.getText()+"7");
			//}
			
		}else if(e.getSource() == eightButton) {
				textField.setText(textField.getText()+"8");
		}else if(e.getSource() == nineButton) {
			textField.setText(textField.getText()+"9");
		}else if(e.getSource() == fourButton) {
			textField.setText(textField.getText()+"4");
		}else if(e.getSource() == fiveButton) {
			textField.setText(textField.getText()+"5");
		}else if(e.getSource() == sixButton) {
			textField.setText(textField.getText()+"6");
		}else if(e.getSource() == oneButton) {
			textField.setText(textField.getText()+"1");
		}else if(e.getSource() == twoButton) {
			textField.setText(textField.getText()+"2");
		}else if(e.getSource() == threeButton) {
			textField.setText(textField.getText()+"3");
		}else if(e.getSource() == zeroButton) {
			textField.setText(textField.getText()+"0");
		}else if(e.getSource() == dotButton) {
			textField.setText(textField.getText()+".");
			
		}else if(e.getSource() == modButton) {
			oldValue = textField.getText();
			number = Double.parseDouble(textField.getText());
            textField.setText("");
            displayLabel.setText(oldValue + "%");
            calculation = 5;
		
		}else if(e.getSource() == divButton) {
			oldValue = textField.getText();
			number = Double.parseDouble(textField.getText());
            textField.setText("");
            displayLabel.setText(oldValue + "/");
            calculation = 4;
		
		}else if(e.getSource() == mulButton) {
			oldValue = textField.getText();
			number = Double.parseDouble(textField.getText());
            textField.setText("");
            displayLabel.setText(oldValue + "x");
            calculation = 3;
		
		}else if(e.getSource() == minusButton) {
			oldValue = textField.getText();
			number = Double.parseDouble(textField.getText());
            textField.setText("");
            displayLabel.setText(oldValue + "-");
            calculation = 2;
		
		}else if(e.getSource() == plusButton) {
			//isOperatorClicked = true;
			oldValue = textField.getText();
			number = Double.parseDouble(textField.getText());
            textField.setText("");
            displayLabel.setText(oldValue + "+");
           
            calculation = 1;
          // isOperatorClicked = false;
            
			
		}else if(e.getSource() == reciprocalButton) {
			number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            
		}else if(e.getSource() == squareButton) {
			String str = textField.getText();
	        number = Double.parseDouble(textField.getText());
	        double square = Math.pow(number, 2);
	        String string = Double.toString(square);
	        if (string.endsWith(".0")) {
	            textField.setText(string.replace(".0", ""));
	        } else {
	            textField.setText(string);
	        }
	        displayLabel.setText("(sqr)" + str);
			
		}else if(e.getSource() == signButton) {
			//textField.setText("(-");
			Double operands = Double.parseDouble(textField.getText());
            operands = operands * (-1);
            String string = Double.toString(operands);
            if (string.endsWith(".0")) {
	            textField.setText(string.replace(".0", ""));
	        } else {
	            textField.setText(string);
	        }
            
		}else if(e.getSource() == sqrtButton) {
			number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            String string = Double.toString(sqrt);
            if (string.endsWith(".0")) {
	            textField.setText(string.replace(".0", ""));
	        } else {
	            textField.setText(string);
	        }
            
		}else if(e.getSource() == clearButton) {
			textField.setText("");
		}else if(e.getSource() == deleteButton) {
			 int length = textField.getText().length();
	         int number = length - 1;


	            if (length > 0) {
	                StringBuilder back = new StringBuilder(textField.getText());
	                back.deleteCharAt(number);
	                textField.setText(back.toString());
	                //displayLabel.setText(back.toString());

	            }
	            if (textField.getText().endsWith("")) {
	                displayLabel.setText("");
	            }
		}
		else if(e.getSource() == equalButton) {
			
			switch (calculation) {
            case 1:
                answer = number + Double.parseDouble(textField.getText());
                if (Double.toString(answer).endsWith(".0")) {
                    textField.setText(Double.toString(answer).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(answer));
                }
                displayLabel.setText("");
                break;
            case 2:
                answer = number - Double.parseDouble(textField.getText());
                if (Double.toString(answer).endsWith(".0")) {
                    textField.setText(Double.toString(answer).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(answer));
                }
                displayLabel.setText("");
                break;
            case 3:
                answer = number * Double.parseDouble(textField.getText());
                if (Double.toString(answer).endsWith(".0")) {
                    textField.setText(Double.toString(answer).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(answer));
                }
                displayLabel.setText("");
                break;
            case 4:
                answer = number / Double.parseDouble(textField.getText());
                if (Double.toString(answer).endsWith(".0")) {
                    textField.setText(Double.toString(answer).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(answer));
                }
                displayLabel.setText("");
                break;
            case 5:
                answer = number % Double.parseDouble(textField.getText());
                if (Double.toString(answer).endsWith(".0")) {
                    textField.setText(Double.toString(answer).replace(".0", ""));
                } else {
                    textField.setText(Double.toString(answer));
                }
                displayLabel.setText("");
                break;
			}
		}
			
	}
}
