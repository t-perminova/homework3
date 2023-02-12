package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.homework3.model.RailwayTicket;
import com.example.homework3.model.RailwayTicketChild;
import com.example.homework3.model.RailwayTicketPensioner;

public class MainActivity extends AppCompatActivity {

    // создание сущности взрослых билетов (стоимость билета, количество билетов)
    RailwayTicket railwayTicket = new RailwayTicket(70,9);
    // создание сущности дестких билетов (стоимость билета, количество билетов, скидка)
    RailwayTicketChild railwayTicketChild = new RailwayTicketChild(70, 11,50);
    //создание сущности пенсионерских билетов (стоимость билета, количество билетов, скидка)
    RailwayTicketPensioner railwayTicketPensioner = new RailwayTicketPensioner(70,5,30);

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

        // вывод информации на экран приложения
        // первое поле с информацией об общей стоимости взрослых билетов
        railwayTicketOut.setText(Float.toString(railwayTicket.ticketPriceAll()) + " монет");
        // второе поле с информацией об общей стоимости детских билетов
        railwayTicketChildOut.setText(Float.toString(railwayTicketChild.ticketPriceAll()) + " монет");
        // третье поле с информацией об общей стоимости пенсионерских билетов
        railwayTicketPensionerOut.setText(Float.toString(railwayTicketPensioner.ticketPriceAll()) + " монет");
        // четвертое поле с информацией об общей стоимости всех билетов вместе
        railwayTicketTotalOut.setText(Float.toString(railwayTicket.ticketPriceAll() + railwayTicketChild.ticketPriceAll() + railwayTicketPensioner.ticketPriceAll()) + " монет");
    }

}