package com.example.samara.calculadora;


import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

import java.math.BigDecimal;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tvResult)
    EditText tvResult;
    private int resut = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btn0)
    public void btn0(View view) {
        String valor = tvResult.getText().toString();
        valor += "0";
        tvResult.setText(valor);
    }

    @OnClick(R.id.bt1)
    public void bt1(View view) {
        String valor = tvResult.getText().toString();
        valor += "1";
        tvResult.setText(valor);
    }

    @OnClick(R.id.btn2)
    public void btn2(View view) {
        String valor = tvResult.getText().toString();
        valor += "2";
        tvResult.setText(valor);
    }

    @OnClick(R.id.btn3)
    public void btn3(View view) {
        String valor = tvResult.getText().toString();
        valor += "3";
        tvResult.setText(valor);

    }

    @OnClick(R.id.btn4)
    public void btn4(View view) {
        String valor = tvResult.getText().toString();
        valor += "4";
        tvResult.setText(valor);

    }

    @OnClick(R.id.btn5)
    public void btn5(View view) {
        String valor = tvResult.getText().toString();
        valor += "5";
        tvResult.setText(valor);

    }

    @OnClick(R.id.btn6)
    public void btn6(View view) {
        String valor = tvResult.getText().toString();
        valor += "6";
        tvResult.setText(valor);

    }

    @OnClick(R.id.btn7)
    public void btn7(View view) {
        String valor = tvResult.getText().toString();
        valor += "7";
        tvResult.setText(valor);

    }

    @OnClick(R.id.btn8)
    public void btn8(View view) {
        String valor = tvResult.getText().toString();
        valor += "8";
        tvResult.setText(valor);

    }

    @OnClick(R.id.btn9)
    public void btn9(View view) {
        String valor = tvResult.getText().toString();
        valor += "9";
        tvResult.setText(valor);

    }

    @OnClick(R.id.btn_soma)
    public void brSoma(View view) {

            int soma = Integer.parseInt(tvResult.getText().toString());
            resut += soma;
            tvResult.setText(String.valueOf(resut));

        }

    @OnClick(R.id.btn_subtracao)
    public void btSub(View view) {
        int subtrai = Integer.parseInt(tvResult.getText().toString());
        resut += subtrai;
        tvResult.setText(String.valueOf(resut));

    }

    @OnClick(R.id.btn_multiplicacao)
    public void btvezez(View view) {
        int multiplica = Integer.parseInt(tvResult.getText().toString());
        resut *= multiplica;
        tvResult.setText(String.valueOf(resut));
    }

    @OnClick(R.id.btn_divisao)
    public void btDiv(View view) {
        int div = Integer.parseInt(tvResult.getText().toString());
        if (resut != 0 || div != 0) {
            resut /= div;
            tvResult.setText(String.valueOf(resut));
        }
    }

    @OnClick(R.id.btn_resultado)
    public void btIgual(View view) {
        tvResult.setText(String.valueOf(resut));
    }

    @OnClick(R.id.btn_apagar_caracter)
    public void btApaga(View view) {
        resut=0;
        tvResult.setText(String.valueOf(resut));

    }

    @OnClick(R.id.btn_limpar)
    public void btlimpar(View view) {
        resut=0;
        tvResult.setText(String.valueOf(resut));
    }

}
