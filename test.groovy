job('DSL-Tutorial-1-Test') {
    scm {
        perforce('ssl:perforce.ges.symantec.com:1666')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}
