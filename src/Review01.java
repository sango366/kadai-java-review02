
public class Review01 {

    public static void main(String[] args) {
        int money = 100;
        double taxRate = 10.0;
        int tax_amount =  tax(money,taxRate);
        int moneyIncludingTax = tax_amount + money;
        System.out.println(money + "円の商品の税込価格は" + moneyIncludingTax + "円（消費税は" + tax_amount  + "円）です。");

    }

    public static int tax(int money, double taxRate) {
        double taxAmountDouble = money * (taxRate / 100);
        int taxAmount = (int) taxAmountDouble;
        return taxAmount;
    }
}
