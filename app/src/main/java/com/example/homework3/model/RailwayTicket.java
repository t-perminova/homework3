package com.example.homework3.model;

public class RailwayTicket {
    private String departurePoint;  // место отправления
    private String arrivalPoint; // место прибытия
    private String departureDate; // дата отправления
    private String arrivalDate; // дата прибытия
    private String travelTime; // время в пути
    private int distance; // расстояние в пути
    private float ticketPrice; // стоимость взрослого билета
    private int numberOfTickets; // количество билетов

    // создание пустого конструктора
    public RailwayTicket() {
    }

    // создание конструктора исходных данных взрослого билета (стоимость билета, количество билетов)
    public RailwayTicket(float ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice; // стоимость взрослого билета
        this.numberOfTickets = numberOfTickets; // количество билетов
    }

    // метод подсчёта стоимости взрослых билетов
    public float ticketPriceAll() {
        return ticketPrice * numberOfTickets; // умножаем стоимость одного билета на количество билетов
    }

    // создание геттеров и сеттеров

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
