package com.solvd.laba.block2.bankhierarchy.domain;

public class TransactionStatus {
    private Long id = null;
    private String name;

    public TransactionStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
