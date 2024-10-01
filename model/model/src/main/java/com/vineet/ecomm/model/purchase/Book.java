package com.vineet.ecomm.model.purchase;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
   long id;
   String name;
   String publication;
   double price;
}