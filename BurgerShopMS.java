import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;
import java.util.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;



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
				 dispose();
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
									 dispose();
				  SearchOrder searchOrderInstance = new SearchOrder();
					searchOrderInstance.SearchOrderFrame();
					
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
				 dispose();
				 ViewOrderDetails v1=new  ViewOrderDetails();
				 v1.ViewOrderHomeDesign();
				 v1.LeftpanelDesignViewOrder();
				 v1.RightpanelDesignViewOrder();
				 v1.setVisible(true);
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
					dispose();
				 new UpdateOrder();
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
					dispose();
					SearchBestCustomerOption bestCustomerWindow = new SearchBestCustomerOption();
					bestCustomerWindow.SearchBestCustomerOption();
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
			setLayout(new BorderLayout());
			
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
			Westpanel.add(Box.createVerticalStrut(40));
			orderIdLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			orderIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
			orderIdLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			
//Customer id output 
			JLabel CustomerIdLabel=new JLabel(" Customer ID  : " + orderi.GetcustomerId());
			CustomerIdLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			
			CustomerIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
			CustomerIdLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			
//customer name
			JLabel customerNameLabel = new JLabel("Customer Name :");
			customerNameLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			customerNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			customerNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
			
			JTextField customerNameField = new JTextField();
			customerNameField.setHorizontalAlignment(SwingConstants.CENTER);
			customerNameField.setPreferredSize(new Dimension(200, 30));
			customerNameField.setMaximumSize(new Dimension(200, 30));
			customerNameField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

//Seperate Line 
			JSeparator line = new JSeparator(SwingConstants.HORIZONTAL);
			line.setMaximumSize(new Dimension(400, 2));
			line.setForeground(Color.BLACK);
			line.setBackground(Color.BLACK);
			
//Qty and status 
			JLabel netTotalLabel = new JLabel("Net Total : Rs. 0.00");
			JLabel Quntitylabel=new JLabel("Burger QTY :"); 
			Quntitylabel.setFont(new Font("Arial Black", Font.BOLD, 20));	
			Quntitylabel.setHorizontalAlignment(SwingConstants.CENTER);
			Quntitylabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			JTextField QtyField = new JTextField();
			QtyField.setHorizontalAlignment(SwingConstants.CENTER);
			QtyField.setAlignmentX(Component.CENTER_ALIGNMENT);
			QtyField.setPreferredSize(new Dimension(150, 30));
			QtyField.setMaximumSize(new Dimension(150, 30));
			QtyField.setMinimumSize(new Dimension(150, 30));
			QtyField.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
			QtyField.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				try {
            int qty = Integer.parseInt(QtyField.getText());
            double total = qty * orderi.Getprice();
            netTotalLabel.setText("Net Total : Rs. " + total);
			} catch (Exception ex) {
            netTotalLabel.setText("Net Total : Rs. 0.00");
					}
				}
			});
			
			JLabel statusLabel = new JLabel("Status :"+orderi.getStatusText());
			statusLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
			statusLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
			statusLabel.setForeground(new Color(255, 140, 0)); 
			
			JLabel changeStatus=new JLabel("Mark order as Delivered");
			changeStatus.setFont(new Font("Arial Black", Font.BOLD, 20));
			changeStatus.setAlignmentX(Component.CENTER_ALIGNMENT);
			changeStatus.setHorizontalAlignment(SwingConstants.CENTER);
			
			JButton changestatusbtn=new JButton("");
			changestatusbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
			changestatusbtn.setMaximumSize(new Dimension(383, 65));
			changestatusbtn.setBorderPainted(false);
			changestatusbtn.setFocusPainted(false);
			changestatusbtn.setContentAreaFilled(false);
			changestatusbtn.setIcon(new ImageIcon("changestatusbtn.png")); 
			changestatusbtn.setPressedIcon(new ImageIcon("changestatusclickedbtn.png"));
			changestatusbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					orderi.setStatus(OrderDetails.DELIVERED);
					statusLabel.setText("Status : " + orderi.getStatusText());
					statusLabel.setForeground(new Color(0, 128, 0));
					changestatusbtn.setEnabled(false); 
					}
			});
			
			Westpanel.add(orderIdLabel);
			Westpanel.add(Box.createVerticalStrut(10));
			Westpanel.add(CustomerIdLabel);
			Westpanel.add(Box.createVerticalStrut(30));
			Westpanel.add(customerNameLabel);
			Westpanel.add(Box.createVerticalStrut(05));
			Westpanel.add(customerNameField);
			Westpanel.add(Box.createVerticalStrut(90));
			Westpanel.add(line);
			Westpanel.add(Box.createVerticalStrut(60));
			Westpanel.add(Quntitylabel);
			Westpanel.add(Box.createVerticalStrut(10));
			Westpanel.add(QtyField);
			Westpanel.add(Box.createVerticalStrut(50));
			Westpanel.add(statusLabel);
			Westpanel.add(Box.createVerticalStrut(40));
			Westpanel.add(changeStatus);
			Westpanel.add(Box.createVerticalStrut(10));
			Westpanel.add(changestatusbtn);
			
