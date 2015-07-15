package com.example.allenarango.notes;

public class NoteListItem {
    private String text;
    NoteListItem item = new NoteListItem("My first note!");

    public NoteListItem(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
