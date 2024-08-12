public class Ex4_1 {
    public enum AccountType {SAVINGS, CREDIT}

    private AccountType type;
    private String name;
    private int num;
    private int amt;

    public Ex4_1(AccountType type, String name, int num, int amt) {
        this.type = type;
        this.name = name;
        this.num = num;
        this.amt = amt;
    }

    public AccountType getType() {
        return type;
    }
    public String getName() {
        return name;
    }
    public int getNum() {
        return num;
    }
    public int getAmt() {
        return amt;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setAmt(int amt) {
        this.amt = amt;
    }

    public int calculateInitialBonusValue(int amount) {
        return (int) (amount * 0.05); 
    }

    public static void main(String[] args) {
        Ex4_1 account = new Ex4_1(AccountType.SAVINGS, "John Doe", 123456, 1000);
        System.out.println("Account Type: " + account.getType());
        System.out.println("Account Holder Name: " + account.getName());
        System.out.println("Account Number: " + account.getNum());
        System.out.println("Account Amount: " + account.getAmt());

        int bonus = account.calculateInitialBonusValue(account.getAmt());
        System.out.println("Initial Bonus Value: " + bonus);
    }
}
