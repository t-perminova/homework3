package com.example.homework3.model;

public class RailwayTicketChild extends RailwayTicket {
    // задание полей
    private float ticketDiscount; // скидка на детский билет

    // создание пустого конструктора
    public RailwayTicketChild() {
    }

    // создание конструктора исходных данных детского билета (стоимость билета, количество билетов, скидка)
    public RailwayTicketChild(float ticketPrice, int numberOfTickets, float ticketDiscount ) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    // метод подсчта стоимости детских билетов
    public float ticketPriceAll() {
        return ((getTicketPrice() - getTicketPrice() * (ticketDiscount/100)) * getNumberOfTickets()); // умножаем стоимость билета на количество билетов и на скидку и делим все на 100
    }
}
