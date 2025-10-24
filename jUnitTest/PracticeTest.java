package jUnitTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * 単体テストを行う親クラス
 * @author		:yumiko-noine
 * @version		:1.0.0
 * @作成日		:2025/01/14
 * @更新日		:2025/01/14
 * @ポイント	:標準入力と標準出力を置き換える
 */
public class PracticeTest {
    //標準入力の代わりに使用
    protected StandardInputStream in = new StandardInputStream();
	//標準出力の代わりに使用
    protected ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    protected ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeEach
    /**
     * テスト前に標準入出力を置き換えるメソッド
     */
    public void before() {
		//標準出力をinに置き換える
        System.setIn(in);
        
		//標準出力をoutContentに置き換える
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    /**
     * テスト後に標準入出力を戻すメソッド
     */
    public void after() {
		//標準出力を戻す
        System.setIn(System.in);

		//標準出力を戻す
        System.setOut(System.out);
	    System.setErr(System.err);
    }
}
