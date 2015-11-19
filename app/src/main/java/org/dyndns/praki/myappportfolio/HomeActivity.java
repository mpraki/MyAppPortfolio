package org.dyndns.praki.myappportfolio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private Activity dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        dis = this;
        bindEvent(R.id.spottifyStreamer, "Spotify Me");
        bindEvent(R.id.buildItBigger, "Build It Bigger");
        bindEvent(R.id.libraryApp, "Library App");
        bindEvent(R.id.scoresApp, "Scores App");
        bindEvent(R.id.xyzReader, "XYZ Reader");
        bindEvent(R.id.myOwnApp, "My Own App");
    }

    private void bindEvent(int id, final CharSequence message){
        findViewById(id).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(dis,message,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
