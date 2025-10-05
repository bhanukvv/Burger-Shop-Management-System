import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
import java.util.*;

//Home Menu 
class Home extends JFrame{
	
	Home(){
	}
	
	void HomeDesign(){
		setTitle("Burger Shop Managment System");
		setSize(1200, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//using grid layout and split the Frame
		setLayout(new GridLayout(1,2));
	}
		
//left panel design 
	 void LeftpanelDesign(){
		JPanel Leftpanel=new JPanel(); 
		Leftpanel.setBackground(new Color(255, 255, 255)); 
		Leftpanel.setLayout(new BorderLayout());
//Title
		JLabel Titlelb = new JLabel("BV Burger Shop");
		Titlelb.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
		Titlelb.setHorizontalAlignment(SwingConstants.CENTER);
		Titlelb.setBorder(BorderFactory.createEmptyBorder(70, 0, 0, 0)); 
		
//logo and icon
		ImageIcon logo = new ImageIcon("LogoB.jpg");
		JLabel LogoLabel=new JLabel(logo);
		LogoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LogoLabel.setVerticalAlignment(SwingConstants.CENTER);
		Leftpanel.add(LogoLabel,BorderLayout.CENTER);
		Leftpanel.add(Titlelb, BorderLayout.NORTH);
		add(Leftpanel);	
	 }
//Right panel design
	 void RightpanelDesign(){
		JPanel Rightpanel=new JPanel();
		Rightpanel.setBackground(new Color(234, 235, 234)); 
		Rightpanel.setLayout(new BoxLayout(Rightpanel, BoxLayout.Y_AXIS));
		
//place Order button
		JButton Placeorderbtn = new JButton("");
		Placeorderbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		Placeorderbtn.setMaximumSize(new Dimension(330, 66));
		Rightpanel.add(Box.createVerticalStrut(50));
		Placeorderbtn.setBorderPainted(false);
		Placeorderbtn.setFocusPainted(false); 
		Placeorderbtn.setContentAreaFilled(false);
		Placeorderbtn.setIcon(new ImageIcon("PObutton.png")); 
		Placeorderbtn.setPressedIcon(new ImageIcon("POpress.png")); 
		Rightpanel.add(Placeorderbtn);
		Placeorderbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BurgerDetails b1=new BurgerDetails();
				b1.PlaceOrder();
			}
		});
		
//Search order button
		JButton Searchorderbtn=new JButton("");
		Searchorderbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		Searchorderbtn.setMaximumSize(new Dimension(330, 66));
		Rightpanel.add(Box.createVerticalStrut(50));
		Searchorderbtn.setBorderPainted(false);
		Searchorderbtn.setFocusPainted(false); 
		Searchorderbtn.setContentAreaFilled(false);
		Searchorderbtn.setIcon(new ImageIcon("SObtn.png")); 
		Searchorderbtn.setPressedIcon(new ImageIcon("SOclicked.png"));
		Rightpanel.add(Searchorderbtn);
		Searchorderbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        // This runs when button is clicked
			}
		});
//view orders button 
		JButton Vieworderbtn=new JButton("");
		Vieworderbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		Vieworderbtn.setMaximumSize(new Dimension(330, 66));
		Rightpanel.add(Box.createVerticalStrut(50));
		Vieworderbtn.setBorderPainted(false);
		Vieworderbtn.setFocusPainted(false); 
		Vieworderbtn.setContentAreaFilled(false);
		Vieworderbtn.setIcon(new ImageIcon("VObtn.png")); 
		Vieworderbtn.setPressedIcon(new ImageIcon("VObtnclicked.png"));
		Rightpanel.add(Vieworderbtn);
		Vieworderbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        // This runs when button is clicked
			}
		});
//update order details
		JButton Updateorderbtn=new JButton("");
		Updateorderbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		Updateorderbtn.setMaximumSize(new Dimension(330, 66));
		Rightpanel.add(Box.createVerticalStrut(50));
		Updateorderbtn.setBorderPainted(false);
		Updateorderbtn.setFocusPainted(false); 
		Updateorderbtn.setContentAreaFilled(false);
		Updateorderbtn.setIcon(new ImageIcon("UODbtn.png")); 
		Updateorderbtn.setPressedIcon(new ImageIcon("UODbtnclicked.png"));
		Rightpanel.add(Updateorderbtn);
		Updateorderbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        // This runs when button is clicked
			}
		});
		
