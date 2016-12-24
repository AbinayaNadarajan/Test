package banking;

public class PayeeDetails {

	private String n;
	private int id;
	private int accNo;
	private String brName;

	public PayeeDetails() {
		System.out.println("");
	}

	public PayeeDetails(String name, int accountNum) {
		this.n = name;
		this.accNo = accountNum;
	}

	public PayeeDetails(int accountId, String branchName) {
		this.id = accountId;
		this.brName = branchName;

	}

	public void display() {
		System.out.println("Added payee details");
		System.out.println("Name: " + getName());
		System.out.println("Id: " + getId());
		System.out.println("Branch_Name: " + getBrName());
		System.out.println("Account_number: " + getAccNo());
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		n = name;
	}

	public void setAccNo(int accountNum) {
		accNo = accountNum;
	}

	public void setBrName(String branchName) {
		brName = branchName;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return n;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getBrName() {
		return brName;
	}
}
