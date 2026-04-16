def call (String image, String env) {
    sh "docker build -t ${image}:${env}-v1.0 ."
}