package com.sali

class Receptionist {
   //declare variables
   String recepName
   String recepEmail
   String recepUsername
   String recepPassword
   String recepPhone

    static constraints = {
        //constraints
       recepName blank:false
       recepEmail blank:false, email: true
       recepUsername blank:false, unique: true
       recepPassword blank:false
       recepPhone blank:false 
    }
    // declare relationships
    static belongsTo = [surgery:Surgery]
}
