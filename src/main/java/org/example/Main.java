package org.example;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

  // ==== STUDENT MANAGEMENT SYSTEM ====

        try {
            StudentManagementSystem sms = new StudentManagementSystem();
            sms.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}