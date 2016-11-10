import java.io.*;
import java.util.*;
import java.text.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumFractionDigits(2);
		formatter.setMaximumFractionDigits(2);
		String name;
		ArrayList<BankAccount> aryList = new ArrayList<BankAccount>();
		do {
			Scanner kbReader = new Scanner(System.in);
			System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort): ");
			name = kbReader.nextLine();
			if(!name.equalsIgnoreCase("EXIT")){
				System.out.print("Please enter the amount of the deposit.");
				Double amount = kbReader.nextDouble();
				System.out.println();
				aryList.add(new BankAccount(amount, name));
			}
		} while (!name.equalsIgnoreCase("EXIT"));
		BankAccount ba = aryList.get(0);
		double maxBalance = ba.balance;
		String maxName = ba.name;
		for(int n = 1; n < aryList.size(); n++){
			if (aryList.get(n).balance > maxBalance){
				maxBalance = aryList.get(n).balance;
				maxName = aryList.get(n).name;
			}
		}
		System.out.println("\nThe account with the largest balance belongs to " + maxName + ".\nThe amount is $" + maxBalance);
	}
	
}
