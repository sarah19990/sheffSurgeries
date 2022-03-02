package appointmentsystem

class Doctor {
   String fullName
   String qualifications
   String position
   String doctorEmail
   String password
   String doctorOffice
   String doctorPhone
   String bio

    static constraints = {
        fullName blank:false, nullable: false
        qualifications  blank:false, nullable: false
        position blank:false, nullable:false
        doctorEmail blank:false, nullable:false, email: true
        password blank:false, nullable:false
        doctorOffice blank:false, nullable:false
        doctorPhone blank:false, nullable:false
        bio maxSize:500, blank:false, nullable:false


    }
}