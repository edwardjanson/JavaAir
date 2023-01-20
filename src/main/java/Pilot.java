public class Pilot {

    private String name;
    private Rank rank;
    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber) {
        this.name = name;
        this.rank = rank;
        this.licenceNumber = licenceNumber;
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
