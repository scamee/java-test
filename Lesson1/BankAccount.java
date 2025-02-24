// ChatGPTから問題を作成
// 要件1: 銀行口座システム
// 概要: 銀行口座を管理するシステムを作成してください。顧客の名前、口座番号、口座残高を保持し、預金、引き出し、残高照会などの機能を提供するクラスを作成します。

// 要件:
// BankAccountクラス:
// 顧客の名前 (String)、口座番号 (String)、残高 (double) をフィールドとして持つ。
// 預金するメソッド (deposit(double amount))
// 引き出しするメソッド (withdraw(double amount))
// 残高を表示するメソッド (displayBalance())
// Mainクラス:
// 口座を作成し、預金、引き出し、残高確認を行うプログラム。

public class BankAccount{
    // フィールド
    private String name;
    private String accountNumber;
    private double balance;

    // コンストラクタ
    public BankAccount(String name,String accountNumber,double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // メソッド
    // 預金
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("預金: " + amount + "円");
        }else{
            System.out.println("預金額は正の値である必要があります。");
        }
    }

    // 引き出し
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("引き出し: " + amount + "円");
        } else if (amount > balance) {
            System.out.println("残高不足です。引き出しできません。");
        } else {
            System.out.println("引き出し額は正の値である必要があります。");
        }
    }

    // 残高を画面に表示
    public void displayBalance(){
        System.out.println("残高:" + balance);
    }
}