package com.nexos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CasinoInputOutputTest {

    @Test
    public void testCasinoOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ByteArrayInputStream inContent = new ByteArrayInputStream("10 4 3\n0 0 0\n".getBytes());
        System.setIn(inContent);

        Main.main(new String[0]);

        assertEquals(" 4  8,  9  5,  3  1,  2  6, 10,  7\n", outContent.toString());
    }
}
