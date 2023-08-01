package com.example.delivery;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.delivery.databinding.ActivityMapBinding;

public class MapActivity extends AppCompatActivity {

    private ActivityMapBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // ...
    }

    // Método para manejar el clic del botón "Confirmar dirección"
    public void onConfirmarDireccionClick(View view) {
        String direccionEnvio = binding.etDireccionEnvio.getText().toString();
        if (!direccionEnvio.isEmpty()) {
            Toast.makeText(this, "Tu pedido ha sido enviado a: " + direccionEnvio, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Por favor, ingresa tu dirección de envío", Toast.LENGTH_SHORT).show();
        }
    }

    // Método para manejar el clic del botón "Volver"
    public void onVolverClick(View view) {
        onBackPressed();
    }
}
