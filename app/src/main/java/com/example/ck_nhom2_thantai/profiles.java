package com.example.ck_nhom2_thantai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class profiles extends AppCompatActivity {
    private ImageButton bt_load;
    private Button add,xoa,sua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profiles);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        add=findViewById(R.id.btnAdd);
        add=findViewById(R.id.btnDelete);
        add=findViewById(R.id.btnEdit);
        bt_load=findViewById(R.id.btnBack);

        //load về
        bt_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profiles.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        //Thêm giao diện đây chỉ để tạm thời
    }
}