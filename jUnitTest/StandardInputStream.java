/**
 * 
 */


/**
 * 標準入力を奪うためのクラス
 */
package jUnitTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

public class StandardInputStream extends InputStream {
    /** バッファ */
    private LinkedList<Byte> buffer = new LinkedList<>();

    /** 改行文字 */
    private static String crlf = System.getProperty( "line.separator");

    /**
     * 文字列を入力する
     * @param str 文字列
     */
    public void inputln( String str) {
        String appendStr = str + crlf;
        byte[] byteArray = appendStr.getBytes();
        for (byte b : byteArray) {
            buffer.addLast(Byte.valueOf(b));
        }
    }

    @Override
    public int read() throws IOException {
        if ( buffer.isEmpty()) {
            return -1;
        }
        Byte in = buffer.pollFirst();
        return in.intValue();
    }
}
