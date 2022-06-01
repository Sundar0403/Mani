package transaction;

public class TransactionHistory {
	private int transactionID;
	private long transactionTime;
	private double transactionAmount;
	private String transactionType;
	public int getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public long getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(long transactionTime) {
		this.transactionTime = transactionTime;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	@Override
	public String toString() {
		return "TransactionHistory [transactionID=" + transactionID + ", transactionTime=" + transactionTime
				+ ", transactionAmount=" + transactionAmount + ", transactionType=" + transactionType + "]";
	}
	
	
}
