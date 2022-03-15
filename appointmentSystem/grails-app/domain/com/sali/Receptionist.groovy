package com.sali

class Receptionist {
   //declare variables
   String recepName
   String recepEmail
   String recepUsername
   String recepPassword
   String recepPhone

    static constraints = {
        //declare constraints
       recepName blank:false
       recepEmail blank:false, email: true, unique:true
       recepUsername blank:false, unique: true
       recepPassword blank:false, size:7..16
       recepPhone blank:false, size:0..15
    }
    // declare relationships
    static belongsTo = [surgery:Surgery]
}