//East panel
			JPanel Eastpanel=new JPanel();
			Eastpanel.setLayout(new BoxLayout(Eastpanel, BoxLayout.Y_AXIS));
			Eastpanel.setBackground(Color.WHITE);
//Place order button
			JButton Saveorderbtn=new JButton("");
			Saveorderbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
			Saveorderbtn.setMaximumSize(new Dimension(330, 66));
			Saveorderbtn.setBorderPainted(false);
			Saveorderbtn.setFocusPainted(false); 
			Saveorderbtn.setContentAreaFilled(false);
			Saveorderbtn.setIcon(new ImageIcon("PObtn.png"));
			Saveorderbtn.setPressedIcon(new ImageIcon("POclickedbtn.png"));
			Saveorderbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
					Saveorderbtn.setEnabled(false); 
					orderi.setCustomerName(customerNameField.getText());
            
           
					int qty = Integer.parseInt(QtyField.getText());
					orderi.setQuantity(qty);
            
            
					OrderDetails.addOrder(orderi);
            
					JOptionPane.showMessageDialog(null, "Order Saved Successfully!");
					
					} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter valid data.");
					}
				System.out.println(Arrays.toString(OrderDetails.getOrders()));
			}
		});
		
//new Order button
			JButton Neworderbtn=new JButton("");
			Neworderbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
			Neworderbtn.setMaximumSize(new Dimension(330, 66));
			Neworderbtn.setBorderPainted(false);
			Neworderbtn.setFocusPainted(false); 
			Neworderbtn.setContentAreaFilled(false);
			Neworderbtn.setIcon(new ImageIcon("NObtn.png"));
			Neworderbtn.setPressedIcon(new ImageIcon("NOclickedbtn.png"));
			Neworderbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					BurgerDetails newWindow = new BurgerDetails();
					newWindow.PlaceOrder();
					dispose();
			}
		});
			
//Cancel order button
			JButton Cancelorderbtn=new JButton("");
			Cancelorderbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
			Cancelorderbtn.setMaximumSize(new Dimension(330, 66));
			Cancelorderbtn.setBorderPainted(false);
			Cancelorderbtn.setFocusPainted(false); 
			Cancelorderbtn.setContentAreaFilled(false);
			Cancelorderbtn.setIcon(new ImageIcon("CObtn.png"));
			Cancelorderbtn.setPressedIcon(new ImageIcon("COclickedbtn.png"));
			Cancelorderbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Saveorderbtn.setEnabled(false);
					changestatusbtn.setEnabled(false);
					orderi.setCustomerName(customerNameField.getText());
					int qty = Integer.parseInt(QtyField.getText());
					orderi.setQuantity(qty);
					orderi.setStatus(OrderDetails.CANCEL);
					OrderDetails.addOrder(orderi);
					JOptionPane.showMessageDialog(null, "Order Cancelled!");
					statusLabel.setText("Status : " + orderi.getStatusText());
					statusLabel.setForeground(Color.RED);
					} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter valid data.");
			}
		}
	});

//Exit and go to homepage (Exit button)
			JButton ExittoHbtn=new JButton("");
			ExittoHbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
			ExittoHbtn.setMaximumSize(new Dimension(330, 66));
			ExittoHbtn.setBorderPainted(false);
			ExittoHbtn.setFocusPainted(false);
			ExittoHbtn.setContentAreaFilled(false);
			ExittoHbtn.setIcon(new ImageIcon("Exitbtn.png"));
			ExittoHbtn.setPressedIcon(new ImageIcon("Exitclickbtn.png"));
			ExittoHbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 dispose();
					 Home home = new Home();
					home.HomeDesign();
					home.LeftpanelDesign();
					home.RightpanelDesign();
					home.setVisible(true);
			}
		});
		
