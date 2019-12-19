package com.example.listviews;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listviews.Adapters.ContactoAdaptador;
import com.example.listviews.Modelos.Contacto;
import com.example.listviews.helpers.QueueUtils;

public class MainActivity extends AppCompatActivity {
    QueueUtils.QueueObject queue = null;

    ListView contactosList;
    ContactoAdaptador contactoAdaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactosList = findViewById(R.id.contactosList);
        contactosList.setAdapter(contactoAdaptador);
        queue = QueueUtils.getInstance(this.getApplicationContext());

        contactoAdaptador = new ContactoAdaptador(this, Contacto.getCollection(), queue.getImageLoader() );

    }
}