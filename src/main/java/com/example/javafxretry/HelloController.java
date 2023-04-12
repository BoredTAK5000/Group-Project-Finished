package com.example.javafxretry;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
//import com.mysql.jdbc.Statement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;
import java.util.Random;

//import com.mysql.jdbc.ResultSet;
import javafx.stage.Stage;

public class HelloController {

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Advisor Buttons ----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------

    //-- Control Panel ------------------------------------------------------------------------------------------------------------------------------------------------
    @FXML
    private Button Advisor_Go_To_Cancel_Ticket_Button;

    @FXML
    private Button Advisor_Log_Out;

    @FXML
    private Button Advisor_Go_To_Create_Customer_Button;

    @FXML
    private Button Advisor_Go_To_Publish_Self_Report_Button;

    @FXML
    private Button Advisor_Go_To_Sell_Ticket_Button;

    @FXML
    private Button Advisor_Go_To_View_Past_Reports_Button;

    //-- Cancel Ticket ------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Manager_Cancel_Ticket_Button;

    @FXML
    private TextField Manager_Cancel_Ticket_ID;

    @FXML
    private Button Manager_Cancel_Ticket_Cancel_Button;

    //-- Cancel Ticket (Advisor) --------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Advisor_Cancel_Ticket_Button;

    @FXML
    private Button Advisor_Cancel_Ticket_Cancel_Button;

    @FXML
    private TextField Ticket_ID_To_Delete;

    //-- Create Customer Account --------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Advisor_Customer_City;

    @FXML
    private TextField Advisor_Customer_Country;

    @FXML
    private TextField Advisor_Customer_Discount;

    @FXML
    private TextField Advisor_Customer_Email;

    @FXML
    private TextField Advisor_Customer_Name;

    @FXML
    private TextField Advisor_Customer_Postcode;

    @FXML
    private TextField Advisor_Phone_Number;

    @FXML
    private TextField Customer_Address;

    @FXML
    private Button Advisor_Create_Account_Cancel_Button;

    //-- Sell Tickets -------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Advisor_Amount;

    @FXML
    private TextField Advisor_Blank_ID;

    @FXML
    private TextField Advisor_Currency_Purchased;

    @FXML
    private TextField Advisor_Customer_ID;

    @FXML
    private TextField Advisor_Date_Purchased;

    @FXML
    private TextField Advisor_From_Location;

    @FXML
    private TextField Advisor_Merchant_ID;

    @FXML
    private TextField Advisor_Seat_Location;

    @FXML
    private Button Advisor_Sell_Ticket;

    @FXML
    private Button Advisor_Sell_Ticket_Button;

    @FXML
    private TextField Advisor_To_Loaction;

    //-- Self Report --------------------------------------------------------------------------------------------------------------------------------------------------

    //   TO-DO

    @FXML
    private TextField Advisor_Advisor_ID;

    @FXML
    private Button Advisor_Cancel_Self_Report_Button;

    @FXML
    private Button Advisor_Self_Report_Button;

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Manager Buttons ----------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------

    //-- Control Panel buttons ---------------------------------------------------------------------------------------------------------------------------------------


    @FXML
    private Label Manager_Data_Output;

    @FXML
    private Button Manager_Get_Account_Data_Button;

    @FXML
    private Button Manager_Get_Blank_Data_Button;

    @FXML
    private Button Manager_Get_Customer_Data_Button;

    @FXML
    private Button Manager_Get_Ticket_Data_Button;

    @FXML
    private Button Manager_Go_To_Cancel_Ticket_Button;

    @FXML
    private Button Manager_Log_out_Button;

    @FXML
    private Button Manager_Go_To_Generate_Report_Button;
    @FXML
    private Button Manager_Manage_Blanks_Button;

    @FXML
    private Button Manager_Go_To_Manager_Customers;

    @FXML
    private Button Manager_Go_To_Refund_Ticket_Button;

    @FXML
    private Button Manager_Go_To_View_Past_Reports_Button;

    @FXML
    private Button Admin_Log_Out_Button;

    //-- Manage Blanks ------------------------------------------------------------------------------------------------------------------------------------------------
    @FXML
    private Button Manader_Go_To_Allocate_Blanks_Button;

    //-- Manage Customers ---------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Manager_Go_To_Create_Customer;

    @FXML
    private Button Manager_Go_To_Alter_Customer_Account_Button;

    @FXML
    private Button Manager_Go_To_Change_Discount_Button;

    @FXML
    private Button Manager_Go_To_Delete_Customer_Button;

    //-- Create Customer ----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Manager_Create_Customer_Cancel_Button;

    @FXML
    private Button Create_Customer_Button;

    @FXML
    private TextField Customer_1st_Address_Line;

    @FXML
    private TextField Customer_City;

    @FXML
    private TextField Customer_Country;

    @FXML
    private TextField Customer_Email;

    @FXML
    private TextField Customer_Name;

    @FXML
    private TextField Customer_Phone_Number;

    @FXML
    private TextField Customer_Postcode;

    @FXML
    private TextField Flex_Or_Fixed_Discount;

    //-- Delete Customer ----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Delete_Customer_Button;

    @FXML
    private TextField Manager_Customer_Account_ID_To_Delete;

    @FXML
    private TextField Manager_Email_Of_Customer_To_Delete;

    @FXML
    private TextField Manager_Name_Of_Customer_To_Delete;

    @FXML
    private Button Manager_Delete_Customer_Cancel_Button;

    //-- Alter Customer------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Alter_Customer_Account_Button;

    @FXML
    private Button Manager_Alter_Account_Cancel_Button;

    @FXML
    private TextField Customer_New_Address;

    @FXML
    private TextField Customer_New_City;

    @FXML
    private TextField Customer_New_Country;

    @FXML
    private TextField Customer_New_Email;

    @FXML
    private TextField Customer_New_Fix_Or_Fle_Discount;

    @FXML
    private TextField Customer_New_ID;

    @FXML
    private TextField Customer_New_Name;

    @FXML
    private TextField Customer_New_Phone_Number;

    @FXML
    private TextField Customer_New_Postcode;

    //-- Manage Discount ----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Manager_Alter_Customer_Flex_Or_Fix;

    @FXML
    private Button Manager_Alter_Discount_Button;

    @FXML
    private Button Manager_Change_Discount_Cancel_Button;

    @FXML
    private TextField Manager_Customer_ID_To_Change;

    @FXML
    private TextField Manager_Percentage_Discount;

    //-- Create Account -----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Manager_Create_Account_Agency;

    @FXML
    private Button Manager_Create_Account_Button;

    @FXML
    private Button Manager_Create_Account_Cancel_Button;

    @FXML
    private TextField Manager_Create_Account_Name;

    @FXML
    private TextField Manager_Create_Account_Password;

    @FXML
    private TextField Manager_Create_Account_Phone_Number;

    @FXML
    private TextField Manager_Create_Account_Username;

    //-- Delete Account -----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Manager_Account_ID_To_Delete;

    @FXML
    private TextField Manager_Account_To_Delete_Password;

    @FXML
    private Button Manager_Delete_Account_Button;

    @FXML
    private Button Manager_Delete_Account_Cancel_Button;

    //-- Manage Accounts ----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Manager_Go_To_Alter_Account_Button;

    @FXML
    private Button Manager_Go_To_Create_Account_Button;

    @FXML
    private Button Manager_Go_To_Delete_Account_Button;

    //-- Alter Accounts -----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Manager_Alter_Account_Change_Password_Button;

    @FXML
    private Button Manager_Alter_Account_Change_Role_Button;

    @FXML
    private Button Manager_Alter_Account_Change_Username_Button;

    @FXML
    private Button Manager_Alter_Accounts_Cancel_Button;

    //-- Change Password ----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Manager_Account_ID_To_Change_Password;

    @FXML
    private Button Manager_Change_Password_Button;

    @FXML
    private Button Manager_Change_Password_Cancel_Button;

    @FXML
    private TextField Manager_New_Password1_To_Change_Password;

    @FXML
    private TextField Manager_New_Password2_To_Change_Password;

    @FXML
    private TextField Manager_Old_Password_To_Change_Password;

    //-- Change Role --------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Manager_Account_ID_To_Change_Role;

    @FXML
    private Button Manager_Change_Role_Cancel_Button;

    @FXML
    private Button Manager_Change_Roll_Button;

    @FXML
    private TextField Manager_New_Role_To_Change_Role;

    @FXML
    private TextField Manager_Password_To_Change_Role;

    @FXML
    private TextField Manager_Username_To_Change_Role;

    //-- Change Username ----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Manager_Account_ID_To_Change_Username;

    @FXML
    private Button Manager_Change_Username_Button;

    @FXML
    private Button Manager_Change_Username_Cancel_Button;

    @FXML
    private TextField Manager_New_Username_To_Change_Username;

    @FXML
    private TextField Manager_Password_To_Change_Username;


    //-- Manage Blanks -----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Manager_Go_To_Sell_Ticket_Button;

    @FXML
    private Button Manager_Go_To_Void_Ticket_Button;

    @FXML
    private Button Manager_Manage_Blanks_Cancel_Button;

    //-- Allocate Blanks ---------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Manager_Allocate_Blank_Button;

    @FXML
    private Button Manager_Allocate_Blanks_Button;

    @FXML
    private TextField Manager_Recipiant_ID;

