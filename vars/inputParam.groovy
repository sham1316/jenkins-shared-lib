#!/usr/bin/env groovy

def call(Map config=[:], Closure body) {
    node {
        stage('Use cache?') {
            when {
                triggeredBy cause: "UserIdCause"
            }
            steps {
                script {
                    timeout(time: 60, unit: 'SECONDS') {
                        env.USE_CACHE = input message: 'User input required', ok: 'Cache?',
                                parameters: [
                                        choice(name: 'Use cache?', choices: 'yes\nno', description: 'Use docker cache?')]
                    }
                }
            }
        }
        body()
    }
}