//Price calculate and show 
			netTotalLabel.setFont(new Font("Arial Black", Font.BOLD, 22));
			netTotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
			netTotalLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			netTotalLabel.setForeground(Color.RED);
			netTotalLabel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
			netTotalLabel.setPreferredSize(new Dimension(300, 40));
			
			
			
			Eastpanel.add(Box.createVerticalStrut(70));
			Eastpanel.add(Saveorderbtn);
			Eastpanel.add(Box.createVerticalStrut(50));
			Eastpanel.add(Neworderbtn);
			Eastpanel.add(Box.createVerticalStrut(50));
			Eastpanel.add(Cancelorderbtn);
			Eastpanel.add(Box.createVerticalStrut(50));
			Eastpanel.add(ExittoHbtn);
			Eastpanel.add(Box.createVerticalStrut(40));
			Eastpanel.add(netTotalLabel);
			
			
			Westpanel.setPreferredSize(new Dimension(600, 800));
			Westpanel.add(Box.createVerticalGlue());
			Eastpanel.setPreferredSize(new Dimension(600, 800));
			Eastpanel.add(Box.createVerticalGlue());
			add(Eastpanel,BorderLayout.EAST);
			add(Westpanel,BorderLayout.WEST);
			add(Placeorderpanel, BorderLayout.NORTH);
			setVisible(true);
		}
}
//view order class 
class ViewOrderDetails extends JFrame {
    void ViewOrderHomeDesign() {
        setTitle("View Orders");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
    }

// left panel design for viewOrder
    void LeftpanelDesignViewOrder() {
        JPanel Leftpanel = new JPanel();
        Leftpanel.setBackground(new Color(255, 255, 255));
        Leftpanel.setLayout(new BorderLayout());

        JLabel TitlelbofViewOrder = new JLabel("BV Burger Shop");
        TitlelbofViewOrder.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
        TitlelbofViewOrder.setHorizontalAlignment(SwingConstants.CENTER);
        TitlelbofViewOrder.setBorder(BorderFactory.createEmptyBorder(70, 0, 0, 0));

        ImageIcon logo = new ImageIcon("LogoB.jpg");
        JLabel LogoLabel = new JLabel(logo);
        LogoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        LogoLabel.setVerticalAlignment(SwingConstants.CENTER);
        Leftpanel.add(LogoLabel, BorderLayout.CENTER);
        Leftpanel.add(TitlelbofViewOrder, BorderLayout.NORTH);
        add(Leftpanel); 
    }

// Right panel design for ViewOrder
    void RightpanelDesignViewOrder() {
        JPanel Rightpanel = new JPanel();
        Rightpanel.setBackground(new Color(255, 255, 255));
        Rightpanel.setLayout(new BoxLayout(Rightpanel, BoxLayout.Y_AXIS));
        
        
//view preparing order button 
        JButton preparingBtn = new JButton("");
        preparingBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        preparingBtn.setMaximumSize(new Dimension(312, 66));
        preparingBtn.setBorderPainted(false);
        preparingBtn.setFocusPainted(false);
        preparingBtn.setContentAreaFilled(false);
        preparingBtn.setIcon(new ImageIcon("PPorderbtn.png"));
        preparingBtn.setPressedIcon(new ImageIcon("PPorderclickedbtn.png"));
        preparingBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								 dispose();
				JFrame preparingFrame = new JFrame("Preparing Orders");
				preparingFrame.setSize(1200, 800);
				preparingFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				preparingFrame.setLayout(new BorderLayout());
				
				JPanel preparingOrderViewPanel = new JPanel();
				preparingOrderViewPanel.setBackground(new Color(224, 185, 23));
				preparingOrderViewPanel.setPreferredSize(new Dimension(1200, 80));
				
				JLabel titleLabel = new JLabel("Preparing Orders");
				titleLabel.setForeground(Color.BLACK);
				titleLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
				titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
				titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
				preparingOrderViewPanel.setLayout(new BorderLayout());
				preparingOrderViewPanel.add(titleLabel, BorderLayout.CENTER);
				
//Table
				String[] columns = {"Order ID", "Customer ID", "Customer Name", "Quantity", "Total (Rs.)", "Status"};
				OrderDetails[] allOrders = OrderDetails.getOrders();
				
// Count preparing orders
				int preparingCount = 0;
				for (OrderDetails o : allOrders) {
				if (o.getStatus() == OrderDetails.PREPARING) {
                preparingCount++;
					}
				}
				 String[][] data = new String[preparingCount][columns.length];
				int index = 0;
				for (OrderDetails o : allOrders) {
				if (o.getStatus() == OrderDetails.PREPARING) {
                data[index][0] = o.Getorderid();
                data[index][1] = o.GetcustomerId();
                data[index][2] = o.getCustomerName();
                data[index][3] = String.valueOf(o.GetQuantity());
                data[index][4] = String.valueOf(o.GetTotal());
                data[index][5] = o.getStatusText();
                index++;
					}
				}
				JTable table = new JTable(data, columns) {
				@Override
				public boolean isCellEditable(int row, int column) {
                return false;
					}
				};
				
				table.setFillsViewportHeight(true);
				table.setFont(new Font("Arial", Font.PLAIN, 14));
				table.setRowHeight(25);
				JScrollPane scrollPane = new JScrollPane(table);
				
//Back view Order Menu Button 
				JButton goToViewOrdersBtn = new JButton("Go to View Orders");
				goToViewOrdersBtn.setFont(new Font("Arial", Font.BOLD, 16));
				goToViewOrdersBtn.setBackground(new Color(30, 215, 96)); 
				goToViewOrdersBtn.setForeground(Color.WHITE);

				goToViewOrdersBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                preparingFrame.dispose();
                ViewOrderDetails view = new ViewOrderDetails();
                view.ViewOrderHomeDesign();
                view.LeftpanelDesignViewOrder();
                view. RightpanelDesignViewOrder();
                view.setVisible(true);
					}
				});
				preparingFrame.add(preparingOrderViewPanel, BorderLayout.NORTH);
				preparingFrame.add(scrollPane, BorderLayout.CENTER);
				preparingFrame.add(goToViewOrdersBtn, BorderLayout.SOUTH);
	
// Show frame
				preparingFrame.setVisible(true);
					
			}
		});

