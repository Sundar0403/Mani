package account;

public class ZcoinAccount {
	private String email_Id;
	private int z_Id;
	private double zCoin_Balance;
	private double rc_Balance;
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public int getZ_Id() {
		return z_Id;
	}
	public void setZ_Id(int z_Id) {
		this.z_Id = z_Id;
	}
	public double getzCoin_Balance() {
		return zCoin_Balance;
	}
	public void setzCoin_Balance(double zCoin_Balance) {
		this.zCoin_Balance = zCoin_Balance;
	}
	public double getRc_Balance() {
		return rc_Balance;
	}
	public void setRc_Balance(double rc_Balance) {
		this.rc_Balance = rc_Balance;
	}
	
	@Override
	public String toString() {
		return "ZcoinAccount [Email_Id=" + email_Id+ ", z_Id=" + z_Id + ", zCoin_Balance=" + zCoin_Balance + ", rc_Balance="
				+ rc_Balance + "]";
	}
	
	
}
