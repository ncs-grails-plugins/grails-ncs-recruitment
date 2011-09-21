package edu.umn.ncs

class FatherEngagement {
	TrackedItem trackedItem
	String psuId = '20000048'
	String interviewerInitials
	Date interviewStartTime
	Date interviewEndTime
	Date interviewDate
	Boolean fatherPresent
	Boolean discussNeedToKnow
	Boolean signAsWitness
	
    static constraints = {
    	trackedItem(unique:true)
    	interviewStartTime()
    	interviewEndTime(nullable:true)
    	interviewDate(nullable:true)
    	interviewerInitials(nullable:true)
    	fatherPresent(nullable:true)
    	discussNeedToKnow(nullable:true)
    	signAsWitness(nullable:true)
    }
}
