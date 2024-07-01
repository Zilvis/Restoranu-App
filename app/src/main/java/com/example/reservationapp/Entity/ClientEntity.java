package com.example.reservationapp.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ClientEntity {
    private Long id;
    private String name;
    private String email;
    private String phone;
}
