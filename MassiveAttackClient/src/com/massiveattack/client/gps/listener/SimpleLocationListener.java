package com.massiveattack.client.gps.listener;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Context;

public class SimpleLocationListener implements LocationListener {
	private Context context;
	
	public SimpleLocationListener(Context context) {
		this.context = context;
	}
	
	@Override
	public void onLocationChanged(Location loc) {
		loc.getLatitude();
		loc.getLongitude();
		String Text = "My current location is: Latitud = " + loc.getLatitude() +
		"Longitud = " + loc.getLongitude();
		Toast.makeText(context,Text,Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onProviderDisabled(String provider) {
		Toast.makeText(context, "Gps Disabled", Toast.LENGTH_SHORT ).show();
	}

	@Override
	public void onProviderEnabled(String provider) {
		Toast.makeText(context, "Gps Enabled", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {

	}
}
