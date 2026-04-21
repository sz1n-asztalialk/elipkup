/*
* File: WriteToFile.java
* Author: Dóra Boglárka
* Copyright: 2026, Dóra Boglárka
* Group: SZ-I-N
* Date: 2026-04-21
* Github: https://github.com/kalae1337/
* Licenc: MIT
*/

package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    
    public static void write(String data){
        try {
            tryWrite(data);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void tryWrite(String data) throws IOException{
        FileWriter fw = new FileWriter("history.txt", true);

        fw.write(data);
        fw.close();
    }

    
}
