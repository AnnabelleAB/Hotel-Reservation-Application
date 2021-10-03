package service;

import model.Customer;

import java.util.*;

public class CustomerService {

    //Singleton

    ArrayList<Customer> customers = new ArrayList<>();
   /* public static CustomerService customerService = null;

    private CustomerService(){};

    public static CustomerService getInstance(){
        if (null == customerService) {
            customerService = new customerService();
        }
        return customerService;
        } */
        //addCustomer
    public void addCustomer(String email, String firstName, String lastName){
        Customer customer = new Customer(firstName,lastName,email);
        customer.add(customer);}

        //getCustomer why 2 string?
      public Customer getCustomer (String customerEmail) {
          for (Customer customer : customers) {
              if (customer.getEmail().equals(customerEmail)) {
                  return customer;
              }
          }
          return null;}
          //getAllCustomers
          public List<Customer> getAllCustomers () {
              return customers;
          }
      }






