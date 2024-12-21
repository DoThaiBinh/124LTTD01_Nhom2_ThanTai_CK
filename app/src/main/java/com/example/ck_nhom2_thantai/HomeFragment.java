package com.example.ck_nhom2_thantai;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ck_nhom2_thantai.apiService.ApiService;
import com.example.ck_nhom2_thantai.object.NGUOIDUNG;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends AppCompatActivity {
    private TextView huy, binh, tam;

    public HomeFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.fragment_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        fetchAllUsers();
        Button btnNavigate = findViewById(R.id.profile);
        huy = findViewById(R.id.huy);
        binh = findViewById(R.id.binh);
        tam = findViewById(R.id.tam);

        btnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                getParentFragmentManager().beginTransaction()
//                        .addToBackStack(null)
//                        .commit();
                Intent intent = new Intent(HomeFragment.this, profiles.class);
                startActivity(intent);

            }
        });
    }


    private void fetchAllUsers() {
        Call<List<NGUOIDUNG>> call= ApiService.apiService.GetAllUsers();
        call.enqueue(new Callback<List<NGUOIDUNG>>() {
            @Override
            public void onResponse(Call<List<NGUOIDUNG>> call, Response<List<NGUOIDUNG>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<NGUOIDUNG> users = response.body();
                    if (!users.isEmpty()) {
                        // Hiển thị tên của ba người dùng đầu tiên (nếu có)
                        huy.setText(users.size() > 0 ? users.get(0).getTennguoidung() : "N/A");
                        binh.setText(users.size() > 1 ? users.get(1).getTennguoidung() : "N/A");
                        tam.setText(users.size() > 2 ? users.get(2).getTennguoidung() : "N/A");
                    } else {
                        Toast.makeText(HomeFragment.this, "No users found", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(HomeFragment.this, "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<NGUOIDUNG>> call, Throwable t) {
                Toast.makeText(HomeFragment.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}