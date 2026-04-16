def call(String image, String env, String credentialsId) {
    withCredentials([usernamePassword(
        credentialsId: credentialsId,
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {

        sh """
        echo \$DOCKER_PASS | docker login -u \$DOCKER_USER --password-stdin
        docker push ${image}:${env}-v1.0
        """
    }
}