package list3

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun main(args : Array<String>){
//    println(parsePath("/Users/yole/kotlin-book/chapter.adoc"))

    val kotilinLogo = """| //
                        .|//
                        .|/\"""
    println(kotilinLogo)
}