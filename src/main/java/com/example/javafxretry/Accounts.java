package com.example.javafxretry;

//import java.sql.DriverManager;
import java.util.Random;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;

public class Accounts {
    private String Username;
    private String Password;
    private String Role;
    private String Account_ID;
    private String Name;
    private String Address;
    private int Phone_Number;

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Constructor -----------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    Accounts(String Username_Entered, String Password_Entered, String Role_Entered, String Name_Entered, String Address_Entered, int Phone_Number_Entered){

        Set_Username(Username_Entered);
        Set_Password(Password_Entered);
        Set_Role(Role_Entered);
        Set_Account_ID();
        Set_Name(Name_Entered);
        Set_Address(Address_Entered);
        Set_Phone_Number(Phone_Number_Entered);
        Store_Account();

    }


    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Setters ---------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void Set_Username(String Username_Entered){ //check username for minimum characters
        if (Username_Entered.length() < 8){
            Username = Username_Entered;
        }
        else{
            String Message = "Username needs to be at least 8 characters";
        }
    }

    public void Set_Password(String Password_Entered){
        if (Password_Entered.length() < 8){
            boolean Capital_Letter = false; // these will turn to true if password is valid
            boolean Symbol = false;
            boolean Numbers = false;
            char[] Cap_Letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            char[] Specials = {'!','£','$','&','^','£','*','(',')','@',';',':','/','"','>','<',',','.','#','~','|'};
            char[] Number = {'0','1','2','3','4','5','6','7','8','9'};
            for (int i = 0; i < Password_Entered.length(); i++){

                char c = Password_Entered.charAt(i);

                // Capital Letters
                if ( Capital_Letter == false){
                    for (int j = 0; j < Cap_Letters.length; j++){
                        char d = Cap_Letters[j];
                        if (c == d){
                            Capital_Letter = true;
                            break;
                        }
                    }
                }

                // Special Characters
                if (Symbol == false){
                    for (int j = 0; j < Specials.length; j++){
                        char d = Specials[j];
                        if (c == d){
                            Symbol = true;
                            break;
                        }
                    }
                }

                // Numbers
                if (Numbers == false){
                    for (int j = 0; j < Number.length; j++){
                        char d = Number[j];
                        if (c == d){
                            Numbers = true;
                            break;
                        }
                    }
                }
            }

            if (Capital_Letter && Symbol && Numbers){
                Password = Password_Entered;
            }
            else{
                String Message = "Password must have a Capital letter and a Special character";
            }
        }
        else{
            String Message = "Password needs to be at least 8 characters long";
        }
    }

    public void Set_Role(String Role_Entered){
        Role_Entered = Role_Entered.toLowerCase();
        if (Role_Entered != "advisor" || Role_Entered != "office manager" || Role_Entered != "system admin"){
            String Message = "Invalid role";
            //Submit message
        }
        else {
            Role = Role_Entered;
        }
    }

    private void Set_Account_ID(){
        char[] Characters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j',
                'k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

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
            Letter = temp2.nextInt(52);
        }

        Account_ID = ID; // random ID

    }

    public void Set_Name(String Name_Entered){
        Name = Name_Entered;
    }

    public void Set_Address(String Address_Entered){
        Address = Address_Entered;
    }

    public void Set_Phone_Number (int Phone_Number_Entered){
        Phone_Number = Phone_Number_Entered;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- Getters ---------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public String Get_Username(){
        return Username;
    }

    public String Get_Password(){
        return Password;
    }

    public String Get_Role(){
        return Role;
    }

    public String Get_Name(){
        return Name;
    }

    public String Get_Address(){
        return Address;
    }

    public String Get_Account_ID(){
        return Account_ID;
    }

    public int Get_Phone_Number(){
        return Phone_Number;
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-- The rest --------------------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------------------------------

    private void Store_Account(){
        String Query = "INSERT into Account_Table () VALUES (" + Get_Account_ID() + Get_Username() + Get_Password() + Get_Role() + Get_Address() + Get_Name() + Get_Phone_Number() +")"; // This is the query that will run in SQL
        try {
            /*Connection con = DriverManager.getConnection(/*here go the details for SQL server);
            Statement s = (Statement) con.createStatement();
            ResultSet rs = (ResultSet) s.executeQuery(Query);
            con.close();*/
        }
        catch (Exception e){

        }
    }
}

