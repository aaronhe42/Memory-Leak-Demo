package aaronhe.org.memoeryleak;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    findViewById(R.id.button_leak).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        startActivity(LeakActivity.newIntent(MainActivity.this));
      }
    });
  }
}
