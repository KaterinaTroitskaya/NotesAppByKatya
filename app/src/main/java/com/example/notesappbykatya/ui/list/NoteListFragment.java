package com.example.notesappbykatya.ui.list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.notesappbykatya.R;
import com.example.notesappbykatya.domain.Note;
import com.example.notesappbykatya.domain.NoteRepository;
import com.example.notesappbykatya.domain.NoteRepositoryImpl;

import java.util.List;

public class NoteListFragment extends Fragment {

    private NoteRepository noteRepository;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        noteRepository = new NoteRepositoryImpl();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_note_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout notesList = view.findViewById(R.id.note_list_container);

        List<Note> notes = noteRepository.getNotes();

        for (Note note : notes) {
            View itemView = LayoutInflater.from(requireContext()).inflate(R.layout.item_note, notesList, false);
            TextView noteName = itemView.findViewById(R.id.note_name);
            noteName.setText(note.getName());

            notesList.addView(itemView);
        }

    }


    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onStart() {
        super.onStart();
    }


}
