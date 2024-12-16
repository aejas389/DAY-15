import java.util.*;
class bank
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name:");
        String name = sc.nextLine();
        System.out.println("Enter Customer ID:");
        int id = sc.nextInt();
        bankingapplication t = new bankingapplication(name,id);
        t.menu();
        
    }
}
class bankingapplication
{
    String cname;
    int cid;
    int balance;
    int previoustransaction;
    bankingapplication(String cname,int cid)
    {
        this.cname=cname;
        this.cid=cid;

    public void deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
            previoustransaction=amount;
        }

    }
    public void withdraw(int amount)
    
    {
        if(amount>0)
        {
            if(amount<=balance)
            {
                balance-=amount;
                previoustransaction=-amount;
            }
        }else{
            System.out.println("Your balance is insufficient");
        }
    }
    public void 
    getprevioustransactions()
    {
        if(previoustransaction>0)
        {
            System.out.println("Credited :"+previoustransaction);
        }else if(previoustransaction<0)
        {
            System.out.println("debited:"+previoustransaction);
        }else{
            System.out.println("No transaction occured");
        }
    } 
    void menu(){
        System.out.println("Enter option:-");
        char option='\0';
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Your name is :"+cname);
        System.out.println("Your cid is:"+cid);
        System.out.println("A.Deposit");
        System.out.println("B.with draw");
        System.out.println("C.previous transaction");
        System.out.println("D.total Balance");
        System.out.println("E.Exit");
        do{
            option=Character.toUpperCase(sc.next().charAt(0));
            switch(option)
            {
                
                case 'A':
                System.out.println("Enter amount");
                int amount = sc.nextInt();
                System.out.println("======================");
                deposit (amount);
                System.out.println("amount credited:"+previoustransaction);
                System.out.println("=======================");
                break;
                case 'B':
                System.out.println("Enter amount");
                int amount1 = sc.nextInt();
                System.out.println("======================");
                withdraw(amount);
                System.out.println("amount debited:"+previoustransaction);
                System.out.println("=======================");
                break;
                case 'C':
                System.out.println("======================");
                System.out.println("Your previous transaction);
                getprevioustransactions();
                System.out.println("=======================");
                break;
                case 'D':
                System.out.println("Enter amount");
                int amount1 = sc.nextInt();
                System.out.println("======================");
                withdraw(amount);
                System.out.println("amount debited:"+previoustransaction);
                System.out.println("=======================");
                break;
                case 'B':
                System.out.println("Enter amount");
                int amount1 = sc.nextInt();
                System.out.println("======================");
                withdraw(amount);
                System.out.println("amount debited:"+previoustransaction);
                System.out.println("=======================");
                break;
                

        }
    }

}