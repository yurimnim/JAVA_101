class bankAccount {
    private String name;
    private int leftBalance;
    private double interestRate; 

    public bankAccount(String n) {
        n = name;
        leftBalance = 2000;
        interestRate = 0.1;
    }

    public bankAccount(String ne, int lb, double ir) {
        ne = name;
        lb = leftBalance;
        ir = interestRate;
    }

    //getter

    public String getName() {
        return name;
    }

    public int getLeftBalance() {
        return leftBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    //setter

    public void setName(String a) {
        a = name;
    }

    public void setLeftBalance(int b) {
        b = leftBalance;
    }
    
    public void setInterestRate(double c) {
        c = interestRate;
    }

}

class BankAccountTest{
    public static void main(String[] args) {
        bankAccount kakao = new bankAccount("고길동");
        bankAccount kb = new bankAccount("둘리", 50000, 0.5);

        System.out.println("예금주::" + kakao.getName());
        System.out.println("잔액::"  + kakao.getLeftBalance());
        System.out.println("이자율::" + kakao.getInterestRate());
        System.out.println();
        System.out.println("예금주::" + kb.getName());
        System.out.println("잔액::" + kb.getLeftBalance());
        System.out.println("이자율::" + kb.getInterestRate());
        

    }

}