//view delivered order button
		JButton DeliverdOrderbtn=new JButton("");
		DeliverdOrderbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		DeliverdOrderbtn.setMaximumSize(new Dimension(312, 66));
		DeliverdOrderbtn.setBorderPainted(false);
		DeliverdOrderbtn.setFocusPainted(false);
		DeliverdOrderbtn.setContentAreaFilled(false);
		DeliverdOrderbtn.setIcon(new ImageIcon("DOviewbtn.png"));
		DeliverdOrderbtn.setPressedIcon(new ImageIcon("DOviewclickedbtn.png"));
		DeliverdOrderbtn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
							 dispose();
        JFrame deliveredFrame = new JFrame("Delivered Orders");
        deliveredFrame.setSize(1200, 800);
        deliveredFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        deliveredFrame.setLayout(new BorderLayout());

        JPanel deliveredOrderViewPanel = new JPanel();
        deliveredOrderViewPanel.setBackground(new Color(224, 185, 23));
        deliveredOrderViewPanel.setPreferredSize(new Dimension(1200, 80));

        JLabel titleLabel = new JLabel("Delivered Orders");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        deliveredOrderViewPanel.setLayout(new BorderLayout());
        deliveredOrderViewPanel.add(titleLabel, BorderLayout.CENTER);

        // Table setup
        String[] columns = {"Order ID", "Customer ID", "Customer Name", "Quantity", "Total (Rs.)", "Status"};
        OrderDetails[] allOrders = OrderDetails.getOrders();

        // Count delivered orders
        int deliveredCount = 0;
        for (OrderDetails o : allOrders) {
            if (o.getStatus() == OrderDetails.DELIVERED) {
                deliveredCount++;
            }
        }

        // Fill table data
        String[][] data = new String[deliveredCount][columns.length];
        int index = 0;
        for (OrderDetails o : allOrders) {
            if (o.getStatus() == OrderDetails.DELIVERED) {
                data[index][0] = o.Getorderid();
                data[index][1] = o.GetcustomerId();
                data[index][2] = o.getCustomerName();
                data[index][3] = String.valueOf(o.GetQuantity());
                data[index][4] = String.valueOf(o.GetTotal());
                data[index][5] = o.getStatusText();
                index++;
            }
        }

        JTable table = new JTable(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setFillsViewportHeight(true);
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.setRowHeight(25);

        JScrollPane scrollPane = new JScrollPane(table);

        // Back to View Orders button
        JButton goToViewOrdersBtn = new JButton("Go to View Orders");
        goToViewOrdersBtn.setFont(new Font("Arial", Font.BOLD, 16));
        goToViewOrdersBtn.setBackground(new Color(30, 215, 96)); 
        goToViewOrdersBtn.setForeground(Color.WHITE);
        goToViewOrdersBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deliveredFrame.dispose();
                ViewOrderDetails view = new ViewOrderDetails();
                view.ViewOrderHomeDesign();
                view.LeftpanelDesignViewOrder();
                view.RightpanelDesignViewOrder();
                view.setVisible(true);
            }
        });

        // Add to frame
        deliveredFrame.add(deliveredOrderViewPanel, BorderLayout.NORTH);
        deliveredFrame.add(scrollPane, BorderLayout.CENTER);
        deliveredFrame.add(goToViewOrdersBtn, BorderLayout.SOUTH);
        deliveredFrame.setVisible(true);
			}
		});
		Rightpanel.add(DeliverdOrderbtn);

