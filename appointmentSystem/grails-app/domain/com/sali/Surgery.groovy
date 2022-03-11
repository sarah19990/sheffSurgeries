package com.sali

class Surgery {
    // declare variables
   String name
   String address
   String postcode
   String telephone
   int numberOfPatients
   String description
   String openingtime

    static constraints = {
        // constraints
        name blank:false
       address blank:false
       postcode blank:false, size:5..10
       telephone blank:false, size:0..12
       numberOfPatients max:50, nullable:false
       description blank:false, widget: 'textarea'
       openingtime blank:false
    }
    // declare relationships
    static hasMany = [doctor:Doctor, receptionist:Receptionist, appointment:Appointment, patient:Patient, nurse:Nurse]
}
