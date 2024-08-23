import java.time.LocalDate;

public class AvisClients {
    private String nomClient;
    private String mailClient;
    private int noteHotel;
    private LocalDate datePublication;

    public AvisClients(String nomClient, String mailClient, int noteHotel, LocalDate datePublication) {
        this.nomClient = nomClient;
        this.mailClient = mailClient;
        this.noteHotel = noteHotel;
        this.datePublication = datePublication;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getMailClient() {
        return mailClient;
    }

    public void setMailClient(String mailClient) {
        this.mailClient = mailClient;
    }

    public int getNoteHotel() {
        return noteHotel;
    }

    public void setNoteHotel(int noteHotel) {
        this.noteHotel = noteHotel;
    }

    public LocalDate getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(LocalDate datePublication) {
        this.datePublication = datePublication;
    }


}
