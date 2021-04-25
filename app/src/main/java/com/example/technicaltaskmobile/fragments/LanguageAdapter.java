package com.example.technicaltaskmobile.fragments;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.technicaltaskmobile.LanguageItems;
import com.example.technicaltaskmobile.databinding.ItemLanguageBinding;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder> {
    String[][] languageArrayItems = {{"Java","Java is a class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible."},
            {"PHP","PHP is a general-purpose scripting language especially suited to web development. It was originally created by Danish-Canadian programmer Rasmus Lerdorf in 1994."},
            {"JavaScript","JavaScript, often abbreviated as JS, is a programming language that conforms to the ECMAScript specification. JavaScript is high-level, often just-in-time compiled, and multi-paradigm. It has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and first-class functions."},
            {"Python","Python is an interpreted high-level general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant indentation."},
            {"Kotlin","Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library, but type inference allows its syntax to be more concise."},
            {"Golang","Go is a statically typed, compiled programming language designed at Google by Robert Griesemer, Rob Pike, and Ken Thompson. Go is syntactically similar to C, but with memory safety, garbage collection, structural typing, and CSP-style concurrency."},
            {"C#","C# is a general-purpose, multi-paradigm programming language encompassing static typing, strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented, and component-oriented programming disciplines."},
            {"C++","C++ is a general-purpose programming language created by Bjarne Stroustrup as an extension of the C programming language."},
            {"C","C is a general-purpose, procedural computer programming language supporting structured programming, lexical variable scope, and recursion, with a static type system. By design, C provides constructs that map efficiently to typical machine instructions."},
            {"Groovy","Apache Groovy is a Java-syntax-compatible object-oriented programming language for the Java platform. It is both a static and dynamic language with features similar to those of Python, Ruby, and Smalltalk."}};

    @NonNull
    @Override
    public LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemLanguageBinding binding = ItemLanguageBinding.inflate(inflater, parent, false);
        return new LanguageViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageViewHolder holder, int position) {
        LanguageItems languageItems = new LanguageItems();
        languageItems.setTitle(languageArrayItems[position][0]);
        languageItems.setDescription(languageArrayItems[position][1]);
        holder.bind(languageItems);
    }

    @Override
    public int getItemCount() {
        return languageArrayItems.length;
    }

    public class LanguageViewHolder extends RecyclerView.ViewHolder {
        private ItemLanguageBinding binding;

        public LanguageViewHolder(@NonNull ItemLanguageBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(LanguageItems languageItems) {
            binding.languageTitleText.setText(languageItems.getTitle());
            binding.languageDescText.setText(languageItems.getDescription());
        }
    }
}
