package tr.istiklal.edu.yazilim.account;
public class TestAccount {
    public static void main(String[] args) {
        // ID'si 1122 ve başlangıç bakiyesi 20.000 olan bir Account nesnesi oluşturuluyor
        Account account = new Account(1122, 20000.0);

        // Yıllık faiz oranını %4.5 olarak ayarlıyoruz
        Account.setAnnualInterestRate(4.5);

        // Hesaptan 2.500 çekiliyor
        account.withdraw(2500.0);

        // Hesaba 3.000 yatırılıyor
        account.deposit(3000.0);

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("--- Hesap Bilgileri ---");
        System.out.println("Hesap ID: " + account.getId());
        System.out.println("Güncel Bakiye: " + account.getBalance());
        System.out.println("Aylık Faiz Oranı: " + account.getMonthlyInterestRate());
        System.out.println("Aylık Faiz Miktarı: " + account.getMonthlyInterest());
        System.out.println("Hesabın Açıldığı Tarih: " + account.getDateCreated());
    }
}