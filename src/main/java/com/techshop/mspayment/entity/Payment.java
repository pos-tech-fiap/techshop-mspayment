package com.techshop.mspayment.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private PaymentStatus status;

    private PaymentMethod method;

    private UUID userId;

    private Double value;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod paymentMethod) {
        this.method = paymentMethod;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = UUID.fromString(userId);
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Payment() {
    }

}
