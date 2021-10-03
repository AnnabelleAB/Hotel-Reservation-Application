package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    public String firstName;
    public String lastName;
    public String email;

    //Constructor
    public Customer (String firstName,String lastName,String email){
    this.firstName=firstName;
    this.lastName=lastName;
    this.email=email;
    }
    //Getter methods
    public String getFirstName(){
    return firstName;
    }
    public String getLastName(){
    return lastName;
    }
    public String getEmail(){
    return email;
    }
    //Setter
    public void setFirstName(){
    this.firstName=firstName;
    }
    public void setLastName(){
    this.lastName=lastName;
    }
    public void setEmail (){
    this.email=email;
    }



    @Override
    public String toString(){
        return "Customer Name: "+firstName+" "+lastName + "Email: "+ email;
    }
    String emailRegex = "^(.+)@(.+).(.+)$";
    Pattern pattern = Pattern.compile(emailRegex);
    public void Customer( String firstName,  String lastName, String email){
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, please input valid email");
        }
    }


    public void add(Customer customer) {
    }
}
