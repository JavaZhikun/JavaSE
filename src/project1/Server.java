package project1;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.ws.Response;

public class Server
{
	private JLabel jLabel1;
	private JLabel jLabel2;
	
	private JLabel jLabel3;
	
	private JButton jButton;
	
	private JPanel jPanel1;
	private JPanel jPanel2;
	
	private JScrollPane jScrollPane1;
	
	private JTextArea jTextArea1;
	
	private JTextField jTextField1;
	
	
	public Server()
	{
		
	}
	
	private void initComponents()
	{
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		
		jLabel1 = new JLabel();
		jLabel2 =  new JLabel();
		jLabel3= new JLabel();
		
		jTextField1 = new JTextField();
		jButton = new JButton();
		jScrollPane1 = new JScrollPane();
		jTextArea1 = new JTextArea();
		
		jPanel1.setBorder(BorderFactory.createTitledBorder("服务器信息"));
		jPanel2.setBorder(BorderFactory.createTitledBorder("在线用户列表"));
		
		jLabel1.setText("服务器状态");
		jLabel2.setText("停止");
		jLabel3.setForeground(new Color(204,0,51));
		jLabel3.setText("端口号");
		
		
		jButton.setText("启动服务器");
		
		this.jTextArea1.setEditable(false);
		this.jTextArea1.setForeground(new java.awt.Color(245,0,0));
		
		jPanel1.add(jLabel1);
		jPanel1.add(jLabel2);
		jPanel1.add(jLabel3);
		jPanel1.add(jTextField1);
		jPanel1.add(jButton);
		
		jTextArea1.setColumns(30);
		jTextArea1.setForeground(new java.awt.Color(0, 51, 204));
		jTextArea1.setRows(20);
		
		jScrollPane1.setViewportView(jTextArea1);
		
		jPanel2.add(jScrollPane1);
		
		this.getContentPane().add(jPanel1,BorderLayout.NORTH);
		this.getContentPane().add(jPanel2,BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		
	
								
								
			                   

	}
}








