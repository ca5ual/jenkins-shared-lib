def call (String containerName) {
    sh "docker rm -f ${containerName} || true"
}