//view canceled order button
		JButton CancelOrderbtn=new JButton("");
		CancelOrderbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		CancelOrderbtn.setMaximumSize(new Dimension(312, 66));
		CancelOrderbtn.setBorderPainted(false);
		CancelOrderbtn.setFocusPainted(false);
		CancelOrderbtn.setContentAreaFilled(false);
		CancelOrderbtn.setIcon(new ImageIcon("COviewbtn.png"));
		CancelOrderbtn.setPressedIcon(new ImageIcon("COcviewclickedbtn.png"));
		CancelOrderbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								 dispose();
        JFrame cancelledFrame = new JFrame("Cancelled Orders");
        cancelledFrame.setSize(1200, 800);
        cancelledFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cancelledFrame.setLayout(new BorderLayout());

        JPanel cancelledOrderViewPanel = new JPanel();
        cancelledOrderViewPanel.setBackground(new Color(224, 185, 23)); 
        cancelledOrderViewPanel.setPreferredSize(new Dimension(1200, 80));

        JLabel titleLabel = new JLabel("Cancelled Orders");
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        cancelledOrderViewPanel.setLayout(new BorderLayout());
        cancelledOrderViewPanel.add(titleLabel, BorderLayout.CENTER);

        // Table
        String[] columns = {"Order ID", "Customer ID", "Customer Name", "Quantity", "Total (Rs.)", "Status"};
        OrderDetails[] allOrders = OrderDetails.getOrders();

        // Count cancelled orders
        int cancelledCount = 0;
        for (OrderDetails o : allOrders) {
            if (o.getStatus() == OrderDetails.CANCEL) { 
                cancelledCount++;
            }
        }

        String[][] data = new String[cancelledCount][columns.length];
        int index = 0;
        for (OrderDetails o : allOrders) {
            if (o.getStatus() == OrderDetails.CANCEL) {
                data[index][0] = o.Getorderid();
                data[index][1] = o.GetcustomerId();
                data[index][2] = o.getCustomerName();
                data[index][3] = String.valueOf(o.GetQuantity());
                data[index][4] = String.valueOf(o.GetTotal());
                data[index][5] = o.getStatusText();
                index++;
            }
        }

        JTable table = new JTable(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table.setFillsViewportHeight(true);
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.setRowHeight(25);
        JScrollPane scrollPane = new JScrollPane(table);

        // Back to View Orders Menu Button
        JButton goToViewOrdersBtn = new JButton("Go to View Orders");
        goToViewOrdersBtn.setFont(new Font("Arial", Font.BOLD, 16));
        goToViewOrdersBtn.setBackground(new Color(30, 215, 96)); 
        goToViewOrdersBtn.setForeground(Color.WHITE);

        goToViewOrdersBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cancelledFrame.dispose();
                ViewOrderDetails view = new ViewOrderDetails();
                view.ViewOrderHomeDesign();
                view.LeftpanelDesignViewOrder();
                view.RightpanelDesignViewOrder();
                view.setVisible(true);
            }
        });

        cancelledFrame.add(cancelledOrderViewPanel, BorderLayout.NORTH);
        cancelledFrame.add(scrollPane, BorderLayout.CENTER);
        cancelledFrame.add(goToViewOrdersBtn, BorderLayout.SOUTH);

// Show frame
        cancelledFrame.setVisible(true);
				}
			});
		Rightpanel.add(CancelOrderbtn);	

//Exit from the view order menu 
		JButton Exitfromvieworderbtn=new JButton();
		Exitfromvieworderbtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		Exitfromvieworderbtn.setMaximumSize(new Dimension(312, 66));
		Exitfromvieworderbtn.setBorderPainted(false);
		Exitfromvieworderbtn.setFocusPainted(false);
		Exitfromvieworderbtn.setContentAreaFilled(false);
		Exitfromvieworderbtn.setIcon(new ImageIcon("Exitbtn.png"));
		Exitfromvieworderbtn.setPressedIcon(new ImageIcon("Exitclickbtn.png"));
		Exitfromvieworderbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 dispose();
					 Home home = new Home();
					home.HomeDesign();
					home.LeftpanelDesign();
					home.RightpanelDesign();
					home.setVisible(true);
			}
		});
		
		
		
        Rightpanel.add(Box.createVerticalStrut(60), BorderLayout.NORTH);
        Rightpanel.add(preparingBtn, BorderLayout.CENTER);
        Rightpanel.add(Box.createVerticalStrut(140), BorderLayout.NORTH);
        Rightpanel.add(DeliverdOrderbtn,BorderLayout.CENTER);
        Rightpanel.add(Box.createVerticalStrut(140), BorderLayout.NORTH);
        Rightpanel.add(CancelOrderbtn,BorderLayout.CENTER);
        Rightpanel.add(Box.createVerticalStrut(90), BorderLayout.NORTH);
        Rightpanel.add(Exitfromvieworderbtn,BorderLayout.CENTER);
        add(Rightpanel); 
    }
}
//Search best customer class  
class SearchBestCustomerOption extends JFrame {

    public void SearchBestCustomerOption() {
		
//frame setup and head panel 
        JFrame searchFrame = new JFrame("Search Best Customer");
        searchFrame.setSize(1200, 800);
        searchFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        searchFrame.setLayout(new BorderLayout());

        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(224, 185, 23));
        headerPanel.setPreferredSize(new Dimension(1200, 80));
        headerPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Best Customers");
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        headerPanel.add(titleLabel, BorderLayout.CENTER);
        searchFrame.add(headerPanel, BorderLayout.NORTH);

// Table columns
        String[] columns = {"Customer ID", "Customer Name", "Total Purchase (Rs.)"};

// Create data array from orders
        OrderDetails[] allOrders = OrderDetails.getOrders();

// Sum purchases of duplicate customers manually
        Object[][] tempData = new Object[allOrders.length][3];
        int uniqueCount = 0;

        for (int i = 0; i < allOrders.length; i++) {
            String id = allOrders[i].GetcustomerId();
            String name = allOrders[i].getCustomerName();
            double total = allOrders[i].GetTotal();

            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (tempData[j][1].equals(name)) { // same customer
                    tempData[j][2] = (double) tempData[j][2] + total; // add total
                    found = true;
                    break;
                }
            }

            if (!found) {
                tempData[uniqueCount][0] = id;
                tempData[uniqueCount][1] = name;
                tempData[uniqueCount][2] = total;
                uniqueCount++;
            }
        }

// Copy unique entries into final data array
        Object[][] data = new Object[uniqueCount][3];
        for (int i = 0; i < uniqueCount; i++) {
            data[i][0] = tempData[i][0];
            data[i][1] = tempData[i][1];
            data[i][2] = tempData[i][2];
        }

