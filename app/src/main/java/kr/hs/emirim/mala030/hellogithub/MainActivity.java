package kr.hs.emirim.mala030.hellogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = (Button)findViewld(R.id.btnHello);
        btnHello.setOnClickListener(this);

        Toast.makeText(this, "지민이보고싶다해투언제끝나지", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "지민이보고싶다해투언제끝나지", Toast.LENGTH_SHORT).show();
    }
}
