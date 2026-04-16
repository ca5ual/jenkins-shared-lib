def call(String image, String env, String port) {
    sh """
    docker rm -f ${env} || true

    docker run -d --name ${env} -p ${port}:3000 ${image}:${env}-v1.0
    """
}