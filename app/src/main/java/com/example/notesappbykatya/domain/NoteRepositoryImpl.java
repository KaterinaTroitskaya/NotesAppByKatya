package com.example.notesappbykatya.domain;

import com.example.notesappbykatya.R;

import java.util.ArrayList;
import java.util.List;

public class NoteRepositoryImpl implements NoteRepository {

    @Override
    public List<Note> getNotes() {
        ArrayList<Note> result = new ArrayList<>();
        result.add(new Note(R.string.task, R.string.texttask));
        result.add(new Note(R.string.significance, R.string.textsignificance));
        result.add(new Note(R.string.practice, R.string.textpractice));
        result.add(new Note(R.string.considerations, R.string.textconsiderations));
        result.add(new Note(R.string.ontheotherhand, R.string.textontheotherhand));
        return result;
    }
}
