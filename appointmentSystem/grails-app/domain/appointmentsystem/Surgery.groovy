package appointmentsystem

class Surgery {
   String name
   String address
   String postcode
   String telephone
   int numberOfPatients
   String description
   String openingtime

    static constraints = {
       name blank:false, nullable: false
       address blank:false, nullable: false
       telephone blank:false, nullable:false
       numberOfPatients max:50, blank:false, nullable:false
       description maxSize:500, blank:false, nullable:false, 
       openingtime blank:false, nullable:false 
    }
}
