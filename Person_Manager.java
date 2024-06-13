package com.tiwarisaish.advancedjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.Scanner;

public class Person_Manager {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/Hotel";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "Saish@308181";

    public Person readPerson() {
        int pid;
        String fullName, contactAddress, emailAddress, phoneNumber;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PID");
        pid = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.println("Enter your full name");
        fullName = sc.nextLine();

        System.out.println("Enter your contact address");
        contactAddress = sc.nextLine();

        System.out.println("Enter your email address");
        emailAddress = sc.nextLine();

        System.out.println("Enter your phone number");
        phoneNumber = sc.nextLine();

        Person person1 = new Person(pid, fullName, contactAddress, emailAddress, phoneNumber);

        storePerson(person1);

        return person1;
    }

    private void storePerson(Person person) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            String insertSQL = "INSERT INTO persons (pid, fullName, contactAddress, emailAddress, phoneNumber) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setInt(1, person.getPid());
            preparedStatement.setString(2, person.getName());
            preparedStatement.setString(3, person.getAddress());
            preparedStatement.setString(4, person.getEmail());
            preparedStatement.setString(5, person.getPhone());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printPerson(int pid) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            String selectSQL = "SELECT * FROM persons WHERE pid = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, pid);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Person person = new Person(
                        resultSet.getInt("pid"),
                        resultSet.getString("fullName"),
                        resultSet.getString("contactAddress"),
                        resultSet.getString("emailAddress"),
                        resultSet.getString("phoneNumber")
                );
                System.out.println(person);
            } else {
                System.out.println("Person with PID " + pid + " not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Person_Manager manager = new Person_Manager();
        Person person = manager.readPerson();
        manager.printPerson(person.getPid());
    }
}
