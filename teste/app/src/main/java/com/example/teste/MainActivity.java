package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.teste.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Produto> produtos= new ArrayList<Produto>();
    private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        mainBinding.btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome= mainBinding.txtNome.getText().toString();
                int quantidade= Integer.parseInt(mainBinding.txtQuatidade.getText().toString());
                double preco= Double.parseDouble(mainBinding.txtPreco.getText().toString());

                produtos.add(new Produto(nome, quantidade, preco));


            }
        });

    }
}