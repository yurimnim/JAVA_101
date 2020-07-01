class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println(amount + " 원 입금");
    }

    public void withdraw(double amount) {
        if ((balance - amount) > 0) {
            balance = balance - amount;
            System.out.println(amount + " 원 출금");
        } else {
            System.out.println("잔고부족: 인출불가");
        }   
    }

    public double getBalance(){
        return balance; 
    }

    public void printBalance(){
            System.out.println("현재 잔액::" + balance);
        
    }

    public void addInterest(){
        balance = balance + (balance * 0.075);
    }
    
    public static void main(String[] args) {
        System.out.println("테스트: BankAccount 속에 main");
    }
}

class BankAccountTest {
    public static void main(String[] args) {
         
        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount();
        
        a1.deposit(100);
        a2.deposit(50);

        a1.withdraw(60);
        a2.withdraw(30);

        a1.addInterest();

        a1.printBalance();
        a2.printBalance();
        
  }
}

/*
6. 변경 안해도 ok
7. 오류생김  error: class BankAccount is public, should be declared in a file named BankAccount.java
public class BankAccount (BankAccount 에 public 을 붙일거면 파일명도 BankAccount 로 동일하게 해야함 )
8. 오류 발생하지 않음 하지만 class 안에 main 이 구현되지 않음 
9. public class 안에서 main 이 정상적으로 구현: public class 이름과 파일명 일치시켜야 정상적으로 구동 
*/