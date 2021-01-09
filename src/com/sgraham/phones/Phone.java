package com.sgraham.phones;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	
	public abstract void displayInfo();
	
	public String getVersionNumber() {
		return this.versionNumber;
	}
	public int getBatteryPercentage() {
		return this.batteryPercentage;
	}
	public String getCarrier() {
		return this.carrier;
	}
	public String getRingTone() {
		return this.ringTone;
	}
	
	public void setVersionNumber(String vNum) {
		this.versionNumber = vNum;
	}
	public void setBatteryPercentage(int percent) {
		this.batteryPercentage = percent;
	}
	public void setCarrier(String newCarrier) {
		this.carrier = newCarrier;
	}
	public void setRingTone(String tone) {
		this.ringTone = tone;
	}
}
