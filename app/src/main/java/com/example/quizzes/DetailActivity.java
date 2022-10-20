package com.example.quizzes;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.TextView;

import com.example.quizzes.databinding.ActivityDetailBinding;
import com.example.quizzes.model.Pregunta;

public class DetailActivity extends AppCompatActivity {
    private static ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        Bundle extras = getIntent().getExtras();

        Pregunta pregunta = extras.getParcelable("pregunta");

    }

    public static void res1(){
        binding.Solucion.setText("Respuesta Correcta", TextView.BufferType.EDITABLE);
    }
    public static void res2(){
        binding.Solucion.setText("Respuesta Incorrecta", TextView.BufferType.EDITABLE);
    }

}