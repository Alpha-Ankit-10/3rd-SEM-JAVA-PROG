/*Q1. STUDENT'S registrarion portal using AWT */

import java.awt.*;
import java.awt.event.*;

class StudentRegistration extends Frame implements ActionListener,ItemListener
{

   Button clear,delete,submit;
   Label headingLabel,nameLabel,ageLabel,genderLabel,stateLabel,addressLabel,branchLabel,messgaLabel;
   TextField nameField,ageField;
   CheckboxGroup genderGrp;
   //ButtonGroup branchGroup;
   Checkbox male,female,others;
    Checkbox EEE,CSE,ECE,other;
   Choice state;
   TextArea address;
   Font myFont = new Font ("Serrif", 1, 13);
   Font myfont1=new Font("Serrif",1,18);
   Color c=new Color(0,173,211);
   Color c1=new Color(255,42,99);
	StudentRegistration()
	{
		setVisible(true);
		setSize(500, 600);
		setLayout(null);
		setFont(myFont);
		setBackground(c);
		
		addWindowListener(new WindowAdapter()
		{  
			public void windowClosing(WindowEvent e) 
			{  
                dispose();  
            }  
		});
		

		//HEADING
		headingLabel=new Label("STUDENT REGISTRATION PORTAL");
		headingLabel.setBounds(100, 30, 400, 30);
		headingLabel.setForeground(c1);
		headingLabel.setFont(myfont1);
		
		add(headingLabel);
		
		//name 
		nameLabel=new Label("NAME : ");
		nameLabel.setBounds(60, 80, 50, 20);
		add(nameLabel);

		nameField=new TextField("");
		nameField.setBounds(140, 80, 200, 25);
		add(nameField);

		//AGE
		ageLabel=new Label("AGE : ");
		ageLabel.setBounds(60, 120, 50, 20);
		add(ageLabel);

		ageField=new TextField("");
		ageField.setBounds(140, 120, 200, 25);
		add(ageField);

		//GENDER
		genderLabel=new Label("GENDER : ");
		genderLabel.setBounds(55, 215, 65, 20);
		add(genderLabel);


		 genderGrp=new CheckboxGroup();

		 female= new Checkbox("F",genderGrp,false);
		 female.setBounds(140, 200, 40, 50);
		 add(female);
				
		

		 male= new Checkbox("M",genderGrp,false);
		 male.setBounds(210,200, 40, 50);
		 add(male);

		 
		 others= new Checkbox("Others",genderGrp,false);
		 others.setBounds(270,200, 70, 50);
		 add(others);
		

		  
		 //STATE
		 stateLabel=new Label("STATE: ");
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
		 addressLabel=new Label("ADDRESS: ");
		 addressLabel.setBounds(50, 320, 70, 20);
		 add(addressLabel);

		 address=new TextArea();
		 address.setBounds(140, 320, 300, 100);
		 add(address);



		 //BRANCH
		 branchLabel=new Label("BRANCH: ");
		 branchLabel.setBounds(55, 173, 65, 20);
		 add(branchLabel);
         
		
         
		 EEE=new Checkbox("EEE",false);
		 EEE.addItemListener(this);
		 EEE.setBounds(140, 160, 40, 50);
		 add(EEE);

		CSE=new Checkbox("CSE",false);
		CSE.addItemListener(this);
		CSE.setBounds(210, 160, 40, 50);
		add(CSE);

		 ECE=new Checkbox("ECE",false);
         ECE.addItemListener(this);
		 ECE.setBounds(270, 160, 70, 50);
		 add(ECE);

		 other=new Checkbox("other",false);
		other.addItemListener(this);
		other.setBounds(340, 160, 70, 50);
		add(other);
		 
		 
		 //BUTTONS
		 clear=new Button("CLEAR");
		 clear.setBounds(100, 480, 65, 20);
		 clear.setForeground(Color.YELLOW);
		 clear.setBackground(Color.BLACK);
		 clear.addActionListener(this);
		 add(clear);

		 delete=new Button("DELETE");
		 delete.setBounds(200, 480, 65, 20);
		 delete.setForeground(Color.RED);
		 delete.setBackground(Color.BLACK);
		 delete.addActionListener(this);
		 add(delete);

		 submit=new Button("SUBMIT");
		 submit.setBounds(300, 480, 65, 20);
		 submit.setForeground(Color.GREEN);
		 submit.setBackground(Color.BLACK);
		 submit.addActionListener(this);
		 add(submit);


		 messgaLabel=new Label("");
		
		 messgaLabel.setVisible(false);		
		 messgaLabel.setBounds(120,520,270,40);
		 add(messgaLabel);
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
			System.out.println("gender :"+genderGrp.getSelectedCheckbox().getLabel());
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
			genderGrp.setSelectedCheckbox(null);
			state.select("ODISHA");
			ECE.setState(false);
			EEE.setState(false);
			other.setState(false);
			CSE.setState(false);
		}
		else if(e.getSource()==clear)
		{
			nameField.setText("");
			ageField.setText("");
			address.setText("");
			genderGrp.setSelectedCheckbox(null);
			ECE.setState(false);
			EEE.setState(false);
			other.setState(false);
			CSE.setState(false);
			state.select("ODISHA");
			messgaLabel.setVisible(false);
		}		
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==EEE){
			ECE.setState(false);
			CSE.setState(false);
			other.setState(false);
		}
		else if(e.getSource()==ECE){
			EEE.setState(false);
			CSE.setState(false);
			other.setState(false);
		}
		else if(e.getSource()==CSE){
			EEE.setState(false);
			ECE.setState(false);
			other.setState(false);
		}
		else if(e.getSource()==other){
			EEE.setState(false);
			ECE.setState(false);
			CSE.setState(false);
		}
		
	}
}

class StudentLogin_AWT
{
	public static void main(String[] args) {
		new StudentRegistration();
	}
}

/*

*/