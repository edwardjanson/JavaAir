public class Pilot {

    private String name;
    private String licenceNumber;
    private Rank rank;

    public Pilot(String name, String licenceNumber, Rank rank) {
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public Rank getRank() {
        return rank;
    }
}
