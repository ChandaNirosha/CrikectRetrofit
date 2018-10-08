package com.example.sys9.criketretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.Listview);
            ApiService service = RetrofitClass.getApiService();
            final Call<Cricket> cricketCall = service.getCricket();
            Log.i("URL", cricketCall.request().url().toString());

            cricketCall.enqueue(new Callback<Cricket>() {
                @Override
                public void onResponse(Call<Cricket> call, Response<Cricket> response) {

                    if (response.isSuccessful()) {
                        List<Batsman> batsman = response.body().getBatsman();
                        List<Bowlers>bowlers=response.body().getBowlers();
                        Adapter adapter = new Adapter(getApplicationContext(), batsman,bowlers);
                        listView.setAdapter(adapter);

                    }
                }


                @Override
                public void onFailure(Call<Cricket> call, Throwable t) {

                    Log.e("Error", t.getMessage());
                }
            });
        }
    }
