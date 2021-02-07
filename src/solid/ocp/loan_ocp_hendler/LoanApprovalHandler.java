package solid.ocp.loan_ocp_hendler;

public class LoanApprovalHandler {
    public void approveLoan(PersonalLoanValidator personalLoanValidator){
        if(personalLoanValidator.isValid()){
            // some logic
        }
    }

}

class PersonalLoanValidator{
    public boolean isValid(){
        return true;
    }
}

class VehicleLoanValidator{
    public boolean isValid(){
        return true;
    }
}
