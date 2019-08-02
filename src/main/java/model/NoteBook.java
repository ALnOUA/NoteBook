package model;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Note> noteBook = new ArrayList<>();

    public List<Note> getNoteBook() {
        return this.noteBook;
    }

    public void setNoteBook(List<Note> noteList) {
        this.noteBook.add((Note) noteList);

    }
}

