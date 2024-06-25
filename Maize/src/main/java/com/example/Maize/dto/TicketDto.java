package com.example.Maize.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {

    private Long id;

    private String OwnerName;

    private String OwnerSurname;

    private String Email;

    private int Count_Ticket;

    private int Amount;

    private String payment_method;

    private boolean Payment_success;
}
