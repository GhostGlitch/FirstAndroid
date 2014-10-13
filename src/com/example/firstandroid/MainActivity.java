package com.example.firstandroid;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity
{
	private Button Button;
	private RelativeLayout mainLayout;
	private ArrayList<Integer> colorList;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button = (Button) findViewById(R.id.ColourButton);
		mainLayout = (RelativeLayout) findViewById(R.id.MainLayout);
		colorList = new ArrayList<Integer>();
		setupListeners();
	}
	
	private void fillTheColorList()
	{

	}

	private void setupListeners()
	{
		Button.setOnClickListener(new View.OnClickListener()
		{

			@Override
			public void onClick(View currentView)
			{
				// Button click stuff goes here
				int randomIndex = (int) (Math.random() * colorList.size());
				Button.setBackgroundColor(Color.parseColor("#888888"));

			}
		});
	}
	private String RanHex
	{
		Random rand = new Random();
		return rand.nextInt(16);
	}
}