    @FXML
    private TextField Manager_Sent_Blank_ID;

    //-- Sell Ticket -------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Manager_Sell_Ticket_Blank_ID;

    @FXML
    private Button Manager_Sell_Ticket_Button;

    @FXML
    private Button Manager_Sell_Ticket_Cancel;

    @FXML
    private TextField Manager_Sell_Ticket_Currency_Purchased_In;

    @FXML
    private TextField Manager_Sell_Ticket_Customer_ID;

    @FXML
    private TextField Manager_Sell_Ticket_Date;

    @FXML
    private TextField Manager_Sell_Ticket_From_Location;

    @FXML
    private TextField Manager_Sell_Ticket_Merchant_ID;

    @FXML
    private TextField Manager_Sell_Ticket_Price;

    @FXML
    private TextField Manager_Sell_Ticket_Seat_Location;

    @FXML
    private TextField Manager_Sell_Ticket_To_Location;

    //-- Void Ticket --------------------------------------------------------------------------------------------------------------------------------------------------
    @FXML
    private TextField Manager_Ticket_ID_To_Void;

    @FXML
    private Button Manager_Void_Ticket_Button;

    @FXML
    private Button Manager_Void_Tickets_Cancel_Button;

    //-- Generate Report ----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Manager_Create_Bi_Weekly_Report_Button;

    @FXML
    private Button Manager_Generate_Monthly_Report_Button;

    @FXML
    private Button Manager_Go_To_Generate_Custom_Report_Button;

    @FXML
    private Button Manager_Generate_Report_Cancel_Button;

    //-- Custom Report ------------------------------------------------------------------------------------------------------------------------------------------------

    //   TO-DO

    @FXML
    private Button Manager_Custom_Report_Cancel_Button;

    @FXML
    private Button Manager_Custom_Report_Generate_Report_Button;

    @FXML
    private TextField Manager_Custom_Report_Merchant_ID;

    @FXML
    private TextField Manager_Custom_Report_Report_End_Date;

    @FXML
    private TextField Manager_Custom_Report_Report_Start_Date;

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Systems Admin Buttons ----------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------

    //-- Login Page ---------------------------------------------------------------------------------------------------------------------------------------------------
    @FXML
    private Button button;

    //-- Control Panel ------------------------------------------------------------------------------------------------------------------------------------------------
    @FXML
    private Label Admin_Data_Output;

    @FXML
    private Button Admin_Get_Account_Data_Button;

    @FXML
    private Button Admin_Get_Blank_Data_Button;

    @FXML
    private Button Admin_Get_Customer_Data_Button;

    @FXML
    private Button Admin_Get_Ticket_Data_Button;

    @FXML
    private Button Manage_Blanks_Button;

    @FXML
    private Button Admin_Go_To_Manage_Reports_Button;

    @FXML
    private Button Admin_Go_To_Manage_Tickets_Button;

    @FXML
    private Button Admin_Go_To_Backup_System_Button;

    @FXML
    private Button Admin_Go_To_Manage_Accounts_Button;

    //-- Manage Accounts ----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Admin_Go_To_Alter_Account_Button;

    @FXML
    private Button Admin_Go_To_Create_Account_Button;

    @FXML
    private Button Admin_Go_To_Delete_Account_Button;

    //-- Alter Accounts -----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Admin_Go_To_Change_Username_Button;


    @FXML
    private Button Admin_Go_To_Change_Password_Button;

    @FXML
    private Button Admin_Go_To_Change_Role_Button;

    @FXML
    private Button Admin_Alter_Accounts_Cancel_Button;

    //-- Change Username ----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Admin_Account_ID_To_Change_Username;

    @FXML
    private TextField Admin_New_Username;

    @FXML
    private TextField Admin_Password_Of_Account;

    @FXML
    private Button Change_Username_Button;

    @FXML
    private Button Admin_Change_Username_Cancel_;

    //-- Change Password ----------------------------------------------------------------------------------------------------------------------------------------------
    @FXML
    private TextField Admin_Change_Password_Account_ID;

    @FXML
    private TextField Admin_Current_Password_Of_Account;

    @FXML
    private TextField Admin_New_Password1;

    @FXML
    private TextField Admin_New_Password2;

    @FXML
    private Button Admin_Change_Password_Button;

    @FXML
    private Button Admin_Change_Password_Cancel_Button;

    //-- Change Role ---------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Admin_Account_ID_To_Change_Role;

    @FXML
    private TextField Admin_Account_Password_To_Give_Password;

    @FXML
    private TextField Admin_Account_Username;

    @FXML
    private Button Admin_Change_Role_Button;

    @FXML
    private TextField Admin_New_Role;

    @FXML
    private Button Admin_Change_Role_Cancel_Button;

    //-- Create Account -----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Admin_Create_Account_Agency;

    @FXML
    private Button Admin_Create_Account_Button;

    @FXML
    private TextField Admin_Create_Account_Full_Name;

    @FXML
    private PasswordField Admin_Create_Account_Password;

    @FXML
    private TextField Admin_Create_Account_Phone_Number;

    @FXML
    private TextField Admin_Create_Account_Role;

    @FXML
    private TextField Admin_Create_Account_Username;

    @FXML
    private Button Admin_Create_Account_Cancel_Button;

    //-- Delete Account -----------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Admin_Account_ID_To_Delete;

    @FXML
    private Button Admin_Delete_Account_Button;

    @FXML
    private PasswordField Admin_Password_To_Delete;

    @FXML
    private Button Admin_Delete_Account_Cancel_Button;

    //-- Manage Blanks ------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Admin_Go_To_Sell_Ticket;

    @FXML
    private Button Admin_Go_To_Validate_Ticket_Button;

    @FXML
    private Button Go_To_BlackList_Blank_Button;

    @FXML
    private Button Go_To_Allocate_Blanks_Button;

    @FXML
    private Button To_Create_Blank_Button;

    @FXML
    private Button Admin_Go_To_Void_Ticket_Button;

    @FXML
    private Button Manage_Blanks_Cancel_Button;

    //-- Blacklist Blank Page -----------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button BlackList_Blank_Button;

    @FXML
    private TextField Blacklist_Blank_ID;

    @FXML
    private Button Admin_Blacklist_Blank_Cancel_Button;

    //-- Allocate Blanks ----------------------------------------------------------------------------------------------------------------------------------------------
    @FXML
    private TextField Account_ID_To_Send_Blank;

    @FXML
    private Button Allocate_Blanks_Button;

    @FXML
    private TextField Blank_ID_To_Send;

    @FXML
    private Button Admin_Allocate_Blanks_Cancel_Button;

    //-- Create blank -------------------------------------------------------------------------------------------------------------------------------------------------
    @FXML
    private Button Create_Blank_Button;

    @FXML
    private TextField Admin_Discount_ID_1;

    @FXML
    private TextField Admin_Discount_ID_2;

    @FXML
    private TextField Admin_Discount_ID_3;

    @FXML
    private TextField Admin_Discount_ID_4;

    @FXML
    private Button Admin_Create_Blank_Cancel_Button;

    //-- Sell Ticket --------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Admin_Sell_Tickets_Cancel_Button;

    @FXML
    private TextField Blank_ID;

    @FXML
    private TextField Currency_Purchased;

    @FXML
    private TextField Customer_ID;

    @FXML
    private TextField Date;

    @FXML
    private TextField From_Location;

    @FXML
    private TextField Merchant_ID;

    @FXML
    private TextField Price;

    @FXML
    private Button Sell_Ticket_Button;

    @FXML
    private TextField To_Loaction;

    //-- Validate Tickets ---------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button Admin_Validate_Ticket_Button;

    @FXML
    private TextField Ticket_ID_To_Validate;

    @FXML
    private Button Admin_Validate_Ticket_Cancel_Button;

    //-- Void Tickets -------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private TextField Ticket_ID_To_Void;

    @FXML
    private Button Void_Ticket_Button;

    @FXML
    private Button Admin_Void_Tickets_Cancel_Button;

    //-- Backup System ------------------------------------------------------------------------------------------------------------------------------------------------
    @FXML
    private Button Backup_Button;

    @FXML
    private Button Restore_Backup_Button;

    @FXML
    private Button Backup_System_Cancel;

    //-- Generate Report ----------------------------------------------------------------------------------------------------------------------------------------------

    //    TO-DO

    @FXML
    private Button Admin_Generate_Bi_Weekly_Report_Button;

    @FXML
    private Button Admin_Generate_Monthly_Report_Button;

    @FXML
    private Button Admin_Go_To_Generate_Custom_Report_Button;

    //-- Generate Custom Report ---------------------------------------------------------------------------------------------------------------------------------------

    //    TO-DO

    @FXML
    private Button Admin_Generate_Custom_Report_Cancel_Button;

    @FXML
    private TextField Admin_Generate_Report_End_Date;

    @FXML
    private Button Admin_Generate_Report_Generate_Report_Button;

    @FXML
    private TextField Admin_Generate_Report_Merchant_ID;

    @FXML
    private TextField Admin_Generate_Report_Start_Date;

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------


    private Accounts Currently_Logged_In;
    @FXML
    private PasswordField Password_Entered;

    @FXML
    private TextField Role_Entered;

    @FXML
    private TextField Username_Entered;

    @FXML
    private Label Warning_Message;

    private Stage Stage;
    private Scene Scene;
    private Parent Root;

