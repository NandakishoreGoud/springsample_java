
public class Employee {
	int eid;
	String ename;
	Address eaddress;

	public Employee() {

	}

	public Employee(Address eaddress) {
		this.eaddress = eaddress;
	}

	public Employee(int eid, String ename, Address eaddress) {
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public Address getEaddress() {
		return eaddress;
	}
	public void setAddress(Address eaddress) {
		this.eaddress=eaddress;
	}
	
}
