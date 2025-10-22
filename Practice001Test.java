import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jUnitTest.PracticeTest;

/**
 * Practice001の単体テストを行うクラス
 * @author		:yumiko-noine
 * @version		:1.0.0
 * @作成日		:2025/01/14
 * @更新日		:2025/01/14
 * @ポイント	:偶数と奇数をテスト
 */
class Practice001Test extends PracticeTest {
	/**
	 * 入力値5の時のテストのテスト・メソッド。
	 */
	@Test
	void 入力値5の時のテスト() {

        //テストケース1:奇数
        
	     //標準入力の値
        in.inputln("5");
    
        //mainメソッド呼び出し
        Practice001.main(null);
        
        // 改行コードを取得
        String lineSeparator = System.getProperty("line.separator");
        
        //改行コードを統一する
        String normalizedOutput = outContent.toString().replaceAll("\\R", lineSeparator);
        
        //期待値と実測値が等しいか確認
	    assertEquals("奇数です" + lineSeparator, normalizedOutput);
	}
	/**
	 * 入力値10の時のテストのテスト・メソッド。
	 */
	@Test
	void 入力値10の時のテスト() {

		//テストケース2:偶数
        
	     //標準入力の値
        in.inputln("10");
    
        //mainメソッド呼び出し
        Practice001.main(null);
        
        // 改行コードを取得
        String lineSeparator = System.getProperty("line.separator");
 
        //改行コードを統一する
        String normalizedOutput = outContent.toString().replaceAll("\\R", lineSeparator);
     
        //期待値と実測値が等しいか確認
	    assertEquals("偶数です" + lineSeparator, normalizedOutput);
	}

}
