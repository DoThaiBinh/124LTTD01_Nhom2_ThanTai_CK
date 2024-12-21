package com.example.ck_nhom2_thantai.apiService;

import com.example.ck_nhom2_thantai.object.Danhmuc;
import com.example.ck_nhom2_thantai.object.NGUOIDUNG;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface ApiService {
    // Cấu hình Gson để định dạng ngày giờ
    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();

    // Tạo Retrofit instance
    ApiService apiService = new Retrofit.Builder()
            .baseUrl("http://192.168.147.163:5254/api/APINguoiDung/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiService.class);

    // Phương thức GET để lấy lịch sử thu

    @GET("getKhoanChi")
    Call<List<Danhmuc>> getKhoanChi(@Query("Idnguoidung") String Idnguoidung);
    @GET("GetAllUsers")
    Call<List<NGUOIDUNG>> GetAllUsers();
    @GET("getKhoanThu")
    Call<List<Danhmuc>> getKhoanThu(@Query("Idnguoidung") String Idnguoidung);
    @GET("getAllDanMuc")
    Call<List<Danhmuc>> getAllDanMuc(@Query("Idnguoidung") String Idnguoidung);
    @DELETE("deleteKhoangThuChi")
    Call<String> deleteKhoangThuChi(@Query("idkhoangthuchi") String idkhoangthuchi);
    @PUT("updateKhoang")
    Call<String> updateKhoang(
            @Query("idkhoangthuchi") String idkhoangthuchi,
            @Query("ten") String ten,
            @Query("hinh") String hinh
    );

    @PUT ("ChinhSuaProfile")
    Call<String> ChinhSuaProfile(
        @Query("Idnguoidung") String Idnguoidung,
        @Query("ten") String ten,
        @Query("email") String email,
        @Query("pass") String pass,
        @Query("anhdaidien") String anhdaidien
    );
    @POST("insertKhoangThuChi")
    Call<String> insertKhoangThuChi(
            @Query("kieu") String kieu,
            @Query("ten") String ten,
            @Query("sdt") String sdt,
            @Query("hinh") String hinh
    );
//huy


//tâm


}

