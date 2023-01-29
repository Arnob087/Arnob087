package projectFRAME;
import Interfaces.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;


public class LoginPage extends JFrame implements MouseListener, ActionListener, ILoginPage
{
ImageIcon img;
	JLabel username, passname, accnttype, announcement,Rimi,imgLabel;
	JButton loginbtn, exitbtn;
	JRadioButton r1,r2;
	JTextField usertext;
	JPasswordField password;
	ButtonGroup bg1;
	JComboBox combobox;
	JPanel panel;
	Color myColor;
	Font myFont;
	Color v1=new Color(153,204,0);
	
	public LoginPage(){
		
		super("LOGIN PAGE");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor = new Color(204, 255, 255);
		myFont = new Font("Cooper Black", Font.PLAIN, 28);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		username=new JLabel("Username :");
		username.setBounds(150,120,80,20);
		panel.add(username);
		
		passname=new JLabel("Password  :");
		passname.setBounds(150,150,80,20);
		panel.add(passname);
		
		accnttype=new JLabel("Account Type :");
		accnttype.setBounds(550,90,90,20);
		panel.add(accnttype);
		
		announcement=new JLabel("If You Are A Customer.Please Enter Your A/C Type :");
		announcement.setBounds(460,50,300,20);
		announcement.setBackground(Color.BLUE);
		panel.add(announcement);
		
		Rimi=new JLabel(" DOT Bank Limited ");
		Rimi.setBounds(230,5,280,30);
		Rimi.setOpaque(false);
	    Rimi.setFont(myFont);
		//Rimi.setBackground(Color.CYAN);
		panel.add(Rimi);
		
		usertext=new JTextField();
		usertext.setBounds(230,120,80,20);
		
		panel.add(usertext);
		
		password=new JPasswordField();
		password.setBounds(230,150,80,20);
		
		panel.add(password);
		
		loginbtn=new JButton("Login");
		loginbtn.setBounds(150,180,80,30);
		loginbtn.addMouseListener(this);
		loginbtn.addActionListener(this);
		loginbtn.setBackground(v1);
		panel.add(loginbtn);
		
		exitbtn=new JButton("Exit");
		exitbtn.setBounds(250,180,80,30);
		exitbtn.addMouseListener(this);
		exitbtn.addActionListener(this);
		exitbtn.setBackground(v1);
		panel.add(exitbtn);
		
		r1=new JRadioButton("Customer");
		r1.setBounds(50,50,80,20);
		r1.setOpaque(false);
		//r1.setBackground(Color.PINK);
		panel.add(r1);
		
		r2=new JRadioButton("Agent");
		r2.setBounds(50,75,80,20);
		//r2.setBackground(Color.PINK);
		r2.setOpaque(false);
		panel.add(r2);
		
		bg1 = new ButtonGroup();
		bg1.add(r1);
		bg1.add(r2);
		
		String arr[]={"None","Savings","Fixed"};
		
		combobox=new JComboBox(arr);
		combobox.setBounds(650,90,100,20);
		//combobox.setBackground(Color.PINK);
		panel.add(combobox);
		
		//Image:::
		
		img = new ImageIcon("oop3.jpeg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(325,120 , 500, 300);
		panel.add(imgLabel);
		
		
		
		this.add(panel);
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginbtn)
		{
			loginbtn.setBackground(Color.DARK_GRAY);
			loginbtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == exitbtn)
		{
			exitbtn.setBackground(Color.RED);
			exitbtn.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginbtn)
		{
			loginbtn.setBackground(v1);
			loginbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == exitbtn)
		{
			exitbtn.setBackground(v1);
			exitbtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	
	
	
	public void actionPerformed(ActionEvent ae){
		
		String cmd= ae.getActionCommand();
		
		if(loginbtn.getText().equals(cmd)){
				String s1=usertext.getText();
				String s2=password.getText();
				String s3="";
				String s4="";
				String s5=combobox.getSelectedItem().toString();
	
	//FOR CUSTOMER LOGIN...::
	
				if(r1.isSelected()){
					s3=r1.getText();
					
					
					if (s5=="None"){
						showMessageDialog(null,"Please Enter Your Accouont Type");
					}
					else if(s1.length()<2){
					
					showMessageDialog(null,"Username must have more than 2 charecters");
					}
					else if(s2.length()<6){
						showMessageDialog(null,"Password must have more than 6 charecters");
						
					}
					
					
					else{
						String line1="";
						String line2="";
						String line3="";
						String line4="";
						String line5="";
						
						try{
						FileReader fr= new FileReader("E:\\EDUCATION\\2nd semester\\JAVA\\Project\\My project\\projectFRAME\\"+s1+".txt");
						Scanner sc = new Scanner(fr);
						
						while(sc.hasNext())
						{
						 line1 = sc.nextLine();//name
						 line2 = sc.nextLine();//nmbr
						 line3 = sc.nextLine();//username
						 line4 = sc.nextLine();//password
						 line5 = sc.nextLine();//cash
						
						if(line3.equals(s1) && line4.equals(s2))
						{
							CustomerPage cmp1= new CustomerPage(line1,line2,line3,line4,line5);
							cmp1.setVisible(true);
							this.setVisible(false);
						}
						else{
							showMessageDialog(null, "Wrong Username or Password");
							}
						
					
						}
						//showMessageDialog(null, line1);
						
						fr.close();
						}
						
						catch(Exception io){
							showMessageDialog(null, "NO CUSTOMER ID AVAILABE WITH THIS USERNAME");
							io.printStackTrace();
						}
						
					}
					
				}
				
	//FOR AGENT LOGIN..::
				
				else if(r2.isSelected()){
					s4=r2.getText();
					
			
					if(s1.length()<2){
					
					showMessageDialog(null,"Username must have more than 2 charecters");
					}
					else if(s2.length()<6){
						showMessageDialog(null,"Password must have more than 6 charecters");
						
					}
					
					else{
						if((s1.equals("Arnob")&& s2.equals("arnob123")) || (s1.equals("Rimi") && s2.equals("rimi123")) || (s1.equals("Koshin") &&  s2.equals("koshin123"))){
							
							Agent a1=new Agent();
							a1.setVisible(true);
							this.setVisible(false);
						}
						else{ showMessageDialog(null,"Incorrect Username or Password");}
					}
				}
				
				
				else{
				showMessageDialog(null,"Insert any Agent/Customer");
				}
			
		}
		
		else if(exitbtn.getText().equals(cmd)){
			System.exit(0);
		}
		else
		{
			
		}
	}
	public void Login(){}
}