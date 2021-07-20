interface Worker {
    fun work()
    fun takeVacation()
    fun fileTimeSheet() = println("Why? Really?")
}

interface Assistant {
    fun doChores()
    fun fileTimeSheet() = println("No escape from that")
}

class DepartmentAssistant: Assistant {
    override fun doChores() = println("routine stuff")
}

class JavaProgrammer: Worker {
    override fun work() = println("...write Java...")
    override fun takeVacation() = println("...code at the beach...")
}

class CSharpProgrammer: Worker {
    override fun work() = println("...write C#...")
    override fun takeVacation() = println("...branch at the ranch...")
}

class Manager(val staff: Worker, val assistant: Assistant): Worker by staff, Assistant by assistant {

    override fun takeVacation() = println("of course")

    override fun fileTimeSheet() {
        print("manually forwarding this...")
        assistant.fileTimeSheet()
    }
}

val doe = Manager(CSharpProgrammer(), DepartmentAssistant())
doe.work()
doe.takeVacation()
doe.doChores()
doe.fileTimeSheet()

val employee: Worker = doe
