package com.techelevator;
import java.util.Collection;
import java.util.List;

public class Main {
	public String name;
	public int numberOfNights;
	private double dailyRate = 59.99;
	public double estimatedTotal = numberOfNights * dailyRate;
    private boolean needsCleaning;
    private boolean usedMiniBar;

	public String reservationRoom(String name,  int numberOfNights) {
		return String.valueOf(estimatedTotal);//do I need to return this int to string?
	}

// right here is where I need to put an if for the boolean
	// need for loop to determine total cost


	@Override
	public String toString() {
		return (getName() + estimatedTotal +isUsedMiniBar());

	}


	public String getName() {
		return name;
	}

	public int getNumberOfNights() {
		return numberOfNights;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public double getEstimatedTotal() {
		return estimatedTotal;
	}

	public boolean isNeedsCleaning() {
		return needsCleaning;
	}

	public boolean isUsedMiniBar() {
		return usedMiniBar;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfNights(int numberOfNights) {
		this.numberOfNights = numberOfNights;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public void setEstimatedTotal(double estimatedTotal) {
		this.estimatedTotal = estimatedTotal;
	}
}





