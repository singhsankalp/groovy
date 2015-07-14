job('DSL-Tutorial-1-Test') {

    scm {
      p4('testing') { node ->
            node / configVersion(configVersion2)
            node / p4Client("\${JOB_NAME}")
            node / p4Port("server:1666")
            node / disableChangeLogOnly(true)
        }
    }


    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
