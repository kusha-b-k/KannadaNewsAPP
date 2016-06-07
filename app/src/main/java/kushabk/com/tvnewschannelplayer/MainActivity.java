package kushabk.com.tvnewschannelplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.content.Context;



public class MainActivity extends AppCompatActivity {

    public Button tv9;

    public Button btv;
    public Button suva;
    public Button jana;
    public Button publ;
    final Context context = this;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv9 = (Button) findViewById(R.id.button);
        btv =(Button)findViewById(R.id.button2);
        publ = (Button) findViewById(R.id.button3);
        suva = (Button) findViewById(R.id.button4);
        jana = (Button) findViewById(R.id.button5);

        tv9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
//channel uri
              String s="<iframe width=\"auto\" height=\"auto\" src=\"https://www.youtube.com/embed/DXp_0D6Dr_4\" frameborder=\"0\" allowfullscreen></iframe>";
                Intent intent = new Intent(context, Tvplayer.class);
                intent.putExtra("message",s);
                startActivity(intent);

            }
        });


        btv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               String s="<iframe width=\"auto\" height=\"auto\" src=\"https://www.youtube.com/embed/_YHAFJI7BKk\" frameborder=\"0\" allowfullscreen></iframe>";
                Intent intent = new Intent(context, Tvplayer.class);

                intent.putExtra("message",s);
                startActivity(intent);
            }
        });

        publ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //channel uir
                String s = "<iframe width=\"auto\" height=\"auto\" src=\"https://www.youtube.com/embed/iESOT3MmsSg\" frameborder=\"0\" allowfullscreen></iframe>";

                Intent intent = new Intent(context, Tvplayer.class);
                intent.putExtra("message", s);
                startActivity(intent);
            }
        });


        suva.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

//channel uri
                String s = "<iframe width=\"auto\" height=\"auto\" src=\"https://www.youtube.com/embed/FCqzOHNsfXI\" frameborder=\"0\" allowfullscreen></iframe>";

                Intent intent = new Intent(context, Tvplayer.class);
                intent.putExtra("message", s);
                startActivity(intent);
            }
        });


        jana.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String s="<iframe width=\"auto\" height=\"auto\" src=\"https://www.youtube.com/embed/a4PsYxU-vB8\" frameborder=\"0\" allowfullscreen></iframe>";

                Intent intent = new Intent(context, Tvplayer.class);
                intent.putExtra("message", s);
                startActivity(intent);

            }
        });


    }
}
