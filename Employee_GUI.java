package com.gui_application;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import javax.swing.*;

public class Employee_GUI extends JFrame implements ActionListener{
	JLabel lblEno, lblEname, lblEcity;
	JTextField txtEno, txtEname, txtEcity;
	JButton btnAdd, btnDelete, btnUpdate, btnShow;
	List<Employee> employees;
	
	public Employee_GUI()
	{
	
		employees=new ArrayList<Employee>();
		this.setTitle("Employee List");
		this.setSize(400,400);
		this.setVisible(true);
		this.setLocation(100,100);
		
		this.setLayout(null);
		
		lblEno = new JLabel();
		lblEno.setText("Employee Number");
		lblEno.setBounds(30,30,150,30);
		
		
		lblEname = new JLabel();
		lblEname.setText("Employee Name");
		lblEname.setBounds(30,70,150,30);
		
		lblEcity = new JLabel();
		lblEcity.setText("Employee City");
		lblEcity.setBounds(30,110,150,30);
		
		txtEno = new JTextField();
		txtEno.setBounds(200,30,150,30);
		
		txtEname = new JTextField();
		txtEname.setBounds(200,70,150,30);
		
		txtEcity = new JTextField();
		txtEcity.setBounds(200,110,150,30);

		btnAdd = new JButton("Insert");
		btnAdd.setBounds(100,160,80,40);
		
		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(220,160,80,40);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(100,220,80,40);
		
		btnShow = new JButton("Show");
		btnShow.setBounds(220,220,80,40);
		
		this.add(lblEno);
		this.add(lblEname);
		this.add(lblEcity);
		
		this.add(txtEno);
		this.add(txtEname);
		this.add(txtEcity);
		
		this.add(btnAdd);
		this.add(btnDelete);
		this.add(btnUpdate);
		this.add(btnShow);
		
		
		btnAdd.addActionListener(this);
		btnDelete.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnShow.addActionListener(this);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btnAdd)
		{
			int eno= Integer.parseInt(txtEno.getText());
			String ename = txtEname.getText();
			String ecity = txtEname.getText();
			
			Employee emp=new Employee(eno,ename,ecity);
			employees.add(emp);

		}
		else if(e.getSource()==btnUpdate)
		{
			int eno= Integer.parseInt(txtEno.getText());
			String ename = txtEname.getText();
			String ecity = txtEname.getText();
			
			for(Employee emp:employees)
			{
				if(emp.getEno()==eno)
				{
					emp.setEname(ename);
					emp.setEcity(ecity);
				}
			}
		}
		
		else if(e.getSource()==btnDelete)
		{
			int eno = Integer.parseInt(txtEno.getText());
			for(Employee emp:employees)
			{
				if(emp.getEno()==eno)
				{
					employees.remove(emp);
					break;
				}
			}
		}
		else if(e.getSource()==btnShow)
		{
			for(Employee emp:employees) {
				System.out.println(emp);
		}
		}
	}
	
	public static void main(String [] args)
	{
		Employee_GUI obj=new Employee_GUI();
	}
		
	
	
} 

