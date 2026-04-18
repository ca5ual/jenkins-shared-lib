def call (String repo, String env) {
    sh "docker build -t ${repo}:${env}-v1.0 ."
}