    @FXML
    void Log_In(ActionEvent event) throws IOException { // Log in button
        String Username = Username_Entered.getText();
        String Password = Password_Entered.getText();
        String Role = Role_Entered.getText().toUpperCase();

        if ((Username.toUpperCase().contains("INSERT") || Password.toUpperCase().contains("INSERT") || Role.toUpperCase().contains("INSERT")) || (Username.toUpperCase().contains("SELECT") || Password.toUpperCase().contains("SELECT") || Role.toUpperCase().contains("SELECT"))) { //protection from SQL injections
            Warning_Message.setVisible(true);
        }
        else{
            String Query = "SELECT * FROM account WHERE Username = \""+ Username +"\" AND Password = \""+ Password +"\" AND Role = \""+ Role +"\";"; // This is the query that will be sent to the SQL server

            System.out.println(Query);
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(Query);
                rs.next();
                System.out.println(rs.getString("Username"));

                if (rs.getString(1).equals("")){
                    System.out.println("No account found");
                    Warning_Message.setVisible(true);
                }

                else if (rs.getString("Username").equals(Username)  && rs.getString("Password").equals(Password) && rs.getString("Role").equals(Role)){
                    System.out.println("Log in successful");
                    if (Role.toUpperCase().equals("MANAGER")) { // This code switches the Screen to the Office manager control panel
                        String file = "Office-Manager-Control-Panel.fxml";
                        Change_Scene(event, file); // Make them the account that is currently signed in
                    }
                    else if (Role.toUpperCase().equals("ADMIN") || Role.toUpperCase().equals("SYSTEM ADMINISTRATOR")) { // This code switches the Screen to the System Admin control panel
                        String file = "System-Admin-Control-Panel.fxml";
                        Change_Scene(event, file);
                    }
                    else if (Role.toUpperCase().equals("ADVISOR") || Role.toUpperCase().equals("SALES ADVISOR")) { // This code switches the Screen to the Advisor control panel
                        String file = "Advisor-Control-Panel.fxml";
                        Change_Scene(event, file);
                    }
                    else {
                        Warning_Message.setVisible(true); // Displays warning message
                    }
                    Warning_Message.setVisible(false); // Put Scene transitions here


                }
                else{
                    System.out.println("Option 3");
                    Warning_Message.setVisible(true);
                }
                con.close();


            }
            catch (Exception e){
                System.out.println("RIP connection");
                System.out.println(e);

            }
        }
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Blanks -------------------------------------------------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    void Manage_Blanks(ActionEvent event) throws IOException { //Not working
        String file = "System-Admin-Manage-Blanks.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Go_To_Blacklist_Blank(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Blanks-Blacklist-Blank.fxml";
        Change_Scene(event, file);

    }

