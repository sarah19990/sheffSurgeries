package com.sali

class Nurse {
    //declare variables
   String nurseName
   String qualifications
   String nurseEmail
   String nurseOffice
   String nursePhone

    static constraints = {
        //declare constraints
        nurseName blank:false
        qualifications blank:false
        nurseEmail blank:false, email: true, unique:true
        nurseOffice blank:false
        nursePhone blank:false, size:0..15

    }
    // declare relationships
    
    static belongsTo = [surgery:Surgery, doctor:Doctor]
}
