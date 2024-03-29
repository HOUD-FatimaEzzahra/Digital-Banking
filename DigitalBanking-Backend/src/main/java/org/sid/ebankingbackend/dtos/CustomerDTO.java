package org.sid.ebankingbackend.dtos;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}
