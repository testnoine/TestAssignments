import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jUnitTest.PracticeTest;

/**
 * Practice004の単体テストを行うクラス
 * @author		:yumiko-noine
 * @version		:1.0.0
 * @作成日		:2025/01/14
 * @更新日		:2025/01/14
 * @ポイント	:FizzとBuzzを２パターンテスト
 */
class Practice004Test extends PracticeTest {
	/**
	 * Fizz4Buzz6の時のテストのテスト・メソッド。
	 */
	@Test
	void Fizz4Buzz6の時のテスト() {

        //テストケース1:Fizz:4,Buzz:6
        
	     //標準入力の値
        in.inputln("4");
        in.inputln("6");
    
        //mainメソッド呼び出し
        Practice004.main(null);
        
        // 改行コードを取得
        String lineSeparator = System.getProperty("line.separator");
        
        
        //期待値
        StringBuilder sb = new StringBuilder();
        sb.append("Fizz:Buzz:1" + lineSeparator);
        sb.append("2" + lineSeparator);
        sb.append("3" + lineSeparator);
        sb.append("Fizz" + lineSeparator);
        sb.append("5" + lineSeparator);
        sb.append("Buzz" + lineSeparator);
        sb.append("7" + lineSeparator);
        sb.append("Fizz" + lineSeparator);
        sb.append("9" + lineSeparator);
        sb.append("10" + lineSeparator);
        sb.append("11" + lineSeparator);
        sb.append("FizzBuzz" + lineSeparator);
        sb.append("13" + lineSeparator);
        sb.append("14" + lineSeparator);
        sb.append("15" + lineSeparator);
        sb.append("Fizz" + lineSeparator);
        sb.append("17" + lineSeparator);
        sb.append("Buzz" + lineSeparator);
        sb.append("19" + lineSeparator);
        sb.append("Fizz" + lineSeparator);
        
        //改行コードを統一する
        String normalizedOutput = outContent.toString().replaceAll("\\R", lineSeparator);
     
        //期待値と実測値が等しいか確認
	    assertEquals(sb.toString(), normalizedOutput);

	}
	/**
	 * Fizz3Buzz5の時のテストのテスト・メソッド。
	 */
	@Test
	void Fizz3Buzz5の時のテスト() {

        //テストケース1:Fizz:3,Buzz:5
        
	     //標準入力の値
        in.inputln("3");
        in.inputln("5");
    
        //mainメソッド呼び出し
        Practice004.main(null);
        
        // 改行コードを取得
        String lineSeparator = System.getProperty("line.separator");
        
        
        //期待値
        StringBuilder sb = new StringBuilder();
        sb.append("Fizz:Buzz:1" + lineSeparator);
        sb.append("2" + lineSeparator);
        sb.append("Fizz" + lineSeparator);
        sb.append("4" + lineSeparator);
        sb.append("Buzz" + lineSeparator);
        sb.append("Fizz" + lineSeparator);
        sb.append("7" + lineSeparator);
        sb.append("8" + lineSeparator);
        sb.append("Fizz" + lineSeparator);
        sb.append("Buzz" + lineSeparator);
        sb.append("11" + lineSeparator);
        sb.append("Fizz" + lineSeparator);
        sb.append("13" + lineSeparator);
        sb.append("14" + lineSeparator);
        sb.append("FizzBuzz" + lineSeparator);
        sb.append("16" + lineSeparator);
        sb.append("17" + lineSeparator);
        sb.append("Fizz" + lineSeparator);
        sb.append("19" + lineSeparator);
        sb.append("Buzz" + lineSeparator);
        
        //改行コードを統一する
        String normalizedOutput = outContent.toString().replaceAll("\\R", lineSeparator);
     
        //期待値と実測値が等しいか確認
	    assertEquals(sb.toString(), normalizedOutput);
	}

}
