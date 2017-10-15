package by.grodno.mz;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bankomat by MZ");
		ATM Bankomat = new ATM(2, 2, 2);
		BankomatAnswer BA = new BankomatAnswer();		
		BA = Bankomat.Withdrawal(70);
		System.out.println(BA.rATMresponce);
		System.out.println(BA.rNominal_5);
		System.out.println(BA.rNominal_10);
		System.out.println(BA.rNominal_20);

	}

}
