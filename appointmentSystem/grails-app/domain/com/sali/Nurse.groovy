package com.sali

class Nurse {
    //declare variables
   String nurseName
   String qualifications
   String nurseEmail
   String nurseOffice
   String nursePhone

    static constraints = {
        //constraints
        nurseName blank:false
        qualifications blank:false
        nurseEmail blank:false, email: true
        nurseOffice blank:false
        nursePhone blank:false

    }
    // declare relationships
    static hasMany = [doctor:Doctor]
    static belongsTo = [surgery:Surgery]
}
