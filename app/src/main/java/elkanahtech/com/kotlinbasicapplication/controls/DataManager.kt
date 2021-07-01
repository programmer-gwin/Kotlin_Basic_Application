package elkanahtech.com.kotlinbasicapplication.controls

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        //run anytime you call DataManager
        initializeCourses()
    }

    private fun  initializeCourses(){
        var course = CourseInfo("android_intents", "Android Programming with intents")
        courses.set(course.courseId, course)

        course = CourseInfo("android_async", "Android Async Programming and Services")
        courses.set(course.courseId, course)

        course = CourseInfo("java_lang", "Java Fundamentals: The Java Language")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseId, course)
    }
}