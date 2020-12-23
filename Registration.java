import java.awt.*;
import java.awt.event.*;

class RegistrationFrame extends Frame implements ActionListener{

   Button clear,delete,submit;
   Label headingLabel,nameLabel,ageLabel,genderLabel,countryLabel,addressLabel,salaryLabel,messgaLabel;
   TextField nameField,ageField;
   CheckboxGroup genderGrp,salaryGrp;
   Checkbox male,female,others,salary1,salary2,salary3;
   Choice country;
   TextArea address;
   Font myFont = new Font ("Algerian", 1, 13);
   
	RegistrationFrame()
	{
		setVisible(true);
		setSize(500, 600);
		setLayout(null);
		setFont(myFont);
		setBackground(Color.GRAY);
		

		//HEADING
		headingLabel=new Label("EMPLOYEE REGISTRATION PORTAL");
		headingLabel.setBounds(100, 30, 400, 30);
		headingLabel.setForeground(Color.BLUE);
		
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
		genderLabel.setBounds(55, 173, 65, 20);
		add(genderLabel);


		 genderGrp=new CheckboxGroup();

		 female= new Checkbox("F",genderGrp,false);
		 female.setBounds(140, 160, 40, 50);
		 add(female);
				
		

		 male= new Checkbox("M",genderGrp,false);
		 male.setBounds(210, 160, 40, 50);
		 add(male);

		 
		 others= new Checkbox("Others",genderGrp,false);
		 others.setBounds(270, 160, 70, 50);
		 add(others);
		

		  
		 //COUNTRY
		 countryLabel=new Label("COUNTRY: ");
		 countryLabel.setBounds(55, 210, 65, 20);
		 add(countryLabel);

		 country=new Choice();
		 country.add("INDIA");
		 country.add("BANGLADESH");
		 country.add("NEPAL");
		 country.add("INDONESIA");
		 country.add("BHUTAN");
		 country.add("SRILANKA");
		 country.add("MYANMAAR");
		 country.add("THAILAND");
		 country.setBounds(140, 210, 200, 25);
		 add(country);


		 //ADDRESS
		 addressLabel=new Label("ADDRESS: ");
		 addressLabel.setBounds(55, 260, 65, 20);
		 add(addressLabel);

		 address=new TextArea();
		 address.setBounds(140, 260, 300, 100);
		 add(address);



		 //SALARY
		 salaryLabel=new Label("SALARY: ");
		 salaryLabel.setBounds(55, 413, 65, 20);
		 add(salaryLabel);
         
		 salaryGrp=new CheckboxGroup();

		 salary1=new Checkbox("5000-10000",salaryGrp,false);
		 salary1.setBounds(140, 400, 100, 50);
		 add(salary1);

		 salary2=new Checkbox("11000-20000",salaryGrp,false);
		 salary2.setBounds(250, 400, 100, 50);
		 add(salary2);

		 salary3=new Checkbox(">20000",salaryGrp,false);
		 salary3.setBounds(360, 400, 100, 50);
		 add(salary3);

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


		 //message
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
		    System.out.println("country :"+country.getItem(country.getSelectedIndex()));
		    System.out.println("Address :"+address.getText());
			System.out.println("salary :"+salaryGrp.getSelectedCheckbox().getLabel());
			
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
			salaryGrp.setSelectedCheckbox(null);
			country.select("INDIA");
		}
		else if(e.getSource()==clear)
		{
			nameField.setText("");
			ageField.setText("");
			address.setText("");
			genderGrp.setSelectedCheckbox(null);
			salaryGrp.setSelectedCheckbox(null);
			country.select("INDIA");
			messgaLabel.setVisible(false);

		}	
	}

}
public class Registration
{
	public static void main(String[] args) {
		new RegistrationFrame();
	}
}