    @FXML
    void Go_To_Allocate_Blanks(ActionEvent event) throws IOException { // Make the page they visit depend on their role
        String file = "System-Admin-Manage-Blanks-Allocate-Blanks.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Blacklist_Blank(ActionEvent event) {
        String Blank_ID = Blacklist_Blank_ID.getText();
        if (Blank_ID.toUpperCase().contains("INSERT") || Blank_ID.toUpperCase().contains("UPDATE") || Blank_ID.toUpperCase().contains("SELECT")){
            //Make message visible
        }
        else{
            try{
                String Query = "SELECT * FROM Blanks where Blank_ID = \""+ Blank_ID +"\""; // Add SQL injection protection, make sure that blank exists
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(Query);
                rs.next();
                //Add if statement to see if blank is not there
                if (rs.getString(Blank_ID).equals("")){
                    //  Display message to say that no such account exists
                }
                else{
                    Query = "UPDATE Blanks SET Valid = '0' where Blank_ID = \"" + Blank_ID +"\"";
                    s.executeUpdate(Query);
                    //rs = s.executeQuery(Query);
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    void Change_Scene(ActionEvent event, String File) throws IOException {
        Root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(File)));
        Stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene = new Scene(Root);
        Stage.setScene(Scene);
        Stage.show();
    }

    @FXML
    void Allocate_Blank(ActionEvent event) throws SQLException {
        //Check the Recipient ID exists
        //Check the ID transferred exists
        //Update Database
        String Blank_ID = Blank_ID_To_Send.getText();
        String Recever_ID = Account_ID_To_Send_Blank.getText();

        Allocate_Blank_Actual(Blank_ID, Recever_ID);
    }

    void Allocate_Blank_Actual(String Blank_ID, String Recever_ID){
        boolean Recever_ID_Exists;
        boolean Blank_ID_Exists;

        String Query1 = "SELECT * FROM Blanks WHERE Blank_ID = \"" + Blank_ID + "\";";
        String Query2 = "SELECT * FROM account WHERE ID = \"" + Recever_ID + "\";";
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29", "in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs1 = s.executeQuery(Query1);

            rs1.next();
            if (rs1.getString("Blank_ID").equals("")) {
                // display message
                Blank_ID_Exists = false;
            } else {
                Blank_ID_Exists = true;
            }

            ResultSet rs2 = s.executeQuery(Query2);
            rs2.next();
            if (rs2.getString("ID").equals("")) {
                //display message that account doesn't exist
                Recever_ID_Exists = false;
            } else {
                Recever_ID_Exists = true;
            }

            if (Recever_ID_Exists && Blank_ID_Exists) {
                if (rs2.getString("Blanks_To_Give").equals("")) {

                    //ResultSet rs = s.executeQuery(Query3);
                }
                String Previous_Blanks = rs2.getString("Blanks_To_Give");
                String Query3 = "UPDATE account SET Blanks_To_Give = \"" + Previous_Blanks+ ", " + Blank_ID + "\" WHERE ID = \"" + Recever_ID + "\"";
                s.executeUpdate(Query3);
                //ResultSet rs = s.executeQuery(Query3);

            }
        } catch (Exception e) {
            if (e.toString().equals("java.lang.NullPointerException: Cannot invoke \"String.equals(Object)\" because the return value of \"java.sql.ResultSet.getString(String)\" is null")){
                try{
                    Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29", "in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                    Statement s = con.createStatement();
                    String Query3 = "UPDATE account SET Blanks_To_Give = \""+Blank_ID+"\" WHERE ID = \"" + Recever_ID + "\"";
                    s.executeUpdate(Query3);

                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            else{
                System.out.println(e);
            }
        }
    }

    @FXML
    void Manage_Blanks_Manager(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Blanks.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Go_To_Allocate_Blanks(ActionEvent event) throws IOException {
       String file = "Office-Manager-Manage-Blanks-Allocate-Blanks.fxml";
       Change_Scene(event, file);
    }

    @FXML
    void Go_To_Create_Blanks(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Blanks-Create-Blank.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Create_Blank(ActionEvent event) throws SQLException {
        boolean valid = true;
        if ((Admin_Discount_ID_1.getText().length() > 11 || Admin_Discount_ID_1.getText().length() < 9) || (Admin_Discount_ID_2.getText().length() < 9 || Admin_Discount_ID_2.getText().length() > 11) || (Admin_Discount_ID_3.getText().length() < 9 || Admin_Discount_ID_3.getText().length() > 11) || (Admin_Discount_ID_4.getText().length() < 9 || Admin_Discount_ID_4.getText().length() > 11)){
            valid = false;
        }
        if (Admin_Discount_ID_1.getText().toUpperCase().contains("INSERT") || Admin_Discount_ID_1.getText().toUpperCase().contains("SELECT") || Admin_Discount_ID_1.getText().toUpperCase().contains("UPDATE") || Admin_Discount_ID_1.getText().toUpperCase().contains("DROP")){
            valid = false;
        }
        if (Admin_Discount_ID_2.getText().toUpperCase().contains("INSERT") || Admin_Discount_ID_2.getText().toUpperCase().contains("SELECT") || Admin_Discount_ID_2.getText().toUpperCase().contains("UPDATE") || Admin_Discount_ID_2.getText().toUpperCase().contains("DROP")){
            valid = false;
        }
        if (Admin_Discount_ID_3.getText().toUpperCase().contains("INSERT") || Admin_Discount_ID_3.getText().toUpperCase().contains("SELECT") || Admin_Discount_ID_3.getText().toUpperCase().contains("UPDATE") || Admin_Discount_ID_3.getText().toUpperCase().contains("DROP")){
            valid = false;
        }
        if (Admin_Discount_ID_4.getText().toUpperCase().contains("INSERT") || Admin_Discount_ID_4.getText().toUpperCase().contains("SELECT") || Admin_Discount_ID_4.getText().toUpperCase().contains("UPDATE") || Admin_Discount_ID_4.getText().toUpperCase().contains("DROP")){
            valid = false;
        }

        String[] Discount_IDs = {Admin_Discount_ID_1.getText(), Admin_Discount_ID_2.getText(), Admin_Discount_ID_3.getText(), Admin_Discount_ID_4.getText()};
        if (valid){
            try{
                Blank blank = new Blank(Discount_IDs);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else{
            //Display message
        }
    }

    @FXML
    void Go_To_Sell_Ticket(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Blanks-Sell-Tickets.fxml";
        Change_Scene(event, file);
    }

    boolean Check_SQL_Injection(String[] string){
        for (int i = 0; i < string.length; i++){
            if (string[i].toUpperCase().contains("INSERT") || string[i].toUpperCase().contains("SELECT") || string[i].toUpperCase().contains("DROP") || string[i].toUpperCase().contains("UPDATE") || string[i].toUpperCase().contains("\n")){
                return false;
            }
        }
        return true;
    }

    boolean Check_SQL_Injection(String string){
        if (string.toUpperCase().contains("INSERT") || string.toUpperCase().contains("SELECT") || string.toUpperCase().contains("DROP") || string.toUpperCase().contains("UPDATE")){
            return false;
        }
        else{
            return true;
        }
    }

    String Create_ID() {
        char[] Characters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',};
        String ID = "";
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int j = random.nextInt(52);
            while (!(j < 52)) {
                j = random.nextInt(52);
            }
            ID = ID + Characters[j];
        }
        System.out.println("ID created");
        return ID;
    }

    @FXML
    void Sell_Ticket(ActionEvent event) throws SQLException {

        String Blank = Blank_ID.getText(); //
        String Currency_Purchased_In = Currency_Purchased.getText(); //
        String Customer_Purchaced_ID = Customer_ID.getText();
        String Destination = To_Loaction.getText();
        String From = From_Location.getText();
        String Seller_ID = Merchant_ID.getText();
        int Date_Purchaced = 0;
        int Amount = 0;
        try{
            Amount = Integer.getInteger(Price.getText()); //
            Date_Purchaced = Integer.getInteger(Date.getText()); // Make sure it's an int
        }
        catch (Exception e){
            System.out.println(e);
            //Display message that Amount is invalid
        }
        Sell_Ticket_Actual(Blank, Currency_Purchased_In, Customer_Purchaced_ID, Destination, From, Seller_ID, Date_Purchaced, Amount);
    }

    void Sell_Ticket_Actual(String Blank, String Currency_Purchased_In, String Customer_Purchaced_ID, String Destination, String From, String Seller_ID, int Date_Purchaced, int Amount) throws SQLException {
        String Ticket_ID = "";
        boolean Valid_ID = false;
        while (!Valid_ID){
            Ticket_ID = Create_ID();
            String Query = "SELECT * FROM Tickets WHERE Ticket_ID = \""+Ticket_ID+"\";";
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29", "in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);
            rs.next();
            if(rs.getString("Ticket_ID").equals("")){
                Valid_ID = true;
            }
        }

        if (Blank.length() == 8 && Customer_Purchaced_ID.length() == 8 && Seller_ID.length() == 8 && Currency_Purchased_In.length() > 5 && Date.getText().length() == 6){
            String[] Data = {Blank, Currency_Purchased_In, Customer_Purchaced_ID, Destination, From, Seller_ID};
            if (Check_SQL_Injection(Data)){
                // Store Values make sure tickets are unique
                String Query = "INSERT INTO Tickets (Ticket_ID, Currency_Purchesed, Amount, Date_Purchased, Customer_Purchased_ID, To_Location, From_Location, Seller_ID, Seat_Location, Blank, Valid) VALUES (\""+Ticket_ID+"\", \""+Currency_Purchased_In+"\", "+Amount+", "+Date_Purchaced+", \""+Customer_Purchaced_ID+"\", \""+Destination+"\", \""+From+"\", \""+Seller_ID+"\", \""+"\", \""+Blank+"\", \"1\" )";
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29", "in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                s.executeUpdate(Query);
            }
            else{
                //Display error
            }
        }
        else{
            //Display error
        }
    }

    @FXML
    void Go_To_Validate_Ticket(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Blanks-Validate-Ticket.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Validate_Ticket(ActionEvent event) throws SQLException {
        String Ticket_ID = Ticket_ID_To_Validate.getText();
        if (Check_SQL_Injection(Ticket_ID) && Ticket_ID.length() == 8){
            if(Check_SQL_Injection(Ticket_ID)){
                String Query = "UPDATE Tickets SET Valid = \"1\" WHERE Ticket_ID = \""+Ticket_ID+"\"";
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29", "in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                s.executeUpdate(Query);
                //ResultSet rs = s.executeQuery(Query);
            }
            else{
                // Display error message
            }
        }
        else{
            // Display error message
        }
    }

    @FXML
    void Go_To_Void_Ticket(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Tickets-Void-Ticket.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Void_Ticket(ActionEvent event) throws SQLException {
        String Ticket_ID = Ticket_ID_To_Void.getText();
        Void_Ticket_Actual(Ticket_ID);

    }

    void Void_Ticket_Actual(String Ticket_ID) throws SQLException {
        String Query1 = "SELECT * FROM Tickets WHERE Ticket_ID = \""+Ticket_ID+"\"";
        Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29", "in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s1 = con1.createStatement();
        ResultSet rs1 = s1.executeQuery(Query1);
        if (rs1.getString("Ticket_ID").equals("")){
            //Display error message
        }
        else{
            if (Check_SQL_Injection(Ticket_ID) && Ticket_ID.length() == 8){
                String Query = "UPDATE Tickets SET Valid = \"0\" WHERE Ticket_ID = \""+Ticket_ID+"\"";
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29", "in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                s.executeUpdate(Query);
                //ResultSet rs = s.executeQuery(Query);
            }
            else{
                // Display error message
            }
        }
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------



    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Accounts --------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    void Go_To_Manage_Accounts(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Accounts.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Admin_Go_To_Alter_Account(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Accounts-Alter.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Admin_Go_To_Change_Username(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Accounts-Alter-Change-Username.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Admin_Go_To_Change_Password(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Accounts-Alter-Change-Password.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Admin_Go_To_Change_Role(ActionEvent event) throws IOException { // Program
        String file = "System-Admin-Manage-Accounts-Alter-Change-Role.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Change_Username(ActionEvent event) throws SQLException {
        String Account_ID = Admin_Account_ID_To_Change_Username.getText();
        String New_Username = Admin_New_Username.getText();
        String Password = Admin_Password_Of_Account.getText();

        Change_Username_Actual(Account_ID, New_Username, Password);
    }

    void Change_Username_Actual(String Account_ID, String New_Username, String Password) throws SQLException {
        String[] Check = {Account_ID, New_Username, Password};

        if (Check_SQL_Injection(Check) && Check_Account_Exists(Account_ID)){
            try {
                String Query = "SELECT * FROM account where ID = \""+ Account_ID +"\""; // Add SQL injection protection, make sure that blank exists
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(Query);
                rs.next();
                if (rs.getString("Password").equals(Password)){
                    String Query1 = "UPDATE account SET Username = \" "+New_Username+"\" WHERE ID = \""+Account_ID+"\"";
                    Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29", "in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                    Statement s1 = con1.createStatement();
                    s.executeUpdate(Query1);
                    //ResultSet rs = s.executeQuery(Query);
                }
                else{
                    //Display Message
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        else{
            //Display Error
        }
    }

    boolean Check_Account_Exists(String Account_ID) throws SQLException {
        try{
            String Query = "SELECT * FROM account where ID = \""+ Account_ID +"\""; // Add SQL injection protection, make sure that blank exists
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);
            rs.next();
            if (rs.getString("ID").equals("")){
                return false;
            }
            else{
                return true;
            }
        }
        catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @FXML
    void Change_Password(ActionEvent event) throws SQLException {
        String New_Password1 = Admin_New_Password1.getText();
        String New_Password2 = Admin_New_Password2.getText();
        String Old_Password = Admin_Current_Password_Of_Account.getText();
        String ID = Admin_Change_Password_Account_ID.getText();

        Change_Password_Actual(New_Password1, New_Password2, Old_Password, ID);
    }

    void Change_Password_Actual(String New_Password1, String New_Password2, String Old_Password, String ID) throws SQLException {
        String[] Data = {New_Password1, New_Password2, Old_Password, ID};
        if (New_Password1.equals(New_Password2) && Check_Account_Exists(ID) && Check_SQL_Injection(Data)){
            if (Check_Password(ID, Old_Password)){
                String Query = "UPDATE account SET Password = \""+New_Password1+" \" WHERE ID =\""+ID+"\"";
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                s.executeUpdate(Query);
                //ResultSet rs = s.executeQuery(Query);
            }
            else{
                //Display message
            }
        }
        else{
            //Display error
        }
    }

    boolean Check_Password(String ID, String Password){
        try{
            String Query = "SELECT * FROM account where ID = \""+ ID +"\""; // Add SQL injection protection, make sure that blank exists
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);
            rs.next();
            if (rs.getString("Password").equals(Password)){
                return true;
            }
            else{
                return false;
            }
        }
        catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @FXML
    void Change_Role(ActionEvent event) throws SQLException {

        String ID = Admin_Account_ID_To_Change_Role.getText();
        String Password = Admin_Account_Password_To_Give_Password.getText();
        String Username = Admin_Account_Username.getText();
        String New_Role = Admin_New_Role.getText();

        Change_Role_Actual(ID, Password, Username, New_Role);
    }
    void Change_Role_Actual(String ID, String Password, String Username, String New_Role) throws SQLException {
        New_Role = New_Role.toUpperCase();
        String[] Data = {ID, Password, Username, New_Role};

        if (Check_SQL_Injection(Data) &&  Check_Account_Exists(ID)){
            if (Check_Password(ID, Password)){
                String Query = "UPDATE account SET Role = \""+New_Role+" \" WHERE ID =\""+ID+"\"";
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                s.executeUpdate(Query);
                //ResultSet rs = s.executeQuery(Query);
            }
            else{
                //Display message
            }
        }
        else{
            //Display Message
        }
    }

    @FXML
    void Admin_Create_Account(ActionEvent event) {
        // Check length of phone number

        String Full_Name = Admin_Create_Account_Full_Name.getText();
        String Username = Admin_Create_Account_Username.getText();
        String Role = Admin_Create_Account_Role.getText();
        String Agency = Admin_Create_Account_Agency.getText();
        String Password = Admin_Create_Account_Password.getText();
        int Phone_Number1 = 0;
        try{
            Phone_Number1 = Integer.getInteger(Admin_Create_Account_Phone_Number.getText());
            String Phone_Number2 = Admin_Create_Account_Phone_Number.getText();
            Create_Account(Full_Name, Username, Role, Agency, Password, Phone_Number1, Phone_Number2);
        }
        catch (Exception e){
            // display message
        }
    }

    void Create_Account(String Full_Name, String Username, String Role, String Agency, String Password, int Phone_Number1, String Phone_Number2){
        String[] Data = {Full_Name, Username, Role, Agency, Password};
        String ID = "";
        try {
            if (Check_Account_Doesnt_Exist(Password) && Check_SQL_Injection(Data) && Phone_Number2.length() < 11){
                if(Role.toUpperCase().equals("MANAGER") || Role.toUpperCase().equals("ADMIN") || Role.toUpperCase().equals("ADVISOR")){
                    boolean valid = false;
                    while (!valid){
                        ID = Create_ID();
                        valid = Check_Valid_ID(ID);

                    }
                    String Query = "INSERT INTO account(ID, Username, Password, Role, Full_Name, telephone, Agency) VALUES (\""+ID+"\", \""+Username+"\", \""+Password+"\", \""+Role+"\", \""+Full_Name+"\", \""+Phone_Number1+"\", \""+Agency+"\")";
                    Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                    Statement s = con.createStatement();
                    s.executeUpdate(Query);
                    System.out.println("Account created");
                }
                else{
                    //Display message
                }

            }
            else{
                //Display message
            }
        }
        catch (Exception e){
            //display Error message
        }

    }

    boolean Check_Valid_ID(String ID){
        try{
            String Query = "SELECT * FROM account WHERE ID = \""+ID+"\";";
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);
            rs.next();
            if(rs.getString("ID").equals("")){

            }
            return false;
        }
        catch (Exception e){
            if(e.toString().equals("java.sql.SQLException: Illegal operation on empty result set.")){
                return true;
            }
            else{
                System.out.println(e);
                return false;
            }

        }
    }

    boolean Check_Account_Doesnt_Exist(String Password){
        try {
            System.out.println(Password);
            String Query = "SELECT * FROM account where Password = \""+ Password +"\""; // Add SQL injection protection, make sure that blank exists
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);
            rs.next();
            if(rs.getString("ID").equals("")){

            }
            System.out.println("Problem");
            System.out.println(rs);

            return false;
        }
        catch (Exception e){
            if(e.toString().equals("java.sql.SQLException: Illegal operation on empty result set.")){
                System.out.println("No Problem");
                return true;

            }
            else{
                System.out.println(e);
            }
        }
        System.out.println("wtf");
        return false;
    }

    @FXML
    void Admin_Go_To_Create_Account(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Accounts-Create-Account.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Admin_Go_To_Delete_Account(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Accounts-Delete-Account.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Admin_Delete_Account(ActionEvent event) throws SQLException {
        String ID = Admin_Account_ID_To_Delete.getText();
        String Password = Admin_Password_To_Delete.getText();

        Create_Account(ID, Password);
    }

    void Create_Account(String ID, String Password) throws SQLException {
        String[] Data = {ID, Password};

        if (Check_SQL_Injection(Data) && Check_Account_Exists(ID)){
            String Query = "SELECT * FROM account where Password = \""+ Password +"\" AND ID = \""+ ID +"\";"; // Add SQL injection protection, make sure that blank exists
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);
            rs.next();
            if (rs.getString("ID").equals("")){
                //display message
            }
            else{
                Query = "DELETE FROM account WHERE ID = \""+ID+"\";";
                Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s1 = con1.createStatement();
                s1.executeUpdate(Query);
                //ResultSet rs1 = s1.executeQuery(Query);
            }
        }
        else{
            // Display message
        }

    }

    @FXML
    void Manager_Go_To_Manager_Customer(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Customers.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Go_To_Create_Customer(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Customers-Create-Account.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Create_Customer(ActionEvent event) throws SQLException {

        String City = Customer_City.getText();
        String Country = Customer_Country.getText();
        String Email = Customer_Email.getText();
        String Name = Customer_Name.getText();
        String Postcode = Customer_Postcode.getText();
        String Discount = Flex_Or_Fixed_Discount.getText();
        int Phone_Number = 0;

        try{
            Phone_Number = Integer.valueOf(Customer_Phone_Number.getText());
            Create_Customer_Actual(City, Country, Discount, Email, Name, Postcode, Phone_Number);
        }
        catch (Exception e){
            // Display Message
        }
    }

    void Create_Customer_Actual(String City, String Country, String Discount, String Email, String Name, String Postcode, int Phone_Number) throws SQLException {
        boolean Valid = true;
        String[] Data = {City, Country, Email, Name, Postcode, Discount};

        if (Discount.toUpperCase().equals("FIXED")){
            Valid = true;
        }
        else if (Discount.toUpperCase().equals("FLEXED")) {
            Valid = true;
        }
        else{
            Valid = false;
            //Display Error
        }

        char[] Characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j',
                'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
        String ID = "";
        boolean ID_Created = false;

        while(!(ID_Created)){
            ID = "";
            Random random = new Random();
            for (int i = 0; i < 8; i++){
                int j = random.nextInt(52);
                while (!(j < 52)){
                    j = random.nextInt(52);
                }
                ID = ID + Characters[j];
            }
            String Query = "SELECT * FROM Customers WHERE ID = \" "+ ID +" \" ";
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);
            if(rs.getString(ID).equals("")){
                ID_Created = true;
            }
        }

        if (Check_SQL_Injection(Data) && Valid){
            String Query = "SELECT * FROM Customers WHERE ID = \" "+ID+" \" ";
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);
            if(rs.getString(Email).equals("")){
                Query = "INSERT INTO Customer VALUES (\""+ID+"\", \""+Name+"\", \""+Email+"\", \""+Postcode+"\", \""+City+"\", \""+Country+"\" , "+Phone_Number+")";
                System.out.println(Query);
                Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s1 = con1.createStatement();
                s1.executeUpdate(Query);
            }
            else{
                //Display Message
            }
        }
        else{
            //display message
        }
    }

    @FXML
    void Manager_Go_To_Delete_Customer(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Customers-Delete-Account.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Delete_Customer(ActionEvent event) throws SQLException {
        String ID = Manager_Customer_Account_ID_To_Delete.getText();
        String Email = Manager_Email_Of_Customer_To_Delete.getText();
        String Name = Manager_Name_Of_Customer_To_Delete.getText();

        String Query = "SELECT * FROM Customers WHERE ID = \" "+ID+" \" AND Name = \""+Name+"\" AND Email = \""+Email+"\";";
        Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(Query);
        rs.next();
        if (rs.getString("ID").equals("")){
            //Display message
        }
        else{
            Query = "DELETE FROM Customer WHERE ID = \""+ID+"\";";
            Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s1 = con1.createStatement();
            s1.executeUpdate(Query);
            //ResultSet rs1 = s1.executeQuery(Query);
        }
    }

    @FXML
    void Alter_Customer_Account(ActionEvent event) throws SQLException {

        String ID = Customer_New_ID.getText();
        String City = Customer_New_City.getText();
        String Country = Customer_New_Country.getText();
        String Email = Customer_New_Email.getText();
        String Name = Customer_New_Name.getText();
        String Postcode = Customer_New_Postcode.getText();
        String Discount = Customer_New_Fix_Or_Fle_Discount.getText();
        String Address = Customer_New_Address.getText();
        boolean valid = true;

        String[] Data = {City, Country, Email, Name, Postcode, Discount, Address};

        try{
            int Phone = Integer.valueOf(Customer_New_Phone_Number.getText());
        }
        catch (Exception e){
            //display message
            valid = false;
        }

        if (Check_SQL_Injection(Data)){
            if (valid){
                String Query = "SELECT * FROM Customer WHERE ID = \""+ID+"\";";
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(Query);
                rs.next();
                if(rs.getString("ID").equals("")){
                    //display message
                }
                else{
                    Query = "UPDATE Customer SET Name = \""+ Name +"\", Email = \""+Email+"\", Postcode = \""+Postcode+"\", City = \""+City+"\", ";
                    System.out.println(Query);
                    Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                    Statement s1 = con1.createStatement();
                    s.executeUpdate(Query);
                    //ResultSet rs1 = s.executeQuery(Query);
                }
            }
        }
        else{
            //Display message
        }
    }

    @FXML
    void Manager_Alter_Discount(ActionEvent event) throws SQLException {

        String ID = Manager_Customer_ID_To_Change.getText();
        String Flex_Or_Fixed = "";

        boolean valid = true;
        if (Manager_Alter_Customer_Flex_Or_Fix.getText().toUpperCase().equals("FLEX") || Manager_Alter_Customer_Flex_Or_Fix.getText().toUpperCase().equals("FIXED")){
            Flex_Or_Fixed = Manager_Alter_Customer_Flex_Or_Fix.getText();
        }
        else{
            //Display message
            valid = false;
        }

        String[] Data = {ID, Flex_Or_Fixed};
        int Discount = 0;

        try{
            Discount = Integer.valueOf(Manager_Percentage_Discount.getText());
        }
        catch (Exception e){
            //display message
            valid = false;
        }

        if (Check_SQL_Injection(Data)){
            if(valid){
                String Query = "SELECT * FROM Customer WHERE ID = \""+ID+"\";";
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(Query);
                rs.next();
                if (rs.getString("ID").equals("")){
                    //display message
                }
                else{
                    Query = "UPDATE Customer SET Discount \""+Discount+"\", Flex_Or_Fixed = \""+Flex_Or_Fixed+"\" WHERE ID = \""+ID+"\";";
                    Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                    Statement s1 = con1.createStatement();
                    s.executeUpdate(Query);
                    //ResultSet rs1 = s1.executeQuery(Query);
                }
            }
        }
        else{
            //display message
        }
    }

    @FXML
    void Manager_Go_To_Cancel_Ticket(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Tickets-Void-Ticket.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Go_To_Generate_Report(ActionEvent event) throws IOException {
        String file = "Office-Manager-Generate-Report.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Go_To_Refund_Ticket(ActionEvent event) throws IOException {
        String file = "Office-Manager-Cancel-Ticket.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Go_To_View_Past_Reports(ActionEvent event) throws IOException {
        String file = "Office-Manager-View-Past-Reports.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Advisor_Go_To_Cancel_Ticket(ActionEvent event) throws IOException {
        String file = "Advisor-Cancel-Tickets.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Advisor_Go_To_Create_Customer(ActionEvent event) throws IOException {
        String file = "Advisor-Manage-Create-Account.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Advisor_Go_To_Publish_Self_Report(ActionEvent event) throws IOException {
        String file = "Advisor-Self-Report.fxml";
        Change_Scene(event, file);
        //Create GUI
    }

    @FXML
    void Advisor_Go_To_Sell_Ticket(ActionEvent event) throws IOException {
        String file = "Advisor-Sell-Tickets.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Advisor_Go_To_View_Past_Reports(ActionEvent event) throws IOException {
        String file = "Advisor-View-Past-Reports.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Cancel_Ticket(ActionEvent event) throws SQLException {
        String ID = Manager_Cancel_Ticket_ID.getText();
        Void_Ticket_Actual(ID);
        // Manager_Cancel_Ticket_ID;
    }

    @FXML
    void Advisor_Create_Account(ActionEvent event) throws SQLException {

        String City = Advisor_Customer_City.getText();
        String Country = Advisor_Customer_Country.getText();
        String Discount = Advisor_Customer_Discount.getText();
        String Email = Advisor_Customer_Email.getText();
        String Name = Advisor_Customer_Name.getText();
        String Postcode = Advisor_Customer_Postcode.getText();
        int Phone_Number = 0;

        try{
            Phone_Number = Integer.valueOf(Advisor_Phone_Number.getText());
        }
        catch (Exception e){
            //Display error message
        }

        Create_Customer_Actual(City, Country, Discount, Email, Name, Postcode, Phone_Number); //String Full_Name, String Username, String Role, String Agency, String Password, int Phone_Number1, String Phone_Number2
    }

    @FXML
    void Backup_Server(ActionEvent event) throws SQLException {
        String Query = "SELECT * FROM account;";
        Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(Query);
        while(rs.next()){
            String Query1 = "INSERT INTO Account_Backup (ID, Username, Password, Role, Full_Name, telephone, Blanks_To_Give, Agency) VALUES (\""+rs.getString("ID")+"\", \""+rs.getString("Username")+"\", \""+rs.getString("Password")+"\", \""+rs.getString("Role")+"\", \""+rs.getString("Full_Name")+"\", \""+rs.getString("telephone")+"\", \""+rs.getString("Blanks_To_Give")+"\", \""+rs.getString("Agency")+"\");";
            Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s1 = con1.createStatement();
            s1.executeUpdate(Query1);
        }

        Query = "SELECT * FROM Blanks;";
        Connection con2 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s2 = con2.createStatement();
        ResultSet rs2 = s2.executeQuery(Query);
        while(rs2.next()){
            String Query1 = "INSERT INTO Blanks_Backup (Blank_ID, Valid, Discount1_ID, Discount2_ID, Discount3_ID, Discount4_ID) VALUES (\""+rs2.getString("Blank_ID")+"\", \""+rs2.getString("Valid")+"\", \""+rs2.getString("Discount1_ID")+"\", \""+rs2.getString("Discount2_ID")+"\", \""+rs2.getString("Discount3_ID")+"\", \""+rs2.getString("Discount4_ID")+"\");";
            Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s1 = con1.createStatement();
            s1.executeUpdate(Query1);
        }

        Query = "SELECT * FROM Customer;";
        Connection con3 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s3 = con3.createStatement();
        ResultSet rs3 = s3.executeQuery(Query);
        while(rs3.next()){
            String Query1 = "INSERT INTO Customer_Backup (ID, Name, Email, Postcode, City, Country, Discount, Flex_Or_Fixed) VALUES (\""+rs3.getString("ID")+"\", \""+rs3.getString("Name")+"\", \""+rs3.getString("Email")+"\", \""+rs3.getString("Postcode")+"\", \""+rs3.getString("City")+"\", \""+rs3.getString("Country")+"\", \""+rs3.getString("Discount")+"\", \""+rs3.getString("Flex_Or_Fixed")+"\");";
            Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s1 = con1.createStatement();
            s1.executeUpdate(Query1);
        }

        Query = "SELECT * FROM Tickets;";
        Connection con4 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s4 = con4.createStatement();
        ResultSet rs4 = s4.executeQuery(Query);
        while(rs4.next()){
            String Query1 = "INSERT INTO Tickets_Backup (Ticket_ID, Currency_Purchased, Amount, Date_Purchased, Customer_Purchased_ID, To_Location, From_Location, Seller_ID, Seat_Location, Blank, Valid) VALUES (\""+rs4.getString("Ticket_ID")+"\", \""+rs4.getString("Currency_Purchesed")+"\", \""+rs4.getString("Amount")+"\", \""+rs4.getString("Date_Purchased")+"\", \""+rs4.getString("Customer_Purchased_ID")+"\", \""+rs4.getString("To_Location")+"\", \""+rs4.getString("From_Location")+"\", \""+rs4.getString("Seller_ID")+"\", \""+rs4.getString("Seat_Location")+"\", \""+rs4.getString("Blank")+"\", \""+rs4.getString("Valid")+"\");";
            Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s1 = con1.createStatement();
            s1.executeUpdate(Query1);
        }
    }

    @FXML
    void Restore_Backup(ActionEvent event) throws SQLException {
        String Query = "SELECT * FROM Account_Backup;";
        Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(Query);
        while(rs.next()){
            String Query1 = "INSERT INTO account (Ticket_ID, Currency_Purchesed, Amount, Date_Purchased, Customer_Purchased_ID, To_Location, From_Location, Seller_ID, Seat_Location, Blank, Valid) VALUES (\""+rs.getString("Ticket_ID")+"\", \""+rs.getString("Currency_Purchesed")+"\", \""+rs.getString("Amount")+"\", \""+rs.getString("Date_Purchased")+"\", \""+rs.getString("Customer_Purchased_ID")+"\", \""+rs.getString("To_Location")+"\", \""+rs.getString("From_Location")+"\", \""+rs.getString("Seller_ID")+"\", \""+rs.getString("Seat_Location")+"\", \""+rs.getString("Blank")+"\", \""+rs.getString("Valid")+"\");";
            Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s1 = con1.createStatement();
            s1.executeUpdate(Query1);
        }

        Query = "SELECT * FROM Blanks_Backup;";
        Connection con2 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s2 = con2.createStatement();
        ResultSet rs2 = s2.executeQuery(Query);
        while(rs2.next()){
            String Query1 = "INSERT INTO Blanks (Blank_ID, Valid, Discount1_ID, Discount2_ID, Discount3_ID, Discount4_ID) VALUES (\""+rs2.getString("Blank_ID")+"\", \""+rs2.getString("Valid")+"\", \""+rs2.getString("Discount1_ID")+"\", \""+rs2.getString("Discount2_ID")+"\", \""+rs2.getString("Discount3_ID")+"\", \""+rs2.getString("Discount4_ID")+"\");";
            Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s1 = con1.createStatement();
            s1.executeUpdate(Query1);
        }

        Query = "SELECT * FROM Customer_Backup;";
        Connection con3 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s3 = con3.createStatement();
        ResultSet rs3 = s3.executeQuery(Query);
        while(rs3.next()){
            String Query1 = "INSERT INTO Customer (ID, Name, Email, Postcode, City, Country, Discount, Flex_Or_Fixed) VALUES (\""+rs3.getString("ID")+"\", \""+rs3.getString("Name")+"\", \""+rs3.getString("Email")+"\", \""+rs3.getString("Postcode")+"\", \""+rs3.getString("City")+"\", \""+rs3.getString("Country")+"\", \""+rs3.getString("Discount")+"\", \""+rs3.getString("Flex_Or_Fixed")+"\");";
            Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s1 = con1.createStatement();
            s1.executeUpdate(Query1);
        }

        Query = "SELECT * FROM Tickets_Backup;";
        Connection con4 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s4 = con4.createStatement();
        ResultSet rs4 = s4.executeQuery(Query);
        while(rs4.next()){
            String Query1 = "INSERT INTO Tickets (Ticket_ID, Currency_Purchesed, Amount, Date_Purchased, Customer_Purchased_ID, To_Location, From_Location, Seller_ID, Seat_Location, Blank, Valid) VALUES (\""+rs4.getString("Ticket_ID")+"\", \""+rs4.getString("Currency_Purchesed")+"\", \""+rs4.getString("Amount")+"\", \""+rs4.getString("Date_Purchased")+"\", \""+rs4.getString("Customer_Purchased_ID")+"\", \""+rs4.getString("To_Location")+"\", \""+rs4.getString("From_Location")+"\", \""+rs4.getString("Seller_ID")+"\", \""+rs4.getString("Seat_Location")+"\", \""+rs4.getString("Blank")+"\", \""+rs4.getString("Valid")+"\");";
            Connection con1 = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s1 = con1.createStatement();
            s1.executeUpdate(Query1);
        }
    }

    @FXML
    void Admin_Cancel(ActionEvent event) throws IOException {
        String file = "System-Admin-Control-Panel.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Cancel(ActionEvent event) throws IOException {
        String file = "Office-Manager-Control-Panel.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Advisor_Cancel(ActionEvent event) throws IOException {
        String file = "Advisor-Control-Panel.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Log_Out(ActionEvent event) throws IOException {
        String file = "Log-In-Screen.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Advisor_Cancel_Ticket(ActionEvent event) throws SQLException {
        String ID = Ticket_ID_To_Delete.getText();
        Void_Ticket_Actual(ID);
    }

    @FXML
    void Advisor_Sell_Ticket(ActionEvent event) {
        String Blank_ID = Advisor_Blank_ID.getText();
        String Customer_ID = Advisor_Customer_ID.getText();
        String Currency_Purchased = Advisor_Currency_Purchased.getText();
        String From_Location = Advisor_From_Location.getText();
        String Seller_ID = Advisor_Merchant_ID.getText();
        String Seat_Location = Advisor_Seat_Location.getText();
        String Destination = Advisor_To_Loaction.getText();
        int Amount = 0;
        int Date = 0;

        try{
            Amount = Integer.valueOf(Advisor_Amount.getText());
            Date = Integer.valueOf(Advisor_Date_Purchased.getText());
            Sell_Ticket_Actual(Blank_ID, Currency_Purchased, Customer_ID, Destination, From_Location, Seller_ID, Date, Amount);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @FXML
    void Manager_Create_Account(ActionEvent event) {
        String Name = Manager_Create_Account_Name.getText();
        String Password = Manager_Create_Account_Password.getText();
        String Username = Manager_Create_Account_Username.getText();
        String Agency = Manager_Create_Account_Agency.getText();
        String Role = "ADVISOR";
        int Phone_Number = 0;

        try {
            Phone_Number = Integer.valueOf(Manager_Create_Account_Phone_Number.getText());
            String Phone_Number1 = Manager_Create_Account_Phone_Number.getText();

            Create_Account(Name, Username, Role, Agency, Password, Phone_Number, Phone_Number1); //String Full_Name, String Username, String Role, String Agency, String Password, int Phone_Number1, String Phone_Number2
        }
        catch (Exception e){
            // Display Error
        }
    }

    @FXML
    void Manager_Delete_Account(ActionEvent event) throws SQLException {
        String ID = Manager_Account_ID_To_Delete.getText();
        String Password = Manager_Account_To_Delete_Password.getText();

        Create_Account(ID, Password);
    }

    @FXML
    void Manager_Go_To_Alter_Account(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Accounts-Alter.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Go_To_Create_Account(ActionEvent event) throws IOException {
        String file = "Office-Manager-Create-Accounts.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Go_To_Delete_Account(ActionEvent event) throws IOException {
        String file = "Office-Manager-Delete-Accounts.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Go_To_Change_Username(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Accounts-Alter-Change-Username.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Alter_Account_Change_Password(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Accounts-Alter-Change-Password.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Alter_Account_Change_Role(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Accounts-Alter-Change-Role.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Change_Password(ActionEvent event) throws SQLException {
        String ID = Manager_Account_ID_To_Change_Password.getText();
        String New_Password1 = Manager_New_Password1_To_Change_Password.getText();
        String New_Password2 = Manager_New_Password2_To_Change_Password.getText();
        String Old_Password = Manager_Old_Password_To_Change_Password.getText();

        Change_Password_Actual(New_Password1, New_Password2, Old_Password, ID); //String ID, String Password, String Username, String New_Role
    }

    @FXML
    void Manager_Change_Role(ActionEvent event) throws SQLException {
        String ID = Manager_Account_ID_To_Change_Role.getText();
        String New_Role = Manager_New_Role_To_Change_Role.getText();
        String Password = Manager_Password_To_Change_Role.getText();
        String Username = Manager_Username_To_Change_Role.getText();

        Change_Role_Actual(ID, Password, Username, New_Role);
    }

    @FXML
    void Manager_Change_Username(ActionEvent event) throws SQLException {
        String ID = Manager_Account_ID_To_Change_Username.getText();
        String New_Username = Manager_New_Username_To_Change_Username.getText();
        String Password = Manager_Password_To_Change_Username.getText();

        Change_Username_Actual(ID, New_Username, Password);
    }

    @FXML
    void Manager_Go_To_Sell_Ticket(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Blanks-Sell-Tickets.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Go_To_Void_Ticket(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Tickets-Void-Ticket.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Allocate_Blank(ActionEvent event) {
        String Blank_ID = Manager_Sent_Blank_ID.getText();
        String Recipiant_ID = Manager_Recipiant_ID.getText();

        Allocate_Blank_Actual(Blank_ID, Recipiant_ID);
    }

    @FXML
    void Manager_Sell_Ticket(ActionEvent event) {
        String Blank_ID = Manager_Sell_Ticket_Blank_ID.getText();
        String Currency_Purchased_In = Manager_Sell_Ticket_Currency_Purchased_In.getText();
        String Customer_ID = Manager_Sell_Ticket_Customer_ID.getText();
        String To_Location = Manager_Sell_Ticket_To_Location.getText();
        String From_Location = Manager_Sell_Ticket_From_Location.getText();
        String Seller_ID = Manager_Sell_Ticket_Merchant_ID.getText();
        String Seat_Code = Manager_Sell_Ticket_Seat_Location.getText();

        try{
            int Amount = Integer.valueOf(Manager_Sell_Ticket_Price.getText());
            int Date = Integer.valueOf(Manager_Sell_Ticket_Date.getText());
            Sell_Ticket_Actual(Blank_ID, Currency_Purchased_In, Customer_ID, To_Location, From_Location, Seller_ID, Date, Amount);
        }
        catch (Exception e){
            //display message
        }
    }

    @FXML
    void Manager_Void_Ticket(ActionEvent event) throws SQLException {
        String Ticket_ID = Manager_Ticket_ID_To_Void.getText();
        Void_Ticket_Actual(Ticket_ID);
    }

    @FXML
    void Manager_Create_Bi_Weekly_Report(ActionEvent event) {
        LocalDate Date = LocalDate.now();
        int Day = Date.getDayOfMonth();
        int Month = Date.getMonthValue();
        int Year = Date.getYear();
        boolean First_Half_Month = false;
        boolean Second_Half_Month = false;

        if (Day <= 15){
            First_Half_Month = true;
        }
        else if (Day > 15){
            Second_Half_Month = true;
        }

        try{
            File Report = new File("Bi-Weekly Report "+ Day +" " + Month + " " + Year + ".txt");
            if(Report.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File exists already");
            }

            FileWriter Writer = new FileWriter(Report);

            String Report_Writer = "ID          Currency Code    Amount     Customer ID       To         From         Merchant ID \n";

            String Query = "SELECT * FROM Tickets where Date_Purchased = ??"+Month+Year+";";
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);
            rs.next();

            while(rs.next()){
                if((rs.getInt("Date_Purchased") > 15 && Second_Half_Month) || (rs.getInt("Date_Purchased") <=15 && First_Half_Month)){
                    Report_Writer = Report_Writer + rs.getString("Ticket_ID") +" | "+ rs.getString("Currency_Purchased")+" | "+ rs.getString("Amount") +" | "+ rs.getString("Date_Purchased") +" | "+ rs.getString("Customer_Purchased_ID") +" | "+ rs.getString("To_Location") + " | "+ rs.getString("From_Location") +" | "+ rs.getString("Seller_ID") + "\n";
                }
                rs.next();
            }
            Writer.write(Report_Writer);
        }
        catch (Exception e){

        }
    }

    @FXML
    void Manager_Generate_Monthly_Report(ActionEvent event) throws SQLException {
        LocalDate Date = LocalDate.now();
        int Day = Date.getDayOfMonth();
        int Month = Date.getMonthValue();
        int Year = Date.getYear();

        try {
            File Report = new File("Monthly Report "+ Day +" " + Month + " " + Year + ".txt");
            if(Report.createNewFile()){
                System.out.println("File created");
            }
            else{
                System.out.println("File exists already");
            }
            FileWriter Writer = new FileWriter(Report);

            String Report_Writer = "ID          Currency Code    Amount     Customer ID       To         From         Merchant ID \n";

            String Query = "SELECT * FROM Tickets where Date_Purchased = ??"+Month+Year+";";
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);
            rs.next();

            while(rs.next()){
                Report_Writer = Report_Writer + rs.getString("Ticket_ID") +" | "+ rs.getString("Currency_Purchased")+" | "+ rs.getString("Amount") +" | "+ rs.getString("Date_Purchased") +" | "+ rs.getString("Customer_Purchased_ID") +" | "+ rs.getString("To_Location") + " | "+ rs.getString("From_Location") +" | "+ rs.getString("Seller_ID") + "\n";
                rs.next();
            }
            Writer.write(Report_Writer);
        }
        catch (Exception e){
            System.out.println("An Error Occurred");
            System.out.println(e);
        }
    }

    @FXML
    void Manager_Go_To_Generate_Custom_Report(ActionEvent event) throws IOException {
        String file = "Office-Manager-Generate-Report-Custom-Report.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Custom_Report_Generate_Custom_Report(ActionEvent event) {
        String Merchant_ID = Manager_Custom_Report_Merchant_ID.getText();
        String Start_Date = Manager_Custom_Report_Report_Start_Date.getText();
        String End_Date = Manager_Custom_Report_Report_End_Date.getText();

        Create_Custom_Report(Merchant_ID, Start_Date, End_Date);
    }

    void Create_Custom_Report(String Merchant_ID, String Start_Date, String End_Date){
        LocalDate Date = LocalDate.now();
        int Day = Date.getDayOfMonth();
        int Month = Date.getMonthValue();
        int Year = Date.getYear();

        String[] Data = {Merchant_ID, Start_Date, End_Date};

        if (Check_SQL_Injection(Data)){
            try{
                File Report = new File("Monthly Report "+ Day +" " + Month + " " + Year + ".txt");
                if(Report.createNewFile()){
                    System.out.println("File created");
                }
                else{
                    System.out.println("File exists already");
                }
                FileWriter Writer = new FileWriter(Report);

                String Report_Writer = "ID          Currency Code    Amount     Customer ID       To         From         Merchant ID \n";

                String Query = "SELECT * FROM Tickets where Date_Purchased > "+Start_Date+" AND Date_Purchased < "+End_Date+" AND Seller_ID = \""+Merchant_ID+"\";";
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(Query);
                rs.next();

                while(rs.next()){
                    Report_Writer = Report_Writer + rs.getString("Ticket_ID") +" | "+ rs.getString("Currency_Purchased")+" | "+ rs.getString("Amount") +" | "+ rs.getString("Date_Purchased") +" | "+ rs.getString("Customer_Purchased_ID") +" | "+ rs.getString("To_Location") + " | "+ rs.getString("From_Location") +" | "+ rs.getString("Seller_ID") + "\n";
                    rs.next();
                }
                Writer.write(Report_Writer);
            }
            catch (Exception e){

            }
        }
        else{
            //display message
        }
    }

    @FXML
    void Admin_Go_To_Generate_Custom_Report(ActionEvent event) throws IOException {
        String file = "System-Admin-Generate-Report-Custom-Report.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Admin_Generate_Report(ActionEvent event) {
        String ID = Admin_Generate_Report_Merchant_ID.getText();
        String Start_Date = Admin_Generate_Report_Start_Date.getText();
        String End_Date = Admin_Generate_Report_End_Date.getText();

        Create_Custom_Report(ID, Start_Date, End_Date);
    }

    @FXML
    void Advisor_Self_Report(ActionEvent event) {
        String ID = Advisor_Advisor_ID.getText();

        LocalDate Date = LocalDate.now();
        int Day = Date.getDayOfMonth();
        int Month = Date.getMonthValue();
        int Year = Date.getYear();

        if (Check_SQL_Injection(ID)){
            try{
                File Report = new File("Custom Report "+ Day +" " + Month + " " + Year + ".txt");
                if(Report.createNewFile()){
                    System.out.println("File created");
                }
                else{
                    System.out.println("File exists already");
                }
                FileWriter Writer = new FileWriter(Report);

                String Report_Writer = "ID          Currency Code    Amount     Customer ID       To         From         Merchant ID \n";

                String Query = "SELECT * FROM Tickets where Seller_ID = \""+ID+"\";";
                Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
                Statement s = con.createStatement();
                ResultSet rs = s.executeQuery(Query);
                rs.next();

                while(rs.next()){
                    Report_Writer = Report_Writer + rs.getString("Ticket_ID") +" | "+ rs.getString("Currency_Purchased")+" | "+ rs.getString("Amount") +" | "+ rs.getString("Date_Purchased") +" | "+ rs.getString("Customer_Purchased_ID") +" | "+ rs.getString("To_Location") + " | "+ rs.getString("From_Location") +" | "+ rs.getString("Seller_ID") + "\n";
                    rs.next();
                }
                Writer.write(Report_Writer);
            }
            catch (Exception e){

            }
        }
    }

    String Get_Account_Data() throws SQLException {
        String Query = "SELECT * FROM account;";
        Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(Query);

        String Data = "";

        while(rs.next()){
            Data = Data + rs.getString("ID") + " | " + rs.getString("Username") + " | "+ rs.getString("Password") + " | " +  rs.getString("Role")+ " | " + rs.getString("Full_Name") + " | " + rs.getString("Blanks_To_Give") + "\n"; // the data from the table
        }

        return Data;
    }

    String Get_Blank_Data() throws SQLException {
        String Query = "SELECT * FROM Blanks";
        Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(Query);

        String Data = "";

        while(rs.next()){
            Data = Data + rs.getString("Blank_ID") +" | "+ rs.getString("Valid"); // the data from the table
        }

        return Data;
    }

    String Get_Ticket_Data() throws SQLException {

        try {
            String Query = "SELECT * FROM Tickets;";
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(Query);

            String Data = "";

            while(rs.next()){
                Data = Data + rs.getString("Ticket_ID") +" | "+ rs.getString("Currency_Purchesed") +" | " + rs.getString("Amount") +" | " + rs.getString("Date_Purchased") +" | " +rs.getString("Customer_Purchased_ID") +" | " +rs.getString("To_Location") +" | " +rs.getString("From_Location") +" | " +rs.getString("Seller_ID") +" | " +rs.getString("Seat_Location") +" | " +rs.getString("Blank") +" | " +rs.getString("Valid")+ "\n"; // the data from the table
            }
            return Data;
        }
        catch (Exception e){
            System.out.println("Something went wrong");
            return "";
        }
    }

    String Get_Customer_Data() throws SQLException {
        String Query = "SELECT * FROM Customer;";
        Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29","in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery(Query);


        String Data = "";

        while(rs.next()){
            Data = Data + rs.getString("ID") +" | "+ rs.getString("Name")+ rs.getString("Email") +" | "+ rs.getString("Discout") +" | "+ rs.getString("Flex_Or_Fixed" )+ "\n"; // data from the table
        }

        return Data;
    }

    @FXML
    void Manager_Get_Account_Data(ActionEvent event) throws SQLException {
        Manager_Data_Output.setText(Get_Account_Data());
        Manager_Data_Output.setVisible(true);
    }

    @FXML
    void Manager_Get_Blank_Data(ActionEvent event) throws SQLException {
        Manager_Data_Output.setText(Get_Blank_Data());
        Manager_Data_Output.setVisible(true);
    }

    @FXML
    void Manager_Get_Customer_Data(ActionEvent event) throws SQLException {
        Manager_Data_Output.setText(Get_Customer_Data());
        Manager_Data_Output.setVisible(true);
    }

    @FXML
    void Manager_Get_Ticket_Data(ActionEvent event) throws SQLException {
        Manager_Data_Output.setText(Get_Ticket_Data());
        Manager_Data_Output.setVisible(true);
    }

    // Admin_Data_Output

    @FXML
    void Admin_Get_Account_Data(ActionEvent event) throws SQLException {
        Admin_Data_Output.setText(Get_Account_Data());
        Admin_Data_Output.setVisible(true);
    }

    @FXML
    void Admin_Get_Blank_Data(ActionEvent event) throws SQLException {
        Admin_Data_Output.setText(Get_Blank_Data());
        Admin_Data_Output.setVisible(true);
    }

    @FXML
    void Admin_Get_Customer_Data(ActionEvent event) throws SQLException {
        Admin_Data_Output.setText(Get_Customer_Data());
        Admin_Data_Output.setVisible(true);
    }

    @FXML
    void Admin_Get_Ticket_Data(ActionEvent event) throws SQLException {
        Admin_Data_Output.setText(Get_Ticket_Data());
        Admin_Data_Output.setVisible(true);
    }

    @FXML
    void Admin_Go_To_Backup_System(ActionEvent event) throws IOException {
        String file = "System-Admin-Backup-System.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Admin_Go_To_Manage_Reports(ActionEvent event) throws IOException {
        String file = "System-Admin-Generate-Report.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Admin_Go_To_Manage_Tickets(ActionEvent event) throws IOException {
        String file = "System-Admin-Manage-Tickets-Void-Ticket.fxml";
        Change_Scene(event, file);
    }

    @FXML
    void Manager_Go_To_Manage_Accounts(ActionEvent event) throws IOException {
        String file = "Office-Manager-Manage-Accounts.fxml";
        Change_Scene(event, file);
    }
}
