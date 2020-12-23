/*STUDENT'S registrarion portal using SWING */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StudentRegistration extends JFrame implements ActionListener
{
   JButton clear,delete,submit;
   JLabel headingLabel,nameLabel,ageLabel,genderLabel,stateLabel,addressLabel,branchLabel,messgaLabel;
   JTextField nameField,ageField;
   ButtonGroup branchGroup,gendergrp;
   JCheckBox male,female,others;
    JCheckBox EEE,CSE,ECE,other;
   Choice state;
   JTextArea address;
   Font myFont = new Font ("ALGERIAN",1,13);
   Font myfont1=new Font("ALGERIAN",1,18);
   Color c=new Color(0,173,211);
   Color c1=new Color(255,42,99);
   
	StudentRegistration()
	{
		
		setLayout(null);
		getContentPane().setFont(myFont);

		setDefaultCloseOperation(EXIT_ON_CLOSE);    

		//HEADING
		headingLabel=new JLabel("STUDENT REGISTRATION PORTAL");
		headingLabel.setBounds(100, 30, 400, 30);
		headingLabel.setForeground(c1);
		headingLabel.setFont(myfont1);
		
		add(headingLabel);
		
		//name 
		nameLabel=new JLabel("NAME : ");
		nameLabel.setBounds(60, 80, 50, 20);
		add(nameLabel);

		nameField=new JTextField("");
		nameField.setBounds(140, 80, 200, 25);
		add(nameField);

		//AGE
		ageLabel=new JLabel("AGE : ");
		ageLabel.setBounds(60, 120, 50, 20);
		add(ageLabel);

		ageField=new JTextField("");
		ageField.setBounds(140, 120, 200, 25);
		add(ageField);

		//GENDER
		genderLabel=new JLabel("GENDER : ");
		genderLabel.setBounds(55, 215, 65, 20);
		add(genderLabel);


		 
         gendergrp=new ButtonGroup();
		 female= new JCheckBox("F",false);
		 female.setBounds(140, 200, 40, 50);
		 add(female);
		 
				
		

		 male= new JCheckBox("M",false);
		 male.setBounds(210,200, 40, 50);
		 add(male);

		 
		 others= new JCheckBox("Others",false);
		 others.setBounds(270,200, 70, 50);
		 add(others);
		
		 gendergrp.add(female);
		 gendergrp.add(male);
		 gendergrp.add(others);
		  
		 //STATE
		 stateLabel=new JLabel("STATE: ");
		 stateLabel.setBounds(55, 260, 65, 20);
		 add(stateLabel);

		

		 state=new Choice();
		 state.add("ODISHA");
		 state.add("CHATTISHGARH");
		 state.add("MADHYAPRADESH");
		 state.add("BIHAR");
		 state.add("JHARKHAND");
		 state.add("WESTBENGAL");
		 state.add("ANDRAPRADESH");
		 state.add("TELANGANA");
		 state.setBounds(140, 260, 200, 25);
		 add(state);


		 //ADDRESS
		 addressLabel=new JLabel("ADDRESS: ");
		 addressLabel.setBounds(50, 320, 70, 20);
		 add(addressLabel);

		 address=new JTextArea();
		 address.setBounds(140, 320, 300, 100);
		 add(address);



		 //BRANCH
		 branchLabel=new JLabel("BRANCH: ");
		 branchLabel.setBounds(55, 173, 65, 20);
		 add(branchLabel);
         
		
         branchGroup=new ButtonGroup();
		 EEE=new JCheckBox("EEE",false);
		 EEE.setBounds(140, 160, 70, 50);
		 add(EEE);

		CSE=new JCheckBox("CSE",false);
		CSE.setBounds(210, 160, 70, 50);
		add(CSE);

		 ECE=new JCheckBox("ECE",false);
		 ECE.setBounds(290, 160, 70, 50);
		 add(ECE);

		 other=new JCheckBox("other",false);

		other.setBounds(360, 160, 70, 50);
		add(other);

		branchGroup.add(ECE);
		branchGroup.add(other);
		branchGroup.add(CSE);
		branchGroup.add(EEE);
		 
		 
		 //BUTTONS
		 clear=new JButton("CLEAR");
		 clear.setBounds(100, 480, 80, 20);
		 clear.setForeground(Color.YELLOW);
		 clear.setBackground(Color.GRAY);
		 clear.addActionListener(this);
		 add(clear);

		 delete=new JButton("DELETE");
		 delete.setBounds(200, 480, 100, 20);
		 delete.setForeground(Color.RED);
		 delete.setBackground(Color.GRAY);
		 delete.addActionListener(this);
		 add(delete);

		 submit=new JButton("SUBMIT");
		 submit.setBounds(340, 480, 100, 20);
		 submit.setForeground(Color.GREEN);
		 submit.setBackground(Color.GRAY);
		 submit.addActionListener(this);
		 add(submit);


		 messgaLabel=new JLabel("");
		
		 messgaLabel.setVisible(false);		
		 messgaLabel.setBounds(120,520,270,40);
		 add(messgaLabel);

		 setVisible(true);
		setSize(500, 600);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==submit){
		if(nameField.getText().length()==0 || ageField.getText().length()==0 || address.getText().length()==0 )
		{
			messgaLabel.setText("FILL ALL FIELDS !!");
				messgaLabel.setForeground(Color.RED);
				messgaLabel.setFont(new Font("Algerian", 1, 17));
				messgaLabel.setVisible(true);
		}
		else{
			try{
				messgaLabel.setText("Registration Successful !!!");
				messgaLabel.setForeground(Color.GREEN);
				messgaLabel.setVisible(true);		
			System.out.println("name : "+nameField.getText());
			System.out.println("age : "+ageField.getText());
			
		    System.out.println("country :"+state.getItem(state.getSelectedIndex()));
		    System.out.println("Address :"+address.getText());
			}

			catch(Exception ex)
			{
				messgaLabel.setText("FILL ALL FIELDS !!");
				messgaLabel.setForeground(Color.RED);
				messgaLabel.setFont(new Font("Algerian", 1, 17));
				messgaLabel.setVisible(true);
			}
		}   
		}
		else if(e.getSource()==delete){
			nameField.setText("");
			ageField.setText("");
			address.setText("");
	
			state.select("ODISHA");
			ECE.setSelected(false);;
			EEE.setSelected(false);
			other.setSelected(false);
			CSE.setSelected(false);
		}
		else if(e.getSource()==clear)
		{
			nameField.setText("");
			ageField.setText("");
			address.setText("");
		
			ECE.setSelected(false);
			EEE.setSelected(false);
			other.setSelected(false);
			CSE.setSelected(false);
			state.select("ODISHA");
			messgaLabel.setVisible(false);
		}		
	}
	
}
class StudentLogin_Swing
{
	public static void main(String[] args) {
		new StudentRegistration();
	}
}

/*
E:\SEMESTER 3\Java\JAVA LAB PROG>java StudentLogin_Swing
name : ankit das
age : 21
country :ODISHA
Address :SILICON INSTITUTE BBSR
*/