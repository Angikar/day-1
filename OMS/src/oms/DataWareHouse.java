package oms;

public class DataWareHouse {

	// private double pay;
	private String purchaseID;
	private int mobile;

	public DataWareHouse(String Pid, int mobile) {
		this.purchaseID = Pid;
		this.mobile = mobile;
	}

	public String getPid() {
		return purchaseID;
	}

	public void setPid(String Pid) {
		this.purchaseID = Pid;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

}
