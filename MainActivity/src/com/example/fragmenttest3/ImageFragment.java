package com.example.fragmenttest3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ImageFragment extends Fragment {

	public static ImageFragment newInstance(){
		ImageFragment fragment=new ImageFragment();
		return fragment;
	}
	public ImageFragment(){
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.fragment_image,container,false);
	}
	
}
