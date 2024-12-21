package com.example.ck_nhom2_thantai;

import android.os.Bundle;

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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {
    private TextView huy, binh, tam;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Button btnNavigate = view.findViewById(R.id.profile);
        huy = view.findViewById(R.id.huy);
        binh = view.findViewById(R.id.binh);
        tam = view.findViewById(R.id.tam);

        btnNavigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getParentFragmentManager().beginTransaction()
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
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
                        Toast.makeText(getContext(), "No users found", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getContext(), "Failed to fetch data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<NGUOIDUNG>> call, Throwable t) {
                Toast.makeText(getContext(), "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}