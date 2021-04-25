package com.example.technicaltaskmobile.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.example.technicaltaskmobile.MainActivity;
import com.example.technicaltaskmobile.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final FragmentLoginBinding binding = FragmentLoginBinding.inflate(inflater, container, false);

        binding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = binding.username.getText().toString();
                String password = binding.password.getText().toString();

                if (username.equals("android") & password.equals("developer")) {
                    NavDirections action =
                            LoginFragmentDirections
                                    .actionLoginFragmentToMainFragment(username);
                    Navigation.findNavController(binding.getRoot()).navigate(action);
                }
                else {
                    CharSequence toastText = "Incorrect credentials! Please try again.";
                    Toast toastIncorrectCredentials = Toast.makeText(getActivity(), toastText, Toast.LENGTH_SHORT);
                    toastIncorrectCredentials.show();
                }
            }
        });

        return binding.getRoot();
    }
}
