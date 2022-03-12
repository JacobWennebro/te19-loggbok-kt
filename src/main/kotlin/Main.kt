import java.io.File
import java.io.FileOutputStream
import java.io.ObjectOutputStream

fun clearConsole() { println("\n".repeat(30)) }

fun main(args: Array<String>) {

    println("Enter your name:")
    val name = readLine() as String

    clearConsole();

    println("\"$name\": Type your message below ..");
    val msg = readLine() as String

    val log = LogEntry(msg, name);
    save(log)
}

fun save(log: LogEntry) {
    val outs = ObjectOutputStream(FileOutputStream(File("testSave")))
    outs.writeChars("${log.msg},${log.author},${log.date.toString()}")
    outs.flush()
    outs.close()
}