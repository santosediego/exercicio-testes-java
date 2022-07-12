package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenEntryDataIsValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;

		Financing financing = new Financing(totalAmount, income, months);

		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenEntryDataIsNotValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 20;

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(totalAmount, income, months);
		});
	}

	@Test
	public void setTotalAmountShouldUpdateTotalAmountWhenDataIsValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		Double newTotalAmount = 10000.0;
		Financing financing = new Financing(totalAmount, income, months);

		financing.setTotalAmount(newTotalAmount);

		Assertions.assertEquals(newTotalAmount, financing.getTotalAmount());
	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionnWhenDataIsNotValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		Double newTotalAmount = 200000.0;
		Financing financing = new Financing(totalAmount, income, months);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			financing.setTotalAmount(newTotalAmount);
		});
	}

	@Test
	public void setIncomeShouldUpdateIncomeWhenDataIsValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		Double newIncome = 3000.0;
		Financing financing = new Financing(totalAmount, income, months);

		financing.setIncome(newIncome);

		Assertions.assertEquals(newIncome, financing.getIncome());
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenDataIsNotValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		Double newIncome = 1000.0;
		Financing financing = new Financing(totalAmount, income, months);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			financing.setIncome(newIncome);
		});
	}

	@Test
	public void setMonthsShouldUpdateMonthsWhenDataIsValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		Integer newMonths = 120;
		Financing financing = new Financing(totalAmount, income, months);

		financing.setMonths(newMonths);

		Assertions.assertEquals(newMonths, financing.getMonths());
	}

	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenDataIsNotValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		Integer newMonths = 35;
		Financing financing = new Financing(totalAmount, income, months);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			financing.setMonths(newMonths);
		});
	}

	@Test
	public void entryShouldCorrectlyCalculateWhenDataIsValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		Double expectedValue = 20000.0;
		Financing financing = new Financing(totalAmount, income, months);

		Double entry = financing.entry();

		Assertions.assertEquals(expectedValue, entry);
	}

	@Test
	public void quotaShouldCorrectlyCalculateWhenDataIsValid() {

		Double totalAmount = 100000.0;
		Double income = 2000.0;
		Integer months = 80;
		Double expectedValue = 1000.0;
		Financing financing = new Financing(totalAmount, income, months);

		Double quota = financing.quota();

		Assertions.assertEquals(expectedValue, quota);
	}
}
