package com.brainacad.studyproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testHello(){

       try (FileOutputStream fileOutputStream = new FileOutputStream(file);
            PrintStream out = new PrintStream(fileOutputStream)) {


           System.setOut(out);

           Application.main(null);

           FileReader fis = new FileReader(file);
           String s = new BufferedReader(fis).readLine();

           assertEquals("Unexpected output", "Hello!",s);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
    }


}
