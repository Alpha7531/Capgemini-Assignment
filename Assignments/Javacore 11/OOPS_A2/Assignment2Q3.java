package OOPS_A2;
import java.util.ArrayList;
//child 1
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
   
    public int getCash() {
    	int tocash=totalDeposits+creditLimit;
    	return tocash;
    }
}
//child 2
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
   
    public int getCash() {
    	int tocash=totalDeposits+fixedDepositAmount;
    	return tocash;
    }
}

//parent
public class Assignment2Q3 {
	
    public int totalCashInBank(ArrayList<Integer>cash)
    {
    	int tocash=0;
    	for(int i:cash)
    	{
    		tocash+=i;
    		
    	}
    	return tocash;
    }
    /*public int getCash(){
    	
    }*/
    public static void main(String[] args) {
    	Assignment2Q3 c=new Assignment2Q3();
    	
    	CurrentAccount ca=new CurrentAccount();
    	int a=ca.getCash();
    	SavingsAccount sa=new SavingsAccount();
    	int b=sa.getCash();
    	
    	ArrayList<Integer> cashlist= new ArrayList<>();
    	cashlist.add(a);
    	cashlist.add(b);
    	
    	int d=c.totalCashInBank(cashlist);
    	System.out.println(d);
    	
    	
    }
}


