package edu.umn.ncs

class FatherEngagement {
	TrackedItem trackedItem
	String psuId = '20000048'
	String interviewerInitials
	String interviewer
	Date interviewStartTime
	Date interviewEndTime
	Date interviewDate
	Boolean fatherPresent = false
	Boolean discussNeedToKnow = false
	Boolean signAsWitness = false
	
    static constraints = {
    	trackedItem(unique:true)
    	interviewStartTime()
    	interviewEndTime(nullable:true)
    	interviewDate(nullable:true)
    	interviewerInitials(nullable:true)
    	interviewer(nullable:true)
    	fatherPresent(nullable:true)
    	discussNeedToKnow(nullable:true)
    	signAsWitness(nullable:true)
    }
}
