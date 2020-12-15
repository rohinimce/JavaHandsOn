package javaHandsOn;

public class Bank {
enum Designation{
	CEO(2),GeneralManager(4),RegionalManager(20),BranchManager(30);
    private int noofEmployees;
    Designation(int noofEmployees)
    {
      this.noofEmployees=noofEmployees;
    }
    public int getNoofEmployees(){
      return noofEmployees;
    }
}
public void reportees(Designation designation){
    System.out.println(designation.getNoofEmployees());
}

public void rolesDefined(Designation designation) {
	switch(designation) {
	case CEO:
		System.out.println("Role is CEO");
		break;
	case GeneralManager:
		System.out.println("Role is GeneralManager");
		break;
	default:
		System.out.println("Other Roles");
		break;
	}
	
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank bank=new Bank();
	      bank.reportees(Designation.CEO);
	      bank.rolesDefined(Designation.GeneralManager);
	}

}
