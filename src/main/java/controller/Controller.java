package controller;

import model.Note;
import model.NoteBook;
import view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    List<Note> noteList = new ArrayList<>();

    private NoteBook noteBook;
    private View view;

    public Controller(NoteBook noteBook, View view) {
        this.noteBook = noteBook;
        this.view = view;
    }

    public void processUser() throws Exception {
        Scanner sc = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(view, sc);
        noteList.add(inputNoteBook.inputNote(noteList));
        noteBook.setNoteBook(noteList);
        InputNoteBook inputNoteBook1 = new InputNoteBook(view, sc);
        noteList.add(inputNoteBook1.inputNote(noteList));
        noteBook.setNoteBook(noteList);




    }
}