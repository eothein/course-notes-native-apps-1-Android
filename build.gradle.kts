
val build by tasks.creating(Exec::class){
    executable = "xelatex"
    args("course-notes.tex")
    group = "Building the pdf"
    description = "Build the pdf"
}

val glossaries by tasks.creating(Exec::class){
    executable = "makeglossaries"
    args("course-notes")
    group = "Building the pdf"
    description = "Generate Glossaries file"
}

val clean by tasks.creating{DefaultTask::class
    delete(fileTree(".").matching {
        include("**/*.idx")
        include("**/*.log")
        include("**/*.aux")
        include("**/*.bbl")
        include("**/*.bcf")
        include("**/*.alg")
        include("**/*.acr")
        include("**/*.acn")
        include("**/*.xml")
        include("**/*.toc")
        include("**/*.blg")
        include("**/*.glg")
        include("**/*.glo")
        include("**/*.gls")
        include("**/*.glsdefs")
        include("**/*.ist")
        include("**/*.gz")
        include("**/*.ind")
        include("**/*.ilg")
    })
}