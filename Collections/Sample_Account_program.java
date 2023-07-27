/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collections;

/**
 *
 * @author harshit_ranawat
 */
import java.util.*;
import java.io.*;

class Account implements Serializable{

    String Acc_no;
    String Name;
    double Balance;

    public Account(){}
    
    public Account(String a, String n, double b){
        this.Acc_no=a;
        this.Name=n;
        this.Balance=b;
    }
    /*
    public Account(String n){
       
        this.Name=n;
       
        
    }
    public Account(double b){
        
        this.Balance=b;
    }
    
    
    public String getName(){
        return this.Name;
    }
    
    public String getAccno(){
        return this.Acc_no;
    }
    
    public double getBalance(){
        return this.Balance;
    }
    
    public void setAccno(String a){
        this.Acc_no=a;
    } 
    public void setName(String n){
        this.Name=n;
    } 
    public void setBalance(double b){
       this.Balance=b;
    } 
    
    */
    public String getName(){
        return this.Name;
    }
    public String toString(){
       return "Account No:"+Acc_no+"\nName :"+Name+"\nBalance :"+Balance+"\n";
    }
    
    
}


public class Sample_Account_program {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        
        Account acc = null;
        
        
        HashMap<String,Account> hm = new HashMap<>();
        
        try{
        //used to take details from file again first, whenever run the program
        FileInputStream fis  = new FileInputStream("/home/harshit_ranawat/TempFiles/File6.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        
        
        //get the length of the details
        int count = ois.readInt();
        
        for(int i=0;i<count;i++){
            
            acc = (Account)ois.readObject();
            //System.err.println(acc);
            //hashmap will get the details from file, whenever run the program
            hm.put(acc.Acc_no, acc);
        }
        ois.close();
        fis.close();
        
        }
        catch(Exception e){}
        
        //write the details of new user in file 
        FileOutputStream fos = new FileOutputStream("/home/harshit_ranawat/TempFiles/File6.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        System.err.println("Menu: ");
            
        int choice;
        String acc_no;
        String name;
        double balance;
        
        do{
            
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View  All Accounts");
            System.out.println("5. Modify the Accounts details");
            System.out.println("6. Save Accounts");
            System.out.println("7. Exit");            
            System.out.println("Enter your choice ");
            choice=sc.nextInt();
            
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            switch (choice) {
                
                case 1: 
                    System.out.println("Enter Details Accno, Name ,balance ");
                    acc_no = sc.nextLine();
                    name = sc.nextLine();
                    balance = sc.nextDouble();
                    
                    acc = new Account(acc_no, name, balance);
                    hm.put(acc_no, acc);
                    System.err.println(acc);
                    System.err.println("Congrats account created for the name: "+name);
                    
        
                    break;
                
                case 2:
                    System.out.println("Enter Accno to delete: ");
                    acc_no = sc.nextLine();
                    
                    acc= hm.get(acc_no);
                    String username = acc.getName();
                    
                    
                    hm.remove(acc_no);
                    System.err.println("Account for the "+username+" is deleted");
                    
                    break;
                    
                case 3:
                    System.out.println("Enter Accno to view: ");
                    acc_no = sc.nextLine();
                    
                    System.out.println(hm.get(acc_no));
                    break;
                    
                case 4:
                    System.out.println("These are the details of all accounts: ");
                    for(var x:hm.values()){
                        System.out.println(x);
                    }
                    break;
                    
                case 5:
                    System.out.println("Enter Accno to modify: ");
                    String acc_no1 = sc.nextLine();
                    
                    
                    /*
                            
                    System.err.println("What do you want to change? ");
               
                    System.err.println("Press '1' for Name");
                    System.err.println("Press '2' for Balance");
                    
                    int choose = sc.nextInt();
                    
                    switch (choose) {
                        
                        case 1:
                            try{
                            System.out.println("Enter new Name: ");
                            name = sc.nextLine();
                            
                            hm.replace(acc_no1, new Account(name));
                            }
                            catch(Exception e){}
                            break;
                            
                        case 2:
                            try{
                            System.out.println("Enter new Balance: ");
                            balance = sc.nextDouble();
                            
                            
                            hm.replace(acc_no1, new Account(balance));
                            }
                            catch(Exception e){}
                            break;  
                        
                    }
                    */
                    
                    /*  This is not working
                    
                    
                    System.err.println("What do you want to change? ");
                    System.err.println("Press '1' for Accno");
                    System.err.println("Press '2' for Name");
                    System.err.println("Press '3' for Balance");
                    
                    int choose = sc.nextInt();
                    
                    switch (choose) {
                        case 1:
                            System.out.println("Enter new Accno: ");
                            acc_no = sc.nextLine();
                            hm.replace(acc_no1, new Account(acc_no, acc.getName(), acc.getBalance()));
                            break;
                        case 2:
                            try{
                            System.out.println("Enter new Name: ");
                            name = sc.nextLine();
                            hm.replace(acc_no1, new Account(acc.getAccno(), name, acc.getBalance()));
                            }
                            catch(Exception e){}
                            break;
                            
                        case 3:
                            System.out.println("Enter new Balance: ");
                            balance = sc.nextDouble();
                            hm.replace(acc_no1, new Account(acc.getAccno(), acc.getName(), balance));
                            break;  
                        
                    }
                    */
                    
                    
                    System.out.println("Enter new Accno: ");
                    acc_no = sc.nextLine();
                    System.out.println("Enter new Name: ");
                    name = sc.nextLine();
                    System.out.println("Enter new Balance: ");
                    balance = sc.nextDouble();
                    
                    hm.replace(acc_no1, new Account(acc_no, name, balance));
                    
                    
                    System.err.println("Account is Modified");
                    
                    break;

                    
                case 6:
                case 7:
                    //write the length of the details in file
                    oos.writeInt(hm.size());
                    
                    //write values in file using loop
                    for(Account a : hm.values()){
                        oos.writeObject(a);
                    }
  
            }
            
        }
        while (choice!=7);
        
        oos.flush();
        oos.close();
        fos.close();  
    }
}
