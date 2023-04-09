package com.example.javafxretry;

public class Office_Manager_Account extends Accounts {

    private String Agency;
    private String[] Blank_ID_List;

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Constructor -----------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    Office_Manager_Account(String Username_Entered, String Password_Entered, String Role_Entered, String Name_Entered, String Address_Entered, int Phone_Number_Entered, String Agency_Entered) {
        super(Username_Entered, Password_Entered, Role_Entered, Name_Entered, Address_Entered, Phone_Number_Entered);


        //Add SQL injection validation

        String temp = Agency_Entered.toUpperCase();
        if (temp.contains("INSERT") || temp.contains("SELECT")){
            String Message = "SQL injection detected. Fuck off.";
        }
        else{
            Set_Agency(Agency_Entered);
        }
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Setters ---------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void Set_Agency(String Agency_Entered){
        Agency = Agency_Entered;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Getters ---------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public String Get_Agency(){
        return Agency;
    }

    public String[] Get_Blank_ID_List(){
        return Blank_ID_List;
    }


    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- The rest --------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Void_Ticket, Add_Advisor, Edit_Advisor, Remove_Advisor, Set_Valued_Fixed, Update_Value_Fixed, Set_Valued_Flex, Update_Valued_Flex, Create_Account, Create_Report,
    // Reallocate_Blank, Allocate_Blank, Set_Commission, Add_Commission_Rate, Update_Commission, Record_Commission, Remove_Commission_Rate, Set_Regular, Set_Customer_Value
    // Alter_Record, Refund, Return_Blank

}


