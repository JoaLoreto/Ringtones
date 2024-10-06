package com.example.ringtones;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ringtones.R;
import com.example.ringtones.ShareActivity;


public class MainActivity extends AppCompatActivity {
    Button play1,play2,play3,play4,play5,play6,play7,play8,play9,play10,
            download1,download2,download3,download4,download5,download6,download7,download8,download9,download10,
            share1,share2,share3,share4,share5,share6,share7,share8,share9,share10,
            blue1,blue2,blue3,blue4,blue5,blue6,blue7,blue8,blue9,blue10;

    MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6,mp7,mp8,mp9,mp10;
    String url1,url2,url3,url4,url5,url6,url7,url8,url9,url10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play1 = (Button)findViewById(R.id.play1);
        play2 = (Button)findViewById(R.id.play2);
        play3 = (Button)findViewById(R.id.play3);
        play4 = (Button)findViewById(R.id.play4);
        play5 = (Button)findViewById(R.id.play5);
        play6 = (Button)findViewById(R.id.play6);
        play7 = (Button)findViewById(R.id.play7);
        play8 = (Button)findViewById(R.id.play8);
        play9 = (Button)findViewById(R.id.play9);
        play10 = (Button)findViewById(R.id.play10);

        download1=(Button)findViewById(R.id.download1);
        download2=(Button)findViewById(R.id.download2);
        download3=(Button)findViewById(R.id.download3);
        download4=(Button)findViewById(R.id.download4);
        download5=(Button)findViewById(R.id.download5);
        download6=(Button)findViewById(R.id.download6);
        download7=(Button)findViewById(R.id.download7);
        download8=(Button)findViewById(R.id.download8);
        download9=(Button)findViewById(R.id.download9);
        download10=(Button)findViewById(R.id.download10);

        share1 = (Button)findViewById(R.id.share1);
        share2 = (Button)findViewById(R.id.share2);
        share3 = (Button)findViewById(R.id.share3);
        share4 = (Button)findViewById(R.id.share4);
        share5 = (Button)findViewById(R.id.share5);
        share6 = (Button)findViewById(R.id.share6);
        share7 = (Button)findViewById(R.id.share7);
        share8 = (Button)findViewById(R.id.share8);
        share9 = (Button)findViewById(R.id.share9);
        share10 = (Button)findViewById(R.id.share10);

        blue1 = (Button)findViewById(R.id.blue1);
        blue2 = (Button)findViewById(R.id.blue2);
        blue3 = (Button)findViewById(R.id.blue3);
        blue4 = (Button)findViewById(R.id.blue4);
        blue5 = (Button)findViewById(R.id.blue5);
        blue6 = (Button)findViewById(R.id.blue6);
        blue7 = (Button)findViewById(R.id.blue7);
        blue8 = (Button)findViewById(R.id.blue8);
        blue9 = (Button)findViewById(R.id.blue9);
        blue10 = (Button)findViewById(R.id.blue10);

        mp2 = MediaPlayer.create ( this,R.raw.dragon_ball);
        mp3 = MediaPlayer.create ( this,R.raw.iphone);
        mp5 = MediaPlayer.create ( this,R.raw.mario_bros_tuberia);
        mp6 = MediaPlayer.create ( this,R.raw.mario_bros_vida);
        mp4 = MediaPlayer.create ( this,R.raw.mario_bros_die);
        mp8 = MediaPlayer.create ( this,R.raw.messenger);
        mp9 = MediaPlayer.create ( this,R.raw.pato_donald);
        mp10 = MediaPlayer.create ( this,R.raw.super_mario_bros);
        mp7 = MediaPlayer.create ( this,R.raw.mensaje);
        mp1 = MediaPlayer.create ( this,R.raw.campana);


        url2 = "http://www.sonidosmp3gratis.com/sounds/dragon-ball.mp3";
        url3 = "http://www.sonidosmp3gratis.com/sounds/iphone-notificacion.mp3";
        url5 = "http://www.sonidosmp3gratis.com/sounds/mario-bros%20tuberia.mp3";
        url6 = "http://www.sonidosmp3gratis.com/sounds/mario-bros%20vida.mp3";
        url4 = "http://www.sonidosmp3gratis.com/sounds/mario-bros-die.mp3";
        url8 = "http://www.sonidosmp3gratis.com/sounds/messenger-tono-mensaje-.mp3";
        url9 = "http://www.sonidosmp3gratis.com/sounds/ringtones-pato-donald.mp3";
        url10 = "http://www.sonidosmp3gratis.com/sounds/ringtones-super-mario-bros.mp3";
        url7 = "http://www.sonidosmp3gratis.com/sounds/tono-mensaje-3-.mp3";
        url1 = "http://www.sonidosmp3gratis.com/sounds/whistle-campana-whatsapp.mp3";

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp1.isPlaying()){
                    mp1.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp1.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp2.isPlaying()){
                    mp2.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp2.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp3.isPlaying()){
                    mp3.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp3.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp4.isPlaying()){
                    mp4.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp4.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp5.isPlaying()){
                    mp5.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp5.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp6.isPlaying()){
                    mp6.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp6.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp7.isPlaying()){
                    mp7.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp7.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp8.isPlaying()){
                    mp8.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp8.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp9.isPlaying()){
                    mp9.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp9.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp10.isPlaying()){
                    mp10.pause();
                    Toast.makeText(MainActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp10.start();
                    Toast.makeText(MainActivity.this,"Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        download1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri= Uri.parse(url1);
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        download2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url2);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        download3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url3);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        download4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url4);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        download5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url5);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        download6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url6);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        download7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url7);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        download8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url8);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        download9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url9);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        download10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url10);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        share1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });
        share10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ShareActivity.class);
                startActivity(i);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}