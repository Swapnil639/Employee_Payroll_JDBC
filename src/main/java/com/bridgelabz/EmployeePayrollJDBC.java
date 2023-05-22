package com.bridgelabz;

import java.sql.*;

public class EmployeePayrollJDBC {
    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to Employee Payroll program on JDBC");
        double salary = 312000.00;
        int salary_id = 1;
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_payroll", "root", "Swapnil123");
            System.out.println("Connection Done...");
            String sql = "update employee_salary set =salary? WHERE salary_id= ?";
            PreparedStatement statement1 = connection.prepareStatement(sql);
            statement1.setDouble(1, salary);
            statement1.setInt(2, salary_id);
            statement1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}
