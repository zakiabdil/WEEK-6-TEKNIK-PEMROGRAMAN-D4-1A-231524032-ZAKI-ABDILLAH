public class Salesperson implements Comparable{
    private String firstName, lastName;
    private int totalSales;

    public Salesperson (String first, String last, int sales){
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String toString(){
        return lastName+", "+firstName+": \t"+totalSales;
    }

    @Override
    public boolean equals(Object other) {
        //other merupakan tipe data yang menerima apa lebih spesifiknya class Salesperson.
        //ini membandingkan apakah nama belakang dan nama depannya sama. jika iya maka di return 1/true.
        return (
                lastName.equals(((Salesperson)other).getLastName())
                        && firstName.equals(((Salesperson)other).getFirstName())
        );
    }

    //Ketika di panggil oleh sorting, karena termasuk class Salesperson
    //Maka yang terpanggil adalah ini.
    @Override
    public int compareTo(Object other) {
        int result;
        if(((Salesperson)other).getTotalSales() < this.totalSales){
            result = 1;
        }else{
            result = -1;
        }
        return result;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}