// Sort by Total Purchase descending
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                double total1 = Double.parseDouble(data[i][2].toString());
                double total2 = Double.parseDouble(data[j][2].toString());
                if (total1 < total2) {
                    Object[] temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

// Table model
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable table = new JTable(model);
        table.setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.setRowHeight(28);
        table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));
        table.getTableHeader().setBackground(Color.WHITE);
        table.setPreferredScrollableViewportSize(new Dimension(800, 400));
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(50, 200, 50, 200));
        scrollPane.getViewport().setBackground(Color.WHITE);
        searchFrame.add(scrollPane, BorderLayout.CENTER);

// Back button 
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.setBackground(Color.WHITE);

        JButton backButton = new JButton("");
        backButton.setPreferredSize(new Dimension(315, 66));
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setIcon(new ImageIcon("searchcustomerbackbtn.png")); 
        backButton.setPressedIcon(new ImageIcon("searchcustomerbackbtnpressed.png"));
        bottomPanel.add(backButton);
        searchFrame.add(bottomPanel, BorderLayout.SOUTH);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchFrame.dispose();
                Home home = new Home();
                home.HomeDesign();
                home.LeftpanelDesign();
                home.RightpanelDesign();
                home.setVisible(true);
            }
        });

        searchFrame.setVisible(true);
    }
}
//Search order class 
class SearchOrder extends JFrame {

// Text fields
    private JTextField orderIdField;
    private JTextField customerIdField;
    private JTextField customerNameField;
    private JTextField quantityField;
    private JTextField totalField;

    public void SearchOrderFrame() {
        JFrame searchFrame = new JFrame("Search Order");
        searchFrame.setSize(1200, 800);
        searchFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        searchFrame.setLayout(new BorderLayout());

// ===== HEADER PANEL =====
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(224, 185, 23));
        headerPanel.setPreferredSize(new Dimension(1200, 80));
        headerPanel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Search Order");
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        headerPanel.add(titleLabel, BorderLayout.CENTER);

        searchFrame.add(headerPanel, BorderLayout.NORTH);

//  CONTENT PANEL 
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null); 
        contentPanel.setBackground(Color.WHITE);
        searchFrame.add(contentPanel, BorderLayout.CENTER);

        Font fieldFont = new Font("SansSerif", Font.PLAIN, 16);
        Font labelFont = new Font("SansSerif", Font.BOLD, 16);

// Labels
        JLabel orderIdLabel = new JLabel("Order ID:");
        orderIdLabel.setFont(labelFont);
        orderIdLabel.setBounds(100, 50, 150, 30);
        contentPanel.add(orderIdLabel);

        JLabel customerIdLabel = new JLabel("Customer ID:");
        customerIdLabel.setFont(labelFont);
        customerIdLabel.setBounds(100, 120, 150, 30);
        contentPanel.add(customerIdLabel);

        JLabel customerNameLabel = new JLabel("Customer Name:");
        customerNameLabel.setFont(labelFont);
        customerNameLabel.setBounds(100, 190, 150, 30);
        contentPanel.add(customerNameLabel);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setFont(labelFont);
        quantityLabel.setBounds(100, 260, 150, 30);
        contentPanel.add(quantityLabel);

        JLabel totalLabel = new JLabel("Total (Rs.):");
        totalLabel.setFont(labelFont);
        totalLabel.setBounds(100, 330, 150, 30);
        contentPanel.add(totalLabel);

// Text fields
        orderIdField = new JTextField();
        orderIdField.setFont(fieldFont);
        orderIdField.setBounds(300, 50, 200, 30);
        contentPanel.add(orderIdField);

        customerIdField = new JTextField();
        customerIdField.setFont(fieldFont);
        customerIdField.setBounds(300, 120, 200, 30);
        customerIdField.setEditable(false);
        contentPanel.add(customerIdField);

        customerNameField = new JTextField();
        customerNameField.setFont(fieldFont);
        customerNameField.setBounds(300, 190, 200, 30);
        customerNameField.setEditable(false);
        contentPanel.add(customerNameField);

        quantityField = new JTextField();
        quantityField.setFont(fieldFont);
        quantityField.setBounds(300, 260, 200, 30);
        quantityField.setEditable(false);
        contentPanel.add(quantityField);

        totalField = new JTextField();
        totalField.setFont(fieldFont);
        totalField.setBounds(300, 330, 200, 30);
        totalField.setEditable(false);
        contentPanel.add(totalField);

// Search button
        JButton searchButton = new JButton("");
        searchButton.setBounds(550, 50, 130, 30);
        searchButton.setBorderPainted(false);
        searchButton.setFocusPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setIcon(new ImageIcon("Searchordersearchbtn.png")); 
        searchButton.setPressedIcon(new ImageIcon("searchorderclickedbtn.png"));
        contentPanel.add(searchButton);

        searchButton.addActionListener(e -> searchOrderById(orderIdField.getText()));

