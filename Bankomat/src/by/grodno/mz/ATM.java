package by.grodno.mz;

public class ATM {
	private int nominal_5, nominal_10, nominal_20;

	public ATM(int pNominal_5, int pNominal_10, int pNominal_20) {
		nominal_5 = 0;
		nominal_10 = 0;
		nominal_20 = 0;
		Load(pNominal_5, pNominal_10, pNominal_20);
	}

	public boolean Load(int pNominal_5, int pNominal_10, int pNominal_20) {
		if ((pNominal_5 > 0) || (pNominal_10 > 0) || (pNominal_20 > 0)) {
			nominal_5 = pNominal_5;
			nominal_10 = pNominal_10;
			nominal_20 = pNominal_20;
			return true;
		} else
			return false;
	}

	public boolean Add(int pNominal_5, int pNominal_10, int pNominal_20) {
		// This function has ABSTRACT sense, cause in life banknotes are never
		// added, only full cassettes reload!!!
		if ((pNominal_5 > 0) || (pNominal_10 > 0) || (pNominal_20 > 0)) {
			if (Load(nominal_5 + pNominal_5, nominal_10 + pNominal_10, nominal_20 + pNominal_20))
				return true;
			else
				return false;
		} else
			return false;
	}

	public BankomatAnswer Withdrawal(int pAmount) {
		int mNominal_5 = nominal_5;
		int mNominal_10 = nominal_10;
		int mNominal_20 = nominal_20;
		int minNominal = 0;
		int mAmount = pAmount;
		int rNominal_5 = 0;
		int rNominal_10 = 0;
		int rNominal_20 = 0;

		if ((mNominal_5 == 0) && (mNominal_10 == 0) && (mNominal_20 == 0))
			return new BankomatAnswer(0, 0, 0, ATMresponces.NO_MONEY);

		if (mAmount > (mNominal_5 * 5 + mNominal_10 * 10 + mNominal_20 * 20))
			return new BankomatAnswer(0, 0, 0, ATMresponces.NOT_ENOUGH_MONEY);

		if (mNominal_5 > 0)
			minNominal = 5;
		else if (mNominal_10 > 0)
			minNominal = 10;
		else if (mNominal_20 > 0)
			minNominal = 20;

		if (minNominal == 0)
			return new BankomatAnswer(0, 0, 0, ATMresponces.ATM_ERROR);

		if (pAmount % minNominal != 0)
			return new BankomatAnswer(0, 0, 0, ATMresponces.INNCORRECT_REQUEST_AMOUNT);

		// The best algorithm for ATMs the longest time working
		while ((mNominal_20 > 0) && (mAmount / 20 > 0)) {
			rNominal_20++;
			mNominal_20--;
			mAmount -= 20;
		}

		while ((mNominal_10 > 0) && (mAmount / 10 > 0)) {
			rNominal_10++;
			mNominal_10--;
			mAmount -= 10;
		}

		while ((mNominal_5 > 0) && (mAmount / 5 > 0)) {
			rNominal_5++;
			mNominal_5--;
			mAmount -= 5;
		}

		if (mAmount == 0) {
			nominal_5 = mNominal_5;
			nominal_10 = mNominal_10;
			nominal_20 = mNominal_20;
			return new BankomatAnswer(rNominal_5, rNominal_10, rNominal_20, ATMresponces.SUCCESS);
		} else
			return new BankomatAnswer(0, 0, 0, ATMresponces.ATM_ERROR);
	}

}
