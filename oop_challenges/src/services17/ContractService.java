package services17;

import java.time.LocalDate;

import entities17.Contract;
import entities17.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		super();
		this.onlinePaymentService = onlinePaymentService;
	} 
	
	public void processContract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValue() / months;
		
		for (int i=1; i<=months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getInstalments().add(new Installment(dueDate, quota));
		}
	}
}
