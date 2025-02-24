class Person {
    // クラスフィールド（インスタンス変数）
    String name;
    int age;

    // コンストラクタ（インスタンスの初期化）
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メソッド（インスタンスメソッド）
    public void introduce() {
        System.out.println("私の名前は " + name + " です。年齢は " + age + " 歳です。");
    }

    public int avg(int a,int b){
        return (a + b) / 2;
    } 


}

public class ClassTest{
    public static void main(String[] args) {
        // インスタンスの生成（オブジェクトの作成）
        Person person1 = new Person("山田太郎", 25);
        Person person2 = new Person("鈴木花子", 30);

        // インスタンスメソッドの呼び出し
        person1.introduce();
        person2.introduce();

        System.out.println("平均は" + person1.avg(10,20));
    }
}
