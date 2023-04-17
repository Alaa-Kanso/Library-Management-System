package com.example.project;


import java.sql.SQLException;

public class proxyUser {
    private User realUser;
    private String type ;
    private Database database;

    {
        try {
            database = new Database();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public proxyUser(String email , String password ,String type){
        this.type=type ;
        try {
            this.login(email ,password,this.type);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void login(String email , String password , String type) throws SQLException{
        if(type == "borrower"){
            if(database.borrowerLogin(email,password)){
                this.realUser = new User(email,password);
            }
            return ;
        }
        if(type == "librarian"){
            if(database.librarianLogin(email,password)){
                this.realUser = new User(email,password);
            }
            return ;
        }
        if(type =="admin"){
            if(database.librarianLogin(email,password)){
                this.realUser = new User(email,password);
            }
            return ;
        }
        else{
            this.realUser = null ;
        }
    }

    public User getRealUser(){
        return this.realUser;
    }
    public void setType(String type){this.type = type;}
}
