/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.neotasker;
import com.neotasker.model.OperatingSystem;
import com.neotasker.model.Database;

/**
 *
 * @author kenielf
 */
public class NeoTasker {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // OS Handling
        OperatingSystem os = new OperatingSystem();

        // Create Database
        Database.createDatabase("neotasker.sqlite3");
    }
}
