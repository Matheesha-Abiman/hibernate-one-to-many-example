package com.example;

import config.FactoryConfiguration;
import entity.Customer;
import entity.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Bob");

        Order order1 = new Order();
        order1.setOrderNumber("45674321");
        order1.setCustomer(customer);

        Order order2 = new Order();
        order2.setOrderNumber("45674322");
        order2.setCustomer(customer);

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);

        customer.setOrders(orders);

        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();

        session.close();
    }
}