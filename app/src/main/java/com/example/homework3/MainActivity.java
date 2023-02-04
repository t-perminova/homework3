package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework3.model.RailwayTicket;
import com.example.homework3.model.RailwayTicketChild;
import com.example.homework3.model.RailwayTicketPensioner;

public class MainActivity extends AppCompatActivity {

    // создание сущности взрослых билетов (стоимость билета, количество билетов)
    RailwayTicket railwayTicket = new RailwayTicket( ticketPrice = 70, numberOfTickets = 9);
    // создание сущности дестких билетов (стоимость билета, количество билетов, скидка)
    RailwayTicketChild railwayTicketChild = new RailwayTicketChild( ticketPrice = 70, numberOfTickets = 11, ticketDiscount = 50);
    //создание сущности пенсионерских билетов (стоимость билета, количество билетов, скидка)
    RailwayTicketPensioner railwayTicketPensioner = new RailwayTicketPensioner( ticketPrice = 70, numberOfTickets = 5, ticketDiscount = 30);

    // создание полей для вывода значений на экран
    private TextView railwayTicketOut; // поле вывода общей стоимости взрослых билетов
    private TextView railwayTicketChildOut; // поле вывода общей стоимости детских билетов
    private TextView railwayTicketPensionerOut; // поле вывода стоимости пенсионерских билетов
    private TextView railwayTicketTotalOut; // поле вывода общей стоимости всех билетов

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        railwayTicketOut = findViewById(R.id.railwayTicketOut); // вывод информации о стоимости всех взрослых билетов
        railwayTicketChildOut = findViewById(R.id.railwayTicketChildOut); // вывод информации о стоимости всех детских билетов
        railwayTicketPensionerOut = findViewById(R.id.railwayTicketPensionerOut); // вывод информации о стоимости всех пенсионерских билетов
        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut); // вывод информации о стоимости всех билетов
    }
}