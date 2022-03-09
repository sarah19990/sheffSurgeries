package com.sali

class Nurse {
   String nurseName
   String qualifications
   String nurseEmail
   String nurseOffice
   String nursePhone

    static constraints = {
        nurseName blank:false
        qualifications blank:false
        nurseEmail blank:false, email: true
        nurseOffice blank:false
        nursePhone blank:false

    }
}
