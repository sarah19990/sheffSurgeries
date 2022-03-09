package com.sali

class Surgery {
   String name
   String address
   String postcode
   String telephone
   int numberOfPatients
   String description
   String openingtime

    static constraints = {
        name blank:false
       address blank:false
       telephone blank:false
       numberOfPatients max:50, nullable:false
       description blank:false, widget: 'textarea'
       openingtime blank:false
    }
}
