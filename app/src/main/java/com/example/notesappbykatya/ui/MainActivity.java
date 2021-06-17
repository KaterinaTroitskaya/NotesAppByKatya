package com.example.notesappbykatya.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.notesappbykatya.R;
import com.example.notesappbykatya.domain.Note;
import com.example.notesappbykatya.ui.details.NoteDetailsActivity;
import com.example.notesappbykatya.ui.details.NoteDetailsFragment;
import com.example.notesappbykatya.ui.list.NoteListFragment;

public class MainActivity extends AppCompatActivity implements NoteListFragment.OnNoteClicked {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onNoteClicked(Note note) {

        boolean isLandscape = getResources().getBoolean(R.bool.isLandscape);

        if(isLandscape) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.notes_details_fragment, NoteDetailsFragment.newInstance(note))
                    .commit();

        } else {

            Intent intent = new Intent(this, NoteDetailsActivity.class);
            intent.putExtra(NoteDetailsActivity.ARG_NOTE, note);
            startActivity(intent);
        }


    }
}