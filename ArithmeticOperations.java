public class ArithmeticOperations {

    public static void main(String[] args) {
        // 例として使用する数値
        int num1 = 10;
        int num2 = 5;

        int[] numbers = {8, 10, 15, 3, 20};

        // 加算
        int sum = num1 + num2;
        System.out.println("加算: " + num1 + " + " + num2 + " = " + sum);

        // 減算
        int difference = num1 - num2;
        System.out.println("減算: " + num1 + " - " + num2 + " = " + difference);

        // 乗算
        int product = num1 * num2;
        System.out.println("乗算: " + num1 + " * " + num2 + " = " + product);

        // 除算
        if (num2 != 0) { // 0で割るのを避ける
            int quotient = num1 / num2;
            System.out.println("除算: " + num1 + " ÷ " + num2 + " = " + quotient);
        } else {
            System.out.println("除算: ゼロで割ることはできません");
        }

        for (int num : numbers) {
            // 10の場合は処理をスキップする (continue)
            if (num == 10) {
                System.out.println("数値が10なので処理をスキップします");
                continue;  // 10の場合、次のループに進む
            }

            // 偶数の場合
            else if (num % 2 == 0) {
                System.out.println(num + " は偶数です");
            }

            // 奇数の場合
            else {
                System.out.println(num + " は奇数です");
            }

            // 条件によってループを抜ける (break)
            if (num == 15) {
                System.out.println("数値が15なのでループを終了します");
                break;  // 15でループを終了
            }
        }
    }
}
