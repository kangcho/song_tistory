package com.example.fragmenttest3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TextFragment extends Fragment {

	public static TextFragment newInstance(){
		
		TextFragment fragment=new TextFragment();
		return fragment;
	}
	public TextFragment(){
		// Required empty public constructor 
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.fragment_text,container,false);
	}
	
}
