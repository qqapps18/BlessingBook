package com.example.samipc.bookofblessings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.rabia.nestedrecyclerview.R;
import com.github.barteksc.pdfviewer.PDFView;

public class Blessing_Activity extends AppCompatActivity {

    public static final String Pag = "Pag";
    public static final String Blessing_Book = "Blessing_Book";

    PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blessing_);

        Intent intent = getIntent();

        int pag = intent.getIntExtra(Pag, -1);
        String libro = intent.getStringExtra(Blessing_Book);


        PDFView pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromAsset(libro).swipeHorizontal(true).defaultPage(pag).spacing(0).load();

    }
}
