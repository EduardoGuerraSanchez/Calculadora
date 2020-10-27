package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class MainActivity extends AppCompatActivity {

    Button btnCero;
    Button btnUno;
    Button btnDos;
    Button btnTres;
    Button btnCuatro;
    Button btnCinco;
    Button btnSeis;
    Button btnSiete;
    Button btnOcho;
    Button btnNueve;
    Button btnSumar;
    Button btnRestar;
    Button btnMultiplicar;
    Button btnDivision;
    Button btnLimpiar;
    Button btnIgual;
    Button btnModulo;
    Button btnComa;

    TextView txtResultado;
    TextView txtOperacion;

    String signo;

    Double res;
    Double numero1;
    Double numero2;
    Double numeroAux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();

        btnCero = findViewById(R.id.botonCero);
        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtResultado.getText().toString() + "0");
            }
        });

        btnUno = findViewById(R.id.botonUno);
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtResultado.getText().toString() + "1");
            }
        });

        btnDos = findViewById(R.id.botonDos);
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtResultado.getText().toString() + "2");
            }
        });

        btnTres = findViewById(R.id.botonTres);
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtResultado.getText().toString() + "3");
            }
        });

        btnCuatro = findViewById(R.id.botonCuatro);
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtResultado.getText().toString() + "4");
            }
        });

        btnCinco = findViewById(R.id.botonCinco);
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtResultado.getText().toString() + "5");
            }
        });

        btnSeis = findViewById(R.id.botonSeis);
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtResultado.getText().toString() + "6");
            }
        });

        btnSiete = findViewById(R.id.botonSiete);
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtResultado.getText().toString() + "7");
            }
        });

        btnOcho = findViewById(R.id.botonOcho);
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtResultado.getText().toString() + "8");
            }
        });

        btnNueve = findViewById(R.id.botonNueve);
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText(txtResultado.getText().toString() + "9");
            }
        });

        btnSumar = findViewById(R.id.botonSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (res != null) {
                    numeroAux = Double.valueOf((String) txtResultado.getText());
                    res += numeroAux;
                    txtResultado.setText(String.valueOf(res));
                    numero1 = null;
                    numero2 = null;
                }

                if (numero1 == null) {
                    numero1 = Double.valueOf((String) txtResultado.getText());
                }
                else {
                    numero2 = Double.valueOf((String) txtResultado.getText());
                    res = numero1 + numero2;
                    txtResultado.setText(String.valueOf(res));
                }
                txtOperacion.setText(txtResultado.getText() + "+");

                txtResultado.setText("");
                signo = "+";

            }
        });

        btnRestar = findViewById(R.id.botonRestar);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (res != null) {
                    numeroAux = Double.valueOf((String) txtResultado.getText());
                    res -= numeroAux;
                    txtResultado.setText(String.valueOf(res));
                    numero1 = null;
                    numero2 = null;
                }

                if (numero1 == null) {
                    numero1 = Double.valueOf((String) txtResultado.getText());
                } else {
                    numero2 = Double.valueOf((String) txtResultado.getText());
                    res = numero1 - numero2;
                    txtResultado.setText(String.valueOf(res));
                }

                txtOperacion.setText(txtResultado.getText() + "-");

                signo = "-";
                txtResultado.setText("");

            }
        });

        btnMultiplicar = findViewById(R.id.botonMultiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res != null) {
                    numeroAux = Double.valueOf((String) txtResultado.getText());
                    res *= numeroAux;
                    txtResultado.setText(String.valueOf(res));
                    numero1 = null;
                    numero2 = null;
                }

                if (numero1 == null) {
                    numero1 = Double.valueOf((String) txtResultado.getText());
                } else {
                    numero2 = Double.valueOf((String) txtResultado.getText());
                    res = numero1 * numero2;
                    txtResultado.setText(String.valueOf(res));
                }

                txtOperacion.setText(txtResultado.getText() + "*");

                signo = "*";
                txtResultado.setText("");
            }
        });

        btnDivision = findViewById(R.id.botonDivision);
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res != null) {
                    numeroAux = Double.valueOf((String) txtResultado.getText());
                    res /= numeroAux;
                    txtResultado.setText(String.valueOf(res));
                    numero1 = null;
                    numero2 = null;
                }

                if (numero1 == null) {
                    numero1 = Double.valueOf((String) txtResultado.getText());

                } else {
                    numero2 = Double.valueOf((String) txtResultado.getText());
                    if(numero2 == 0){
                        Toast.makeText(context,"Introduce un numero que no sea 0",Toast.LENGTH_SHORT).show();
                    }
                    res = numero1 / numero2;
                    txtResultado.setText(String.valueOf(res));
                }

                txtOperacion.setText(txtResultado.getText() + "/");

                signo = "/";
                txtResultado.setText("");
            }
        });

        btnLimpiar = findViewById(R.id.botonLimpiar);
        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOperacion.setText("");
                txtResultado.setText("");
                numero1 = null;
                numero2 = null;
                res = null;
            }
        });

        btnModulo = findViewById(R.id.botonModulo);
        btnModulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res != null) {
                    numeroAux = Double.valueOf((String) txtResultado.getText());
                    res %= numeroAux;
                    txtResultado.setText(String.valueOf(res));
                    numero1 = null;
                    numero2 = null;
                }

                if (numero1 == null) {
                    numero1 = Double.valueOf((String) txtResultado.getText());
                } else {
                    numero2 = Double.valueOf((String) txtResultado.getText());
                    res = numero1 % numero2;
                    txtResultado.setText(String.valueOf(res));
                }

                txtOperacion.setText(txtResultado.getText() + "%");

                signo = "%";
                txtResultado.setText("");
            }
        });

        btnComa = findViewById(R.id.botonComa);
        btnComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtResultado.setText(txtResultado.getText().toString() + ".");


            }
        });

        txtOperacion = findViewById(R.id.textoOperacion);
        txtResultado = findViewById(R.id.textoResultado);

        btnIgual = findViewById(R.id.botonIgual);
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //numero2 = Double.valueOf((String) txtResultado.getText());
                //txtOperacion.setText(txtOperacion.getText().toString() + txtResultado.getText().toString());

                if(signo.equals("+")){

                    res += numeroAux;
                    txtResultado.setText(String.valueOf(res));

                }

                if(signo.equals("-")){
                    res = numero1 - numero2;
                    txtResultado.setText(String.valueOf(res));
                }

                if(signo.equals("*")){
                    res = numero1 * numero2;
                    txtResultado.setText(String.valueOf(res));
                }

                if(signo.equals("/")){
                    if( numero1 == 0 || numero2 == 0){
                        Toast.makeText(context,"Indeterminacion",Toast.LENGTH_SHORT).show();
                    }
                    res = numero1 / numero2;
                    txtResultado.setText(String.valueOf(res));
                }

                if(signo.equals("%")){
                    res = numero1 % numero2;
                    txtResultado.setText(String.valueOf(res));
                }
                numeroAux = null;

            }
        });
    }

}