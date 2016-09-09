

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.sql.*
;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.ScrollPaneConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.util.*;
import java.util.Date;

public class libraryhome {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTable table_1;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					libraryhome window = new libraryhome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public libraryhome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1072, 735);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1050, 663);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("HOME", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblLibraryHomePage = new JLabel("LIBRARY HOME PAGE");
		lblLibraryHomePage.setBounds(274, 16, 231, 20);
		panel.add(lblLibraryHomePage);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnSearch.setBounds(74, 62, 115, 29);
		panel.add(btnSearch);
		
		JButton btnFines = new JButton("FINES");
		btnFines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnFines.setBounds(74, 233, 115, 29);
		panel.add(btnFines);
		
		JButton btnCheckin = new JButton("CHECK-IN");
		btnCheckin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		btnCheckin.setBounds(549, 62, 115, 29);
		panel.add(btnCheckin);
		
		JButton btnCheckout = new JButton("CHECK-OUT");
		btnCheckout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		btnCheckout.setBounds(60, 424, 146, 29);
		panel.add(btnCheckout);
		
		JButton btnAddborrower = new JButton("ADD-BORROWER");
		btnAddborrower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(5);
			}
		});
		btnAddborrower.setBounds(549, 424, 166, 29);
		panel.add(btnAddborrower);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("SEARCH", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ISBN");
		lblNewLabel.setBounds(15, 16, 69, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AUTHOR NAME");
		lblNewLabel_1.setBounds(15, 75, 146, 20);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TITLE");
		lblNewLabel_2.setBounds(234, 16, 69, 20);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(15, 41, 146, 26);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(15, 96, 146, 26);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(234, 41, 146, 26);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 190, 1045, 450);
		panel_1.add(scrollPane);
		
		table = new JTable();
	/*table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ISBN", "BOOK_TITLE", "BRANCH_ID", "BOOK_AUTHOR", "COPIES_PER_BRANCH", "COPIES_NOTCHECKEDOUT"
			}
		));
		table.getColumnModel().getColumn(4).setMinWidth(22);*/
		//scrollPane.setViewportView(table);
		
				JButton btnSearch_1 = new JButton("Search");
				btnSearch_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					//	table = new JTable();
						DefaultTableModel model3 = new DefaultTableModel(){
							public Class<?> getColumnClass(int column){
								switch(column){
								case 0:
									return String.class;
								case 1:
									return String.class;
								case 2:
									return String.class;
								case 3:
									return String.class;
								case 4:
									return String.class;
								case 5:
									return String.class;
								case 6:
									return String.class;
								default:
									return String.class;
								}
							}
						};
						model3.addColumn("ISBN");
						model3.addColumn("Book Title");
						model3.addColumn("Author name");
						model3.addColumn("Branch Name");
						model3.addColumn("Branch ID");
						model3.addColumn("Total Copies");
						model3.addColumn("Copies Available");
						
						table.setModel(new DefaultTableModel(
							new Object[][] {
							},
							new String[] {
									"ISBN","Book Title","Author name", "Branch Name", "Branch ID","Total Copies","Copies Available"
							}
						));
						
						table.setModel(model3);
						
						scrollPane.setViewportView(table);
					
						
						String id = textField.getText();
						String id1  = textField_1.getText();
						String id2 = textField_2.getText();
					String query = "select book.isbn,book.title,authors.fname,authors.fullname,authors.lname,library_branch.branch_id,library_branch.branch_name,book_copies.no_of_copies,book_copies.remaining_books "
							+ " from book,book_authors,authors,book_copies,library_branch where book.isbn = book_authors.isbn "
							+ "and book_authors.author_id = authors.author_id and book.isbn=book_copies.Isbn and book_copies.branch_id = library_branch.branch_id"
							+ " and book.isbn like '%"+id+"%' and book.title like '%"+id2+"%'"
							+ " and (authors.fname like '%"+id1+"%' or authors.lname like '%"+id1+"%')"; 
								
							conn_sql con = new conn_sql();
						    ResultSet r = con.Connection(query);
				
						    try{
							    while(r.next()){
							    	String s1 = r.getString("book.isbn");
							    	String s2 = r.getString("book.title");
							    	String s3= r.getString("authors.fname");
							    	String s4= r.getString("authors.lname");
							    	String s7 = r.getString("book_copies.no_of_copies");
							    	String s8 = r.getString("book_copies.remaining_books");
							    	String s5 = r.getString("library_branch.branch_name");
							    	String s6 = r.getString("library_branch.branch_id");
							    	String sm = r.getString("authors.fullname");
							    	
							    if((s3.isEmpty()||s3==null)){
							    	 Object[] ob={s1,s2,s4,s5,s6,s7,s8};
										model3.addRow(ob);
										scrollPane.setVisible(true);  
							    }
							    else 
							    {
							    	Object[] ob={s1,s2,sm,s5,s6,s7,s8};
									model3.addRow(ob);
									scrollPane.setVisible(true);  	
							    }
							    
							    }
							    }
							   catch(Exception e1){
								   e1.printStackTrace();
							   }
						 
					}
				});
		btnSearch_1.setBounds(735, 95, 115, 29);
		panel_1.add(btnSearch_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("FINES", null, panel_2, null);
		panel_2.setLayout(null);
		
		textField_21 = new JTextField();
		textField_21.setBounds(72, 63, 116, 22);
		panel_2.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(343, 63, 116, 22);
		panel_2.add(textField_22);
		textField_22.setColumns(10);
		
		JLabel lblLoanid = new JLabel("LOAN_ID");
		lblLoanid.setBounds(101, 111, 56, 16);
		panel_2.add(lblLoanid);
		
		JLabel lblCardno = new JLabel("CARD_NO");
		lblCardno.setBounds(374, 111, 56, 16);
		panel_2.add(lblCardno);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 243, 847, 258);
		panel_2.add(scrollPane_2);
		
		JButton btnUpdatefines = new JButton("UPDATE_FINES");
		btnUpdatefines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model5 = new DefaultTableModel(){
					public Class<?> getColumnClass(int column){
						switch(column){
						case 0:
							return String.class;
						case 1:
							return String.class;
						case 2:
							return String.class;
						default:
							return String.class;
						}
					}
				};
				model5.addColumn("Card_no");
				model5.addColumn("Sum_of_Fines($)");
				model5.addColumn("Paid");
				
				
				table_2 = new JTable();
				table_2.setModel(model5);		
				table_2.getColumnModel().getColumn(1).setPreferredWidth(104);
				scrollPane_2.setViewportView(table_2);
				
				
				
				
				
				
				
				
				
				
				
				
				
				String s = textField_21.getText();
				
				String query = "select * from book_loans where loan_id ="+s;
				conn_sql con = new conn_sql();
				ResultSet rs = con.Connection(query);
		
				
				try {
					while(rs.next()){
						String fine_id= rs.getString("Loan_id");
						String card_no = rs.getString("Card_no");
						String check = rs.getString("date_in");
						String query1;
						if(check.equals("1885-01-01")){
						query1 = "SELECT  (CURDATE()-due_date)*0.25 as result from book_loans where loan_id = "+fine_id;
						}
						else{
							query1 = "SELECT  (date_in-due_date)*0.25 as result from book_loans where loan_id = "+fine_id;
						}
						ResultSet rs1 = con.Connection(query1);
						if(rs1.next()){
							float fine_amt = Float.parseFloat(rs1.getString(1));
						
							
							
							if(fine_amt>0){
								textField_23.setText(" ");
								String query3 = "Select * from fines where loan_id = "+fine_id;
								ResultSet rs2 = con.Connection(query3);
								

								if(rs2.next()){
									String query4 = "UPDATE FINES SET FINE_AMT="+fine_amt+" where loan_id = "+fine_id;
									
									con.Connection2(query4);
									Object[] ob1={card_no,rs1.getString(1), rs2.getString("paid")
									};
									model5.addRow(ob1);
									scrollPane.setVisible(true);
																		
								}
								else
								{
									String query6 = "INSERT INTO FINES VALUES("+fine_id+","+fine_amt+",0)";
									con.Connection2(query6);
									Object[] ob1={card_no,rs1.getString(1), "0"
									};
									model5.addRow(ob1);
									scrollPane.setVisible(true);
									System.out.println("Done");
								}
							}
							
							else
							{
								textField_23.setText("No Fines on this loan id");
							}
					}
					}
				}
				 catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnUpdatefines.setBounds(72, 164, 133, 25);
		panel_2.add(btnUpdatefines);
		
		JButton btnGetdetails = new JButton("GET_DETAILS");
		btnGetdetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String s = textField_22.getText();
					String query = "select sum(fine_amt) from fines,book_loans where book_loans.loan_id = fines.loan_id and book_loans.card_no ="+s+" and paid = 0";
					conn_sql con = new conn_sql();
					ResultSet rs = con.Connection(query);
					ResultSet rs1 = con.Connection(query);
					try {
						rs1.next();
					} catch (SQLException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					boolean empty = false;
				
					try {
					 if(rs1.getString("sum(fine_amt)").equalsIgnoreCase(null)){
					 
					 
					   empty = true;
					 }
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
			
					
						try {
							if(empty)
							{
								textField_23.setVisible(true);
								textField_23.setText("You don't have any dues");
								
							}
							else{
								
								textField_23.setVisible(true);
								textField_23.setText(" ");
								//System.out.println(("ammmmmmm"));
							rs.next();
							String amt = rs.getString("sum(fine_amt)");
							float fine_amt = Float.parseFloat(rs.getString(1));
							
							DefaultTableModel model5 = new DefaultTableModel(){
								public Class<?> getColumnClass(int column){
									switch(column){
									case 0:
										return String.class;
									case 1:
										return String.class;
									case 2:
										return String.class;
									default:
										return String.class;
									}
								}
							};
							model5.addColumn("Card_no");
							model5.addColumn("Total unpaid fines($)");
							model5.addColumn("Paid");
							
							
							table_2 = new JTable();
							table_2.setModel(model5);		
							table_2.getColumnModel().getColumn(1).setPreferredWidth(104);
							scrollPane_2.setViewportView(table_2);
							
							Object[] ob1={s,amt, "0"
							};
							model5.addRow(ob1);
							scrollPane.setVisible(true);
							}	
							
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					
					
			
		});
		btnGetdetails.setBounds(359, 164, 126, 25);
		panel_2.add(btnGetdetails);
		
		textField_23 = new JTextField();
		textField_23.setBounds(642, 63, 116, 22);
		panel_2.add(textField_23);
		textField_23.setColumns(10);
		
		JButton btnUpdatepaid = new JButton("UPDATE_PAID");
		btnUpdatepaid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     String s = textField_21.getText();
					
					String query = "select * from book_loans where loan_id ="+s;
					conn_sql con = new conn_sql();
					ResultSet rs = con.Connection(query);
			
					
					try {
						while(rs.next()){
							String fine_id= rs.getString("Loan_id");
							String card_no = rs.getString("Card_no");
							String check = rs.getString("date_in");
							
							if(check.equals("1885-01-01")){
								textField_23.setText("You cannot pay till you return the book");
							}
							else{
								textField_23.setText("Thanks for the payment");
								
								String query1 = "UPDATE FINES SET PAID='1' where loan_id = "+fine_id;
								con.Connection2(query1);
								
							}
			             	}
					}
					catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
				}
		
			
		});
		btnUpdatepaid.setBounds(661, 164, 116, 25);
		panel_2.add(btnUpdatepaid);
		
		/*JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 243, 847, 258);
		panel_2.add(scrollPane_2);*/
		
		/*table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"PAID", "TOTAL_AMOUNT", "CARD_NUM"
			}
		));
		scrollPane_2.setViewportView(table_2);*/
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("CHECK-IN", null, panel_3, null);
		panel_3.setLayout(null);
		
		textField_16 = new JTextField();
		textField_16.setBounds(113, 83, 146, 26);
		panel_3.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(431, 83, 146, 26);
		panel_3.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(764, 83, 159, 26);
		panel_3.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("BOOK_ID");
		lblNewLabel_14.setBounds(149, 148, 69, 20);
		panel_3.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("CARD_NO");
		lblNewLabel_15.setBounds(464, 148, 87, 20);
		panel_3.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("BORROWER_NAME");
		lblNewLabel_16.setBounds(777, 148, 146, 20);
		panel_3.add(lblNewLabel_16);
		
		JButton btnNewButton = new JButton("CHECK_IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i =0;i<table_1.getRowCount();i++){
					Boolean checked = Boolean.valueOf(table_1.getValueAt(i,0).toString());
					if(checked){
					String s = textField_19.getText();
					String s1 = table_1.getValueAt(i,2).toString();
					String s2 = "update book_loans set date_in = '"+s+"' where Loan_id = '"+s1+"'";
					String s3 = table_1.getValueAt(i,3).toString();
					String s4 = table_1.getValueAt(i,1).toString();
					String s5 = "select remaining_books from book_copies where  isbn = '"+s4+"' and branch_id='"+s3+"'";
					conn_sql con = new conn_sql();
					con.Connection2(s2);
					ResultSet r = con.Connection(s5);
					int count =0;
					
					try {
						r.next();
						 count =Integer.parseInt( r.getString("remaining_books"));
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				count++;	
				
				String query4 ="update book_copies set remaining_books ='"+count+"' where Isbn = '"+s4+"' and branch_id ='"+s3+"'";
		        con.Connection2(query4);
				textField_20.setText("Data manipulated successfully");
					
					
					}
				
			}
			}
		});
		btnNewButton.setBounds(282, 239, 115, 29);
		panel_3.add(btnNewButton);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 274, 1045, 355);
		panel_3.add(scrollPane_1);
		
		JButton btnNewButton_1 = new JButton("GET_BOOKS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model4 = new DefaultTableModel(){
					public Class<?> getColumnClass(int column){
						switch(column){
						case 0:
							return Boolean.class;
						case 1:
							return String.class;
						case 2:
							return String.class;
						case 3:
							return String.class;
						case 4:
							return String.class;
						case 5:
							return String.class;
						case 6:
							return String.class;
						default:
							return String.class;
						}
					}
				};
				model4.addColumn("Selection");
				model4.addColumn("Book_ID");
				model4.addColumn("Loan_ID");
				model4.addColumn("Branch_ID");
				model4.addColumn("Card__no");
				model4.addColumn("Date_out");
				model4.addColumn("Due_Date");
				
				table_1 = new JTable();
				table_1.setModel(model4);
				table_1.getColumnModel().getColumn(6).setPreferredWidth(92);
				scrollPane_1.setViewportView(table_1);
						
				    String s1 = textField_16.getText();
					String s2 = textField_17.getText();
					String s3 = textField_18.getText();
					
					System.out.println(s1 + s2 + s3);
					System.out.println(s2);
					
					/*String query = "select * from book_loans,borrower where borrower.card_no = book_loans.card_no and (book_loans.Isbn='"+s1+"' or"
							+ " book_loans.card_no = '"+s2+"' or borrower.fname like '%"+s3+"%' or borrower.lname like '%"+s3+"%') and "
							+ " book_loans.date_in='1885-01-01'";*/
					
				/*	String query = "select * from book_loans,borrower where book_loans.card_no = borrower.card_no and ((book_loans.date_in='1885-01-01' and book_loans.Isbn='"+s1+"') or"
							+ " (book_loans.date_in='1885-01-01' and book_loans.card_no = '"+s2+"') or (book_loans.date_in='1885-01-01' and (borrower.fname like '%"+s3+"%' or borrower.lname like '%"+s3+"%')))";*/
					
			String 	query  = "select l.isbn,l.card_no,l.date_out,l.due_date,bw.fname,bw.lname,l.loan_id,l.branch_id from book_loans l join borrower bw on l.card_no=bw.card_no"
					+" where l.date_in='1885-01-01' and (l.isbn='"+s1+"' or l.card_no='"+s2+"' or bw.fname='"+s3+"' or bw.lname='"+s3+"')";
					
					conn_sql con = new conn_sql();
					ResultSet r = con.Connection(query);
				
					try {
						while(r.next()){
							//System.out.println(r.getString("count(*)"));
							String r1 = r.getString("l.date_out");
							String r3 = r.getString("l.due_date");
							String r2 = r.getString("l.card_no") ;
							String r4 = r.getString("l.loan_id");
						    String r5 = r.getString("l.isbn");
						    String r6 = r.getString("l.branch_id");
						    
						    
						    System.out.println(r1 + r2 + r3 + r4 +r5+ r6 );
						   Object[] ob1={false,r5,r4,r6,r2,r1,r3};
							model4.addRow(ob1);
							scrollPane.setVisible(true);  
					
							
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				
					
				}
			});
			
		
		
		btnNewButton_1.setBounds(602, 239, 146, 29);
		panel_3.add(btnNewButton_1);
		
		
		
	/*	table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"BOOK_ID", "CARD_NO", "FNAME", "LNAME"
			}
		));*/
		scrollPane_1.setViewportView(table_1);
		
		textField_19 = new JTextField();
		textField_19.setBounds(50, 200, 116, 22);
		panel_3.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblDatein = new JLabel("DATE_IN*");
		lblDatein.setBounds(79, 245, 75, 16);
		panel_3.add(lblDatein);
		
		textField_20 = new JTextField();
		textField_20.setBounds(258, 200, 177, 22);
		panel_3.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblYyyymmdd = new JLabel("* yyyy-mm-dd");
		lblYyyymmdd.setBounds(39, 24, 115, 16);
		panel_3.add(lblYyyymmdd);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("CHECK-OUT", null, panel_4, null);
		panel_4.setLayout(null);
		
		textField_12 = new JTextField();
		textField_12.setBounds(83, 91, 146, 26);
		panel_4.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("ISBN");
		lblNewLabel_11.setBounds(136, 148, 69, 20);
		panel_4.add(lblNewLabel_11);
		
		textField_13 = new JTextField();
		textField_13.setBounds(416, 91, 146, 26);
		panel_4.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("BRANCH_ID");
		lblNewLabel_12.setBounds(446, 148, 98, 20);
		panel_4.add(lblNewLabel_12);
		
		textField_14 = new JTextField();
		textField_14.setBounds(776, 91, 146, 26);
		panel_4.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("CARD_NO");
		lblNewLabel_13.setBounds(808, 148, 98, 20);
		panel_4.add(lblNewLabel_13);
		
		textField_15 = new JTextField();
		textField_15.setBounds(192, 280, 608, 117);
		panel_4.add(textField_15);
		textField_15.setColumns(10);
		
		JButton btnCheckout_1 = new JButton("CHECK-OUT");
		btnCheckout_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = textField_12.getText();
				String s2 = textField_13.getText();
				String s3 = textField_14.getText();
				
				
				String query1 = "select remaining_books from BOOK_COPIES where Isbn ="+s1+" and branch_id ="+s2;
				System.out.println(query1);
				conn_sql con = new conn_sql();
			    ResultSet r = con.Connection(query1);
			    
			    int check =0;
			    int count=0;
			    try {
			    	r.next();
					count = Integer.parseInt(r.getString("remaining_books"));
					if(count == 0){
						System.out.println("Book is not available.Please try later");
					textField_18.setVisible(true);
				    textField_18.setText("Book is not available.Please try later");
				    
					}
					
					else{
						String query2 = "select count(card_no) from book_loans where card_no ="+s3+" and date_in = '1885-01-01'"; //+" date_out < due_date";
						r = con.Connection(query2);
					    
						r.next();
						check = Integer.parseInt(r.getString("count(card_no)"));
						
						System.out.println(check);
						
						if(check>=3){
							textField_15.setVisible(true);
					        textField_15.setText("You can't borrow more than three books");	
						}
						else{
							String query3 = "insert into book_loans(isbn,branch_id,card_no,date_out,due_date) values "
									+ "((select isbn from  book_copies where isbn = '"+s1+"' and branch_id = '"+s2+"'),"
									+ "(select branch_id from book_copies where isbn ='"+s1+"' and branch_id ='"+s2+"'),"
									+ "(select card_no from borrower where card_no = '"+s3+"'),"
									+ "curdate(), DATE_ADD(date_out,INTERVAL 14 DAY))";
						
							con.Connection2(query3);
							
							
							textField_15.setVisible(true);
					        textField_15.setText("You have successfully borrowed a book");
					        
					        count--; /* decrement the book count in that particular branch id*/
					      
					        String query4 ="update book_copies set remaining_books ='"+count+"' where Isbn = '"+s1+"' and branch_id ='"+s2+"'";
					        con.Connection2(query4);
							
						
						}
								
					}
					
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			    
			    
			    
			}
		});
		
		btnCheckout_1.setBounds(446, 502, 151, 29);
		panel_4.add(btnCheckout_1);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("ADD-BORROWER", null, panel_5, null);
		panel_5.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setBounds(28, 35, 146, 26);
		panel_5.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(218, 35, 146, 26);
		panel_5.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(418, 35, 146, 26);
		panel_5.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(629, 35, 146, 26);
		panel_5.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("SSN*");
		lblNewLabel_3.setBounds(84, 77, 69, 20);
		panel_5.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ADDRESS*");
		lblNewLabel_4.setBounds(253, 77, 97, 20);
		panel_5.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("FNAME*");
		lblNewLabel_5.setBounds(462, 77, 69, 20);
		panel_5.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("LNAME*");
		lblNewLabel_6.setBounds(677, 77, 69, 20);
		panel_5.add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(28, 189, 146, 26);
		panel_5.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(218, 189, 146, 26);
		panel_5.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(418, 189, 146, 26);
		panel_5.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(629, 189, 146, 26);
		panel_5.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("EMAIL");
		lblNewLabel_7.setBounds(73, 240, 69, 20);
		panel_5.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CITY");
		lblNewLabel_8.setBounds(270, 240, 69, 20);
		panel_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("STATE");
		lblNewLabel_9.setBounds(462, 240, 69, 20);
		panel_5.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("PHONE");
		lblNewLabel_10.setBounds(677, 240, 69, 20);
		panel_5.add(lblNewLabel_10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(174, 347, 445, 72);
		panel_5.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = textField_5.getText();
				String s2 = textField_6.getText();
				String s3 = textField_3.getText();
				String s4 = textField_7.getText();
				String s5 = textField_4.getText();
				String s6 = textField_8.getText();
				String s7 = textField_9.getText();
				String s8 = textField_10.getText();
				
				
				if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s5.isEmpty()){
					textField_11.setVisible(true);
				    textField_11.setText("Please enter all the fields");
				    
				}
				
				else 
				{
					textField_11.setVisible(true);
					textField_11.setText("");
					
					String query="select ssn from borrower";
					conn_sql con = new conn_sql();
					ResultSet r = con.Connection(query);
					int duplicates =0;
					try {
						while(r.next()){
						if(s3.equals(r.getString("ssn"))){
							textField_11.setText("Please enter a different ssn");
							duplicates++;
						}
						}
						
						if(duplicates==0){
			     	String	query1 = "insert into borrower(ssn,fname,lname,email,address,city,state,phone) values('"+s3
								+ "','"
								+ s1
								+ "','"
								+ s2
								+ "','"
								+ s4
								+ "','"
								+ s5
								+ "','"
								+ s6
								+ "','"
								+ s7
								+ "','"
								+ s8
								+ "')";
						
						con.Connection2(query1);
						
						textField_11.setVisible(true);
						textField_11.setText("User account created successfully");
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				
			}
		});
			
		btnAdd.setBounds(329, 469, 115, 29);
		panel_5.add(btnAdd);
		
		JLabel lblmustEnter = new JLabel("*MUST ENTER");
		lblmustEnter.setBounds(812, 526, 137, 20);
		panel_5.add(lblmustEnter);
	}
}
