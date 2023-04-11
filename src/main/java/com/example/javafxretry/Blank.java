package com.example.javafxretry;

import java.sql.*;
import java.util.Random;
public class Blank {
    private String[] Coupon_IDs;
    private String Blank_ID;
    private boolean Valid;

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Constructor -----------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    Blank(String[] Coupon_IDs_Entered) throws SQLException {

        //Add SQL injection validation
        Set_Coupon_IDs(Coupon_IDs_Entered);
        Set_Blank_ID();
        Valid = true;

        try{
            String Query = "INSERT INTO Blanks (Blank_ID, Valid, Discount1_ID, Discount2_ID, Discount3_ID, Discount4_ID) VALUES (\""+Blank_ID+"\", \"1\", \""+Coupon_IDs_Entered[0]+"\", \""+Coupon_IDs_Entered[1]+"\", \""+Coupon_IDs_Entered[2]+"\", \""+Coupon_IDs_Entered[3]+"\");";
            System.out.println("1");
            Connection con = DriverManager.getConnection("jdbc:mysql://smcse-stuproj00.city.ac.uk:3306/in2018g29", "in2018g29_d", "vtF1zs6O"); // "jdbc:mysql://localhost:3306/in2018g29","in2018g29_d", "vtF1zs6O" "jdbc:mysql://hostname:port/dbname","username", "password"
            System.out.println("2");
            Statement s = con.createStatement();
            System.out.println("3");
            ResultSet rs = s.executeQuery(Query);
            System.out.println("4");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Setters ---------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    void Set_Coupon_IDs(String[] Coupon_IDs_Entered){
        if (Coupon_IDs_Entered.length == 4){
            Coupon_IDs = Coupon_IDs_Entered;
        }
        else{
            String message = "Please enter 4 coupons.";
            // send message to the console
        }
    }

    void Set_Blank_ID() throws SQLException {
        boolean ID_Set = true;
        char[] Characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j',
                'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};

        for (int i = 0; i < 8; i++){
            Random r = new Random();
            int character = r.nextInt(52);
            Blank_ID = Blank_ID + Characters[character];
        }
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Getters ---------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    String[] Get_Coupon_IDs(){
        return Coupon_IDs;
    }

    String Get_Blank_ID(){
        return Blank_ID;
    }

    boolean Get_Valid(){
        return Valid;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- The rest --------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    void Validate(){
        Valid = true;
    }

    void Invalidate(){
        Valid = false;
    }

    boolean Is_ID_Valid(String ID){
        String message = "SELECT * FROM Accounts WHERE ID = " + ID;
        try{
            /*Connection con = DriverManager.getConnection(/*here go the details for SQL server);
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(message);
            try{
                if (rs.getString(0) == ""){
                    return true;
                }
                else{
                    return false;
                }
            }
            catch (Exception e){
                return true;
            }
            con.close();*/
        }
        catch (Exception e){

        }
        return true;
    }
}



