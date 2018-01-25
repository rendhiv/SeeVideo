package com.mobiledev.sky.videoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
        VideoView videoView;
        //deklarasi obj

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            getSupportActionBar().setTitle("Contoh VideoView");
            getSupportActionBar().setSubtitle("mobiledev-id.com");

            videoView = (VideoView) findViewById(R.id.videoView);
            //inisialisasi object videoView
            videoView.setVideoPath("https://r4---sn-npoe7n7s.googlevideo.com/videoplayback?ei=6j1pWrftA9b1uAWXurjgCA&source=youtube&requiressl=yes&ipbits=0&sparams=clen,dur,ei,expire,gir,id,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pl,ratebypass,requiressl,source&lmt=1514879078183335&ratebypass=yes&dur=0.000&clen=55961556&mime=video%2Fwebm&key=cms1&itag=43&id=o-ANCH6Y0f9o8CygMFQ_If0HqJVsL6Ezw51IY-fI914XKh&signature=44EE18F57B02EC0D897E012F55A279E9A293D332.7877964E02E1200D3597DD512FB6AEC8D9F4A794&gir=yes&pl=24&expire=1516868170&ip=23.239.195.119&video_id=syB-HrQTcGs&title=TOP+5+TERNGAKAK+Indonesian+Idol+2018+%28Part+1%29&rm=sn-mv-qxoe76,sn-q4felz7z&req_id=3df6bf5bf0a9a3ee&redirect_counter=2&cms_redirect=yes&ipbypass=yes&mip=114.142.171.13&mm=29&mn=sn-npoe7n7s&ms=rdu&mt=1516853935&mv=m");
            //digunakan untuk mengidentifikasi resource alamat url video
            videoView.setMediaController(new MediaController(this));
            //menampilkan media controller video
            videoView.start();
            //memulai video


        }
    }