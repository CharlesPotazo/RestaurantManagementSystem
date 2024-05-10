package DataLayer;
import java.util.*;

public class EmployeeData {
    
    private ArrayList<EmployeeModel> managerEmployees = new ArrayList<EmployeeModel>();
    private ArrayList<EmployeeModel> cashierEmployees = new ArrayList<EmployeeModel>();
    
    public EmployeeData(){
        registeredManagerData();
        registeredCashierData();
    }
    
    private ArrayList<EmployeeModel> registeredManagerData(){
       
       EmployeeModel employee1 = new EmployeeModel("Charles","Hello", 001);
       managerEmployees.add(employee1);
       
       EmployeeModel employee2 = new EmployeeModel("Elijah","Hi",002);
       managerEmployees.add(employee2);
       
       EmployeeModel employee3 = new EmployeeModel("Rod","password",003);
       managerEmployees.add(employee3);
       
       return managerEmployees;
   }
    
    private ArrayList<EmployeeModel> registeredCashierData(){
       
       EmployeeModel employee4 = new EmployeeModel("DJ","daniel", 004);
       cashierEmployees.add(employee4); 
        
       EmployeeModel employee5 = new EmployeeModel("Bryle","HIHI", 005);
       cashierEmployees.add(employee5);
       
       EmployeeModel employee6 = new EmployeeModel("Christian","OK",006);
       cashierEmployees.add(employee6);
       
       return cashierEmployees;
   }
    
    public boolean VerifyManagerEmployee(int employeeID,String password){
       boolean result=false; 
       for(EmployeeModel employee : managerEmployees){
            if(employee.employeeID == employeeID && employee.password.equals(password)){
                result = true;
                break;
            }
            else{
            }
        }
        return result;   
    }
    
    public boolean VerifyCashierEmployee(int employeeID,String password){
       boolean result=false; 
       for(EmployeeModel employee : cashierEmployees){
            if(employee.employeeID == employeeID && employee.password.equals(password)){
                result = true;
                break;
            }
            else{
            }
        }
        return result;   
    }
    
    
}
