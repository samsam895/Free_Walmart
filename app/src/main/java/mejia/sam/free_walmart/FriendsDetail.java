package mejia.sam.free_walmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FriendsDetail extends AppCompatActivity {
    TextView idfb,namefb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_detail);
        idfb = (TextView) findViewById(R.id.idfb);
        namefb = (TextView) findViewById(R.id.namefb);
        Intent intent = getIntent();

        if(intent!=null){
            Friends frien = (Friends)intent.getSerializableExtra("5813");
            idfb.setText(frien.getId());
            namefb.setText(frien.getName());
        }
    }
}