// Back button 
        JButton backButton = new JButton("");
        backButton.setBounds(850, 600, 315, 66);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setIcon(new ImageIcon("searchcustomerbackbtn.png")); 
        backButton.setPressedIcon(new ImageIcon("searchcustomerbackbtnpressed.png"));
        contentPanel.add(backButton);

        backButton.addActionListener(e -> {
            searchFrame.dispose();
            Home home = new Home();
            home.HomeDesign();
            home.LeftpanelDesign();
            home.RightpanelDesign();
            home.setVisible(true);
        });

        searchFrame.setVisible(true);
    }

    void searchOrderById(String id) {
        boolean found = false;

        OrderDetails[] orders = OrderDetails.getOrders();

        for (OrderDetails order : orders) {
            if (order.Getorderid().equals(id)) {
                found = true;

                customerIdField.setText(order.GetcustomerId());
                customerNameField.setText(order.getCustomerName());
                quantityField.setText(String.valueOf(order.GetQuantity()));
                totalField.setText(String.valueOf(order.GetTotal()));

                break;
            }
        }

        if (!found) {
            customerIdField.setText("");
            customerNameField.setText("");
            quantityField.setText("");
            totalField.setText("");

            JOptionPane.showMessageDialog(null, "No order found with ID: " + id);
        }
    }
}
//update order details class 
class UpdateOrder extends JFrame {

    private JTextField orderIdField;
    private JTextField customerIdField;
    private JTextField customerNameField;
    private JTextField quantityField;
    private JLabel totalLabel;
    private JLabel statusLabel;
    private JComboBox<String> statusComboBox;

    private OrderDetails currentOrder; 

    public UpdateOrder() {
        setTitle("Update Order");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout());

// HEADER 
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(224, 185, 23));
        headerPanel.setPreferredSize(new Dimension(1200, 80));
        JLabel titleLabel = new JLabel("Update Order");
        titleLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 30));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerPanel.add(titleLabel);
        add(headerPanel, BorderLayout.NORTH);

 // CONTENT 
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setLayout(null);

        Font labelFont = new Font("SansSerif", Font.BOLD, 16);
        Font fieldFont = new Font("SansSerif", Font.PLAIN, 16);

// Order ID input
        JLabel orderIdLabel = new JLabel("Order ID:");
        orderIdLabel.setFont(labelFont);
        orderIdLabel.setBounds(100, 50, 150, 30);
        contentPanel.add(orderIdLabel);

        orderIdField = new JTextField();
        orderIdField.setFont(fieldFont);
        orderIdField.setBounds(300, 50, 200, 30);
        contentPanel.add(orderIdField);

        JButton searchBtn = new JButton("");
        searchBtn.setBounds(520, 50, 130, 35);
        searchBtn.setBorderPainted(false);
        searchBtn.setFocusPainted(false);
        searchBtn.setContentAreaFilled(false);
        searchBtn.setIcon(new ImageIcon("Searchordersearchbtn.png")); 
        searchBtn.setPressedIcon(new ImageIcon("searchorderclickedbtn.png"));
        contentPanel.add(searchBtn);

// Customer ID 
        JLabel customerIdLabel = new JLabel("Customer ID:");
        customerIdLabel.setFont(labelFont);
        customerIdLabel.setBounds(100, 120, 150, 30);
        contentPanel.add(customerIdLabel);

        customerIdField = new JTextField();
        customerIdField.setFont(fieldFont);
        customerIdField.setBounds(300, 120, 200, 30);
        customerIdField.setEditable(false);
        contentPanel.add(customerIdField);

// Customer Name
        JLabel customerNameLabel = new JLabel("Customer Name:");
        customerNameLabel.setFont(labelFont);
        customerNameLabel.setBounds(100, 190, 150, 30);
        contentPanel.add(customerNameLabel);

        customerNameField = new JTextField();
        customerNameField.setFont(fieldFont);
        customerNameField.setBounds(300, 190, 200, 30);
        contentPanel.add(customerNameField);

// Quantity
        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setFont(labelFont);
        quantityLabel.setBounds(100, 260, 150, 30);
        contentPanel.add(quantityLabel);

        quantityField = new JTextField();
        quantityField.setFont(fieldFont);
        quantityField.setBounds(300, 260, 200, 30);
        contentPanel.add(quantityField);

// Total
        totalLabel = new JLabel("Total: Rs. 0.00");
        totalLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
        totalLabel.setForeground(Color.RED);
        totalLabel.setBounds(300, 330, 300, 30);
        contentPanel.add(totalLabel);

// Status
        statusLabel = new JLabel("Status:");
        statusLabel.setFont(labelFont);
        statusLabel.setBounds(100, 400, 200, 30);
        contentPanel.add(statusLabel);

        statusComboBox = new JComboBox<>(new String[]{"Preparing", "Delivered", "Cancelled"});
        statusComboBox.setBounds(300, 400, 200, 30);
        contentPanel.add(statusComboBox);

