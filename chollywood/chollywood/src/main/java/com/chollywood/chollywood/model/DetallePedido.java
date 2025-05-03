package com.chollywood.chollywood.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cantidad;
    private double subtotal;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    @JsonBackReference("pedido-detalles")
    private PedidoConfiteria pedidoConfiteria;

    @ManyToOne
    @JoinColumn(name = "id_confiteria")
    @JsonBackReference("confiteria-detalles")
    private Confiteria confiteria;

    // Constructor
    public DetallePedido() {
    }

    public DetallePedido(Long id, int cantidad, double subtotal, PedidoConfiteria pedidoConfiteria,
            Confiteria confiteria) {
        this.id = id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.pedidoConfiteria = pedidoConfiteria;
        this.confiteria = confiteria;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public PedidoConfiteria getPedidoConfiteria() {
        return pedidoConfiteria;
    }

    public void setPedidoConfiteria(PedidoConfiteria pedidoConfiteria) {
        this.pedidoConfiteria = pedidoConfiteria;
    }

    public Confiteria getConfiteria() {
        return confiteria;
    }

    public void setConfiteria(Confiteria confiteria) {
        this.confiteria = confiteria;
    }

    // toString
    @Override
    public String toString() {
        return "DetallePedido{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                ", pedidoConfiteria=" + pedidoConfiteria +
                ", confiteria=" + confiteria +
                '}';
    }
}