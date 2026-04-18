def call(String env, String repo, String port) {
    sh "docker run -d --name ${env} -p ${port}:3000 ${repo}:${env}-v1.0"
}