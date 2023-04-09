package com.example.javafxretry;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
public class Blank {
    private String[] Coupon_IDs;
    private String Blank_ID;
    private boolean Valid;

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Constructor -----------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    Blank(String[] Coupon_IDs_Entered){

        //Add SQL injection validation
        Set_Coupon_IDs(Coupon_IDs_Entered);
        Set_Blank_ID();
        Valid = true;
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

    void Set_Blank_ID(){
        boolean ID_Set = true;
        char[] Characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j',
                'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};

        while (ID_Set){

            Random temp1 = new Random();
            int Amount_Of_Charcters = temp1.nextInt(10);
            while (Amount_Of_Charcters > 3){
                Amount_Of_Charcters = temp1.nextInt(10);
            }

            String ID = "";
            Random temp2 = new Random();
            int Letter = temp2.nextInt(52);
            for(int k = 0; k < Amount_Of_Charcters; k++){
                ID = ID + Characters[Letter];
            }

            if (!Is_ID_Valid(ID)){
                Blank_ID = ID;
                ID_Set = false;
            }
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



