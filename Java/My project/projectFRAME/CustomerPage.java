package projectFRAME;
import Interfaces.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class CustomerPage extends JFrame implements MouseListener, ActionListener, ICustomerPage
{
	ImageIcon img;
	JLabel AccountDetails,rcvrusernm, acname, acnmbr, cash,name1,name2,name3, tm, eranum, eaccount, epass, rmvac, entracnmbr, rmvacpass, imgLabel;
	JTextField tmTF, eranumTF, eaccountTF, srchAcNmbr,rcvrusernmTF;
	JButton transferbtn, dltbtn, backbtn;
	JPasswordField password, rmvpass;
	JPanel panel;
	Color myColor;
	Font myFont;
	
	private String accountnmbr;
	private String accountHldrName;
	private String cash2;
	private String password2;
	private String username2;
	
	
	public CustomerPage(String accountHldrName,String accountNumber,String username,String password1,String cash1){
		
		super("Customer page");
		this.setSize(900,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.accountHldrName=accountHldrName;
		this.accountnmbr=accountNumber;
		this.username2=username;
		this.password2=password1;
		this.cash2=cash1;
		
		myColor = new Color(0, 204, 255);
		myFont = new Font("Arial Black", Font.PLAIN,13);
		
		//FOR CUSTOMER'S DETAILS....::
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
		
		//For account details...:::
		
		AccountDetails=new JLabel("Account Details :");
		AccountDetails.setBounds(30,30,150,40);
		AccountDetails.setForeground(Color.BLUE);
		AccountDetails.setFont(myFont);
		panel.add(AccountDetails);
		
		acname=new JLabel("Account Holder Name:");
		acname.setBounds(30,80,150,20);
		panel.add(acname);
		
	 
		name1=new JLabel(accountHldrName);
		name1.setBounds(190,80,100,20);
		panel.add(name1);
		
		acnmbr=new JLabel("Account Number:");
		acnmbr.setBounds(30,100,100,20);
		panel.add(acnmbr);
		
		name2=new JLabel(accountnmbr);
		name2.setBounds(190,100,100,20);
		panel.add(name2);
		
		cash=new JLabel("Cash:");
		cash.setBounds(30,120,100,20);
		panel.add(cash);
		
		name3=new JLabel(cash2);
		name3.setBounds(190,120,100,20);
		panel.add(name3);
		
		
		
		
		//For Transfer Money...:::
		
		tm=new JLabel("Transfer Money :");
		tm.setBounds(30,180,150,20);
		tm.setForeground(Color.BLUE);
		tm.setFont(myFont);
		panel.add(tm);
		
		
		eranum=new JLabel("Enter Reciver Account Number:");
		eranum.setBounds(30,210,200,20);
		panel.add(eranum);
		
		rcvrusernm=new JLabel("Enter Reciver Account Username:");
		rcvrusernm.setBounds(30,230,200,20);
		panel.add(rcvrusernm);
		
	 
		eaccount=new JLabel("Enter Amount:");
		eaccount.setBounds(30,250,200,20);
		panel.add(eaccount);
		
		epass=new JLabel("Enter Password:");
		epass.setBounds(30,270,200,20);
		panel.add(epass);
		
		//textfield start:::
		
		eranumTF=new JTextField();
		eranumTF.setBounds(220,210,100,20);
		panel.add(eranumTF);
		
		rcvrusernmTF=new JTextField();
		rcvrusernmTF.setBounds(220,230,100,20);
		rcvrusernmTF.setBackground(Color.WHITE);
		panel.add(rcvrusernmTF);
		
		eaccountTF=new JTextField();
		eaccountTF.setBounds(220,250,100,20);
		eaccountTF.setBackground(Color.WHITE);
		panel.add(eaccountTF);
		
		password=new JPasswordField();
		password.setBounds(220,270,100,20);
		password.setBackground(Color.WHITE);
		panel.add(password);
		
		//For Transfer Button...:::
		
		transferbtn=new JButton("Transfer");
		transferbtn.setBounds(130,300,100,30);
		transferbtn.setBackground(Color.YELLOW);
		transferbtn.addMouseListener(this);
		transferbtn.addActionListener(this);
		panel.add(transferbtn);
		
		
		//FOR REMOVE ACCOUNT...:::
		//JLABEL :
		rmvac=new JLabel("Delete Your Account :");
		rmvac.setBounds(500,30,200,20);
		rmvac.setForeground(Color.BLUE);
		rmvac.setFont(myFont);
		panel.add(rmvac);
		
		entracnmbr=new JLabel("Enter Your Account Number:");
		entracnmbr.setBounds(500,70,200,20);
		panel.add(entracnmbr);
		
		rmvacpass=new JLabel("Enter Password:");
		rmvacpass.setBounds(500,90,150,20);
		panel.add(rmvacpass);
		
		//JTEXTFIELD :
		
		srchAcNmbr=new JTextField();
		srchAcNmbr.setBounds(720,70,100,20);
		srchAcNmbr.setBackground(Color.WHITE);
		panel.add(srchAcNmbr);
		
		rmvpass=new JPasswordField();
		rmvpass.setBounds(720,90,100,20);
		rmvpass.setBackground(Color.WHITE);
		panel.add(rmvpass);
		
		//JBUTTON :
		
		dltbtn=new JButton("Delete");
		dltbtn.setBounds(615,120,100,30);
		dltbtn.setBackground(Color.RED);
		dltbtn.addMouseListener(this);
		dltbtn.addActionListener(this);
		panel.add(dltbtn);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(400,350,100,30);
		backbtn.setBackground(Color.GREEN);
		backbtn.addMouseListener(this);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		
		//Image:::
		
		img = new ImageIcon("oop3.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(520, 25, 350, 520);
		panel.add(imgLabel);
		
		
		
	
		
		this.add(panel);
		
		
	}
	
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == transferbtn)
		{
			transferbtn.setBackground(Color.DARK_GRAY);
			transferbtn.setForeground(Color.WHITE);
		}
		else if(me.getSource() == dltbtn)
		{
			dltbtn.setBackground(Color.ORANGE);
			dltbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == backbtn)
		{
			backbtn.setBackground(Color.RED);
			backbtn.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == transferbtn)
		{
			transferbtn.setBackground(Color.YELLOW);
			transferbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == dltbtn)
		{
			dltbtn.setBackground(Color.RED);
			dltbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource() == backbtn)
		{
			backbtn.setBackground(Color.GREEN);
			backbtn.setForeground(Color.BLACK);
		}
		else
		{
			
		}
	}
	
	
	
	public void actionPerformed(ActionEvent ae){
		
		String cmd= ae.getActionCommand();
	
	
	
	//FOR BACK BUTTON....::
	
		if(cmd.equals(backbtn.getText())){
			LoginPage lp =new LoginPage();
			lp.setVisible(true);
			this.setVisible(false);
		}
	
	//FOR REMOVE ACCOUNT....::
	
		else if(dltbtn.getText().equals(cmd)){
			
			if(srchAcNmbr.getText().equals(accountnmbr)){
				if(rmvpass.getText().equals(password2)){
					try{
						File fl= new File("E:\\EDUCATION\\2nd semester\\JAVA\\Project\\My project\\projectFRAME\\"+username2+".txt");
						fl.delete();
					}
					catch(Exception e){}
				
					showMessageDialog(null, "Account Deleted");
					
					LoginPage l=new LoginPage();
					l.setVisible(true);
					this.setVisible(false);
				}
				else{
					showMessageDialog(null, "Wrong Password");
				}
			}
			else{
				showMessageDialog(null, "NO ACCOUNT WITH THIS ACCOUNT NUMBER");
			}
		
		}
		
//FOR TRANSFER MONEY..::			
		
		else if(transferbtn.getText().equals(cmd)){
			
			String line1="";
			String line2="";
			String line3="";
			String line4="";
			String line5="";
			
			
			try{
				FileReader fr= new FileReader("E:\\EDUCATION\\2nd semester\\JAVA\\Project\\My project\\projectFRAME\\"+rcvrusernmTF.getText()+".txt");
				Scanner sc = new Scanner(fr);
				
				while(sc.hasNext())
				{
				 line1 = sc.nextLine();//name
				 line2 = sc.nextLine();//nmbr
				 line3 = sc.nextLine();//username
				 line4 = sc.nextLine();//password
				 line5 = sc.nextLine();//cash
				}
				
				
				if((rcvrusernmTF.getText().equals(line3)) && (eranumTF.getText().equals(line2)))
				{
					
					if(password.getText().equals(password2)){
						double a= Double.parseDouble(cash2);//1st customer's cash
						double b= Double.parseDouble(line5);//2nd customer's cash
						double c= Double.parseDouble(eaccountTF.getText());//entered amount
						if(c<a)
						{
						double cashcustomer1= a-c;
						double cashcustomer2= b+c;
						
						cash2= String.valueOf(cashcustomer1);
						line5= String.valueOf(cashcustomer2);
						
					
						FileWriter file= new FileWriter("E:\\EDUCATION\\2nd semester\\JAVA\\Project\\My project\\projectFRAME\\"+username2+".txt");
						file.write(accountHldrName+"\n"+accountnmbr+"\n"+username2+"\n"+password2+"\n"+cash2+"\n");
						file.close();
						
						
						FileWriter file1= new FileWriter("E:\\EDUCATION\\2nd semester\\JAVA\\Project\\My project\\projectFRAME\\"+rcvrusernmTF.getText()+".txt");
						file1.write(line1+"\n"+line2+"\n"+line3+"\n"+line4+"\n"+line5+"\n");
						file1.close();
						
						showMessageDialog(null, "TRANSFERED SUCCESSFULLY");
						showMessageDialog(null, "PLEASE LOG IN AGAIN");
						
						LoginPage lg= new LoginPage();
						lg.setVisible(true);
						this.setVisible(false);
					
						}
						else{
							showMessageDialog(null,"You Do Not Have Enough Cash");
						}
					}
					else{
						showMessageDialog(null,"Wrong Password");
					}
					
					
					
				}
				else{
					showMessageDialog(null, "RECIVER ACCOUNT DOESN'T FOUND");
					}
						
				fr.close();
				}
					
				catch(Exception io){
					showMessageDialog(null, "NO CUSTOMER ID AVAILABE WITH THIS USERNAME");
					io.printStackTrace();
				}
			
		}
		
		
	}
	public void CustomerPageinfo(){}	
}
