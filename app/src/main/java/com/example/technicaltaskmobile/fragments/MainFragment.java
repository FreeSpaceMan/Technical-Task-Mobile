package com.example.technicaltaskmobile.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.technicaltaskmobile.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        FragmentMainBinding binding = FragmentMainBinding.inflate(inflater, container, false);

        MainFragmentArgs args = MainFragmentArgs.fromBundle(requireArguments());
        String welcomeText = "Welcome " + args.getUsername() + "!";

        binding.textWelcome.setText(welcomeText);

        binding.listRecyclerLanguages.setAdapter(new LanguageAdapter());

        return binding.getRoot();
    }
}
