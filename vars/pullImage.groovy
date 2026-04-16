def call (String image, String env) {
    sh "docker pull ${image}:${env}-v1.0"
}