// Update button
        JButton updateBtn = new JButton("");
        updateBtn.setBounds(300, 480, 330, 66);
        updateBtn.setBorderPainted(false);
        updateBtn.setFocusPainted(false); 
        updateBtn.setContentAreaFilled(false);
        updateBtn.setIcon(new ImageIcon("updateorderbtn.png"));
        updateBtn.setPressedIcon(new ImageIcon("Updateorderclickedbtn.png"));
        updateBtn.setEnabled(false); 
        contentPanel.add(updateBtn);

// Back button
        JButton backBtn = new JButton("");
        backBtn.setBounds(650, 480, 200, 66);
        backBtn.setBorderPainted(false);
        backBtn.setFocusPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setIcon(new ImageIcon("searchcustomerbackbtn.png"));
        backBtn.setPressedIcon(new ImageIcon("searchcustomerbackbtnpressed.png"));
        contentPanel.add(backBtn);

        add(contentPanel, BorderLayout.CENTER);

       

// Search order
        searchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchId = orderIdField.getText().trim();
                currentOrder = null;
                for (OrderDetails o : OrderDetails.getOrders()) {
                    if (o.Getorderid().equals(searchId)) {
                        currentOrder = o;
                        break;
                    }
                }
                if (currentOrder != null) {
                    customerIdField.setText(currentOrder.GetcustomerId());
                    customerNameField.setText(currentOrder.getCustomerName());
                    quantityField.setText(String.valueOf(currentOrder.GetQuantity()));
                    totalLabel.setText("Total: Rs. " + currentOrder.GetTotal());
                    statusLabel.setText("Status: " + currentOrder.getStatusText());

// Set status in combo box
                    switch (currentOrder.getStatus()) {
                        case 0: statusComboBox.setSelectedItem("Preparing"); break;
                        case 1: statusComboBox.setSelectedItem("Delivered"); break;
                        case 2: statusComboBox.setSelectedItem("Cancelled"); break;
                    }

// Only enable editing if order is Preparing
                    boolean editable = currentOrder.getStatus() == 0;
                    customerNameField.setEditable(editable);
                    quantityField.setEditable(editable);
                    updateBtn.setEnabled(editable);
                    statusComboBox.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Order ID not found.");
                    updateBtn.setEnabled(false);
                }
            }
        });

// Update order
        updateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (currentOrder != null) {
                    try {
                        currentOrder.setCustomerName(customerNameField.getText().trim());
                        int qty = Integer.parseInt(quantityField.getText().trim());
                        currentOrder.setQuantity(qty);

// Update total
                        totalLabel.setText("Total: Rs. " + currentOrder.GetTotal());

// Update status
                        String selectedStatus = (String) statusComboBox.getSelectedItem();
                        int statusCode = 0;
                        if (selectedStatus.equals("Preparing")) statusCode = 0;
                        else if (selectedStatus.equals("Delivered")) statusCode = 1;
                        else if (selectedStatus.equals("Cancelled")) statusCode = 2;
                        currentOrder.setStatus(statusCode);

                        statusLabel.setText("Status: " + currentOrder.getStatusText());

                        JOptionPane.showMessageDialog(null, "Order updated successfully!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid data.");
                    }
                }
            }
        });

// Back to home
        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Home home = new Home();
                home.HomeDesign();
                home.LeftpanelDesign();
                home.RightpanelDesign();
                home.setVisible(true);
            }
        });

        setVisible(true);
    }
}

//Encapsulated order details class
class OrderDetails{
	private String Customerid;
	public static int Customernum=0;
	private String orderid;
	public static int Ordernum=0;
	private int Quantity;
	private final int PRICE_PER_ITEM=500;
	private double Total;
	public static final int PREPARING = 0;
	public static final int DELIVERED = 1;
	public static final int CANCEL = 2;
	private int status = PREPARING;
	private String customerName;
	private static OrderDetails[] orders = new OrderDetails[0];
	
	public OrderDetails(){
		Ordernum++;
		orderid=String.format("B%04d",Ordernum);
		Customernum++;
		Customerid=String.format("C%04d",Customernum);
		
	}
	public void setQuantity(int qty) {
    this.Quantity = qty;
	}

	public String Getorderid(){
		return orderid;
	}
	public String GetcustomerId(){
		return Customerid;
	}
	public int 	GetQuantity(){
		return Quantity;
	}
	public double GetTotal(){
		Total=PRICE_PER_ITEM*Quantity;
		return Total;
	}
	public int Getprice(){
		return PRICE_PER_ITEM;
	}
	public int getStatus() {
    return status;
	}
	public void setStatus(int status) {
    this.status = status;
	}
	 public String getStatusText() {
     switch (status) {
         case DELIVERED: return "Delivered";
         case CANCEL: return "Cancelled";
         default: return "Preparing";
		}
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
    this.customerName = customerName;
	}
	
	public static void addOrder(OrderDetails order) {
    OrderDetails[] temp = new OrderDetails[orders.length + 1];
    for (int i = 0; i < orders.length; i++) {
        temp[i] = orders[i];
    }
    temp[orders.length] = order;
    orders = temp;
	}
	public static OrderDetails[] getOrders() {
    return orders;
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
