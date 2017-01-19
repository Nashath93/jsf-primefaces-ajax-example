package lk.inova.jsf.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;

import lk.inova.jsf.models.Employee;

@ManagedBean(name="employeeBean")
@SessionScoped
public class EmployeeManagedBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Employee> employees = new ArrayList<Employee>();
	private String employeeName;
	
	@PostConstruct
	public void setEmployeeDataList(){
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee(i, "Employee #" + i);
			this.employees.add(emp);
		}
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void listener(AjaxBehaviorEvent e){
		System.out.println(e); 
	}
}
