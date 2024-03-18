//Represents a staff member that works as a volunteer

public class Volunteer extends StaffMember{
    //Sets up a volunteer using the specified information
    public Volunteer (String eName, String eAddress, String ePhone){
        super(eName,eAddress,ePhone);
    }

    @Override
    public double pay() {
        return 0;
    }
}