//search best customer button
		JButton Bestcustomerbtn=new JButton("");
		Bestcustomerbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		Bestcustomerbtn.setMaximumSize(new Dimension(330, 66));
		Rightpanel.add(Box.createVerticalStrut(50));
		Bestcustomerbtn.setBorderPainted(false);
		Bestcustomerbtn.setFocusPainted(false); 
		Bestcustomerbtn.setContentAreaFilled(false);
		Bestcustomerbtn.setIcon(new ImageIcon("SBCbtn.png")); 
		Bestcustomerbtn.setPressedIcon(new ImageIcon("SBCclickedbtn.png"));
		Rightpanel.add(Bestcustomerbtn);
		Bestcustomerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        // This runs when button is clicked
			}
		});

//Exit button
		JButton Exitbtn=new JButton("");
		Exitbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		Exitbtn.setMaximumSize(new Dimension(180, 65));
		Rightpanel.add(Box.createVerticalStrut(50));
		Exitbtn.setBorderPainted(false);
		Exitbtn.setFocusPainted(false); 
		Exitbtn.setContentAreaFilled(false);
		Exitbtn.setIcon(new ImageIcon("Exitbtn.png")); 
		Exitbtn.setPressedIcon(new ImageIcon("Exitclickbtn.png"));
		Rightpanel.add(Exitbtn);
		Exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
		add(Rightpanel);
	 }
}

//Place Order Section
class BurgerDetails extends JFrame{
			
//placeOrderWindow
		void PlaceOrder(){
			setTitle(" Place Order Window ");
			setSize(1200, 800);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setBackground(Color.WHITE);
			
//place order section title 
			JPanel Placeorderpanel = new JPanel();
			Placeorderpanel.setBackground(new Color(224, 185, 23));
			Placeorderpanel.setPreferredSize(new Dimension(1200, 80)); 
			JLabel titleLabel = new JLabel("Place Order");
			titleLabel.setForeground(Color.BLACK);
			titleLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
			titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
			titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0)); 
			Placeorderpanel.add(titleLabel);
			
//West panel
			JPanel Westpanel=new JPanel();
			Westpanel.setLayout(new BoxLayout(Westpanel, BoxLayout.Y_AXIS));
			Westpanel.setBackground(Color.WHITE);
			OrderDetails orderi=new OrderDetails();
			
//Order id output 
			JLabel orderIdLabel = new JLabel("Order ID     : " + orderi.Getorderid());
			Westpanel.add(Box.createVerticalStrut(100));
			orderIdLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			orderIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
			orderIdLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
//Customer id output 
			JLabel CustomerIdLabel=new JLabel(" Customer ID  : " + orderi.GetcustomerId());
			CustomerIdLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			
			CustomerIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
			CustomerIdLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			
			JSeparator line = new JSeparator(SwingConstants.HORIZONTAL);
			line.setMaximumSize(new Dimension(400, 2));
			line.setForeground(Color.BLACK);
			line.setBackground(Color.BLACK);
			
			
			Westpanel.add(orderIdLabel);
			Westpanel.add(Box.createVerticalStrut(60));
			Westpanel.add(CustomerIdLabel);
			Westpanel.add(Box.createVerticalStrut(50));
			Westpanel.add(line);
			Westpanel.add(Box.createVerticalStrut(50));
			Westpanel.setPreferredSize(new Dimension(600, 800));
			Westpanel.add(Box.createVerticalGlue());
			add(Westpanel,BorderLayout.WEST);
			add(Placeorderpanel, BorderLayout.NORTH);
			setVisible(true);
		}
}
//Encapsulated order class
class OrderDetails{
	private String Customerid;
	public static int Customernum=0;
	private String orderid;
	public static int Ordernum=0;
	private int Quantity;
	
	public OrderDetails(){
		Ordernum++;
		orderid=String.format("B%04d",Ordernum);
		Customernum++;
		Customerid=String.format("C%04d",Customernum);
		
	}

	public String Getorderid(){
		return orderid;
	}
	public String GetcustomerId(){
		return Customerid;
	}	
}

class BurgerShopMS{
	public static void main(String args[]){
		Home h1=new Home();
		h1.HomeDesign();
		h1.LeftpanelDesign();
		h1.RightpanelDesign();
		h1.setVisible(true);
		
	}
}
