package by.grodno.mz;

public class BankomatAnswer {

	public int rNominal_5;
	public int rNominal_10;
	public int rNominal_20;

	public ATMresponces rATMresponce;

	public BankomatAnswer() {
		rNominal_5 = 0;
		rNominal_10 = 0;
		rNominal_20 = 0;
		rATMresponce = null;
	}

	public BankomatAnswer(int pNominal_5, int pNominal_10, int pNominal_20, ATMresponces pATMresponce) {
		rNominal_5 = pNominal_5;
		rNominal_10 = pNominal_10;
		rNominal_20 = pNominal_20;
		rATMresponce = pATMresponce;
	}

}
