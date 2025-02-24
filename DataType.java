class DataType{
    public static void main(String args[]){

        // そのまま出力
        System.out.println("Good moning");

        // -100 ~ 100
        byte var;
        var = 1;
        System.out.println(var);

        // -30000 ~ 30000 
        Short VAR;
        VAR = 30000;
        System.out.println(VAR);

        // -20億 ~ 20億
        int var02; 
        var02 = 2000000000;
        System.out.println(var02);

        //「京」以上 最後にL
        long var03;
        var03 = 1000000000L;
        System.out.println(var03);

        // 小数 最後にF
        float var04;
        var04 = 0.1234F;
        System.out.println(var04);

        // 小数 Floatより多くの桁数  基本こっち使う
        double var05;
        var05 = 1.23456789;
        System.out.println(var05);

        // 一文字 ''で囲む
        char var06; 
        var06 = 'A';
        System.out.println(var06);

        // 文字列 ""で囲む
        String var07; 
        var07 = "こんにちは";
        System.out.println(var07);

        // 真偽値
        boolean check;
        check = (var < VAR);
        System.out.println(check);

        // 一次元配列
        String[] arr01 = {"こんにちは","こんばんは"};
        System.out.println(arr01[0]);

        // 二次元配列
        String[][] arr02;
        // 初期化
        arr02 = new String[2][2];
        
        arr02[0][0] = "りんご";
        arr02[0][1] = "みかん";
        arr02[1][0] = "ぶどう";
        arr02[1][1] = "いちご";

        System.out.println(arr02[1][1]);


    }
}