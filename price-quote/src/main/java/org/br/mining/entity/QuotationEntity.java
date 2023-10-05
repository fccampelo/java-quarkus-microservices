package org.br.mining.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "quotation")
@Data
@NoArgsConstructor
public class QuotationEntity {
    @Id
    @GeneratedValue
    private Long id;

    private Data date;

    @Column(name = "currency_price")
    private BigDecimal currencyPrice;

    @Column(name = "pct_change")
    private String pctChange;

    private String pair;
}
