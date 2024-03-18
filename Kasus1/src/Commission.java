public class Commission extends Hourly {
    private double totalSale;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double comRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = comRate;
    }

    public void addSales(double totalSales){
        totalSale += totalSales;
    }

    @Override
    public double pay() {
        double payment = super.pay()+(totalSale*commissionRate);
        totalSale = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nCurrent total sales: "+totalSale;
        return result;
    }
}