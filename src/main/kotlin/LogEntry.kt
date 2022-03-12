import java.io.File
import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.util.*


class LogEntry(log_msg: String, log_author: String) {
    val msg = log_msg
    val author = log_author
    val date = Date()
}