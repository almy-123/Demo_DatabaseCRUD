package sg.edu.rp.id19037610.demodatabasecrud;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Note implements Serializable {
    private int id;
    private String noteContent;

    public Note(int id, String noteContent){
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {
        return id;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Override
    public String toString() {
        String msg = "ID: " + id + " , " + noteContent;
        return msg;
    }
}
