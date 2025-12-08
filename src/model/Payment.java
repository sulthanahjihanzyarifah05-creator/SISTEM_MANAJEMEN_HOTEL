package model;

public class Payment {

    private String payerName;
    private String method;

    public Payment(String payerName, String method) {
        this.payerName = payerName;
        this.method = method;
    }

    public void pay(double amount) {
        System.out.println("\n=== PEMBAYARAN BERHASIL ===");
        System.out.println("Atas Nama   : " + payerName);
        System.out.println("Metode      : " + method);
        System.out.println("Total Bayar : Rp " + amount);
    }

    public String getMethod() {
        return method;
    }
}
