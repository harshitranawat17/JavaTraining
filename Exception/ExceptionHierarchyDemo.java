/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author harshit_ranawat
 */


class AccountException extends Exception {
    public AccountException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends AccountException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidWithdrawalAmountException extends AccountException {
    public InvalidWithdrawalAmountException(String message) {
        super(message);
    }
}

public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        try {
            // Generate a user-defined exception
            withdrawAmount(100, 500);
            
            try{
            // Generate a built-in exception
                divideNumbers(10, 0);
            }
            catch (Exception e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            } 
        } 
        
        
        
        catch (InvalidWithdrawalAmountException e) {
            System.out.println("Caught InvalidWithdrawalAmountException: " + e.getMessage());
        } 
        
        
        catch (InsufficientBalanceException e) {
            System.out.println("Caught InsufficientBalanceException: " + e.getMessage());
        } 
        
         
       
        
        
        catch (AccountException e) {
            System.out.println("Caught AccountException: " + e.getMessage());
        }
        
        
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        
        
    }

    public static void withdrawAmount(double balance, double amount) throws AccountException {
        if (amount <= 0) {
            throw new InvalidWithdrawalAmountException("Invalid withdrawal amount.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
    }

    public static void divideNumbers(int dividend, int divisor) {
        
         System.out.println(dividend / divisor);
    }
}
