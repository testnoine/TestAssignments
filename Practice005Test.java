import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jUnitTest.PracticeTest;

/**
 * Practice005の単体テストを行うクラス
 * @author		:yumiko-noine
 * @version		:1.0.0
 * @作成日		:2025/01/14
 * @更新日		:2025/01/14
 * @ポイント	:出力結果をテスト
 */
class Practice005Test extends PracticeTest {
	/**
	 * 実行のテスト・メソッド。
	 */
	@Test
	void 実行() {
 
        //mainメソッド呼び出し
        Practice005.main(null);
        
        // 改行コードを取得
        String lineSeparator = System.getProperty("line.separator");
        
        //期待値
        StringBuilder sb = new StringBuilder();
        sb.append("1" + lineSeparator);
        sb.append("2" + lineSeparator);
        sb.append("３" + lineSeparator);
        sb.append("4" + lineSeparator);
        sb.append("5" + lineSeparator);
        sb.append("６" + lineSeparator);
        sb.append("7" + lineSeparator);
        sb.append("8" + lineSeparator);
        sb.append("９" + lineSeparator);
        sb.append("10" + lineSeparator);
        sb.append("11" + lineSeparator);
        sb.append("１２" + lineSeparator);
        sb.append("１３" + lineSeparator);
        sb.append("14" + lineSeparator);
        sb.append("１５" + lineSeparator);
        sb.append("16" + lineSeparator);
        sb.append("17" + lineSeparator);
        sb.append("１８" + lineSeparator);
        sb.append("19" + lineSeparator);
        sb.append("20" + lineSeparator);
        sb.append("２１" + lineSeparator);
		sb.append("22" + lineSeparator);
		sb.append("２３" + lineSeparator);
		sb.append("２４" + lineSeparator);
		sb.append("25" + lineSeparator);
		sb.append("26" + lineSeparator);
		sb.append("２７" + lineSeparator);
		sb.append("28" + lineSeparator);
		sb.append("29" + lineSeparator);
		sb.append("３０" + lineSeparator);
		sb.append("３１" + lineSeparator);
		sb.append("３２" + lineSeparator);
		sb.append("３３" + lineSeparator);
		sb.append("３４" + lineSeparator);
		sb.append("３５" + lineSeparator);
		sb.append("３６" + lineSeparator);
		sb.append("３７" + lineSeparator);
		sb.append("３８" + lineSeparator);
		sb.append("３９" + lineSeparator);
		sb.append("40" + lineSeparator);
        
        //改行コードを統一する
        String normalizedOutput = outContent.toString().replaceAll("\\R", lineSeparator);
     
        //期待値と実測値が等しいか確認
	    assertEquals(sb.toString(), normalizedOutput);
	}


}
