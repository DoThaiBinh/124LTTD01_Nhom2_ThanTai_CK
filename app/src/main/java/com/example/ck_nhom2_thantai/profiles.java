package com.example.ck_nhom2_thantai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class profiles extends AppCompatActivity {
    private ImageButton bt_load;
    private Button add, xoa, sua;
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private User useredit;// Your Adapter for RecyclerView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profiles);

        // Set up system bar insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        bt_load = findViewById(R.id.btnBack);
        add = findViewById(R.id.btnAdd);
        xoa = findViewById(R.id.btnDelete);
        sua = findViewById(R.id.btnEdit);
        recyclerView = findViewById(R.id.recyclerView);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Set up the adapter with an item click listener
        userAdapter = new UserAdapter(getUserList(), new UserAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(User user) {
                useredit = user;
                Toast.makeText(profiles.this, "Selected user: " + user.getTen(), Toast.LENGTH_SHORT).show();

            }
        });
        recyclerView.setAdapter(userAdapter);



        // Set up button actions
        bt_load.setOnClickListener(v -> {
            Intent intent = new Intent(profiles.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(profiles.this, Editprofile.class);
            intent.putExtra("key", "them");
            startActivity(intent);
            finish();
        });

        sua.setOnClickListener(v -> {
            Intent intent = new Intent(profiles.this, Editprofile.class);
            intent.putExtra("key", "sua");
            startActivity(intent);
            finish();
        });

        xoa.setOnClickListener(v -> {
            // Handle delete action here
        });
    }

    // Sample method to generate a list of users
    private List<User> getUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", R.drawable.idcard));
        users.add(new User("Bob", R.drawable.idcard));
        users.add(new User("Charlie",  R.drawable.idcard));
        return users;
    }
}
