package projectFRAME;
import Interfaces.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Agent extends JFrame implements MouseListener, ActionListener,IAgent
{
	ImageIcon img;
	JLabel insrtac, acname, acnmbr, cash, username1, passname, addDeposite, anotherAcNmbr,usernameaddrmv,imgLabel, amount;
	JButton insertbtn, backbtn, addBtn, depositeBtn;
	JTextField  acnameTF, acnmbrTF, cashTF, usernameTF, anotherAcNmbrTF, amountTF,usernameaddrmvTF;
	JPasswordField password;
	JPanel panel;
	Color myColor;
	Font myFont;
		Color v1=new Color(255,51,51);
	
	public Agent(){
		
		super("Customer Insert page");
		this.setSize(900,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor = new Color(0,200,100);
		myFont = new Font("Arial Black", Font.PLAIN, 15);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		//For INSERT ACCOUNT :::
		
		insrtac=new JLabel("Register New Account :");
		insrtac.setBounds(30,30,200,20);
		insrtac.setForeground(Color.BLUE);
		insrtac.setFont(myFont);
		panel.add(insrtac);
		
		acname=new JLabel("Account Holder Name");
		acname.setBounds(30,80,130,20);
		panel.add(acname);
		
		acnmbr=new JLabel("Account Number");
		acnmbr.setBounds(30,100,130,20);
		panel.add(acnmbr);
		
		username1=new JLabel("Username");
		username1.setBounds(30,120,130,20);
		panel.add(username1);
		
		passname=new JLabel("Password");
		passname.setBounds(30,140,130,20);
		panel.add(passname);
		
		cash=new JLabel("Cash");
		cash.setBounds(30,160,130,20);
		panel.add(cash);
		
		//TEXTFIELD START...
		
		acnameTF=new JTextField();
		acnameTF.setBounds(160,80,100,20);
		//acnameTF.setBackground(Color.CYAN);
		panel.add(acnameTF);
		
		acnmbrTF=new JTextField();
		acnmbrTF.setBounds(160,100,100,20);
		//acnmbrTF.setBackground(Color.CYAN);
		panel.add(acnmbrTF);
		
		usernameTF=new JTextField();
		usernameTF.setBounds(160,120,100,20);
		//usernameTF.setBackground(Color.CYAN);
		panel.add(usernameTF);
		
		password=new JPasswordField();
		password.setBounds(160,140,100,20);
		//password.setBackground(Color.CYAN);
		panel.add(password);
		
		cashTF=new JTextField();
		cashTF.setBounds(160,160,100,20);
		//cashTF.setBackground(Color.CYAN);
		panel.add(cashTF);
		
		//BUTTON START...
		
		insertbtn=new JButton("Insert");
		insertbtn.setBounds(90,200,80,30);
		insertbtn.addMouseListener(this);
		insertbtn.addActionListener(this);
	    insertbtn.setBackground(Color.YELLOW);
		panel.add(insertbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(360,350,100,40);
		backbtn.addMouseListener(this);
		backbtn.addActionListener(this);
		backbtn.setBackground(v1);
		panel.add(backbtn);
		
		
		
		//FOR ADD/DEPOSITE MONEY...::
		
		addDeposite=new JLabel("Add or Deposite in An Account :");
		addDeposite.setBounds(500,30,350,20);
		addDeposite.setForeground(Color.BLUE);
		addDeposite.setFont(myFont);
		panel.add(addDeposite);
		
		anotherAcNmbr=new JLabel("Enter Account Number");
		anotherAcNmbr.setBounds(500,70,150,30);
		panel.add(anotherAcNmbr);
		
		usernameaddrmv=new JLabel("Enter Username");
		usernameaddrmv.setBounds(500,110,150,30);
		panel.add(usernameaddrmv);
		
		amount=new JLabel("Enter Amount");
		amount.setBounds(500,150,150,30);
		panel.add(amount);
		
		//TEXTFIELD..::
		
		anotherAcNmbrTF=new JTextField();
		anotherAcNmbrTF.setBounds(700,70,150,30);
		//anotherAcNmbrTF.setBackground(Color.CYAN);
		panel.add(anotherAcNmbrTF);
		
		usernameaddrmvTF=new JTextField();
		usernameaddrmvTF.setBounds(700,110,150,30);
		//usernameaddrmvTF.setBackground(Color.CYAN);
		panel.add(usernameaddrmvTF);
		
		amountTF=new JTextField();
		amountTF.setBounds(700,150,150,30);
		//amountTF.setBackground(Color.CYAN);
		panel.add(amountTF);
		
		//BUTTON..::
		
		addBtn=new JButton("Add Money");
		addBtn.setBounds(500,190,150,30);
		addBtn.addMouseListener(this);
		addBtn.addActionListener(this);
		addBtn.setBackground(Color.YELLOW);
		panel.add(addBtn);
		
		depositeBtn=new JButton("Deposite Money");
		depositeBtn.setBounds(670,190,170,30);
		depositeBtn.addMouseListener(this);
		depositeBtn.addActionListener(this);
		depositeBtn.setBackground(Color.YELLOW);
		panel.add(depositeBtn);
		
		
		
		
		
		//Image:::
		
		img = new ImageIcon("oop4.jpeg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(460,180 , 500, 300);
		panel.add(imgLabel);
		
		
		
		this.add(panel);
	}
	//MOUSE LISTENER...::
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == insertbtn)
		{
			insertbtn.setBackground(Color.BLUE);
			insertbtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == backbtn)
		{
			backbtn.setBackground(Color.RED);
			backbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == addBtn)
		{
			addBtn.setBackground(Color.DARK_GRAY);
			addBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == depositeBtn)
		{
			depositeBtn.setBackground(Color.MAGENTA);
			depositeBtn.setForeground(Color.WHITE);
		}
		
		else
		{
			
		}
	}
	
	
	//ACTIONLISTENER...::
	
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == insertbtn)
		{
			insertbtn.setBackground(Color.YELLOW);
			insertbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == backbtn)
		{
			backbtn.setBackground(v1);
			backbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == addBtn)
		{
			addBtn.setBackground(Color.YELLOW);
			addBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == depositeBtn)
		{
			depositeBtn.setBackground(Color.YELLOW);
			depositeBtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	
	public void actionPerformed(ActionEvent ae){
		
		String cmd= ae.getActionCommand();
		
		
		//ACCOUNT CREATION...::
		
		
		
		if(insertbtn.getText().equals(cmd)){
			String s1=acnameTF.getText();
			String s2=acnmbrTF.getText();
			String s3=usernameTF.getText();
			String s4=password.getText().toString();
			String s5=cashTF.getText();
			
			if(s1.length()>2 && s2.length()>3 && s3.length()>2 && s4.length()>2 && s5.length()>1)
			{
				try{
					FileWriter file= new FileWriter("E:\\EDUCATION\\2nd semester\\JAVA\\Project\\My project\\projectFRAME\\"+s3+".txt");
					file.write(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n");
					file.close();
					showMessageDialog(null,"New Account Created");
				}
				catch(Exception io){
					io.printStackTrace();
					}
			
				
			}
			else{
				showMessageDialog(null,"Please Fill All The Critaria");
				
				
				
			}
			
			
		}
		
		
//FOR ADDING MONEY...::

		else if(addBtn.getText().equals(cmd)){
			
			String line1="";	String nmbr =anotherAcNmbrTF.getText();
			String line2="";	String nme =usernameaddrmvTF.getText();
			String line3="";	String amt =amountTF.getText();
			String line4="";
			String line5="";
			
			//showMessageDialog(null,"pr");
			try{
				FileReader fr= new FileReader("E:\\EDUCATION\\2nd semester\\JAVA\\Project\\My project\\projectFRAME\\"+usernameaddrmvTF.getText()+".txt");
				Scanner sc = new Scanner(fr);
				
				while(sc.hasNext())
				{
				 line1 = sc.nextLine();//name
				 line2 = sc.nextLine();//acount nmbr
				 line3 = sc.nextLine();//username
				 line4 = sc.nextLine();//password
				 line5 = sc.nextLine();//cash
				}
				
				//showMessageDialog(null,line3);
				if(nmbr.equals(line2) && nme.equals(line3)){
					
					double a= Double.parseDouble(line5);
					double b= Double.parseDouble(amt);
					
					double cash=a+b;
					
					line5= String.valueOf(cash);
				
					FileWriter file= new FileWriter("E:\\EDUCATION\\2nd semester\\JAVA\\Project\\My project\\projectFRAME\\"+nme+".txt");
					file.write(line1+"\n"+line2+"\n"+line3+"\n"+line4+"\n"+line5+"\n");
					file.close();
				
					showMessageDialog(null, "Money Added");
				}	
				else{
					showMessageDialog(null,"Incorrect Account Number or Account Doesn't Exist");
				}
			fr.close();	
			}
			catch(Exception io){
							showMessageDialog(null, "Wrong Username");
							io.printStackTrace();
						}
		
		}
		
	//	FOR DEPOSITE MONEY..::
	
	

		else if(depositeBtn.getText().equals(cmd)){
			
			String line1="";	String nmbr =anotherAcNmbrTF.getText();
			String line2="";	String nme =usernameaddrmvTF.getText();
			String line3="";	String amt =amountTF.getText();
			String line4="";
			String line5="";
			
			
			try{
				FileReader fr= new FileReader("E:\\EDUCATION\\2nd semester\\JAVA\\Project\\My project\\projectFRAME\\"+usernameaddrmvTF.getText()+".txt");
				Scanner sc = new Scanner(fr);
				
				while(sc.hasNext())
				{
				 line1 = sc.nextLine();//name
				 line2 = sc.nextLine();//acount nmbr
				 line3 = sc.nextLine();//username
				 line4 = sc.nextLine();//password
				 line5 = sc.nextLine();//cash
				}
				
				//showMessageDialog(null,line3);
				if(nmbr.equals(line2) && nme.equals(line3)){
					
					double a= Double.parseDouble(line5);
					double b= Double.parseDouble(amt);
					if(a>b){
					double cash=a-b;
					
					line5= String.valueOf(cash);
				
					FileWriter file= new FileWriter("E:\\EDUCATION\\2nd semester\\JAVA\\Project\\My project\\projectFRAME\\"+nme+".txt");
					file.write(line1+"\n"+line2+"\n"+line3+"\n"+line4+"\n"+line5+"\n");
					file.close();
				
					showMessageDialog(null, "Money Deposited");
				}
				else{showMessageDialog(null,"You Do Not Have Enough Cash");}
				}	
				else{
					showMessageDialog(null,"Incorrect Account Number or Account Doesn't Exist");
				}
			fr.close();	
			}
			catch(Exception io){
							showMessageDialog(null, "Wrong Username");
							io.printStackTrace();
						}
		
		}
		
		
		
		//FOR GOING BACK...::
		

		else if(backbtn.getText().equals(cmd)){
			LoginPage lp =new LoginPage();
			lp.setVisible(true);
			this.setVisible(false);
		}
		
			
		
		
		
	}
public void Agentform(){}
	
}