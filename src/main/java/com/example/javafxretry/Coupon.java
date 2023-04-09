package com.example.javafxretry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class Coupon {

    private int Discount;
    private boolean Used;
    private boolean Flex_Or_Fixed;
    private String Coupon_ID;

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Constructor -----------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    Coupon(int Discount_Entered, boolean Flex_Or_Fixed_Entered){
        Used = false;
        Set_Discount(Discount_Entered);
        Set_Flex_Or_Fixed(Flex_Or_Fixed_Entered);
        Set_Coupon_ID();
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Setters ---------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void Set_Discount(int Discount_Entered){ // Validate discount
        if (Discount > 100 || Discount < 0){
            String Message = "Discount Invalid; discount can be between 100 and 0";
        }
        else{
            Discount = Discount_Entered;
        }
    }

    public void Set_Flex_Or_Fixed(boolean Flex_Or_Fixed_Entered){
        Flex_Or_Fixed = Flex_Or_Fixed_Entered;
    }

    public void Set_Coupon_ID(){
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
                Coupon_ID = ID ; //randomly generate Coupon_ID
                ID_Set = false;
            }
        }

    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Getters ---------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public int Get_Discount(){
        return Discount;
    }

    public boolean Get_Used(){
        return Used;
    }

    public boolean Get_Flex_Or_Fixed(){
        return Flex_Or_Fixed;
    }

    public String Get_Coupon_ID(){
        return Coupon_ID;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- The rest --------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void Has_Been_Used(){
        Used = true;
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


