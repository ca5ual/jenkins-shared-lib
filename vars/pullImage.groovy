def call (String repo, String env) {
    sh "docker pull ${repo}:${env}-v1.0"
}