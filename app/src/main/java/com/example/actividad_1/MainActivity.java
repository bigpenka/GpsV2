package com.example.actividad_1;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapView);
        mapFragment.getMapAsync(this);

        videoView = findViewById(R.id.videoView);

        String videoUrl = "https://www.youtube.com/watch?v=1GKHDN77GSM";
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.setVideoPath(videoUrl);
        videoView.start();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        LatLng arica = new LatLng(-18.4832126007107, -70.31035394605763);
        mMap.addMarker(new MarkerOptions().position(arica).title("UST arica"));
        LatLng iquique = new LatLng(-20.238507550842492, -70.14472782573823);
        mMap.addMarker(new MarkerOptions().position(iquique).title("UST iquique"));
        LatLng antofagasta = new LatLng(-23.634495584846203, -70.39402041706951);
        mMap.addMarker(new MarkerOptions().position(antofagasta).title("UST antofagasta"));
        LatLng laserena = new LatLng(-29.907721753442356, -71.25706493315894);
        mMap.addMarker(new MarkerOptions().position(laserena).title("UST la serena"));

        LatLng viña = new LatLng(-33.03688587807562, -71.5222165743905);
        mMap.addMarker(new MarkerOptions().position(viña).title("UST viña del mar"));
        LatLng santiago = new LatLng(-33.44418285631855, -70.66056093450682);
        mMap.addMarker(new MarkerOptions().position(santiago).title("UST santiago"));
        LatLng talca = new LatLng(-35.42853375706412, -71.67290429302253);
        mMap.addMarker(new MarkerOptions().position(talca).title("UST talca"));
        LatLng conce = new LatLng(-36.82605639049783, -73.0616235183252);
        mMap.addMarker(new MarkerOptions().position(conce).title("UST concepcion"));
        LatLng angeles = new LatLng(-37.46961898158142, -72.35457418076943);
        mMap.addMarker(new MarkerOptions().position(angeles).title("UST los angeles"));
        LatLng temuco = new LatLng(-38.73340052159866, -72.60183813974459);
        mMap.addMarker(new MarkerOptions().position(temuco).title("UST temuco"));
        LatLng valdivia = new LatLng(-39.81633676834092, -73.23341525674886);
        mMap.addMarker(new MarkerOptions().position(valdivia).title("UST valdivia"));
        LatLng osorno = new LatLng(-40.57167667772045, -73.13773666055336);
        mMap.addMarker(new MarkerOptions().position(osorno).title("UST osorno"));
        LatLng puerto = new LatLng(-41.472659832886855, -72.92877269647491);
        mMap.addMarker(new MarkerOptions().position(puerto).title("UST puerto montt"));








        mMap.moveCamera(CameraUpdateFactory.newLatLng(temuco));
    }


}