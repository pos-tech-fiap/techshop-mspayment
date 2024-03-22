package com.techshop.mspayment.DTO;

import com.techshop.mspayment.entity.Payment;
import com.techshop.mspayment.entity.PaymentMethod;
import com.techshop.mspayment.entity.PaymentStatus;

import jakarta.validation.constraints.NotNull;


import java.util.UUID;

public class PaymentDTO {

    private UUID id;

    @NotNull
    private PaymentStatus status;

    @NotNull
    private PaymentMethod method;

    @NotNull
    private UUID userId;

    @NotNull
    private Double value;

    public PaymentDTO(PaymentStatus status, PaymentMethod method, UUID userId, Double value) {
        this.status = status;
        this.method = method;
        this.userId = userId;
        this.value = value;
    }

    public PaymentDTO(Payment payment) {
        this.id = payment.getId();
        this.status = payment.getStatus();
        this.method = payment.getMethod();
        this.userId = payment.getUserId();
        this.value = payment.getValue();
    }

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

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
