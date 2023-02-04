package com.example.homework3.model;

public class RailwayTicketPensioner extends RailwayTicket {
    // задание полей
    private float ticketDiscount; // скидка на пенсионерский билет

    // создание пустого конструктора
    public RailwayTicketPensioner() {
    }

    // создание конструктора исходных данных пенсионерского билета (стоимость билета, количество билетов, скидка)
    public RailwayTicketPensioner(float ticketPrice, int numberOfTickets, float ticketDiscount ) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    // метод подсчта стоимости пенсионерских билетов
    public float ticketPriceAll() {
        return ((getTicketPrice() - getTicketPrice() * (ticketDiscount/100)) * getNumberOfTickets()); // умножаем количество билетов на стоимость билета со скидкой
    }
}
