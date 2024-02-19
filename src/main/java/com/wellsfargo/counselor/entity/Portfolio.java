package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private final Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client", nullable = false)
    private Client client;

    @Column(name = "creation_date", nullable = false)
    private Date creationDate;

    public Portfolio(Long portfolioId, Client client, Date creationDate) {
        this.portfolioId = portfolioId;
        this.client = client;
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
