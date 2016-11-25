package com.brainacad.studyproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import java.io.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by User on 27/10/2016.
 */

public class ApplicationTest {

    public static final String HELLO_TXT = "hello.txt";

    private File file;

    @Before
    public void setUp() {
        file = new File(HELLO_TXT);
    }

    @After
    public void tearDown(){
        file.delete();
    }

    @Ignore
    @Test
    public void testHello(){

       try (FileOutputStream fileOutputStream = new FileOutputStream(file);
            PrintStream out = new PrintStream(fileOutputStream);
            FileReader fis = new FileReader(file)) {

           System.setOut(out);

           Application.main(null);

           String s = new BufferedReader(fis).readLine();

           assertEquals("Unexpected output", "Hello!",s);

       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
