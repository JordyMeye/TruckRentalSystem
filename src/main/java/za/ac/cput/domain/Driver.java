package za.ac.cput.domain;

public class Driver {
    String name;
    String surname;
    int idNumber;
    int licenseNo;
    int telephone;
    int truckID;

    public Driver(String name, String surname, int idNumber, int licenseNo, int telephone, int truckID)
    {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.licenseNo = licenseNo;
        this.telephone = telephone;
        this.truckID = truckID;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public int getLicenseNo()
    {
        return licenseNo;
    }

    public int getTelephone()
    {
        return telephone;
    }

    public int getTruckID()
    {
        return truckID;
    }

    @Override
    public String toString()
    {
        return "Driver{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", idNumber=" + idNumber +
                ", licenseNo=" + licenseNo +
                ", telephone=" + telephone +
                ", truckID=" + truckID +
                '}';
    }
}
