package com.techelevator;

import java.io.*;
import java.time.LocalDateTime;

public class TELog {

    public static void log(String message) {
        LocalDateTime now = LocalDateTime.now();

        try (PrintWriter logger = new PrintWriter(new FileWriter("logs/search.log", true))) {
            logger.println(now + " ; " +message);


        } catch (FileNotFoundException e) {
            TELogException logException = new TELogException(e.getMessage());
            throw logException;
        } catch(IOException e){
                throw new com.techelevator.util.TELogException(e.getMessage());
            }
        }
    }
