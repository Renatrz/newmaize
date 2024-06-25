package com.example.Maize.Entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.lang.model.element.Name;

@Data
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Owner_Name")
    private String OwnerName;
    @Column(name = "Owner_Surname")
    private String OwnerSurname;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Count_Ticket")
    private int Count_Ticket;
    @Column(name = "Total_Amount")
    private int Amount;
    @Column(name = "Payment_Method")
    private String payment_method;
    @Column(name = "Payment_Success")
    private boolean Payment_success;

    public Ticket(Long id, String ownerName, String ownerSurname, String email, int countTicket, int amount, String paymentMethod, boolean paymentSuccess) {
        this.id = id;
        this.OwnerName = ownerName;
        this.OwnerSurname = ownerSurname;
        this.Email = email;
        this.Count_Ticket = countTicket;
        this.Amount = amount;
        this.payment_method = paymentMethod;
        this.Payment_success = paymentSuccess;
    }
}
