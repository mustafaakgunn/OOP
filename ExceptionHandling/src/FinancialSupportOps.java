public class FinancialSupportOps {

    public void financialSupportPayment(Student student){
        try {
            if (student.financialAid > 7000) {
                throw new SalaryPaidOnBankException("Go bank for your financial aid.");
            } else {
                System.out.println("Payment can be requested from the office... Amount: " + student.financialAid);
            }
        } catch (Exception SalaryPaidOnBankException){
            System.out.println("Payment can be requested from the bank... Amount: " + student.financialAid);
        }

    }

}
